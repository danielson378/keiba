package com.beautyred.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * [騎手情報登録画面遷移のアクションクラス]<br>
 * <br>
 * @author tarosa0001
 */
public class ToRegister {

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
     * HelloWorldを出力する処理を実行する。<br>
     * 実行するメソッドは、struts.xmlで指定したメソッド名を使用して実装する。<br>
     * Struts2ではアクションの処理結果でページの遷移先を決定するが、
     * 今回は"success"の固定文字列を返却する。<br>
     * <br>
     * @return
     * @throws Exception
     */
    public String execute() throws Exception {


        return RESULT.SUCCESS;
    }

}
