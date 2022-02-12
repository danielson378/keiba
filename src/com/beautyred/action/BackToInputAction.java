package com.beautyred.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * [Input画面戻るのアクションクラス]<br>
 * <br>
 * @author tarosa0001
 */
public class BackToInputAction {


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


	 /** 処理結果 */
	private interface RESULT{
		// 成功
		String SUCCESS = "success";
		// 失敗
		String FAILD = "faild";
	}
   /** ロガー */
   private Logger logger = LogManager.getLogger(ToRegister.class);

   /** エラーメッセージ */
   private final String ERR_MSG = "パスワードが違います。";

   /**
    * [result画面からinput画面戻る処理]<br>
    * @return
    */
   public String execute() {

       return RESULT.SUCCESS;
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

public Logger getLogger() {
	return logger;
}

public void setLogger(Logger logger) {
	this.logger = logger;
}


}
