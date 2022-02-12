package com.beautyred.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.beautyred.config.DbConfig;
import com.beautyred.dto.JockeyNameDto;

public class NameSelectAction {

    /** SQL文 */
	private interface SQL{
		// 検索SQL
		String SELECT = "select * from jockeys where id=?";
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
		// 失敗1
		String ERR_MSG_1 = "番号を入力してください。";
		// 失敗1
		String ERR_MSG_2 = "半角数字を入力してください。";
		// 失敗1
		String ERR_MSG_3 = "入力した騎手番号が確認できません。番号を確認してください。";
	}

    /** ロガー */
    private Logger logger = LogManager.getLogger(NameSelectAction.class);

    //////////////　番号　//////////////
    /** ユーザー1 */
    private String user1;
    /** ユーザー2 */
    private String user2;
    /** ユーザー3 */
    private String user3;
    /** ユーザー4 */
    private String user4;
    /** ユーザー5 */
    private String user5;
    /** ユーザー6 */
    private String user6;
    /** ユーザー7 */
    private String user7;
    /** ユーザー8 */
    private String user8;
    /** ユーザー9 */
    private String user9;
    /** ユーザー10 */
    private String user10;
    /** ユーザー11 */
    private String user11;
    /** ユーザー12 */
    private String user12;
    /** ユーザー13 */
    private String user13;
    /** ユーザー14 */
    private String user14;
    /** ユーザー15 */
    private String user15;
    /** ユーザー16 */
    private String user16;
    /** ユーザー17 */
    private String user17;
    /** ユーザー18 */
    private String user18;

    /** ユーザー1 */
    private String user1Name1;
    /** ユーザー2 */
    private String user2Name1;
    /** ユーザー3 */
    private String user3Name1;
    /** ユーザー4 */
    private String user4Name1;
    /** ユーザー5 */
    private String user5Name1;
    /** ユーザー6 */
    private String user6Name1;
    /** ユーザー7 */
    private String user7Name1;
    /** ユーザー8 */
    private String user8Name1;
    /** ユーザー9 */
    private String user9Name1;
    /** ユーザー10 */
    private String user10Name1;
    /** ユーザー11 */
    private String user11Name1;
    /** ユーザー12 */
    private String user12Name1;
    /** ユーザー13 */
    private String user13Name1;
    /** ユーザー14 */
    private String user14Name1;
    /** ユーザー15 */
    private String user15Name1;
    /** ユーザー16 */
    private String user16Name1;
    /** ユーザー17 */
    private String user17Name1;
    /** ユーザー18 */
    private String user18Name1;
     /** ユーザー1 */
    private String user1Name2;
    /** ユーザー2 */
    private String user2Name2;
    /** ユーザー3 */
    private String user3Name2;
    /** ユーザー4 */
    private String user4Name2;
    /** ユーザー5 */
    private String user5Name2;
    /** ユーザー6 */
    private String user6Name2;
    /** ユーザー7 */
    private String user7Name2;
    /** ユーザー8 */
    private String user8Name2;
    /** ユーザー9 */
    private String user9Name2;
    /** ユーザー10 */
    private String user10Name2;
    /** ユーザー11 */
    private String user11Name2;
    /** ユーザー12 */
    private String user12Name2;
    /** ユーザー13 */
    private String user13Name2;
    /** ユーザー14 */
    private String user14Name2;
    /** ユーザー15 */
    private String user15Name2;
    /** ユーザー16 */
    private String user16Name2;
    /** ユーザー17 */
    private String user17Name2;
    /** ユーザー18 */
    private String user18Name2;

    /** ユーザー1 */
    private String house1;
    /** ユーザー2 */
    private String house2;
    /** ユーザー3 */
    private String house3;
    /** ユーザー4 */
    private String house4;
    /** ユーザー5 */
    private String house5;
    /** ユーザー6 */
    private String house6;
    /** ユーザー7 */
    private String house7;
    /** ユーザー8 */
    private String house8;
    /** ユーザー9 */
    private String house9;
    /** ユーザー10 */
    private String house10;
    /** ユーザー11 */
    private String house11;
    /** ユーザー12 */
    private String house12;
    /** ユーザー13 */
    private String house13;
    /** ユーザー14 */
    private String house14;
    /** ユーザー15 */
    private String house15;
    /** ユーザー16 */
    private String house16;
    /** ユーザー17 */
    private String house17;
    /** ユーザー18 */
    private String house18;

