package com.beautyred.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.beautyred.config.DbConfig;

/**
 * [騎手情報登録のアクションクラス]<br>
 * <br>
 * @author tarosa0001
 */
public class RegisterAction {

    /** SQL文 */
	private interface SQL{
		// 検索SQL
		String SELECT = "select * from jockeys where id=?";
		// 登録SQL
		String INSERET = "INSERT INTO jockeys VALUES (?,?,?,?,?)";
	}
	 /** 処理結果 */
	private interface RESULT{
		// 成功
		String SUCCESS = "success";
		// 失敗
		String FAILD = "faild";
	}
	 /** メッセージ */
	private interface MSG{
		// 成功
		String SUCCESS = "登録成功！！！";
		// 失敗1
		String ERR_MSG_1 = "入力したID番号既に存在します。";
		// 失敗1
	}
    /** ロガー */
    private Logger logger = LogManager.getLogger(RegisterAction.class);

    /** ID */
    private String id;

    /** 名前 */
    private String name;

    /** 誕生日 */
    private String birthday;

    /** メッセージ */
    private String msg;

    /**
     * [アクション実行処理]<br>
     * HelloWorldを出力する処理を実行する。<br>
     * 実行するメソッドは、struts.xmlで指定したメソッド名を使用して実装する。<br>
     * Struts2ではアクションの処理結果でページの遷移先を決定するが、
     * 今回は"success"の固定文字列を返却する。<br>
     * <br>
     * @return
     * @throws Exception
     */
    public String execute() throws Exception {
        logger.info("入力されたユーザーIDは「{}」です。", id, name, birthday);

        //获得请求
//        HttpServletRequest  _request = ServletActionContext.getRequest();
        //获得会话
//        HttpSession  _session = _request.getSession();
        //获得上下文对象
//        ServletContext  _application = ServletActionContext.getServletContext();

        // 获得请求
        HttpServletRequest  request = ServletActionContext.getRequest();

        // 获得回话
//        HttpSession session = ServletActionContext.getRequest().getSession();
        String errMsg = null;

        // 結果があれば、true返す
        if (this.pamterCheack()) {

        	return RESULT.FAILD;

        }
        // 登録する
        this.registerPro();

        // 結果がなければ、エラーメッセージ設定する
//        errMsg = ERR_MSG;

//        session.setAttribute("errMsg", errMsg);
        request.setAttribute("errMsg", errMsg);

        return RESULT.SUCCESS;
    }

	/**
     * [パラメータチェック]<br>
     * @return
     * @throws Exception
     */
    private boolean pamterCheack() throws Exception {
    	boolean flag = false;

    	String sql = SQL.SELECT;

    	DbConfig dbConfig = DbConfig.getInstance();
    	Connection conn = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	conn = dbConfig.getConnection();

    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, id);

    		rs = ps.executeQuery();
    		// 結果取得されない場合
    		if (rs.next() == false) {
    			// rsはnullでなければデータがある
    			flag = false;
			// 結果取得された場合
    		} else {
    			msg = MSG.ERR_MSG_1;
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		ps.close();
    		conn.close();
    	}

    	return flag;
    }

	/**
     * 登録処理<br>
     * @return
	 * @throws Exception
     */
    private void registerPro() throws Exception {

    	String year = this.changeFormat(birthday)[0];
    	String month = this.changeFormat(birthday)[1];
    	String day = this.changeFormat(birthday)[2];

    	String sql = SQL.INSERET;

    	DbConfig dbConfig = DbConfig.getInstance();
    	Connection conn = null;
    	PreparedStatement ps = null;
    	conn = dbConfig.getConnection();

    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, id);
    		ps.setString(2, name);
    		ps.setString(3, year);
    		ps.setString(4, month);
    		ps.setString(5, day);

    		ps.executeUpdate();
    		msg = MSG.SUCCESS;
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		ps.close();
    		conn.close();
    	}
	}

	/**
     * 誕生日を割れる処理<br>
     * @return
     * @throws Exception
     */
	private String[] changeFormat(String birthday) {
		String[] aryStr = birthday.split("/");
		return aryStr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}



}
