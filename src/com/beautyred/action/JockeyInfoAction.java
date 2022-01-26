package com.beautyred.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.beautyred.config.DbConfig;
import com.beautyred.dto.JockeyInfoDto;

//import com.beautyred.action.ToRegister.RESULT;

public class JockeyInfoAction {

    /** SQL文 */
	private interface SQL{
		// 検索SQL
		String SELECT = "select * from jockeys";

	}

	/** 処理結果 */
	private interface RESULT {
		// 成功
		String SUCCESS = "success";
		// 失敗
		String FAILD = "faild";
	}

	/** ロガー */
	private Logger logger = LogManager.getLogger(ToRegister.class);

	/** エラーメッセージ */
	private final String ERR_MSG = "パスワードが違います。";

	JockeyInfoDto jockeyInfoDto = new JockeyInfoDto();
	List<JockeyInfoDto> aryJockeyInfoDto = new ArrayList<JockeyInfoDto>();
	// 获得请求
    HttpServletRequest  request = ServletActionContext.getRequest();

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

		this.getJockeyInfo();
		 request.setAttribute("aryJockeyInfoDto", aryJockeyInfoDto);

		return RESULT.SUCCESS;
	}

	/**
	* <PRE>
	* 処理名：騎手情報取得
	* <br>
	* @param maruResult　年、月、日〇を付けた結果
	 * @throws Exception
	*/
	private void getJockeyInfo() throws Exception {

		JockeyInfoDto jockeyInfoDto = null;

		String sql = SQL.SELECT;

		DbConfig dbConfig = DbConfig.getInstance();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = dbConfig.getConnection();

		try {
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			// 結果取得されない場合
			while (rs.next()) {

				jockeyInfoDto = new JockeyInfoDto();

				jockeyInfoDto.setId(rs.getString("id"));
				jockeyInfoDto.setName(rs.getString("name"));
				jockeyInfoDto.setYear(rs.getString("year"));
				jockeyInfoDto.setMonth(rs.getString("month"));
				jockeyInfoDto.setDay(rs.getString("day"));
				aryJockeyInfoDto.add(jockeyInfoDto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ps.close();
			conn.close();
		}
	}

	public JockeyInfoDto getJockeyInfoDto() {
		return jockeyInfoDto;
	}

	public void setJockeyInfoDto(JockeyInfoDto jockeyInfoDto) {
		this.jockeyInfoDto = jockeyInfoDto;
	}

	public List<JockeyInfoDto> getAryJockeyInfoDto() {
		return aryJockeyInfoDto;
	}

	public void setAryJockeyInfoDto(List<JockeyInfoDto> aryJockeyInfoDto) {
		this.aryJockeyInfoDto = aryJockeyInfoDto;
	}


}