    /** メッセージ */
    private String errMsg;

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
        logger.info("入力されたユーザーIDは「{}」です。", user1);

        // 获得请求
        HttpServletRequest  request = ServletActionContext.getRequest();

        // 画面側入力した番号の結果をチェック
        if (this.checkNo()) {
        	return RESULT.FAILD;
        }
        // 画面側入力した番号のフォーマットをチェック（数字かのチェック）
        if (this.formatCheck()) {
        	return RESULT.FAILD;
        }
        // 画面側入力した騎手番号
        List<String> jockeyNo = new ArrayList<String>();
        jockeyNo = this.getJockeyNoDto();
        // 騎手氏名
        List<JockeyNameDto> aryJockeyNameDto = new ArrayList<JockeyNameDto>();

        // 結果があれば、true返す
        if (null != jockeyNo) {
        	for (String strNo : jockeyNo) {
        		if (null == this.getName(strNo,aryJockeyNameDto)) {
        			errMsg = MSG.ERR_MSG_3 + "[" + strNo + "]";
        			return RESULT.FAILD;
        		}

//        		this.getName(strNo,aryJockeyNameDto);
        	}
        }

       this.setName(aryJockeyNameDto);


//        session.setAttribute("errMsg", errMsg);
//        request.setAttribute("errMsg", errMsg);

