package com.beautyred.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResetAction {

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
    * [アクション実行処理]<br>
    * @return
    * @throws Exception
    */
   public String execute() throws Exception {


       return RESULT.SUCCESS;
   }
}
