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
 * [HelloWorldのアクションクラス]<br>
 * <br>
 * @author tarosa0001
 */
public class LoginAction {

    /** SQL文 */
	private interface SQL{
		String SELECT = "select * from admin where name=? and pw=?";
	}
	 /** 処理結果 */
	private interface RESULT{
		// 成功
		String SUCCESS = "success";
		// 失敗
		String FAILD = "faild";
	}
    /** ロガー */
    private Logger logger = LogManager.getLogger(LoginAction.class);

    /** 名前 */
    private String username;

    /** パスワード */
    private String password;

    /** エラーメッセージ */
    private final String ERR_MSG = "パスワードが違います。";

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
        logger.info("入力されたユーザーIDは「{}」です。", username);

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
        if (this.adminCheack()) {

        	return RESULT.SUCCESS;

        }
        // 結果がなければ、エラーメッセージ設定する
        errMsg = ERR_MSG;

//        session.setAttribute("errMsg", errMsg);
        request.setAttribute("errMsg", errMsg);

        return RESULT.FAILD;
    }

    // ID,PWチェック
    private boolean adminCheack() throws Exception {
    	boolean flag = false;

    	String sql = SQL.SELECT;

    	DbConfig dbConfig = DbConfig.getInstance();
    	Connection conn = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	conn = dbConfig.getConnection();

    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, username);
    		ps.setString(2, password);

    		rs = ps.executeQuery();
    		if (rs.next() == true) {
    			// rsはnullでなければデータがある
    			flag = true;

    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}

    	return flag;
    }
	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username セットする username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}



}