        return RESULT.SUCCESS;
    }

    private boolean formatCheck() {

    	boolean flag = false;

		if(!isNumeric(user1)) {
			errMsg = "項目[1]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user2)){
			errMsg = "項目[2]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user3)){
			errMsg = "項目[3]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user4)){
			errMsg = "項目[4]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user5)){
			errMsg = "項目[5]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user6)){
			errMsg = "項目[6]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user7)){
			errMsg = "項目[7]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user8)){
			errMsg = "項目[8]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user9)){
			errMsg = "項目[9]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user10)){
			errMsg = "項目[10]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user11)){
			errMsg = "項目[11]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user12)){
			errMsg = "項目[12]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user13)){
			errMsg = "項目[13]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user14)){
			errMsg = "項目[14]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user15)){
			errMsg = "項目[15]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user16)){
			errMsg = "項目[16]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user17)){
			errMsg = "項目[17]を"+MSG.ERR_MSG_2;
			return flag = true;
		} else if(!isNumeric(user18)){
			errMsg = "項目[18]を"+MSG.ERR_MSG_2;
			return flag = true;
		}
		return flag;
	}

	/**
     * 画面側入力した騎手の番号をチェックする、
     * @return　
     */
	private boolean checkNo() {
		boolean flag = false;

		if(user1.isEmpty()) {
			errMsg = "項目[1]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user2.isEmpty()){
			errMsg = "項目[2]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user3.isEmpty()){
			errMsg = "項目[3]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user4.isEmpty()){
			errMsg = "項目[4]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user5.isEmpty()){
			errMsg = "項目[5]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user6.isEmpty()){
			errMsg = "項目[6]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user7.isEmpty()){
			errMsg = "項目[7]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user8.isEmpty()){
			errMsg = "項目[8]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user9.isEmpty()){
			errMsg = "項目[9]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user10.isEmpty()){
			errMsg = "項目[10]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user11.isEmpty()){
			errMsg = "項目[11]を"+MSG.ERR_MSG_1;
			return flag = true;
		} else if(user12.isEmpty()){
			errMsg = "項目[12]を"+MSG.ERR_MSG_1;
			return flag = true;
		}
//		else if(user13.isEmpty()){
//			errMsg = "項目[13]を"+MSG.ERR_MSG_1;
//			return flag = true;
//		} else if(user14.isEmpty()){
//			errMsg = "項目[14]を"+MSG.ERR_MSG_1;
//			return flag = true;
//		} else if(user15.isEmpty()){
//			errMsg = "項目[15]を"+MSG.ERR_MSG_1;
//			return flag = true;
//		} else if(user16.isEmpty()){
//			errMsg = "項目[16]を"+MSG.ERR_MSG_1;
//			return flag = true;
//		} else if(user17.isEmpty()){
//			errMsg = "項目[17]を"+MSG.ERR_MSG_1;
//			return flag = true;
//		} else if(user18.isEmpty()){
//			errMsg = "項目[18]を"+MSG.ERR_MSG_1;
//			return flag = true;
//		}
		return flag;
	}

	/**
     * DBから取得した騎手氏名情報を変数にセットする
     * @param aryJockeyNameDto 騎手氏名情報リスト
     * @return　
     */
	private void setName(List<JockeyNameDto> aryJockeyNameDto) {
		user1Name1 = aryJockeyNameDto.get(0).getName1();
		user1Name2 = aryJockeyNameDto.get(0).getName2();
		user2Name1 = aryJockeyNameDto.get(1).getName1();
		user2Name2 = aryJockeyNameDto.get(1).getName2();
		user3Name1 = aryJockeyNameDto.get(2).getName1();
		user3Name2 = aryJockeyNameDto.get(2).getName2();
		user4Name1 = aryJockeyNameDto.get(3).getName1();
		user4Name2 = aryJockeyNameDto.get(3).getName2();
		user5Name1 = aryJockeyNameDto.get(4).getName1();
		user5Name2 = aryJockeyNameDto.get(4).getName2();
		user6Name1 = aryJockeyNameDto.get(5).getName1();
		user6Name2 = aryJockeyNameDto.get(5).getName2();
		user7Name1 = aryJockeyNameDto.get(6).getName1();
		user7Name2 = aryJockeyNameDto.get(6).getName2();
		user8Name1 = aryJockeyNameDto.get(7).getName1();
		user8Name2 = aryJockeyNameDto.get(7).getName2();
		user9Name1 = aryJockeyNameDto.get(8).getName1();
		user9Name2 = aryJockeyNameDto.get(8).getName2();
		user10Name1 = aryJockeyNameDto.get(9).getName1();
		user10Name2 = aryJockeyNameDto.get(9).getName2();
		user11Name1 = aryJockeyNameDto.get(10).getName1();
		user11Name2 = aryJockeyNameDto.get(10).getName2();
		user12Name1 = aryJockeyNameDto.get(11).getName1();
		user12Name2 = aryJockeyNameDto.get(11).getName2();
		if (aryJockeyNameDto.size()>12 && aryJockeyNameDto.get(12) != null) {
			user13Name1 = aryJockeyNameDto.get(12).getName1();
			user13Name2 = aryJockeyNameDto.get(12).getName2();
		}
		if (aryJockeyNameDto.size()>13 && aryJockeyNameDto.get(13) != null) {
			user14Name1 = aryJockeyNameDto.get(13).getName1();
			user14Name2 = aryJockeyNameDto.get(13).getName2();
		}
		if (aryJockeyNameDto.size()>14 && aryJockeyNameDto.get(14) != null) {
			user15Name1 = aryJockeyNameDto.get(14).getName1();
			user15Name2 = aryJockeyNameDto.get(14).getName2();
		}
		if (aryJockeyNameDto.size()>15 && aryJockeyNameDto.get(15) != null) {
			user16Name1 = aryJockeyNameDto.get(15).getName1();
			user16Name2 = aryJockeyNameDto.get(15).getName2();
		}
		if (aryJockeyNameDto.size()>16 && aryJockeyNameDto.get(16) != null) {
			user17Name1 = aryJockeyNameDto.get(16).getName1();
			user17Name2 = aryJockeyNameDto.get(16).getName2();
		}
		if (aryJockeyNameDto.size()>16 && aryJockeyNameDto.get(16) != null) {
			user18Name1 = aryJockeyNameDto.get(17).getName1();
			user18Name2 = aryJockeyNameDto.get(17).getName2();
		}

	}


	/**
     * input画面入力した騎手番号を取得する
     * <br>
     * @return　
     */
	private List<String> getJockeyNoDto() {
		List<String> aryUser = new ArrayList<String>();
		aryUser.add(user1);
    	aryUser.add(user2);
    	aryUser.add(user3);
    	aryUser.add(user4);
    	aryUser.add(user5);
    	aryUser.add(user6);
    	aryUser.add(user7);
    	aryUser.add(user8);
    	aryUser.add(user9);
    	aryUser.add(user10);
    	aryUser.add(user11);
    	aryUser.add(user12);
    	if (!user13.isEmpty()) {
    		aryUser.add(user13);
    	}
    	if (!user14.isEmpty()) {
    		aryUser.add(user14);
    	}
    	if (!user15.isEmpty()) {
    		aryUser.add(user15);
    	}
    	if (!user16.isEmpty()) {
    		aryUser.add(user16);
    	}
    	if (!user17.isEmpty()) {
    		aryUser.add(user17);
    	}
    	if (!user18.isEmpty()) {
    		aryUser.add(user18);
    	}
		return aryUser;
	}


	/**
     * [パラメータチェック]<br>
	 * @param strNo
	 * @param aryJockeyNameDto
     * @return
     * @throws Exception
     */
    private JockeyNameDto getName(String strNo, List<JockeyNameDto> aryJockeyNameDto) throws Exception {

    	JockeyNameDto JockeyNameDto = null;

    	String sql = SQL.SELECT;

    	DbConfig dbConfig = DbConfig.getInstance();
    	Connection conn = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	conn = dbConfig.getConnection();

    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, strNo);

    		rs = ps.executeQuery();
    		// 結果取得されない場合
    		while (rs.next()) {

    			JockeyNameDto = new JockeyNameDto();
    			String name1 = this.changeFormat(rs.getString("name"))[0];
    			String name2 = this.changeFormat(rs.getString("name"))[1];
    			JockeyNameDto.setName1(name1);
    			JockeyNameDto.setName2(name2);
    			aryJockeyNameDto.add(JockeyNameDto);
    		}

    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		ps.close();
    		conn.close();
    	}
		return JockeyNameDto;
    }


	/**
     * 名前を割れる処理<br>
     * @return
     * @throws Exception
     */
	private String[] changeFormat(String name) {
		String[] aryStr = null;
		if (name.contains("　")) {
			aryStr = name.split("　");
		}else if (name.contains("・")) {
			aryStr = name.split("・");
		}
		return aryStr;
	}

	/**
     * 利用正则表达式判断字符串是否是数字
     * @param str
     * @return
     */
    public boolean isNumeric(String str){
           Pattern pattern = Pattern.compile("[0-9]*");
           Matcher isNum = pattern.matcher(str);
           if( !isNum.matches() ){
               return false;
           }
           return true;
    }


	public String getUser1() {
		return user1;
	}


	public void setUser1(String user1) {
		this.user1 = user1;
	}


	public String getUser2() {
		return user2;
	}


	public void setUser2(String user2) {
		this.user2 = user2;
	}


	public String getUser3() {
		return user3;
	}


	public void setUser3(String user3) {
		this.user3 = user3;
	}


	public String getUser4() {
		return user4;
	}


	public void setUser4(String user4) {
		this.user4 = user4;
	}


	public String getUser5() {
		return user5;
	}


	public void setUser5(String user5) {
		this.user5 = user5;
	}


	public String getUser6() {
		return user6;
	}


	public void setUser6(String user6) {
		this.user6 = user6;
	}


	public String getUser7() {
		return user7;
	}


	public void setUser7(String user7) {
		this.user7 = user7;
	}


	public String getUser8() {
		return user8;
	}


	public void setUser8(String user8) {
		this.user8 = user8;
	}


	public String getUser9() {
		return user9;
	}


	public void setUser9(String user9) {
		this.user9 = user9;
	}


	public String getUser10() {
		return user10;
	}


	public void setUser10(String user10) {
		this.user10 = user10;
	}


	public String getUser11() {
		return user11;
	}


	public void setUser11(String user11) {
		this.user11 = user11;
	}


	public String getUser12() {
		return user12;
	}


	public void setUser12(String user12) {
		this.user12 = user12;
	}


	public String getUser13() {
		return user13;
	}


	public void setUser13(String user13) {
		this.user13 = user13;
	}


	public String getUser14() {
		return user14;
	}


	public void setUser14(String user14) {
		this.user14 = user14;
	}


	public String getUser15() {
		return user15;
	}


	public void setUser15(String user15) {
		this.user15 = user15;
	}


	public String getUser16() {
		return user16;
	}


	public void setUser16(String user16) {
		this.user16 = user16;
	}


	public String getUser17() {
		return user17;
	}


	public void setUser17(String user17) {
		this.user17 = user17;
	}


	public String getUser18() {
		return user18;
	}


	public void setUser18(String user18) {
		this.user18 = user18;
	}


	public String getUser1Name1() {
		return user1Name1;
	}


	public void setUser1Name1(String user1Name1) {
		this.user1Name1 = user1Name1;
	}


	public String getUser2Name1() {
		return user2Name1;
	}


	public void setUser2Name1(String user2Name1) {
		this.user2Name1 = user2Name1;
	}


	public String getUser3Name1() {
		return user3Name1;
	}


	public void setUser3Name1(String user3Name1) {
		this.user3Name1 = user3Name1;
	}


	public String getUser4Name1() {
		return user4Name1;
	}


	public void setUser4Name1(String user4Name1) {
		this.user4Name1 = user4Name1;
	}


	public String getUser5Name1() {
		return user5Name1;
	}


	public void setUser5Name1(String user5Name1) {
		this.user5Name1 = user5Name1;
	}


	public String getUser6Name1() {
		return user6Name1;
	}


	public void setUser6Name1(String user6Name1) {
		this.user6Name1 = user6Name1;
	}


	public String getUser7Name1() {
		return user7Name1;
	}


	public void setUser7Name1(String user7Name1) {
		this.user7Name1 = user7Name1;
	}


	public String getUser8Name1() {
		return user8Name1;
	}


	public void setUser8Name1(String user8Name1) {
		this.user8Name1 = user8Name1;
	}


	public String getUser9Name1() {
		return user9Name1;
	}


	public void setUser9Name1(String user9Name1) {
		this.user9Name1 = user9Name1;
	}


	public String getUser10Name1() {
		return user10Name1;
	}


	public void setUser10Name1(String user10Name1) {
		this.user10Name1 = user10Name1;
	}


	public String getUser11Name1() {
		return user11Name1;
	}


	public void setUser11Name1(String user11Name1) {
		this.user11Name1 = user11Name1;
	}


	public String getUser12Name1() {
		return user12Name1;
	}


	public void setUser12Name1(String user12Name1) {
		this.user12Name1 = user12Name1;
	}


	public String getUser13Name1() {
		return user13Name1;
	}


	public void setUser13Name1(String user13Name1) {
		this.user13Name1 = user13Name1;
	}


	public String getUser14Name1() {
		return user14Name1;
	}


	public void setUser14Name1(String user14Name1) {
		this.user14Name1 = user14Name1;
	}


	public String getUser15Name1() {
		return user15Name1;
	}


	public void setUser15Name1(String user15Name1) {
		this.user15Name1 = user15Name1;
	}


	public String getUser16Name1() {
		return user16Name1;
	}


	public void setUser16Name1(String user16Name1) {
		this.user16Name1 = user16Name1;
	}


	public String getUser17Name1() {
		return user17Name1;
	}


	public void setUser17Name1(String user17Name1) {
		this.user17Name1 = user17Name1;
	}


	public String getUser18Name1() {
		return user18Name1;
	}


	public void setUser18Name1(String user18Name1) {
		this.user18Name1 = user18Name1;
	}


	public String getUser1Name2() {
		return user1Name2;
	}


	public void setUser1Name2(String user1Name2) {
		this.user1Name2 = user1Name2;
	}


	public String getUser2Name2() {
		return user2Name2;
	}


	public void setUser2Name2(String user2Name2) {
		this.user2Name2 = user2Name2;
	}


	public String getUser3Name2() {
		return user3Name2;
	}


	public void setUser3Name2(String user3Name2) {
		this.user3Name2 = user3Name2;
	}


	public String getUser4Name2() {
		return user4Name2;
	}


	public void setUser4Name2(String user4Name2) {
		this.user4Name2 = user4Name2;
	}


	public String getUser5Name2() {
		return user5Name2;
	}


	public void setUser5Name2(String user5Name2) {
		this.user5Name2 = user5Name2;
	}


	public String getUser6Name2() {
		return user6Name2;
	}


	public void setUser6Name2(String user6Name2) {
		this.user6Name2 = user6Name2;
	}


	public String getUser7Name2() {
		return user7Name2;
	}


	public void setUser7Name2(String user7Name2) {
		this.user7Name2 = user7Name2;
	}


	public String getUser8Name2() {
		return user8Name2;
	}


	public void setUser8Name2(String user8Name2) {
		this.user8Name2 = user8Name2;
	}


	public String getUser9Name2() {
		return user9Name2;
	}


	public void setUser9Name2(String user9Name2) {
		this.user9Name2 = user9Name2;
	}


	public String getUser10Name2() {
		return user10Name2;
	}


	public void setUser10Name2(String user10Name2) {
		this.user10Name2 = user10Name2;
	}


	public String getUser11Name2() {
		return user11Name2;
	}


	public void setUser11Name2(String user11Name2) {
		this.user11Name2 = user11Name2;
	}


	public String getUser12Name2() {
		return user12Name2;
	}


	public void setUser12Name2(String user12Name2) {
		this.user12Name2 = user12Name2;
	}


	public String getUser13Name2() {
		return user13Name2;
	}


	public void setUser13Name2(String user13Name2) {
		this.user13Name2 = user13Name2;
	}


	public String getUser14Name2() {
		return user14Name2;
	}


	public void setUser14Name2(String user14Name2) {
		this.user14Name2 = user14Name2;
	}


	public String getUser15Name2() {
		return user15Name2;
	}


	public void setUser15Name2(String user15Name2) {
		this.user15Name2 = user15Name2;
	}


	public String getUser16Name2() {
		return user16Name2;
	}


	public void setUser16Name2(String user16Name2) {
		this.user16Name2 = user16Name2;
	}


	public String getUser17Name2() {
		return user17Name2;
	}


	public void setUser17Name2(String user17Name2) {
		this.user17Name2 = user17Name2;
	}


	public String getUser18Name2() {
		return user18Name2;
	}


	public void setUser18Name2(String user18Name2) {
		this.user18Name2 = user18Name2;
	}



	public String getHouse1() {
		return house1;
	}

	public void setHouse1(String house1) {
		this.house1 = house1;
	}

	public String getHouse2() {
		return house2;
	}

	public void setHouse2(String house2) {
		this.house2 = house2;
	}

	public String getHouse3() {
		return house3;
	}

	public void setHouse3(String house3) {
		this.house3 = house3;
	}

	public String getHouse4() {
		return house4;
	}

	public void setHouse4(String house4) {
		this.house4 = house4;
	}

	public String getHouse5() {
		return house5;
	}

	public void setHouse5(String house5) {
		this.house5 = house5;
	}

	public String getHouse6() {
		return house6;
	}

	public void setHouse6(String house6) {
		this.house6 = house6;
	}

	public String getHouse7() {
		return house7;
	}

	public void setHouse7(String house7) {
		this.house7 = house7;
	}

	public String getHouse8() {
		return house8;
	}

	public void setHouse8(String house8) {
		this.house8 = house8;
	}

	public String getHouse9() {
		return house9;
	}

	public void setHouse9(String house9) {
		this.house9 = house9;
	}

	public String getHouse10() {
		return house10;
	}

	public void setHouse10(String house10) {
		this.house10 = house10;
	}

	public String getHouse11() {
		return house11;
	}

	public void setHouse11(String house11) {
		this.house11 = house11;
	}

	public String getHouse12() {
		return house12;
	}

	public void setHouse12(String house12) {
		this.house12 = house12;
	}

	public String getHouse13() {
		return house13;
	}

	public void setHouse13(String house13) {
		this.house13 = house13;
	}

	public String getHouse14() {
		return house14;
	}

	public void setHouse14(String house14) {
		this.house14 = house14;
	}

	public String getHouse15() {
		return house15;
	}

	public void setHouse15(String house15) {
		this.house15 = house15;
	}

	public String getHouse16() {
		return house16;
	}

	public void setHouse16(String house16) {
		this.house16 = house16;
	}

	public String getHouse17() {
		return house17;
	}

	public void setHouse17(String house17) {
		this.house17 = house17;
	}

	public String getHouse18() {
		return house18;
	}

	public void setHouse18(String house18) {
		this.house18 = house18;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}


}
