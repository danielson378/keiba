package com.beautyred.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.beautyred.config.DbConfig;
import com.beautyred.dto.BaseNum;
import com.beautyred.dto.JockeyNoDto;
import com.beautyred.dto.JockeysBirthdayDto;

/**
 * [主処理のアクションクラス]<br>
 * <br>
 * @author tarosa0001
 */
public class ProcessAction {

    /** SQL文 */
	private interface SQL{
		String SELECT = "select * from jockeys where id=?";
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

    /** SQL文 */
	private interface TEXT{
		// 検索SQL
		String RED_STAR = "<span class=\"tRed01\">★</span>";
	}
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
    //////////////　年　//////////////
    /** 年1 */
    private String year1;
    /** 年2 */
    private String year2;
    /** 年3 */
    private String year3;
    /** 年4 */
    private String year4;
    /** 年5 */
    private String year5;
    /** 年6 */
    private String year6;
    /** 年7 */
    private String year7;
    /** 年8 */
    private String year8;
    /** 年9 */
    private String year9;
    /** 年10 */
    private String year10;
    /** 年11 */
    private String year11;
    /** 年12 */
    private String year12;
    /** 年13 */
    private String year13;
    /** 年14 */
    private String year14;
    /** 年15 */
    private String year15;
    /** 年16 */
    private String year16;
    /** 年17 */
    private String year17;
    /** 年18 */
    private String year18;
    //////////////　月　//////////////
    /** 月1 */
    private String month1;
    /** 月2 */
    private String month2;
    /** 月3 */
    private String month3;
    /** 月4 */
    private String month4;
    /** 月5 */
    private String month5;
    /** 月6 */
    private String month6;
    /** 月7 */
    private String month7;
    /** 月8 */
    private String month8;
    /** 月9 */
    private String month9;
    /** 月10 */
    private String month10;
    /** 月11 */
    private String month11;
    /** 月12 */
    private String month12;
    /** 月13 */
    private String month13;
    /** 月14 */
    private String month14;
    /** 月15 */
    private String month15;
    /** 月16 */
    private String month16;
    /** 月17 */
    private String month17;
    /** 月18 */
    private String month18;
    //////////////　日　//////////////
    /** 日1 */
    private String day1;
    /** 日2 */
    private String day2;
    /** 日3 */
    private String day3;
    /** 日4 */
    private String day4;
    /** 日5 */
    private String day5;
    /** 日6 */
    private String day6;
    /** 日7 */
    private String day7;
    /** 日8 */
    private String day8;
    /** 日9 */
    private String day9;
    /** 日10 */
    private String day10;
    /** 日11 */
    private String day11;
    /** 日12 */
    private String day12;
    /** 日13 */
    private String day13;
    /** 日14 */
    private String day14;
    /** 日15 */
    private String day15;
    /** 日16 */
    private String day16;
    /** 日17 */
    private String day17;
    /** 日18 */
    private String day18;


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
    /** 1、4、7、10 */
    private static final List<String> NUM14710 = Arrays.asList("1","4","7","10");
    /** 2、5、8、11 */
    private static final List<String> NUM25811 = Arrays.asList("2","5","8","11");
    /** 3、6、9、12 */
    private static final List<String> NUM36912 = Arrays.asList("3","6","9","12");

    // 年base数字 Ya行

    // BaseNum
    BaseNum baseNum = new BaseNum();

    Map<String, String> yearMap = new HashMap<String, String>();
    Map<String, String> monthMap = new HashMap<String, String>();
    Map<String, String> dayMap = new HashMap<String, String>();

    Map<String, String> starMap = new HashMap<String, String>();

    /** エラーメッセージ */
    private final String ERR_MSG = "入力した騎手番号が確認できません。番号を確認してください。";
	 /** エラーメッセージ */
	private interface MSG{
		// 失敗1
		String ERR_MSG_1 = "番号を入力してください。";
		// 失敗1
//		String ERR_MSG_2 = "半角数字を入力してください。";
		// 失敗1
		String ERR_MSG_2 = "入力した騎手番号が確認できません。番号を確認してください。";
	}

    /**
     * [主処理]<br>
     * <br>
     * @return
     * @throws Exception
     */
    public String execute() throws Exception {
        logger.info("入力されたユーザーIDは「{}」です。", user1);

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

        // 騎手誕生日DTO
        List<JockeysBirthdayDto> aryJockeysBirthdayDto = new ArrayList<JockeysBirthdayDto>();

        // 騎手番号DTO
        JockeyNoDto jockeyNoDto = new JockeyNoDto();
        // 年情報
        List<String> aryYears = new ArrayList<String>();

        // 月情報
        List<String> aryMonths = new ArrayList<String>();
        // 日情報
        List<String> aryDays = new ArrayList<String>();
        // 画面側から騎手番号を取得
        jockeyNoDto = getJockeyNoDto();

        // 画面側騎手番号1つでも入力されない場合、エラーする
        if (null == jockeyNoDto) {
        	errMsg = MSG.ERR_MSG_1;
        	request.setAttribute("errMsg", errMsg);
        	return RESULT.FAILD;
        }
        // 騎手誕生日を取得
        for (String user : jockeyNoDto.getAryUser()) {

        	// 騎手誕生日の年、月、日どちらかnullの場合、FAILDを返却する
        	JockeysBirthdayDto jockeysBirthdayDto = getJockeysInfo(user);
        	if (null == jockeysBirthdayDto.getYear()
        			|| null == jockeysBirthdayDto.getMonth()
        			|| null == jockeysBirthdayDto.getDay()) {

                errMsg = MSG.ERR_MSG_2 + "[" + user + "]";
                request.setAttribute("errMsg", errMsg);
        		return RESULT.FAILD;
        	}
        	aryJockeysBirthdayDto.add(getJockeysInfo(user));
        }

        if (null != aryJockeysBirthdayDto) {

            // 〇を付けた結果をLISTに詰める（★を付ける計算のため）
    		List<String> yearMaruResult = new ArrayList<String>();
    		List<String> monthMaruResult = new ArrayList<String>();
    		List<String> dayMaruResult = new ArrayList<String>();


        	// 12に変更する
        	this.setResult(aryJockeysBirthdayDto);
        	// 12に変更した結果Listに詰める
        	this.setChangeResult(aryYears, aryMonths, aryDays);

        	// base数字を〇を付ける
        	this.maruPro(aryYears, aryMonths, aryDays, yearMaruResult, monthMaruResult, dayMaruResult);

        	// ★を付ける
        	this.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);

        	return RESULT.SUCCESS;

        }
        // 結果がなければ、エラーメッセージ設定する
        errMsg = ERR_MSG;

//        session.setAttribute("errMsg", errMsg);
        request.setAttribute("errMsg", errMsg);

        return RESULT.FAILD;
    }

	/**
     * 数字を12に変更した結果画面側に返却する項目（レスポンス）は設定する
     * <br>
     * @param aryJockeysBirthdayDto 騎手誕生日情報クラスリスト
     */
	private void setResult(List<JockeysBirthdayDto> aryJockeysBirthdayDto) {
		year1 = chenge12Pro(aryJockeysBirthdayDto.get(0).getYear());
		year2 = chenge12Pro(aryJockeysBirthdayDto.get(1).getYear());
		year3 = chenge12Pro(aryJockeysBirthdayDto.get(2).getYear());
		year4 = chenge12Pro(aryJockeysBirthdayDto.get(3).getYear());
		year5 = chenge12Pro(aryJockeysBirthdayDto.get(4).getYear());
		year6 = chenge12Pro(aryJockeysBirthdayDto.get(5).getYear());
		year7 = chenge12Pro(aryJockeysBirthdayDto.get(6).getYear());
		year8 = chenge12Pro(aryJockeysBirthdayDto.get(7).getYear());
		year9 = chenge12Pro(aryJockeysBirthdayDto.get(8).getYear());
		year10 = chenge12Pro(aryJockeysBirthdayDto.get(9).getYear());
		year11 = chenge12Pro(aryJockeysBirthdayDto.get(10).getYear());
		year12 = chenge12Pro(aryJockeysBirthdayDto.get(11).getYear());
		if (aryJockeysBirthdayDto.size()>12 && aryJockeysBirthdayDto.get(12) != null) {
			year13 = chenge12Pro(aryJockeysBirthdayDto.get(12).getYear());
		}
		if (aryJockeysBirthdayDto.size()>13 && aryJockeysBirthdayDto.get(13) != null) {
			year14 = chenge12Pro(aryJockeysBirthdayDto.get(13).getYear());
		}
		if (aryJockeysBirthdayDto.size()>14 && aryJockeysBirthdayDto.get(14) != null) {
			year15 = chenge12Pro(aryJockeysBirthdayDto.get(14).getYear());
		}
		if (aryJockeysBirthdayDto.size()>15 && aryJockeysBirthdayDto.get(15) != null) {
			year16 = chenge12Pro(aryJockeysBirthdayDto.get(15).getYear());
		}
		if (aryJockeysBirthdayDto.size()>16 && aryJockeysBirthdayDto.get(16) != null) {
			year17 = chenge12Pro(aryJockeysBirthdayDto.get(16).getYear());
		}
		if (aryJockeysBirthdayDto.size()>17 && aryJockeysBirthdayDto.get(17) != null) {
			year18 = chenge12Pro(aryJockeysBirthdayDto.get(17).getYear());
		}

		month1 = chenge12Pro(aryJockeysBirthdayDto.get(0).getMonth());
		month2 = chenge12Pro(aryJockeysBirthdayDto.get(1).getMonth());
		month3 = chenge12Pro(aryJockeysBirthdayDto.get(2).getMonth());
		month4 = chenge12Pro(aryJockeysBirthdayDto.get(3).getMonth());
		month5 = chenge12Pro(aryJockeysBirthdayDto.get(4).getMonth());
		month6 = chenge12Pro(aryJockeysBirthdayDto.get(5).getMonth());
		month7 = chenge12Pro(aryJockeysBirthdayDto.get(6).getMonth());
		month8 = chenge12Pro(aryJockeysBirthdayDto.get(7).getMonth());
		month9 = chenge12Pro(aryJockeysBirthdayDto.get(8).getMonth());
		month10 = chenge12Pro(aryJockeysBirthdayDto.get(9).getMonth());
		month11 = chenge12Pro(aryJockeysBirthdayDto.get(10).getMonth());
		month12 = chenge12Pro(aryJockeysBirthdayDto.get(11).getMonth());
		if (aryJockeysBirthdayDto.size()>12 && aryJockeysBirthdayDto.get(12) != null) {
			month13 = chenge12Pro(aryJockeysBirthdayDto.get(12).getMonth());
		}
		if (aryJockeysBirthdayDto.size()>13 && aryJockeysBirthdayDto.get(13) != null) {
			month14 = chenge12Pro(aryJockeysBirthdayDto.get(13).getMonth());
		}
		if (aryJockeysBirthdayDto.size()>14 && aryJockeysBirthdayDto.get(14) != null) {
			month15 = chenge12Pro(aryJockeysBirthdayDto.get(14).getMonth());
		}
		if (aryJockeysBirthdayDto.size()>15 && aryJockeysBirthdayDto.get(15) != null) {
			month16 = chenge12Pro(aryJockeysBirthdayDto.get(15).getMonth());
		}
		if (aryJockeysBirthdayDto.size()>16 && aryJockeysBirthdayDto.get(16) != null) {
			month17 = chenge12Pro(aryJockeysBirthdayDto.get(16).getMonth());
		}
		if (aryJockeysBirthdayDto.size()>17 && aryJockeysBirthdayDto.get(17) != null) {
			month18 = chenge12Pro(aryJockeysBirthdayDto.get(17).getMonth());
		}

		day1 = chenge12Pro(aryJockeysBirthdayDto.get(0).getDay());
		day2 = chenge12Pro(aryJockeysBirthdayDto.get(1).getDay());
		day3 = chenge12Pro(aryJockeysBirthdayDto.get(2).getDay());
		day4 = chenge12Pro(aryJockeysBirthdayDto.get(3).getDay());
		day5 = chenge12Pro(aryJockeysBirthdayDto.get(4).getDay());
		day6 = chenge12Pro(aryJockeysBirthdayDto.get(5).getDay());
		day7 = chenge12Pro(aryJockeysBirthdayDto.get(6).getDay());
		day8 = chenge12Pro(aryJockeysBirthdayDto.get(7).getDay());
		day9 = chenge12Pro(aryJockeysBirthdayDto.get(8).getDay());
		day10 = chenge12Pro(aryJockeysBirthdayDto.get(9).getDay());
		day11 = chenge12Pro(aryJockeysBirthdayDto.get(10).getDay());
		day12 = chenge12Pro(aryJockeysBirthdayDto.get(11).getDay());
		if (aryJockeysBirthdayDto.size()>12 && aryJockeysBirthdayDto.get(12) != null) {
			day13 = chenge12Pro(aryJockeysBirthdayDto.get(12).getDay());
		}
		if (aryJockeysBirthdayDto.size()>13 && aryJockeysBirthdayDto.get(13) != null) {
			day14 = chenge12Pro(aryJockeysBirthdayDto.get(13).getDay());
		}
		if (aryJockeysBirthdayDto.size()>14 && aryJockeysBirthdayDto.get(14) != null) {
			day15 = chenge12Pro(aryJockeysBirthdayDto.get(14).getDay());
		}
		if (aryJockeysBirthdayDto.size()>15 && aryJockeysBirthdayDto.get(15) != null) {
			day16 = chenge12Pro(aryJockeysBirthdayDto.get(15).getDay());
		}
		if (aryJockeysBirthdayDto.size()>16 && aryJockeysBirthdayDto.get(16) != null) {
			day17 = chenge12Pro(aryJockeysBirthdayDto.get(16).getDay());
		}
		if (aryJockeysBirthdayDto.size()>17 && aryJockeysBirthdayDto.get(17) != null) {
			day18 = chenge12Pro(aryJockeysBirthdayDto.get(17).getDay());
		}

	}


	/**
     * 数字を12に変更する
     * <br>
     * @param str 年・月・日
     * @return　result 計算結果
     */
    private String chenge12Pro(String str) {
    	int target = Integer.parseInt(str);
    	if (target>12) {
    		target=target%12;
    	}
    	if (target == 0) {
    		target = 12;
    	}
    	int result = target;
		return String.valueOf(result);
	}


	/**
     * input画面入力した騎手番号を取得する
     * <br>
     * @return　
     */
    private JockeyNoDto getJockeyNoDto() {
    	JockeyNoDto jockeyNoDto = new JockeyNoDto();
    	List<String> aryUser = new ArrayList<String>();
    	if (!user1.isEmpty()) {
    		aryUser.add(user1);
    	}
    	if (!user2.isEmpty()) {
    		aryUser.add(user2);
    	}
    	if (!user3.isEmpty()) {
    		aryUser.add(user3);
    	}
    	if (!user4.isEmpty()) {
    		aryUser.add(user4);
    	}
    	if (!user5.isEmpty()) {
    		aryUser.add(user5);
    	}
    	if (!user6.isEmpty()) {
    		aryUser.add(user6);
    	}
    	if (!user7.isEmpty()) {
    		aryUser.add(user7);
    	}
    	if (!user8.isEmpty()) {
    		aryUser.add(user8);
    	}
    	if (!user9.isEmpty()) {
    		aryUser.add(user9);
    	}
    	if (!user10.isEmpty()) {
    		aryUser.add(user10);
    	}
    	if (!user11.isEmpty()) {
    		aryUser.add(user11);
    	}
    	if (!user12.isEmpty()) {
    		aryUser.add(user12);
    	}
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
    	if (aryUser.size() == 0) {
    		return null;
    	}
    	jockeyNoDto.setAryUser(aryUser);
		return jockeyNoDto;
	}

    /**
     * <PRE>
     * 処理名：騎手誕生日情報を取得
     * <br>
     * @param user 騎手番号
     * @return　騎手誕生日情報
     * @throws Exception
     */
	private JockeysBirthdayDto getJockeysInfo(String user) throws Exception {

    	String sql = SQL.SELECT;

    	DbConfig dbConfig = DbConfig.getInstance();
    	Connection conn = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	conn = dbConfig.getConnection();

    	JockeysBirthdayDto jockeysBirthdayDto = new JockeysBirthdayDto();
    	try {
    		ps = conn.prepareStatement(sql);
    		ps.setString(1, user);

    		rs = ps.executeQuery();

    		while (rs.next()) {
    			jockeysBirthdayDto.setYear(rs.getString("year"));
    			jockeysBirthdayDto.setMonth(rs.getString("month"));
    			jockeysBirthdayDto.setDay(rs.getString("day"));
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		if (rs != null) {
    			try {
    				rs.close();
    			} catch (Exception e) {
    				// 何もしない
    			}
    		}
    		if (ps != null) {
    			try {
    				ps.close();
    			} catch (Exception e) {
    				// 何もしない
    			}
    		}
    		if (conn != null) {
    			try {
    				conn.close();
    			} catch (Exception e) {
    				// 何もしない
    			}
    		}
    	}

		return jockeysBirthdayDto;
	}

    /**
     * <PRE>
     * 処理名：生年月日の数字を12に変換した結果をListに設定する
     * <br>
     * @param user 騎手番号
     * @return　騎手誕生日情報
     * @throws Exception
     */
	private void setChangeResult(List<String> aryYears, List<String> aryMonths, List<String> aryDays) {
		// 年
		aryYears.add(year1);
		aryYears.add(year2);
		aryYears.add(year3);
		aryYears.add(year4);
		aryYears.add(year5);
		aryYears.add(year6);
		aryYears.add(year7);
		aryYears.add(year8);
		aryYears.add(year9);
		aryYears.add(year10);
		aryYears.add(year11);
		aryYears.add(year12);
		aryYears.add(year13);
		aryYears.add(year14);
		aryYears.add(year15);
		aryYears.add(year16);
		aryYears.add(year17);
		aryYears.add(year18);

		// 月
		aryMonths.add(month1);
		aryMonths.add(month2);
		aryMonths.add(month3);
		aryMonths.add(month4);
		aryMonths.add(month5);
		aryMonths.add(month6);
		aryMonths.add(month7);
		aryMonths.add(month8);
		aryMonths.add(month9);
		aryMonths.add(month10);
		aryMonths.add(month11);
		aryMonths.add(month12);
		aryMonths.add(month13);
		aryMonths.add(month14);
		aryMonths.add(month15);
		aryMonths.add(month16);
		aryMonths.add(month17);
		aryMonths.add(month18);

		// 日
		aryDays.add(day1);
		aryDays.add(day2);
		aryDays.add(day3);
		aryDays.add(day4);
		aryDays.add(day5);
		aryDays.add(day6);
		aryDays.add(day7);
		aryDays.add(day8);
		aryDays.add(day9);
		aryDays.add(day10);
		aryDays.add(day11);
		aryDays.add(day12);
		aryDays.add(day13);
		aryDays.add(day14);
		aryDays.add(day15);
		aryDays.add(day16);
		aryDays.add(day17);
		aryDays.add(day18);
	}

    /**
     * <PRE>
     * 処理名：基本数字に生年月日の数字がない場合は、〇を付ける
     * <br>
     * @param aryYears 年リスト
     * @param aryMonths 月リスト
     * @param aryDays 日リスト
     * @param dayResult
     * @param monthResult
     * @param yearResult
     */
	private void maruPro(List<String> aryYears, List<String> aryMonths, List<String> aryDays, List<String> yearResult, List<String> monthResult, List<String> dayResult) {

		yearMap.put("YaR3", baseNum.getYaR3());
		yearMap.put("YaR2", baseNum.getYaR2());
		yearMap.put("YaR1", baseNum.getYaR1());
		yearMap.put("Ya1", baseNum.getYa1());
		yearMap.put("Ya2", baseNum.getYa2());
		yearMap.put("Ya3", baseNum.getYa3());
		yearMap.put("Ya4", baseNum.getYa4());
		yearMap.put("Ya5", baseNum.getYa5());
		yearMap.put("Ya6", baseNum.getYa6());
		yearMap.put("Ya7", baseNum.getYa7());
		yearMap.put("Ya8", baseNum.getYa8());
		yearMap.put("Ya9", baseNum.getYa9());
		yearMap.put("Ya10", baseNum.getYa10());
		yearMap.put("Ya11", baseNum.getYa11());
		yearMap.put("Ya12", baseNum.getYa12());
		yearMap.put("Ya13", baseNum.getYa13());
		yearMap.put("Ya14", baseNum.getYa14());
		yearMap.put("Ya15", baseNum.getYa15());
		yearMap.put("Ya16", baseNum.getYa16());
		yearMap.put("Ya17", baseNum.getYa17());
		yearMap.put("Ya18", baseNum.getYa18());
		yearMap.put("YaL1", baseNum.getYaL1());
		yearMap.put("YaL2", baseNum.getYaL2());
		yearMap.put("YaL3", baseNum.getYaL3());

		yearMap.put("YbR3", baseNum.getYbR3());
		yearMap.put("YbR2", baseNum.getYbR2());
		yearMap.put("YbR1", baseNum.getYbR1());
		yearMap.put("Yb1", baseNum.getYb1());
		yearMap.put("Yb2", baseNum.getYb2());
		yearMap.put("Yb3", baseNum.getYb3());
		yearMap.put("Yb4", baseNum.getYb4());
		yearMap.put("Yb5", baseNum.getYb5());
		yearMap.put("Yb6", baseNum.getYb6());
		yearMap.put("Yb7", baseNum.getYb7());
		yearMap.put("Yb8", baseNum.getYb8());
		yearMap.put("Yb9", baseNum.getYb9());
		yearMap.put("Yb10", baseNum.getYb10());
		yearMap.put("Yb11", baseNum.getYb11());
		yearMap.put("Yb12", baseNum.getYb12());
		yearMap.put("Yb13", baseNum.getYb13());
		yearMap.put("Yb14", baseNum.getYb14());
		yearMap.put("Yb15", baseNum.getYb15());
		yearMap.put("Yb16", baseNum.getYb16());
		yearMap.put("Yb17", baseNum.getYb17());
		yearMap.put("Yb18", baseNum.getYb18());
		yearMap.put("YbL1", baseNum.getYbL1());
		yearMap.put("YbL2", baseNum.getYbL2());
		yearMap.put("YbL3", baseNum.getYbL3());

		yearMap.put("YcR3", baseNum.getYcR3());
		yearMap.put("YcR2", baseNum.getYcR2());
		yearMap.put("YcR1", baseNum.getYcR1());
		yearMap.put("Yc1", baseNum.getYc1());
		yearMap.put("Yc2", baseNum.getYc2());
		yearMap.put("Yc3", baseNum.getYc3());
		yearMap.put("Yc4", baseNum.getYc4());
		yearMap.put("Yc5", baseNum.getYc5());
		yearMap.put("Yc6", baseNum.getYc6());
		yearMap.put("Yc7", baseNum.getYc7());
		yearMap.put("Yc8", baseNum.getYc8());
		yearMap.put("Yc9", baseNum.getYc9());
		yearMap.put("Yc10", baseNum.getYc10());
		yearMap.put("Yc11", baseNum.getYc11());
		yearMap.put("Yc12", baseNum.getYc12());
		yearMap.put("Yc13", baseNum.getYc13());
		yearMap.put("Yc14", baseNum.getYc14());
		yearMap.put("Yc15", baseNum.getYc15());
		yearMap.put("Yc16", baseNum.getYc16());
		yearMap.put("Yc17", baseNum.getYc17());
		yearMap.put("Yc18", baseNum.getYc18());
		yearMap.put("YcL1", baseNum.getYcL1());
		yearMap.put("YcL2", baseNum.getYcL2());
		yearMap.put("YcL3", baseNum.getYcL3());

		yearMap.put("YdR3", baseNum.getYdR3());
		yearMap.put("YdR2", baseNum.getYdR2());
		yearMap.put("YdR1", baseNum.getYdR1());
		yearMap.put("Yd1", baseNum.getYd1());
		yearMap.put("Yd2", baseNum.getYd2());
		yearMap.put("Yd3", baseNum.getYd3());
		yearMap.put("Yd4", baseNum.getYd4());
		yearMap.put("Yd5", baseNum.getYd5());
		yearMap.put("Yd6", baseNum.getYd6());
		yearMap.put("Yd7", baseNum.getYd7());
		yearMap.put("Yd8", baseNum.getYd8());
		yearMap.put("Yd9", baseNum.getYd9());
		yearMap.put("Yd10", baseNum.getYd10());
		yearMap.put("Yd11", baseNum.getYd11());
		yearMap.put("Yd12", baseNum.getYd12());
		yearMap.put("Yd13", baseNum.getYd13());
		yearMap.put("Yd14", baseNum.getYd14());
		yearMap.put("Yd15", baseNum.getYd15());
		yearMap.put("Yd16", baseNum.getYd16());
		yearMap.put("Yd17", baseNum.getYd17());
		yearMap.put("Yd18", baseNum.getYd18());
		yearMap.put("YdL1", baseNum.getYdL1());
		yearMap.put("YdL2", baseNum.getYdL2());
		yearMap.put("YdL3", baseNum.getYdL3());

		monthMap.put("MaR3", baseNum.getMaR3());
		monthMap.put("MaR2", baseNum.getMaR2());
		monthMap.put("MaR1", baseNum.getMaR1());
		monthMap.put("Ma1", baseNum.getMa1());
		monthMap.put("Ma2", baseNum.getMa2());
		monthMap.put("Ma3", baseNum.getMa3());
		monthMap.put("Ma4", baseNum.getMa4());
		monthMap.put("Ma5", baseNum.getMa5());
		monthMap.put("Ma6", baseNum.getMa6());
		monthMap.put("Ma7", baseNum.getMa7());
		monthMap.put("Ma8", baseNum.getMa8());
		monthMap.put("Ma9", baseNum.getMa9());
		monthMap.put("Ma10", baseNum.getMa10());
		monthMap.put("Ma11", baseNum.getMa11());
		monthMap.put("Ma12", baseNum.getMa12());
		monthMap.put("Ma13", baseNum.getMa13());
		monthMap.put("Ma14", baseNum.getMa14());
		monthMap.put("Ma15", baseNum.getMa15());
		monthMap.put("Ma16", baseNum.getMa16());
		monthMap.put("Ma17", baseNum.getMa17());
		monthMap.put("Ma18", baseNum.getMa18());
		monthMap.put("MaL1", baseNum.getMaL1());
		monthMap.put("MaL2", baseNum.getMaL2());
		monthMap.put("MaL3", baseNum.getMaL3());

		monthMap.put("MbR3", baseNum.getMbR3());
		monthMap.put("MbR2", baseNum.getMbR2());
		monthMap.put("MbR1", baseNum.getMbR1());
		monthMap.put("Mb1", baseNum.getMb1());
		monthMap.put("Mb2", baseNum.getMb2());
		monthMap.put("Mb3", baseNum.getMb3());
		monthMap.put("Mb4", baseNum.getMb4());
		monthMap.put("Mb5", baseNum.getMb5());
		monthMap.put("Mb6", baseNum.getMb6());
		monthMap.put("Mb7", baseNum.getMb7());
		monthMap.put("Mb8", baseNum.getMb8());
		monthMap.put("Mb9", baseNum.getMb9());
		monthMap.put("Mb10", baseNum.getMb10());
		monthMap.put("Mb11", baseNum.getMb11());
		monthMap.put("Mb12", baseNum.getMb12());
		monthMap.put("Mb13", baseNum.getMb13());
		monthMap.put("Mb14", baseNum.getMb14());
		monthMap.put("Mb15", baseNum.getMb15());
		monthMap.put("Mb16", baseNum.getMb16());
		monthMap.put("Mb17", baseNum.getMb17());
		monthMap.put("Mb18", baseNum.getMb18());
		monthMap.put("MbL1", baseNum.getMbL1());
		monthMap.put("MbL2", baseNum.getMbL2());
		monthMap.put("MbL3", baseNum.getMbL3());

		monthMap.put("McR3", baseNum.getMcR3());
		monthMap.put("McR2", baseNum.getMcR2());
		monthMap.put("McR1", baseNum.getMcR1());
		monthMap.put("Mc1", baseNum.getMc1());
		monthMap.put("Mc2", baseNum.getMc2());
		monthMap.put("Mc3", baseNum.getMc3());
		monthMap.put("Mc4", baseNum.getMc4());
		monthMap.put("Mc5", baseNum.getMc5());
		monthMap.put("Mc6", baseNum.getMc6());
		monthMap.put("Mc7", baseNum.getMc7());
		monthMap.put("Mc8", baseNum.getMc8());
		monthMap.put("Mc9", baseNum.getMc9());
		monthMap.put("Mc10", baseNum.getMc10());
		monthMap.put("Mc11", baseNum.getMc11());
		monthMap.put("Mc12", baseNum.getMc12());
		monthMap.put("Mc13", baseNum.getMc13());
		monthMap.put("Mc14", baseNum.getMc14());
		monthMap.put("Mc15", baseNum.getMc15());
		monthMap.put("Mc16", baseNum.getMc16());
		monthMap.put("Mc17", baseNum.getMc17());
		monthMap.put("Mc18", baseNum.getMc18());
		monthMap.put("McL1", baseNum.getMcL1());
		monthMap.put("McL2", baseNum.getMcL2());
		monthMap.put("McL3", baseNum.getMcL3());

		monthMap.put("MdR3", baseNum.getMdR3());
		monthMap.put("MdR2", baseNum.getMdR2());
		monthMap.put("MdR1", baseNum.getMdR1());
		monthMap.put("Md1", baseNum.getMd1());
		monthMap.put("Md2", baseNum.getMd2());
		monthMap.put("Md3", baseNum.getMd3());
		monthMap.put("Md4", baseNum.getMd4());
		monthMap.put("Md5", baseNum.getMd5());
		monthMap.put("Md6", baseNum.getMd6());
		monthMap.put("Md7", baseNum.getMd7());
		monthMap.put("Md8", baseNum.getMd8());
		monthMap.put("Md9", baseNum.getMd9());
		monthMap.put("Md10", baseNum.getMd10());
		monthMap.put("Md11", baseNum.getMd11());
		monthMap.put("Md12", baseNum.getMd12());
		monthMap.put("Md13", baseNum.getMd13());
		monthMap.put("Md14", baseNum.getMd14());
		monthMap.put("Md15", baseNum.getMd15());
		monthMap.put("Md16", baseNum.getMd16());
		monthMap.put("Md17", baseNum.getMd17());
		monthMap.put("Md18", baseNum.getMd18());
		monthMap.put("MdL1", baseNum.getMdL1());
		monthMap.put("MdL2", baseNum.getMdL2());
		monthMap.put("MdL3", baseNum.getMdL3());

		dayMap.put("DaR3", baseNum.getDaR3());
		dayMap.put("DaR2", baseNum.getDaR2());
		dayMap.put("DaR1", baseNum.getDaR1());
		dayMap.put("Da1", baseNum.getDa1());
		dayMap.put("Da2", baseNum.getDa2());
		dayMap.put("Da3", baseNum.getDa3());
		dayMap.put("Da4", baseNum.getDa4());
		dayMap.put("Da5", baseNum.getDa5());
		dayMap.put("Da6", baseNum.getDa6());
		dayMap.put("Da7", baseNum.getDa7());
		dayMap.put("Da8", baseNum.getDa8());
		dayMap.put("Da9", baseNum.getDa9());
		dayMap.put("Da10", baseNum.getDa10());
		dayMap.put("Da11", baseNum.getDa11());
		dayMap.put("Da12", baseNum.getDa12());
		dayMap.put("Da13", baseNum.getDa13());
		dayMap.put("Da14", baseNum.getDa14());
		dayMap.put("Da15", baseNum.getDa15());
		dayMap.put("Da16", baseNum.getDa16());
		dayMap.put("Da17", baseNum.getDa17());
		dayMap.put("Da18", baseNum.getDa18());
		dayMap.put("DaL1", baseNum.getDaL1());
		dayMap.put("DaL2", baseNum.getDaL2());
		dayMap.put("DaL3", baseNum.getDaL3());

		dayMap.put("DbR3", baseNum.getDbR3());
		dayMap.put("DbR2", baseNum.getDbR2());
		dayMap.put("DbR1", baseNum.getDbR1());
		dayMap.put("Db1", baseNum.getDb1());
		dayMap.put("Db2", baseNum.getDb2());
		dayMap.put("Db3", baseNum.getDb3());
		dayMap.put("Db4", baseNum.getDb4());
		dayMap.put("Db5", baseNum.getDb5());
		dayMap.put("Db6", baseNum.getDb6());
		dayMap.put("Db7", baseNum.getDb7());
		dayMap.put("Db8", baseNum.getDb8());
		dayMap.put("Db9", baseNum.getDb9());
		dayMap.put("Db10", baseNum.getDb10());
		dayMap.put("Db11", baseNum.getDb11());
		dayMap.put("Db12", baseNum.getDb12());
		dayMap.put("Db13", baseNum.getDb13());
		dayMap.put("Db14", baseNum.getDb14());
		dayMap.put("Db15", baseNum.getDb15());
		dayMap.put("Db16", baseNum.getDb16());
		dayMap.put("Db17", baseNum.getDb17());
		dayMap.put("Db18", baseNum.getDb18());
		dayMap.put("DbL1", baseNum.getDbL1());
		dayMap.put("DbL2", baseNum.getDbL2());
		dayMap.put("DbL3", baseNum.getDbL3());

		dayMap.put("DcR3", baseNum.getDcR3());
		dayMap.put("DcR2", baseNum.getDcR2());
		dayMap.put("DcR1", baseNum.getDcR1());
		dayMap.put("Dc1", baseNum.getDc1());
		dayMap.put("Dc2", baseNum.getDc2());
		dayMap.put("Dc3", baseNum.getDc3());
		dayMap.put("Dc4", baseNum.getDc4());
		dayMap.put("Dc5", baseNum.getDc5());
		dayMap.put("Dc6", baseNum.getDc6());
		dayMap.put("Dc7", baseNum.getDc7());
		dayMap.put("Dc8", baseNum.getDc8());
		dayMap.put("Dc9", baseNum.getDc9());
		dayMap.put("Dc10", baseNum.getDc10());
		dayMap.put("Dc11", baseNum.getDc11());
		dayMap.put("Dc12", baseNum.getDc12());
		dayMap.put("Dc13", baseNum.getDc13());
		dayMap.put("Dc14", baseNum.getDc14());
		dayMap.put("Dc15", baseNum.getDc15());
		dayMap.put("Dc16", baseNum.getDc16());
		dayMap.put("Dc17", baseNum.getDc17());
		dayMap.put("Dc18", baseNum.getDc18());
		dayMap.put("DcL1", baseNum.getDcL1());
		dayMap.put("DcL2", baseNum.getDcL2());
		dayMap.put("DcL3", baseNum.getDcL3());

		dayMap.put("DdR3", baseNum.getDdR3());
		dayMap.put("DdR2", baseNum.getDdR2());
		dayMap.put("DdR1", baseNum.getDdR1());
		dayMap.put("Dd1", baseNum.getDd1());
		dayMap.put("Dd2", baseNum.getDd2());
		dayMap.put("Dd3", baseNum.getDd3());
		dayMap.put("Dd4", baseNum.getDd4());
		dayMap.put("Dd5", baseNum.getDd5());
		dayMap.put("Dd6", baseNum.getDd6());
		dayMap.put("Dd7", baseNum.getDd7());
		dayMap.put("Dd8", baseNum.getDd8());
		dayMap.put("Dd9", baseNum.getDd9());
		dayMap.put("Dd10", baseNum.getDd10());
		dayMap.put("Dd11", baseNum.getDd11());
		dayMap.put("Dd12", baseNum.getDd12());
		dayMap.put("Dd13", baseNum.getDd13());
		dayMap.put("Dd14", baseNum.getDd14());
		dayMap.put("Dd15", baseNum.getDd15());
		dayMap.put("Dd16", baseNum.getDd16());
		dayMap.put("Dd17", baseNum.getDd17());
		dayMap.put("Dd18", baseNum.getDd18());
		dayMap.put("DdL1", baseNum.getDdL1());
		dayMap.put("DdL2", baseNum.getDdL2());
		dayMap.put("DdL3", baseNum.getDdL3());

		for (String year : yearMap.keySet()) {
			if (!aryYears.contains(yearMap.get(year))) {
				yearResult.add(year);
				yearMap.put(year, this.maruChange(yearMap.get(year)));
			}
		}

		for (String month : monthMap.keySet()) {
			if (!aryMonths.contains(monthMap.get(month))) {
				monthResult.add(month);
				monthMap.put(month, this.maruChange(monthMap.get(month)));
			}
		}

		for (String day : dayMap.keySet()) {
			if (!aryDays.contains(dayMap.get(day))) {
				dayResult.add(day);
				dayMap.put(day, this.maruChange(dayMap.get(day)));
			}
		}
	}

    /**
     * <PRE>
     * 処理名：基本数字が〇を付け数字を変換する
     * <br>
     * @param aryYears 年リスト
     * @param aryMonths 月リスト
     * @param aryDays 日リスト
     */
	private String maruChange(String str) {
		String result = "";
		if (str == "1") {
			result = "①";
		} else if (str == "2") {
			result = "②";
		} else if (str == "3") {
			result = "③";
		} else if (str == "4") {
			result = "④";
		} else if (str == "5") {
			result = "⑤";
		} else if (str == "6") {
			result = "⑥";
		} else if (str == "7") {
			result = "⑦";
		} else if (str == "8") {
			result = "⑧";
		} else if (str == "9") {
			result = "⑨";
		} else if (str == "10") {
			result = "⑩";
		} else if (str == "11") {
			result = "⑪";
		} else if (str == "12") {
			result = "⑫";
		}
		return result;
	}

    /**
     * <PRE>
     * 処理名：ポイント数字★を付ける
     * <br>
     * @param dayMaruResult 年の〇付け数字リスト
     * @param monthMaruResult 月の〇付け数字リスト
     * @param yearMaruResult 日の〇付け数字リスト
     * @param yearResult 年の12変換後の数字リスト
     * @param monthResult 月の12変換後の数字リスト
     * @param dayResult 日の12変換後の数字リスト
     */
	private void starPro(List<String> yearMaruResult, List<String> monthMaruResult, List<String> dayMaruResult, List<String> yearResult, List<String> monthResult, List<String> dayResult) {

		// 年の行ポイントの数字★を付ける
		List<String> aLine = new ArrayList<String>();
		List<String> bLine = new ArrayList<String>();
		List<String> cLine = new ArrayList<String>();
		List<String> dLine = new ArrayList<String>();

		// 行を分類する(a,b,c,dを分類)
		this.lineSortPro(yearMaruResult, aLine, bLine, cLine, dLine);

		// 先にD行で〇を付けた数字を見る、D行の数字を見た結果がなければ、C行を見る...の順番に。
		if (null != dLine) {
			for (String year : dLine) {
				// Yd1 ①:4、10
				if ("Yd1".equals(year)) {
					// 左
					if ("4".equals(year4)) {
						if (year3.equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("2".equals(year2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					} else if ("10".equals(year4)) {
						if ("11".equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("12".equals(year2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					}
					// 右
					if ("4".equals(year10)) {
						if ("3".equals(year11)) {
							starMap.put("YR2", TEXT.RED_STAR);
						}
						if ("2".equals(year12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
					} else if ("10".equals(year10)) {
						if ("11".equals(year11)) {
							starMap.put("YR2", TEXT.RED_STAR);
						}
						if ("12".equals(year12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
					}
					// Yd2 ②:5、11
				} else if ("Yd2".equals(year)) {
					// 左
					if ("5".equals(year5)) {
						if ("4".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("3".equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					} else if ("11".equals(year5)) {
						if ("12".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("1".equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					}
					// 右
					if ("5".equals(year11)) {
						if ("4".equals(year12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
						if ("3".equals(year1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
					} else if ("11".equals(year11)) {
						if ("12".equals(year12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
						if ("1".equals(year1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
					}
					// Yd3 ③:6、12
				} else if ("Yd3".equals(year)) {
					// 左
					if ("6".equals(year6)) {
						if ("5".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("4".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					} else if ("12".equals(year6)) {
						if ("1".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("2".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					}
					// 右
					if ("6".equals(year12)) {
						if ("5".equals(year1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
						if ("4".equals(year2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					} else if ("12".equals(year12)) {
						if ("1".equals(year1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
						if ("2".equals(year2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					}
					// Yd4 ④:7、1
				} else if ("Yd4".equals(year)) {
					// 左
					if ("7".equals(year7)) {
						if ("6".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("5".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					} else if ("1".equals(year7)) {
						if ("2".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("3".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					}
					// 右
					if ("7".equals(year1)) {
						if ("6".equals(year2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
						if ("5".equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					} else if ("1".equals(year1)) {
						if ("2".equals(year2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
						if ("3".equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					}
					// Yd5 ⑤:2、8
				} else if ("Yd5".equals(year)) {
					// 左
					if ("8".equals(year8)) {
						if ("7".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("6".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					} else if ("2".equals(year8)) {
						if ("3".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("4".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					}
					// 右
					if ("8".equals(year2)) {
						if ("7".equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("6".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					} else if ("2".equals(year2)) {
						if ("3".equals(year3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("4".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					}
					// Yd6 ⑥:3、9
				} else if ("Yd6".equals(year)) {
					// 左
					if ("9".equals(year9)) {
						if ("8".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("7".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					} else if ("3".equals(year9)) {
						if ("4".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("5".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					}
					// 右
					if ("9".equals(year3)) {
						if ("8".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("7".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					} else if ("3".equals(year3)) {
						if ("4".equals(year4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("5".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					}
					// Yd7 ⑦:4、10
				} else if ("Yd7".equals(year)) {
					// 左
					if ("10".equals(year10)) {
						if ("9".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("8".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					} else if ("4".equals(year10)) {
						if ("5".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("6".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					}
					// 右
					if ("10".equals(year4)) {
						if ("9".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("8".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					} else if ("4".equals(year4)) {
						if ("5".equals(year5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("6".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					}
					// Yd8 ⑧:5、11
				} else if ("Yd8".equals(year)) {
					// 左
					if ("11".equals(year11)) {
						if ("10".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("9".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					} else if ("5".equals(year11)) {
						if ("6".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("7".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					}
					// 右
					if ("11".equals(year5)) {
						if ("10".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("9".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					} else if ("5".equals(year5)) {
						if ("6".equals(year6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("7".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					}
					// Yd9 ⑨:6、12
				} else if ("Yd9".equals(year)) {
					// 左
					if ("12".equals(year12)) {
						if ("11".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("10".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					} else if ("6".equals(year12)) {
						if ("7".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("8".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					}
					// 右
					if ("12".equals(year6)) {
						if ("11".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("10".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					} else if ("6".equals(year6)) {
						if ("7".equals(year7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("8".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					}
					// Yd10 ⑩:1、7
				} else if ("Yd10".equals(year)) {
					// 左
					if ("1".equals(year13)) {
						if ("12".equals(year12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("11".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					} else if ("7".equals(year13)) {
						if ("8".equals(year12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("9".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					}
					// 右
					if ("1".equals(year7)) {
						if ("12".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("11".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					} else if ("7".equals(year7)) {
						if ("8".equals(year8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("9".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					}
					// Yd11 ⑪:2、8
				} else if ("Yd11".equals(year)) {
					// 左
					if ("2".equals(year14)) {
						if ("1".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("12".equals(year12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					} else if ("8".equals(year14)) {
						if ("9".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("10".equals("year12")) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					}
					// 右
					if ("2".equals(year8)) {
						if ("1".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("12".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					} else if ("8".equals(year8)) {
						if ("9".equals(year9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("10".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					}

					// Yd12 ⑫:3、9
				} else if ("Yd12".equals(year)) {
					// 左
					if ("3".equals(year15)) {
						if ("2".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("1".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					} else if ("9".equals(year15)) {
						if ("10".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("1".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					}
					// 右
					if ("3".equals(year9)) {
						if ("2".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("1".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					} else if ("9".equals(year9)) {
						if ("10".equals(year10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("11".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					}

					// Yd13 ①:4、10
				} else if ("Yd13".equals(year)) {
					// 左
					if ("4".equals(year16)) {
						if ("3".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("2".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					} else if ("10".equals(year16)) {
						if ("11".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("12".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					}
					// 右
					if ("4".equals(year10)) {
						if ("3".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("2".equals(year12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					} else if ("10".equals(year10)) {
						if ("11".equals(year11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("12".equals(year12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					}

					// Yd14 ②:5、11
				} else if ("Yd14".equals(year)) {
					// 左
					if ("5".equals(year17)) {
						if ("4".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("3".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					} else if ("11".equals(year17)) {
						if ("12".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("13".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					}
					// 右
					if ("5".equals(year11)) {

						if ("4".equals(year12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("3".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					} else if (year11.equals("11")) {
						if ("12".equals(year12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("13".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					}

					// Yd15 ③:6、12
				} else if ("Yd15".equals(year)) {
					// 左
					if ("6".equals(year18)) {
						if ("5".equals(year17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
						if ("4".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					} else if ("12".equals(year18)) {
						if ("1".equals(year17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
						if ("2".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					}
					// 右
					if ("6".equals(year12)) {
						if ("5".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("4".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					} else if ("12".equals(year12)) {
						if ("1".equals(year13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("2".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					}

					// Yd16 ④:7、1
				} else if ("Yd16".equals(year)) {
					// 左
					if ("7".equals(year7)) {
						if ("6".equals(year18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
						if ("5".equals(year17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					} else if ("1".equals(year7)) {
						if ("2".equals(year18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
						if ("3".equals(year17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					}
					// 右
					if ("7".equals(year13)) {
						if ("6".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("5".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					} else if ("1".equals(year13)) {
						if ("2".equals(year14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("3".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					}

					// Yd17 ⑤:2、8
				} else if ("Yd17".equals(year)) {
					// 左
					if ("8".equals(year8)) {
						if ("7".equals(year7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
						if ("6".equals(year18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
					} else if (year8.equals("2")) {
						if ("3".equals(year7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
						if ("4".equals(year18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
					}
					// 右
					if ("8".equals(year14)) {
						if ("7".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("6".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					} else if ("2".equals(year14)) {
						if ("3".equals(year15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("4".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					}

					// Yd18 ⑥:3、9
				} else if ("Yd18".equals(year)) {
					// 左
					if ("9".equals(year9)) {
						if ("8".equals(year8)) {
							starMap.put("YL2", TEXT.RED_STAR);
						}
						if ("7".equals(year7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
					} else if ("3".equals(year9)) {
						if ("4".equals(year8)) {
							starMap.put("YL2", TEXT.RED_STAR);
						}
						if ("5".equals(year7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
					}
					// 右
					if ("9".equals(year15)) {
						if ("8".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("7".equals(year17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					} else if ("3".equals(year15)) {
						if ("4".equals(year16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("5".equals(year17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					}
				}
			}
		}

		// D行を見た結果がない場合、C行の結果を見る
		if (null != cLine) {
			if (starMap.size() == 0) {
				for (String year : cLine) {
					// Yc1 ④:7、1
					if ("Yc1".equals(year)) {
						// 左
						if ("7".equals(year4)) {
							if ("6".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("5".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("1".equals(year4)) {
							if ("2".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("3".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(year1)) {
							if ("6".equals(year2)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("5".equals(year3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("1".equals(year1)) {
							if ("2".equals(year2)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("3".equals(year3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Yc2 ⑤:8、2
					} else if ("Yc2".equals(year)) {
						// 左
						if ("8".equals(year5)) {
							if ("7".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("6".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("2".equals(year5)) {
							if ("3".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("4".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(year2)) {
							if ("7".equals(year3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("6".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("2".equals(year2)) {
							if ("3".equals(year3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("4".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Yc3 ⑥:9、3
					} else if ("Yc3".equals(year)) {
						// 左
						if ("9".equals(year6)) {
							if ("8".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("7".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("3".equals(year6)) {
							if ("4".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("5".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(year3)) {
							if ("8".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("7".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("3".equals(year3)) {
							if ("4".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("5".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Yc4 ⑦:10、4
					} else if ("Yc4".equals(year)) {
						// 左
						if ("10".equals(year7)) {
							if ("9".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("8".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("4".equals(year7)) {
							if ("5".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("6".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(year1)) {
							if ("9".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("8".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("4".equals(year1)) {
							if ("5".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("6".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Yc5 ⑧:11、5
					} else if ("Yc5".equals(year)) {
						// 左
						if ("11".equals(year8)) {
							if ("10".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("9".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("5".equals(year8)) {
							if ("6".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("7".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(year2)) {
							if ("10".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("9".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("5".equals(year2)) {
							if ("6".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("7".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Yc6 ⑨:12、6
					} else if ("Yc6".equals(year)) {
						// 左
						if ("12".equals(year9)) {
							if ("11".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("10".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("6".equals(year9)) {
							if ("7".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("8".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(year3)) {
							if ("11".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("10".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("6".equals(year3)) {
							if ("7".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("8".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Yc7 ⑩:1、7
					} else if ("Yc7".equals(year)) {
						// 左
						if ("1".equals(year10)) {
							if ("12".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("11".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("7".equals(year10)) {
							if ("8".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("9".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(year4)) {
							if ("12".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("11".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("7".equals(year4)) {
							if ("8".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("9".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Yc8 ⑪:2、8
					} else if ("Yc8".equals(year)) {
						// 左
						if ("2".equals(year11)) {
							if ("1".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("12".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("8".equals(year11)) {
							if ("9".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("10".equals("10")) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(year5)) {
							if ("1".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("11".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("8".equals(year5)) {
							if ("9".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("10".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Yc9 ⑫:3、9
					} else if ("Yc9".equals(year)) {
						// 左
						if ("3".equals(year12)) {
							if ("2".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("1".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("9".equals(year12)) {
							if ("10".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("11".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(year6)) {
							if ("2".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("1".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("9".equals(year6)) {
							if ("10".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("11".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Yc10 ①:4、10
					} else if ("Yc10".equals(year)) {
						// 左
						if ("4".equals(year13)) {
							if ("3".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("2".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("10".equals(year13)) {
							if ("11".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("12".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(year7)) {
							if ("3".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("2".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("10".equals(year7)) {
							if ("11".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("12".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Yc11 ②:5、11
					} else if ("Yc11".equals(year)) {
						// 左
						if ("5".equals(year14)) {
							if ("4".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("3".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("11".equals(year14)) {
							if ("12".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("1".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(year8)) {
							if ("4".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("3".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("11".equals(year8)) {
							if ("12".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("1".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Yc12 ③:6、12
					} else if ("Yc12".equals(year)) {
						// 左
						if ("6".equals(year15)) {
							if ("5".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("4".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("12".equals(year15)) {
							if ("1".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("2".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(year9)) {
							if ("5".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("4".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("12".equals(year9)) {
							if ("1".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("2".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Yc13 ④:7、1
					} else if ("Yc13".equals(year)) {
						// 左
						if ("7".equals(year16)) {
							if ("6".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("5".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("1".equals(year16)) {
							if ("2".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("3".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(year10)) {
							if ("6".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("5".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("1".equals(year10)) {
							if ("2".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("3".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Yc14 ⑤:2、8
					} else if ("Yc14".equals(year)) {
						// 左
						if ("2".equals(year17)) {
							if ("3".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("4".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("8".equals(year17)) {
							if ("7".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("6".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(year11)) {
							if ("3".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("4".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("8".equals(year11)) {
							if ("7".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("6".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Yc15 ⑥:3、9
					} else if ("Yc15".equals(year)) {
						// 左
						if ("3".equals(year18)) {
							if ("4".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("5".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("9".equals(year18)) {
							if ("8".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("7".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(year12)) {
							if ("4".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("5".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("9".equals(year12)) {
							if ("8".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("7".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Yc16 ⑦:10、4
					} else if ("Yc16".equals(year)) {
						// 左
						if ("10".equals(year10)) {
							if ("9".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("8".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("4".equals(year10)) {
							if ("5".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("6".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(year13)) {
							if ("9".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("8".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("4".equals(year13)) {
							if ("5".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("6".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Yc17 ⑧:11、5
					} else if ("Yc17".equals(year)) {
						// 左
						if ("11".equals(year11)) {
							if ("10".equals(year10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("9".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("5".equals(year11)) {
							if ("6".equals(year10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("7".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(year14)) {
							if ("10".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("9".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("5".equals(year14)) {
							if ("6".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("7".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Yc18 ⑨:12、6
					} else if ("Yc18".equals(year)) {
						// 左
						if ("12".equals(year12)) {
							if ("11".equals(year11)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("10".equals(year10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("6".equals("6")) {
							if ("7".equals(year11)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("8".equals(year10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(year15)) {
							if ("11".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("10".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("6".equals(year15)) {
							if ("7".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("8".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}
				}
			}
		}

		// C行を見た結果がない場合、B行の結果を見る
		if (null != bLine) {
			if (starMap.size() == 0) {
				for (String year : bLine) {
					// Yb1 ⑦:10、4
					if ("Yb1".equals(year)) {
						// 左
						if ("10".equals(year4)) {
							if ("9".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("8".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("4".equals(year4)) {
							if ("5".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("6".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(year4)) {
							if ("9".equals(year5)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("8".equals(year6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("4".equals(year4)) {
							if ("5".equals(year5)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("6".equals(year6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Yb2 ⑧:11、5
					} else if ("Yb2".equals(year)) {
						// 左
						if ("11".equals(year5)) {
							if (year4.equals("10")) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if (year3.equals("9")) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("5".equals(year5)) {
							if ("6".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("7".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(year5)) {
							if ("10".equals(year6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("9".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("5".equals("5")) {
							if ("6".equals(year6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("7".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Yb3 ⑨:12、6
					} else if ("Yb3".equals(year)) {
						// 左
						if ("12".equals(year6)) {
							if ("11".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("10".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("6".equals(year6)) {
							if ("7".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("8".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(year6)) {
							if ("11".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("10".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("6".equals(year6)) {
							if ("7".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("8".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Yb4 ⑩:1、7
					} else if ("Yb4".equals(year)) {
						// 左
						if ("1".equals(year7)) {
							if ("12".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("11".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("7".equals(year7)) {
							if ("8".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("9".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(year1)) {
							if ("12".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("11".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("7".equals(year1)) {
							if ("8".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("9".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Yb5 ⑪:2、8
					} else if ("Yb5".equals(year)) {
						// 左
						if ("2".equals(year8)) {
							if ("1".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("12".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("8".equals(year8)) {
							if ("9".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("10".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(year2)) {
							if ("1".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("12".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("8".equals(year2)) {
							if ("9".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("10".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Yb6 ⑫:3、9
					} else if ("Yb6".equals(year)) {
						// 左
						if ("3".equals(year9)) {
							if ("2".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("1".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("9".equals(year9)) {
							if ("10".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("11".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(year3)) {
							if ("2".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("1".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("9".equals(year3)) {
							if ("10".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("11".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Yb7 ①:4、10
					} else if ("Yb7".equals(year)) {
						// 左
						if ("4".equals(year10)) {
							if ("3".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("2".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("10".equals(year10)) {
							if ("11".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("12".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(year4)) {
							if ("3".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("2".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("10".equals(year4)) {
							if ("11".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("12".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Yb8 ②:5、11
					} else if ("Yb8".equals(year)) {
						// 左
						if ("5".equals(year11)) {
							if ("4".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("3".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("11".equals(year11)) {
							if ("12".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("1".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(year5)) {
							if ("4".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("3".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("11".equals(year5)) {
							if ("12".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("1".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Yb9 ③:6、12
					} else if ("Yb9".equals(year)) {
						// 左
						if ("6".equals(year12)) {
							if ("5".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("4".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("12".equals(year12)) {
							if ("1".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("2".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(year6)) {
							if ("5".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("4".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("12".equals(year6)) {
							if ("1".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("2".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Yb10 ④:7、1
					} else if ("Yb10".equals(year)) {
						// 左
						if ("7".equals(year13)) {
							if ("6".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("5".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("1".equals(year13)) {
							if ("2".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("3".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(year7)) {
							if ("6".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("5".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("1".equals(year7)) {
							if ("2".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("3".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Yb11 ⑤:8、2
					} else if ("Yb11".equals(year)) {
						// 左
						if ("8".equals(year14)) {
							if ("7".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("6".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("2".equals(year14)) {
							if ("3".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("4".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(year8)) {
							if ("7".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("6".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("2".equals(year8)) {
							if ("3".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("4".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Yb12 ⑥:9、3
					} else if ("Yb12".equals(year)) {
						// 左
						if ("9".equals(year15)) {
							if ("10".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("11".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("3".equals(year15)) {
							if ("4".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("5".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(year9)) {
							if ("8".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("7".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("3".equals(year9)) {
							if ("4".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("5".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Yb13 ⑦:10、4
					} else if ("Yb13".equals(year)) {
						// 左
						if ("10".equals(year16)) {
							if ("9".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("8".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("4".equals(year16)) {
							if ("5".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("6".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(year10)) {
							if ("9".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("8".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("4".equals(year10)) {
							if ("5".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("6".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Yb14 ⑧:11、5
					} else if ("Yb14".equals(year)) {
						// 左
						if ("11".equals(year17)) {
							if ("10".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("9".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("5".equals(year17)) {
							if ("6".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("7".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(year11)) {
							if ("10".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("9".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("5".equals(year11)) {
							if ("6".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("7".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Yb15 ⑨:12、6
					} else if ("Yb15".equals(year)) {
						// 左
						if ("12".equals(year18)) {
							if ("11".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("10".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("6".equals(year18)) {
							if ("7".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("8".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(year12)) {
							if ("11".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("10".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("6".equals(year12)) {
							if ("7".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("8".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Yb16 ⑩:1、7
					} else if ("Yb16".equals(year)) {
						// 左
						if ("1".equals(year1)) {
							if ("12".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("11".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("7".equals(year1)) {
							if ("8".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("9".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(year13)) {
							if ("12".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("11".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("7".equals(year13)) {
							if ("8".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("9".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Yb17 ⑪:2、8
					} else if ("Yb17".equals(year)) {
						// 左
						if ("2".equals(year2)) {
							if ("1".equals(year1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("12".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("8".equals(year2)) {
							if ("9".equals(year1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("10".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(year14)) {
							if ("1".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("12".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("8".equals(year14)) {
							if ("9".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("10".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Yb18 ⑫:3、9
					} else if ("Yb18".equals(year)) {
						// 左
						if ("3".equals(year3)) {
							if ("2".equals(year2)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("1".equals(year1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("9".equals(year3)) {
							if ("10".equals(year2)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("11".equals(year1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(year15)) {
							if ("2".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("1".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("9".equals(year15)) {
							if ("10".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("11".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}

				}
			}
		}

		// b行を見た結果がない場合、a行の結果を見る
		if (null != aLine) {
			if (starMap.size() == 0) {
				for (String year : aLine) {
					// Ya1 ⑩:1、7
					if ("Ya1".equals(year)) {
						// 左
						if ("1".equals(year4)) {
							if ("12".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("11".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("7".equals(year4)) {
							if ("8".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("9".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(year7)) {
							if ("12".equals(year8)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("11".equals(year9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("7".equals(year7)) {
							if ("8".equals(year8)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("9".equals(year9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Ya2 ⑪:2、8
					} else if ("Ya2".equals(year)) {
						// 左
						if ("2".equals(year5)) {
							if ("1".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("12".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("8".equals(year5)) {
							if ("9".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("10".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(year8)) {
							if ("1".equals(year9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("12".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("8".equals(year8)) {
							if ("9".equals(year9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("10".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Ya3 ⑫:3、9
					} else if ("Ya3".equals(year)) {
						// 左
						if ("3".equals(year6)) {
							if ("2".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("1".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("9".equals(year6)) {
							if ("10".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("11".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(year9)) {
							if ("2".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("1".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("9".equals(year9)) {
							if ("10".equals(year1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("11".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Ya4 ①:4、10
					} else if ("Ya4".equals(year)) {
						// 左
						if ("4".equals(year7)) {
							if ("3".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("2".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("10".equals("10")) {
							if ("11".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("12".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(year1)) {
							if ("3".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("2".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("10".equals(year1)) {
							if ("11".equals(year2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("12".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Ya5 ②:5、11
					} else if ("Ya5".equals(year)) {
						// 左
						if ("5".equals(year8)) {
							if ("4".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("3".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("11".equals(year8)) {
							if ("12".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("1".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(year2)) {
							if ("4".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("3".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("11".equals(year2)) {
							if ("12".equals(year3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("1".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Ya6 ③:6、12
					} else if ("Ya6".equals(year)) {
						// 左
						if ("6".equals(year9)) {
							if ("5".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("4".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("12".equals(year9)) {
							if ("1".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("2".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(year3)) {
							if ("5".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("4".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("12".equals(year3)) {
							if ("1".equals(year4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("2".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Ya7 ④:7、1
					} else if ("Ya7".equals(year)) {
						// 左
						if ("7".equals(year10)) {
							if ("6".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("5".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("1".equals(year10)) {
							if ("2".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("3".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(year4)) {
							if ("6".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("5".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("1".equals(year4)) {
							if ("2".equals(year5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("3".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Ya8 ⑤:8、2
					} else if ("Ya8".equals(year)) {
						// 左
						if ("8".equals(year11)) {
							if ("7".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("6".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("2".equals(year11)) {
							if ("3".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("4".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(year5)) {
							if ("7".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("6".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("2".equals(year5)) {
							if ("3".equals(year6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("4".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Ya9 ⑥:9、3
					} else if ("Ya9".equals(year)) {
						// 左
						if ("9".equals(year12)) {
							if ("8".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("7".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("3".equals(year12)) {
							if ("4".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("5".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(year6)) {
							if ("8".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("7".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("3".equals(year6)) {
							if ("4".equals(year7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("5".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Ya10 ⑦:10、4
					} else if ("Ya10".equals(year)) {
						// 左
						if ("10".equals(year13)) {
							if ("9".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("8".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("4".equals(year13)) {
							if ("5".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("6".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(year7)) {
							if ("9".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("8".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("4".equals(year7)) {
							if ("5".equals(year8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("6".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Ya11 ⑧:11、5
					} else if ("Ya11".equals(year)) {
						// 左
						if ("11".equals(year14)) {
							if ("10".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("9".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("5".equals(year14)) {
							if ("6".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("7".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(year8)) {
							if ("10".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("9".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("5".equals(year8)) {
							if ("6".equals(year9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("7".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Ya12 ⑨:12、6
					} else if ("Ya12".equals(year)) {
						// 左
						if ("12".equals(year15)) {
							if ("11".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("10".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("6".equals(year15)) {
							if ("7".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("8".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(year9)) {
							if ("11".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("10".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("6".equals(year9)) {
							if ("7".equals(year10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("8".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Ya13 ⑩:1、7
					} else if ("Ya13".equals(year)) {
						// 左
						if ("1".equals(year16)) {
							if ("12".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("11".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("7".equals(year16)) {
							if ("8".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("9".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(year10)) {
							if ("12".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("11".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("7".equals(year10)) {
							if ("8".equals(year11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("9".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Ya14 ⑪:2、8
					} else if ("Ya14".equals(year)) {
						// 左
						if ("2".equals(year17)) {
							if ("1".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("12".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("8".equals(year17)) {
							if ("9".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("10".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(year11)) {
							if ("1".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("12".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("8".equals(year11)) {
							if ("9".equals(year12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("10".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Ya15 ⑫:3、9
					} else if ("Ya15".equals(year)) {
						// 左
						if ("3".equals(year18)) {
							if ("2".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("1".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("9".equals(year18)) {
							if ("10".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("11".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(year12)) {
							if ("2".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("1".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("9".equals(year12)) {
							if ("10".equals(year13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("11".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Ya16 ①:4、10
					} else if ("Ya16".equals(year)) {
						// 左
						if ("4".equals(year4)) {
							if ("3".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("2".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("10".equals(year4)) {
							if ("11".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("12".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(year13)) {
							if ("3".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("2".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("10".equals(year13)) {
							if ("11".equals(year14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("12".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Ya17 ②:5、11
					} else if ("Ya17".equals(year)) {
						// 左
						if ("5".equals(year5)) {
							if ("4".equals(year4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("3".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("11".equals(year5)) {
							if ("12".equals(year4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("1".equals(year18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(year14)) {
							if ("4".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("3".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("11".equals(year14)) {
							if ("12".equals(year15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("1".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Ya18 ③:6、12
					} else if ("Ya18".equals(year)) {
						// 左
						if ("6".equals(year6)) {
							if ("5".equals(year5)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("4".equals(year4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("12".equals(year6)) {
							if ("1".equals(year5)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("2".equals(year4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(year15)) {
							if ("5".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("4".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("12".equals(year15)) {
							if ("1".equals(year16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("2".equals(year17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}

				}
			}
		}

		// 月の行ポイントの数字★を付ける
		aLine = new ArrayList<String>();
		bLine = new ArrayList<String>();
		cLine = new ArrayList<String>();
		dLine = new ArrayList<String>();

		// 行を分類する(a,b,c,dを分類)
		this.lineSortPro(monthMaruResult, aLine, bLine, cLine, dLine);

		// 先にD行で〇を付けた数字を見る、D行の数字を見た結果がなければ、C行を見る...の順番に。
		if (null != dLine) {
			for (String month : dLine) {
				// Yd1 ①:4、10
				if ("Yd1".equals(month)) {
					// 左
					if ("4".equals(month4)) {
						if (month3.equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("2".equals(month2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					} else if ("10".equals(month4)) {
						if ("11".equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("12".equals(month2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					}
					// 右
					if ("4".equals(month10)) {
						if ("3".equals(month11)) {
							starMap.put("YR2", TEXT.RED_STAR);
						}
						if ("2".equals(month12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
					} else if ("10".equals(month10)) {
						if ("11".equals(month11)) {
							starMap.put("YR2", TEXT.RED_STAR);
						}
						if ("12".equals(month12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
					}
					// Yd2 ②:5、11
				} else if ("Yd2".equals(month)) {
					// 左
					if ("5".equals(month5)) {
						if ("4".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("3".equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					} else if ("11".equals(month5)) {
						if ("12".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("1".equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					}
					// 右
					if ("5".equals(month11)) {
						if ("4".equals(month12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
						if ("3".equals(month1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
					} else if ("11".equals(month11)) {
						if ("12".equals(month12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
						if ("1".equals(month1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
					}
					// Yd3 ③:6、12
				} else if ("Yd3".equals(month)) {
					// 左
					if ("6".equals(month6)) {
						if ("5".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("4".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					} else if ("12".equals(month6)) {
						if ("1".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("2".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					}
					// 右
					if ("6".equals(month12)) {
						if ("5".equals(month1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
						if ("4".equals(month2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					} else if ("12".equals(month12)) {
						if ("1".equals(month1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
						if ("2".equals(month2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					}
					// Yd4 ④:7、1
				} else if ("Yd4".equals(month)) {
					// 左
					if ("7".equals(month7)) {
						if ("6".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("5".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					} else if ("1".equals(month7)) {
						if ("2".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("3".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					}
					// 右
					if ("7".equals(month1)) {
						if ("6".equals(month2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
						if ("5".equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					} else if ("1".equals(month1)) {
						if ("2".equals(month2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
						if ("3".equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					}
					// Yd5 ⑤:2、8
				} else if ("Yd5".equals(month)) {
					// 左
					if ("8".equals(month8)) {
						if ("7".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("6".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					} else if ("2".equals(month8)) {
						if ("3".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("4".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					}
					// 右
					if ("8".equals(month2)) {
						if ("7".equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("6".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					} else if ("2".equals(month2)) {
						if ("3".equals(month3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("4".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					}
					// Yd6 ⑥:3、9
				} else if ("Yd6".equals(month)) {
					// 左
					if ("9".equals(month9)) {
						if ("8".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("7".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					} else if ("3".equals(month9)) {
						if ("4".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("5".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					}
					// 右
					if ("9".equals(month3)) {
						if ("8".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("7".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					} else if ("3".equals(month3)) {
						if ("4".equals(month4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("5".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					}
					// Yd7 ⑦:4、10
				} else if ("Yd7".equals(month)) {
					// 左
					if ("10".equals(month10)) {
						if ("9".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("8".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					} else if ("4".equals(month10)) {
						if ("5".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("6".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					}
					// 右
					if ("10".equals(month4)) {
						if ("9".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("8".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					} else if ("4".equals(month4)) {
						if ("5".equals(month5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("6".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					}
					// Yd8 ⑧:5、11
				} else if ("Yd8".equals(month)) {
					// 左
					if ("11".equals(month11)) {
						if ("10".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("9".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					} else if ("5".equals(month11)) {
						if ("6".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("7".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					}
					// 右
					if ("11".equals(month5)) {
						if ("10".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("9".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					} else if ("5".equals(month5)) {
						if ("6".equals(month6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("7".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					}
					// Yd9 ⑨:6、12
				} else if ("Yd9".equals(month)) {
					// 左
					if ("12".equals(month12)) {
						if ("11".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("10".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					} else if ("6".equals(month12)) {
						if ("7".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("8".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					}
					// 右
					if ("12".equals(month6)) {
						if ("11".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("10".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					} else if ("6".equals(month6)) {
						if ("7".equals(month7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("8".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					}
					// Yd10 ⑩:1、7
				} else if ("Yd10".equals(month)) {
					// 左
					if ("1".equals(month13)) {
						if ("12".equals(month12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("11".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					} else if ("7".equals(month13)) {
						if ("8".equals(month12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("9".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					}
					// 右
					if ("1".equals(month7)) {
						if ("12".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("11".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					} else if ("7".equals(month7)) {
						if ("8".equals(month8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("9".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					}
					// Yd11 ⑪:2、8
				} else if ("Yd11".equals(month)) {
					// 左
					if ("2".equals(month14)) {
						if ("1".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("12".equals(month12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					} else if ("8".equals(month14)) {
						if ("9".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("10".equals("month12")) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					}
					// 右
					if ("2".equals(month8)) {
						if ("1".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("12".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					} else if ("8".equals(month8)) {
						if ("9".equals(month9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("10".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					}

					// Yd12 ⑫:3、9
				} else if ("Yd12".equals(month)) {
					// 左
					if ("3".equals(month15)) {
						if ("2".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("1".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					} else if ("9".equals(month15)) {
						if ("10".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("1".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					}
					// 右
					if ("3".equals(month9)) {
						if ("2".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("1".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					} else if ("9".equals(month9)) {
						if ("10".equals(month10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("11".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					}

					// Yd13 ①:4、10
				} else if ("Yd13".equals(month)) {
					// 左
					if ("4".equals(month16)) {
						if ("3".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("2".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					} else if ("10".equals(month16)) {
						if ("11".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("12".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					}
					// 右
					if ("4".equals(month10)) {
						if ("3".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("2".equals(month12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					} else if ("10".equals(month10)) {
						if ("11".equals(month11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("12".equals(month12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					}

					// Yd14 ②:5、11
				} else if ("Yd14".equals(month)) {
					// 左
					if ("5".equals(month17)) {
						if ("4".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("3".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					} else if ("11".equals(month17)) {
						if ("12".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("13".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					}
					// 右
					if ("5".equals(month11)) {

						if ("4".equals(month12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("3".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					} else if (month11.equals("11")) {
						if ("12".equals(month12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("13".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					}

					// Yd15 ③:6、12
				} else if ("Yd15".equals(month)) {
					// 左
					if ("6".equals(month18)) {
						if ("5".equals(month17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
						if ("4".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					} else if ("12".equals(month18)) {
						if ("1".equals(month17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
						if ("2".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					}
					// 右
					if ("6".equals(month12)) {
						if ("5".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("4".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					} else if ("12".equals(month12)) {
						if ("1".equals(month13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("2".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					}

					// Yd16 ④:7、1
				} else if ("Yd16".equals(month)) {
					// 左
					if ("7".equals(month7)) {
						if ("6".equals(month18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
						if ("5".equals(month17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					} else if ("1".equals(month7)) {
						if ("2".equals(month18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
						if ("3".equals(month17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					}
					// 右
					if ("7".equals(month13)) {
						if ("6".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("5".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					} else if ("1".equals(month13)) {
						if ("2".equals(month14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("3".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					}

					// Yd17 ⑤:2、8
				} else if ("Yd17".equals(month)) {
					// 左
					if ("8".equals(month8)) {
						if ("7".equals(month7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
						if ("6".equals(month18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
					} else if (month8.equals("2")) {
						if ("3".equals(month7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
						if ("4".equals(month18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
					}
					// 右
					if ("8".equals(month14)) {
						if ("7".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("6".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					} else if ("2".equals(month14)) {
						if ("3".equals(month15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("4".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					}

					// Yd18 ⑥:3、9
				} else if ("Yd18".equals(month)) {
					// 左
					if ("9".equals(month9)) {
						if ("8".equals(month8)) {
							starMap.put("YL2", TEXT.RED_STAR);
						}
						if ("7".equals(month7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
					} else if ("3".equals(month9)) {
						if ("4".equals(month8)) {
							starMap.put("YL2", TEXT.RED_STAR);
						}
						if ("5".equals(month7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
					}
					// 右
					if ("9".equals(month15)) {
						if ("8".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("7".equals(month17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					} else if ("3".equals(month15)) {
						if ("4".equals(month16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("5".equals(month17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					}
				}
			}
		}

		// D行を見た結果がない場合、C行の結果を見る
		if (null != cLine) {
			if (starMap.size() == 0) {
				for (String month : cLine) {
					// Yc1 ④:7、1
					if ("Yc1".equals(month)) {
						// 左
						if ("7".equals(month4)) {
							if ("6".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("5".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("1".equals(month4)) {
							if ("2".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("3".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(month1)) {
							if ("6".equals(month2)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("5".equals(month3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("1".equals(month1)) {
							if ("2".equals(month2)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("3".equals(month3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Yc2 ⑤:8、2
					} else if ("Yc2".equals(month)) {
						// 左
						if ("8".equals(month5)) {
							if ("7".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("6".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("2".equals(month5)) {
							if ("3".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("4".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(month2)) {
							if ("7".equals(month3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("6".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("2".equals(month2)) {
							if ("3".equals(month3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("4".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Yc3 ⑥:9、3
					} else if ("Yc3".equals(month)) {
						// 左
						if ("9".equals(month6)) {
							if ("8".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("7".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("3".equals(month6)) {
							if ("4".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("5".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(month3)) {
							if ("8".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("7".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("3".equals(month3)) {
							if ("4".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("5".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Yc4 ⑦:10、4
					} else if ("Yc4".equals(month)) {
						// 左
						if ("10".equals(month7)) {
							if ("9".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("8".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("4".equals(month7)) {
							if ("5".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("6".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(month1)) {
							if ("9".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("8".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("4".equals(month1)) {
							if ("5".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("6".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Yc5 ⑧:11、5
					} else if ("Yc5".equals(month)) {
						// 左
						if ("11".equals(month8)) {
							if ("10".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("9".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("5".equals(month8)) {
							if ("6".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("7".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(month2)) {
							if ("10".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("9".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("5".equals(month2)) {
							if ("6".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("7".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Yc6 ⑨:12、6
					} else if ("Yc6".equals(month)) {
						// 左
						if ("12".equals(month9)) {
							if ("11".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("10".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("6".equals(month9)) {
							if ("7".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("8".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(month3)) {
							if ("11".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("10".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("6".equals(month3)) {
							if ("7".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("8".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Yc7 ⑩:1、7
					} else if ("Yc7".equals(month)) {
						// 左
						if ("1".equals(month10)) {
							if ("12".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("11".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("7".equals(month10)) {
							if ("8".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("9".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(month4)) {
							if ("12".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("11".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("7".equals(month4)) {
							if ("8".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("9".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Yc8 ⑪:2、8
					} else if ("Yc8".equals(month)) {
						// 左
						if ("2".equals(month11)) {
							if ("1".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("12".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("8".equals(month11)) {
							if ("9".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("10".equals("10")) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(month5)) {
							if ("1".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("11".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("8".equals(month5)) {
							if ("9".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("10".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Yc9 ⑫:3、9
					} else if ("Yc9".equals(month)) {
						// 左
						if ("3".equals(month12)) {
							if ("2".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("1".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("9".equals(month12)) {
							if ("10".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("11".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(month6)) {
							if ("2".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("1".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("9".equals(month6)) {
							if ("10".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("11".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Yc10 ①:4、10
					} else if ("Yc10".equals(month)) {
						// 左
						if ("4".equals(month13)) {
							if ("3".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("2".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("10".equals(month13)) {
							if ("11".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("12".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(month7)) {
							if ("3".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("2".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("10".equals(month7)) {
							if ("11".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("12".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Yc11 ②:5、11
					} else if ("Yc11".equals(month)) {
						// 左
						if ("5".equals(month14)) {
							if ("4".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("3".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("11".equals(month14)) {
							if ("12".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("1".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(month8)) {
							if ("4".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("3".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("11".equals(month8)) {
							if ("12".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("1".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Yc12 ③:6、12
					} else if ("Yc12".equals(month)) {
						// 左
						if ("6".equals(month15)) {
							if ("5".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("4".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("12".equals(month15)) {
							if ("1".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("2".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(month9)) {
							if ("5".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("4".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("12".equals(month9)) {
							if ("1".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("2".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Yc13 ④:7、1
					} else if ("Yc13".equals(month)) {
						// 左
						if ("7".equals(month16)) {
							if ("6".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("5".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("1".equals(month16)) {
							if ("2".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("3".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(month10)) {
							if ("6".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("5".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("1".equals(month10)) {
							if ("2".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("3".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Yc14 ⑤:2、8
					} else if ("Yc14".equals(month)) {
						// 左
						if ("2".equals(month17)) {
							if ("3".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("4".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("8".equals(month17)) {
							if ("7".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("6".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(month11)) {
							if ("3".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("4".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("8".equals(month11)) {
							if ("7".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("6".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Yc15 ⑥:3、9
					} else if ("Yc15".equals(month)) {
						// 左
						if ("3".equals(month18)) {
							if ("4".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("5".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("9".equals(month18)) {
							if ("8".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("7".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(month12)) {
							if ("4".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("5".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("9".equals(month12)) {
							if ("8".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("7".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Yc16 ⑦:10、4
					} else if ("Yc16".equals(month)) {
						// 左
						if ("10".equals(month10)) {
							if ("9".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("8".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("4".equals(month10)) {
							if ("5".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("6".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(month13)) {
							if ("9".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("8".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("4".equals(month13)) {
							if ("5".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("6".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Yc17 ⑧:11、5
					} else if ("Yc17".equals(month)) {
						// 左
						if ("11".equals(month11)) {
							if ("10".equals(month10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("9".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("5".equals(month11)) {
							if ("6".equals(month10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("7".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(month14)) {
							if ("10".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("9".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("5".equals(month14)) {
							if ("6".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("7".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Yc18 ⑨:12、6
					} else if ("Yc18".equals(month)) {
						// 左
						if ("12".equals(month12)) {
							if ("11".equals(month11)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("10".equals(month10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("6".equals("6")) {
							if ("7".equals(month11)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("8".equals(month10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(month15)) {
							if ("11".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("10".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("6".equals(month15)) {
							if ("7".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("8".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}
				}
			}
		}

		// C行を見た結果がない場合、B行の結果を見る
		if (null != bLine) {
			if (starMap.size() == 0) {
				for (String month : bLine) {
					// Yb1 ⑦:10、4
					if ("Yb1".equals(month)) {
						// 左
						if ("10".equals(month4)) {
							if ("9".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("8".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("4".equals(month4)) {
							if ("5".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("6".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(month4)) {
							if ("9".equals(month5)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("8".equals(month6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("4".equals(month4)) {
							if ("5".equals(month5)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("6".equals(month6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Yb2 ⑧:11、5
					} else if ("Yb2".equals(month)) {
						// 左
						if ("11".equals(month5)) {
							if (month4.equals("10")) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if (month3.equals("9")) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("5".equals(month5)) {
							if ("6".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("7".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(month5)) {
							if ("10".equals(month6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("9".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("5".equals("5")) {
							if ("6".equals(month6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("7".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Yb3 ⑨:12、6
					} else if ("Yb3".equals(month)) {
						// 左
						if ("12".equals(month6)) {
							if ("11".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("10".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("6".equals(month6)) {
							if ("7".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("8".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(month6)) {
							if ("11".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("10".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("6".equals(month6)) {
							if ("7".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("8".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Yb4 ⑩:1、7
					} else if ("Yb4".equals(month)) {
						// 左
						if ("1".equals(month7)) {
							if ("12".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("11".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("7".equals(month7)) {
							if ("8".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("9".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(month1)) {
							if ("12".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("11".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("7".equals(month1)) {
							if ("8".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("9".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Yb5 ⑪:2、8
					} else if ("Yb5".equals(month)) {
						// 左
						if ("2".equals(month8)) {
							if ("1".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("12".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("8".equals(month8)) {
							if ("9".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("10".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(month2)) {
							if ("1".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("12".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("8".equals(month2)) {
							if ("9".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("10".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Yb6 ⑫:3、9
					} else if ("Yb6".equals(month)) {
						// 左
						if ("3".equals(month9)) {
							if ("2".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("1".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("9".equals(month9)) {
							if ("10".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("11".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(month3)) {
							if ("2".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("1".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("9".equals(month3)) {
							if ("10".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("11".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Yb7 ①:4、10
					} else if ("Yb7".equals(month)) {
						// 左
						if ("4".equals(month10)) {
							if ("3".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("2".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("10".equals(month10)) {
							if ("11".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("12".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(month4)) {
							if ("3".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("2".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("10".equals(month4)) {
							if ("11".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("12".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Yb8 ②:5、11
					} else if ("Yb8".equals(month)) {
						// 左
						if ("5".equals(month11)) {
							if ("4".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("3".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("11".equals(month11)) {
							if ("12".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("1".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(month5)) {
							if ("4".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("3".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("11".equals(month5)) {
							if ("12".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("1".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Yb9 ③:6、12
					} else if ("Yb9".equals(month)) {
						// 左
						if ("6".equals(month12)) {
							if ("5".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("4".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("12".equals(month12)) {
							if ("1".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("2".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(month6)) {
							if ("5".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("4".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("12".equals(month6)) {
							if ("1".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("2".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Yb10 ④:7、1
					} else if ("Yb10".equals(month)) {
						// 左
						if ("7".equals(month13)) {
							if ("6".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("5".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("1".equals(month13)) {
							if ("2".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("3".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(month7)) {
							if ("6".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("5".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("1".equals(month7)) {
							if ("2".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("3".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Yb11 ⑤:8、2
					} else if ("Yb11".equals(month)) {
						// 左
						if ("8".equals(month14)) {
							if ("7".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("6".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("2".equals(month14)) {
							if ("3".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("4".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(month8)) {
							if ("7".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("6".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("2".equals(month8)) {
							if ("3".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("4".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Yb12 ⑥:9、3
					} else if ("Yb12".equals(month)) {
						// 左
						if ("9".equals(month15)) {
							if ("10".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("11".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("3".equals(month15)) {
							if ("4".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("5".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(month9)) {
							if ("8".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("7".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("3".equals(month9)) {
							if ("4".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("5".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Yb13 ⑦:10、4
					} else if ("Yb13".equals(month)) {
						// 左
						if ("10".equals(month16)) {
							if ("9".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("8".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("4".equals(month16)) {
							if ("5".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("6".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(month10)) {
							if ("9".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("8".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("4".equals(month10)) {
							if ("5".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("6".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Yb14 ⑧:11、5
					} else if ("Yb14".equals(month)) {
						// 左
						if ("11".equals(month17)) {
							if ("10".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("9".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("5".equals(month17)) {
							if ("6".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("7".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(month11)) {
							if ("10".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("9".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("5".equals(month11)) {
							if ("6".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("7".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Yb15 ⑨:12、6
					} else if ("Yb15".equals(month)) {
						// 左
						if ("12".equals(month18)) {
							if ("11".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("10".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("6".equals(month18)) {
							if ("7".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("8".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(month12)) {
							if ("11".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("10".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("6".equals(month12)) {
							if ("7".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("8".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Yb16 ⑩:1、7
					} else if ("Yb16".equals(month)) {
						// 左
						if ("1".equals(month1)) {
							if ("12".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("11".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("7".equals(month1)) {
							if ("8".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("9".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(month13)) {
							if ("12".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("11".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("7".equals(month13)) {
							if ("8".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("9".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Yb17 ⑪:2、8
					} else if ("Yb17".equals(month)) {
						// 左
						if ("2".equals(month2)) {
							if ("1".equals(month1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("12".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("8".equals(month2)) {
							if ("9".equals(month1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("10".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(month14)) {
							if ("1".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("12".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("8".equals(month14)) {
							if ("9".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("10".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Yb18 ⑫:3、9
					} else if ("Yb18".equals(month)) {
						// 左
						if ("3".equals(month3)) {
							if ("2".equals(month2)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("1".equals(month1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("9".equals(month3)) {
							if ("10".equals(month2)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("11".equals(month1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(month15)) {
							if ("2".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("1".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("9".equals(month15)) {
							if ("10".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("11".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}

				}
			}
		}

		// b行を見た結果がない場合、a行の結果を見る
		if (null != aLine) {
			if (starMap.size() == 0) {
				for (String month : aLine) {
					// Ya1 ⑩:1、7
					if ("Ya1".equals(month)) {
						// 左
						if ("1".equals(month4)) {
							if ("12".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("11".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("7".equals(month4)) {
							if ("8".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("9".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(month7)) {
							if ("12".equals(month8)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("11".equals(month9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("7".equals(month7)) {
							if ("8".equals(month8)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("9".equals(month9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Ya2 ⑪:2、8
					} else if ("Ya2".equals(month)) {
						// 左
						if ("2".equals(month5)) {
							if ("1".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("12".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("8".equals(month5)) {
							if ("9".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("10".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(month8)) {
							if ("1".equals(month9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("12".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("8".equals(month8)) {
							if ("9".equals(month9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("10".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Ya3 ⑫:3、9
					} else if ("Ya3".equals(month)) {
						// 左
						if ("3".equals(month6)) {
							if ("2".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("1".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("9".equals(month6)) {
							if ("10".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("11".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(month9)) {
							if ("2".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("1".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("9".equals(month9)) {
							if ("10".equals(month1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("11".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Ya4 ①:4、10
					} else if ("Ya4".equals(month)) {
						// 左
						if ("4".equals(month7)) {
							if ("3".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("2".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("10".equals("10")) {
							if ("11".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("12".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(month1)) {
							if ("3".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("2".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("10".equals(month1)) {
							if ("11".equals(month2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("12".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Ya5 ②:5、11
					} else if ("Ya5".equals(month)) {
						// 左
						if ("5".equals(month8)) {
							if ("4".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("3".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("11".equals(month8)) {
							if ("12".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("1".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(month2)) {
							if ("4".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("3".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("11".equals(month2)) {
							if ("12".equals(month3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("1".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Ya6 ③:6、12
					} else if ("Ya6".equals(month)) {
						// 左
						if ("6".equals(month9)) {
							if ("5".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("4".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("12".equals(month9)) {
							if ("1".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("2".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(month3)) {
							if ("5".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("4".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("12".equals(month3)) {
							if ("1".equals(month4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("2".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Ya7 ④:7、1
					} else if ("Ya7".equals(month)) {
						// 左
						if ("7".equals(month10)) {
							if ("6".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("5".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("1".equals(month10)) {
							if ("2".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("3".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(month4)) {
							if ("6".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("5".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("1".equals(month4)) {
							if ("2".equals(month5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("3".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Ya8 ⑤:8、2
					} else if ("Ya8".equals(month)) {
						// 左
						if ("8".equals(month11)) {
							if ("7".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("6".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("2".equals(month11)) {
							if ("3".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("4".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(month5)) {
							if ("7".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("6".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("2".equals(month5)) {
							if ("3".equals(month6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("4".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Ya9 ⑥:9、3
					} else if ("Ya9".equals(month)) {
						// 左
						if ("9".equals(month12)) {
							if ("8".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("7".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("3".equals(month12)) {
							if ("4".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("5".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(month6)) {
							if ("8".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("7".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("3".equals(month6)) {
							if ("4".equals(month7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("5".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Ya10 ⑦:10、4
					} else if ("Ya10".equals(month)) {
						// 左
						if ("10".equals(month13)) {
							if ("9".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("8".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("4".equals(month13)) {
							if ("5".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("6".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(month7)) {
							if ("9".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("8".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("4".equals(month7)) {
							if ("5".equals(month8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("6".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Ya11 ⑧:11、5
					} else if ("Ya11".equals(month)) {
						// 左
						if ("11".equals(month14)) {
							if ("10".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("9".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("5".equals(month14)) {
							if ("6".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("7".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(month8)) {
							if ("10".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("9".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("5".equals(month8)) {
							if ("6".equals(month9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("7".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Ya12 ⑨:12、6
					} else if ("Ya12".equals(month)) {
						// 左
						if ("12".equals(month15)) {
							if ("11".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("10".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("6".equals(month15)) {
							if ("7".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("8".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(month9)) {
							if ("11".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("10".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("6".equals(month9)) {
							if ("7".equals(month10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("8".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Ya13 ⑩:1、7
					} else if ("Ya13".equals(month)) {
						// 左
						if ("1".equals(month16)) {
							if ("12".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("11".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("7".equals(month16)) {
							if ("8".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("9".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(month10)) {
							if ("12".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("11".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("7".equals(month10)) {
							if ("8".equals(month11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("9".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Ya14 ⑪:2、8
					} else if ("Ya14".equals(month)) {
						// 左
						if ("2".equals(month17)) {
							if ("1".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("12".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("8".equals(month17)) {
							if ("9".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("10".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(month11)) {
							if ("1".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("12".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("8".equals(month11)) {
							if ("9".equals(month12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("10".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Ya15 ⑫:3、9
					} else if ("Ya15".equals(month)) {
						// 左
						if ("3".equals(month18)) {
							if ("2".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("1".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("9".equals(month18)) {
							if ("10".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("11".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(month12)) {
							if ("2".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("1".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("9".equals(month12)) {
							if ("10".equals(month13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("11".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Ya16 ①:4、10
					} else if ("Ya16".equals(month)) {
						// 左
						if ("4".equals(month4)) {
							if ("3".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("2".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("10".equals(month4)) {
							if ("11".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("12".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(month13)) {
							if ("3".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("2".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("10".equals(month13)) {
							if ("11".equals(month14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("12".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Ya17 ②:5、11
					} else if ("Ya17".equals(month)) {
						// 左
						if ("5".equals(month5)) {
							if ("4".equals(month4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("3".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("11".equals(month5)) {
							if ("12".equals(month4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("1".equals(month18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(month14)) {
							if ("4".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("3".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("11".equals(month14)) {
							if ("12".equals(month15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("1".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Ya18 ③:6、12
					} else if ("Ya18".equals(month)) {
						// 左
						if ("6".equals(month6)) {
							if ("5".equals(month5)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("4".equals(month4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("12".equals(month6)) {
							if ("1".equals(month5)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("2".equals(month4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(month15)) {
							if ("5".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("4".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("12".equals(month15)) {
							if ("1".equals(month16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("2".equals(month17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}

				}
			}
		}

		// 日の行ポイントの数字★を付ける
		aLine = new ArrayList<String>();
		bLine = new ArrayList<String>();
		cLine = new ArrayList<String>();
		dLine = new ArrayList<String>();

		// 行を分類する(a,b,c,dを分類)
		this.lineSortPro(dayMaruResult, aLine, bLine, cLine, dLine);

		// 先にD行で〇を付けた数字を見る、D行の数字を見た結果がなければ、C行を見る...の順番に。
		if (null != dLine) {
			for (String day : dLine) {
				// Yd1 ①:4、10
				if ("Yd1".equals(day)) {
					// 左
					if ("4".equals(day4)) {
						if (day3.equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("2".equals(day2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					} else if ("10".equals(day4)) {
						if ("11".equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("12".equals(day2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					}
					// 右
					if ("4".equals(day10)) {
						if ("3".equals(day11)) {
							starMap.put("YR2", TEXT.RED_STAR);
						}
						if ("2".equals(day12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
					} else if ("10".equals(day10)) {
						if ("11".equals(day11)) {
							starMap.put("YR2", TEXT.RED_STAR);
						}
						if ("12".equals(day12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
					}
					// Yd2 ②:5、11
				} else if ("Yd2".equals(day)) {
					// 左
					if ("5".equals(day5)) {
						if ("4".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("3".equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					} else if ("11".equals(day5)) {
						if ("12".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("1".equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					}
					// 右
					if ("5".equals(day11)) {
						if ("4".equals(day12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
						if ("3".equals(day1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
					} else if ("11".equals(day11)) {
						if ("12".equals(day12)) {
							starMap.put("YR1", TEXT.RED_STAR);
						}
						if ("1".equals(day1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
					}
					// Yd3 ③:6、12
				} else if ("Yd3".equals(day)) {
					// 左
					if ("6".equals(day6)) {
						if ("5".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("4".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					} else if ("12".equals(day6)) {
						if ("1".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("2".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					}
					// 右
					if ("6".equals(day12)) {
						if ("5".equals(day1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
						if ("4".equals(day2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					} else if ("12".equals(day12)) {
						if ("1".equals(day1)) {
							starMap.put("Y1", TEXT.RED_STAR);
						}
						if ("2".equals(day2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
					}
					// Yd4 ④:7、1
				} else if ("Yd4".equals(day)) {
					// 左
					if ("7".equals(day7)) {
						if ("6".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("5".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					} else if ("1".equals(day7)) {
						if ("2".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("3".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					}
					// 右
					if ("7".equals(day1)) {
						if ("6".equals(day2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
						if ("5".equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					} else if ("1".equals(day1)) {
						if ("2".equals(day2)) {
							starMap.put("Y2", TEXT.RED_STAR);
						}
						if ("3".equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
					}
					// Yd5 ⑤:2、8
				} else if ("Yd5".equals(day)) {
					// 左
					if ("8".equals(day8)) {
						if ("7".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("6".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					} else if ("2".equals(day8)) {
						if ("3".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("4".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					}
					// 右
					if ("8".equals(day2)) {
						if ("7".equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("6".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					} else if ("2".equals(day2)) {
						if ("3".equals(day3)) {
							starMap.put("Y3", TEXT.RED_STAR);
						}
						if ("4".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
					}
					// Yd6 ⑥:3、9
				} else if ("Yd6".equals(day)) {
					// 左
					if ("9".equals(day9)) {
						if ("8".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("7".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					} else if ("3".equals(day9)) {
						if ("4".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("5".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					}
					// 右
					if ("9".equals(day3)) {
						if ("8".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("7".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					} else if ("3".equals(day3)) {
						if ("4".equals(day4)) {
							starMap.put("Y4", TEXT.RED_STAR);
						}
						if ("5".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
					}
					// Yd7 ⑦:4、10
				} else if ("Yd7".equals(day)) {
					// 左
					if ("10".equals(day10)) {
						if ("9".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("8".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					} else if ("4".equals(day10)) {
						if ("5".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("6".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					}
					// 右
					if ("10".equals(day4)) {
						if ("9".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("8".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					} else if ("4".equals(day4)) {
						if ("5".equals(day5)) {
							starMap.put("Y5", TEXT.RED_STAR);
						}
						if ("6".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
					}
					// Yd8 ⑧:5、11
				} else if ("Yd8".equals(day)) {
					// 左
					if ("11".equals(day11)) {
						if ("10".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("9".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					} else if ("5".equals(day11)) {
						if ("6".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("7".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					}
					// 右
					if ("11".equals(day5)) {
						if ("10".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("9".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					} else if ("5".equals(day5)) {
						if ("6".equals(day6)) {
							starMap.put("Y6", TEXT.RED_STAR);
						}
						if ("7".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
					}
					// Yd9 ⑨:6、12
				} else if ("Yd9".equals(day)) {
					// 左
					if ("12".equals(day12)) {
						if ("11".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("10".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					} else if ("6".equals(day12)) {
						if ("7".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("8".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					}
					// 右
					if ("12".equals(day6)) {
						if ("11".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("10".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					} else if ("6".equals(day6)) {
						if ("7".equals(day7)) {
							starMap.put("Y7", TEXT.RED_STAR);
						}
						if ("8".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
					}
					// Yd10 ⑩:1、7
				} else if ("Yd10".equals(day)) {
					// 左
					if ("1".equals(day13)) {
						if ("12".equals(day12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("11".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					} else if ("7".equals(day13)) {
						if ("8".equals(day12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("9".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					}
					// 右
					if ("1".equals(day7)) {
						if ("12".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("11".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					} else if ("7".equals(day7)) {
						if ("8".equals(day8)) {
							starMap.put("Y8", TEXT.RED_STAR);
						}
						if ("9".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
					}
					// Yd11 ⑪:2、8
				} else if ("Yd11".equals(day)) {
					// 左
					if ("2".equals(day14)) {
						if ("1".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("12".equals(day12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					} else if ("8".equals(day14)) {
						if ("9".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("10".equals("day12")) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					}
					// 右
					if ("2".equals(day8)) {
						if ("1".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("12".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					} else if ("8".equals(day8)) {
						if ("9".equals(day9)) {
							starMap.put("Y9", TEXT.RED_STAR);
						}
						if ("10".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
					}

					// Yd12 ⑫:3、9
				} else if ("Yd12".equals(day)) {
					// 左
					if ("3".equals(day15)) {
						if ("2".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("1".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					} else if ("9".equals(day15)) {
						if ("10".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("1".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					}
					// 右
					if ("3".equals(day9)) {
						if ("2".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("1".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					} else if ("9".equals(day9)) {
						if ("10".equals(day10)) {
							starMap.put("Y10", TEXT.RED_STAR);
						}
						if ("11".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
					}

					// Yd13 ①:4、10
				} else if ("Yd13".equals(day)) {
					// 左
					if ("4".equals(day16)) {
						if ("3".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("2".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					} else if ("10".equals(day16)) {
						if ("11".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("12".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					}
					// 右
					if ("4".equals(day10)) {
						if ("3".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("2".equals(day12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					} else if ("10".equals(day10)) {
						if ("11".equals(day11)) {
							starMap.put("Y11", TEXT.RED_STAR);
						}
						if ("12".equals(day12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
					}

					// Yd14 ②:5、11
				} else if ("Yd14".equals(day)) {
					// 左
					if ("5".equals(day17)) {
						if ("4".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("3".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					} else if ("11".equals(day17)) {
						if ("12".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("13".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					}
					// 右
					if ("5".equals(day11)) {

						if ("4".equals(day12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("3".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					} else if (day11.equals("11")) {
						if ("12".equals(day12)) {
							starMap.put("Y12", TEXT.RED_STAR);
						}
						if ("13".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
					}

					// Yd15 ③:6、12
				} else if ("Yd15".equals(day)) {
					// 左
					if ("6".equals(day18)) {
						if ("5".equals(day17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
						if ("4".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					} else if ("12".equals(day18)) {
						if ("1".equals(day17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
						if ("2".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					}
					// 右
					if ("6".equals(day12)) {
						if ("5".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("4".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					} else if ("12".equals(day12)) {
						if ("1".equals(day13)) {
							starMap.put("Y13", TEXT.RED_STAR);
						}
						if ("2".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
					}

					// Yd16 ④:7、1
				} else if ("Yd16".equals(day)) {
					// 左
					if ("7".equals(day7)) {
						if ("6".equals(day18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
						if ("5".equals(day17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					} else if ("1".equals(day7)) {
						if ("2".equals(day18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
						if ("3".equals(day17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					}
					// 右
					if ("7".equals(day13)) {
						if ("6".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("5".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					} else if ("1".equals(day13)) {
						if ("2".equals(day14)) {
							starMap.put("Y14", TEXT.RED_STAR);
						}
						if ("3".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
					}

					// Yd17 ⑤:2、8
				} else if ("Yd17".equals(day)) {
					// 左
					if ("8".equals(day8)) {
						if ("7".equals(day7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
						if ("6".equals(day18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
					} else if (day8.equals("2")) {
						if ("3".equals(day7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
						if ("4".equals(day18)) {
							starMap.put("Y18", TEXT.RED_STAR);
						}
					}
					// 右
					if ("8".equals(day14)) {
						if ("7".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("6".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					} else if ("2".equals(day14)) {
						if ("3".equals(day15)) {
							starMap.put("Y15", TEXT.RED_STAR);
						}
						if ("4".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
					}

					// Yd18 ⑥:3、9
				} else if ("Yd18".equals(day)) {
					// 左
					if ("9".equals(day9)) {
						if ("8".equals(day8)) {
							starMap.put("YL2", TEXT.RED_STAR);
						}
						if ("7".equals(day7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
					} else if ("3".equals(day9)) {
						if ("4".equals(day8)) {
							starMap.put("YL2", TEXT.RED_STAR);
						}
						if ("5".equals(day7)) {
							starMap.put("YL1", TEXT.RED_STAR);
						}
					}
					// 右
					if ("9".equals(day15)) {
						if ("8".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("7".equals(day17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					} else if ("3".equals(day15)) {
						if ("4".equals(day16)) {
							starMap.put("Y16", TEXT.RED_STAR);
						}
						if ("5".equals(day17)) {
							starMap.put("Y17", TEXT.RED_STAR);
						}
					}
				}
			}
		}

		// D行を見た結果がない場合、C行の結果を見る
		if (null != cLine) {
			if (starMap.size() == 0) {
				for (String day : cLine) {
					// Yc1 ④:7、1
					if ("Yc1".equals(day)) {
						// 左
						if ("7".equals(day4)) {
							if ("6".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("5".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("1".equals(day4)) {
							if ("2".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("3".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(day1)) {
							if ("6".equals(day2)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("5".equals(day3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("1".equals(day1)) {
							if ("2".equals(day2)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("3".equals(day3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Yc2 ⑤:8、2
					} else if ("Yc2".equals(day)) {
						// 左
						if ("8".equals(day5)) {
							if ("7".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("6".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("2".equals(day5)) {
							if ("3".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("4".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(day2)) {
							if ("7".equals(day3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("6".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("2".equals(day2)) {
							if ("3".equals(day3)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("4".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Yc3 ⑥:9、3
					} else if ("Yc3".equals(day)) {
						// 左
						if ("9".equals(day6)) {
							if ("8".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("7".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("3".equals(day6)) {
							if ("4".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("5".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(day3)) {
							if ("8".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("7".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("3".equals(day3)) {
							if ("4".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("5".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Yc4 ⑦:10、4
					} else if ("Yc4".equals(day)) {
						// 左
						if ("10".equals(day7)) {
							if ("9".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("8".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("4".equals(day7)) {
							if ("5".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("6".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(day1)) {
							if ("9".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("8".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("4".equals(day1)) {
							if ("5".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("6".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Yc5 ⑧:11、5
					} else if ("Yc5".equals(day)) {
						// 左
						if ("11".equals(day8)) {
							if ("10".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("9".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("5".equals(day8)) {
							if ("6".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("7".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(day2)) {
							if ("10".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("9".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("5".equals(day2)) {
							if ("6".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("7".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Yc6 ⑨:12、6
					} else if ("Yc6".equals(day)) {
						// 左
						if ("12".equals(day9)) {
							if ("11".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("10".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("6".equals(day9)) {
							if ("7".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("8".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(day3)) {
							if ("11".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("10".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("6".equals(day3)) {
							if ("7".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("8".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Yc7 ⑩:1、7
					} else if ("Yc7".equals(day)) {
						// 左
						if ("1".equals(day10)) {
							if ("12".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("11".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("7".equals(day10)) {
							if ("8".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("9".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(day4)) {
							if ("12".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("11".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("7".equals(day4)) {
							if ("8".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("9".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Yc8 ⑪:2、8
					} else if ("Yc8".equals(day)) {
						// 左
						if ("2".equals(day11)) {
							if ("1".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("12".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("8".equals(day11)) {
							if ("9".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("10".equals("10")) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(day5)) {
							if ("1".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("11".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("8".equals(day5)) {
							if ("9".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("10".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Yc9 ⑫:3、9
					} else if ("Yc9".equals(day)) {
						// 左
						if ("3".equals(day12)) {
							if ("2".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("1".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("9".equals(day12)) {
							if ("10".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("11".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(day6)) {
							if ("2".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("1".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("9".equals(day6)) {
							if ("10".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("11".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Yc10 ①:4、10
					} else if ("Yc10".equals(day)) {
						// 左
						if ("4".equals(day13)) {
							if ("3".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("2".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("10".equals(day13)) {
							if ("11".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("12".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(day7)) {
							if ("3".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("2".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("10".equals(day7)) {
							if ("11".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("12".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Yc11 ②:5、11
					} else if ("Yc11".equals(day)) {
						// 左
						if ("5".equals(day14)) {
							if ("4".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("3".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("11".equals(day14)) {
							if ("12".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("1".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(day8)) {
							if ("4".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("3".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("11".equals(day8)) {
							if ("12".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("1".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Yc12 ③:6、12
					} else if ("Yc12".equals(day)) {
						// 左
						if ("6".equals(day15)) {
							if ("5".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("4".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("12".equals(day15)) {
							if ("1".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("2".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(day9)) {
							if ("5".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("4".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("12".equals(day9)) {
							if ("1".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("2".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Yc13 ④:7、1
					} else if ("Yc13".equals(day)) {
						// 左
						if ("7".equals(day16)) {
							if ("6".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("5".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("1".equals(day16)) {
							if ("2".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("3".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(day10)) {
							if ("6".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("5".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("1".equals(day10)) {
							if ("2".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("3".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Yc14 ⑤:2、8
					} else if ("Yc14".equals(day)) {
						// 左
						if ("2".equals(day17)) {
							if ("3".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("4".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("8".equals(day17)) {
							if ("7".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("6".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(day11)) {
							if ("3".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("4".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("8".equals(day11)) {
							if ("7".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("6".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Yc15 ⑥:3、9
					} else if ("Yc15".equals(day)) {
						// 左
						if ("3".equals(day18)) {
							if ("4".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("5".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("9".equals(day18)) {
							if ("8".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("7".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(day12)) {
							if ("4".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("5".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("9".equals(day12)) {
							if ("8".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("7".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Yc16 ⑦:10、4
					} else if ("Yc16".equals(day)) {
						// 左
						if ("10".equals(day10)) {
							if ("9".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("8".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("4".equals(day10)) {
							if ("5".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("6".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(day13)) {
							if ("9".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("8".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("4".equals(day13)) {
							if ("5".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("6".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Yc17 ⑧:11、5
					} else if ("Yc17".equals(day)) {
						// 左
						if ("11".equals(day11)) {
							if ("10".equals(day10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("9".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("5".equals(day11)) {
							if ("6".equals(day10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("7".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(day14)) {
							if ("10".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("9".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("5".equals(day14)) {
							if ("6".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("7".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Yc18 ⑨:12、6
					} else if ("Yc18".equals(day)) {
						// 左
						if ("12".equals(day12)) {
							if ("11".equals(day11)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("10".equals(day10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("6".equals("6")) {
							if ("7".equals(day11)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("8".equals(day10)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(day15)) {
							if ("11".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("10".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("6".equals(day15)) {
							if ("7".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("8".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}
				}
			}
		}

		// C行を見た結果がない場合、B行の結果を見る
		if (null != bLine) {
			if (starMap.size() == 0) {
				for (String day : bLine) {
					// Yb1 ⑦:10、4
					if ("Yb1".equals(day)) {
						// 左
						if ("10".equals(day4)) {
							if ("9".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("8".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("4".equals(day4)) {
							if ("5".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("6".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(day4)) {
							if ("9".equals(day5)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("8".equals(day6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("4".equals(day4)) {
							if ("5".equals(day5)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("6".equals(day6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Yb2 ⑧:11、5
					} else if ("Yb2".equals(day)) {
						// 左
						if ("11".equals(day5)) {
							if (day4.equals("10")) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if (day3.equals("9")) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("5".equals(day5)) {
							if ("6".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("7".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(day5)) {
							if ("10".equals(day6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("9".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("5".equals("5")) {
							if ("6".equals(day6)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("7".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Yb3 ⑨:12、6
					} else if ("Yb3".equals(day)) {
						// 左
						if ("12".equals(day6)) {
							if ("11".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("10".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("6".equals(day6)) {
							if ("7".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("8".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(day6)) {
							if ("11".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("10".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("6".equals(day6)) {
							if ("7".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("8".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Yb4 ⑩:1、7
					} else if ("Yb4".equals(day)) {
						// 左
						if ("1".equals(day7)) {
							if ("12".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("11".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("7".equals(day7)) {
							if ("8".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("9".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(day1)) {
							if ("12".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("11".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("7".equals(day1)) {
							if ("8".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("9".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Yb5 ⑪:2、8
					} else if ("Yb5".equals(day)) {
						// 左
						if ("2".equals(day8)) {
							if ("1".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("12".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("8".equals(day8)) {
							if ("9".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("10".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(day2)) {
							if ("1".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("12".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("8".equals(day2)) {
							if ("9".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("10".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Yb6 ⑫:3、9
					} else if ("Yb6".equals(day)) {
						// 左
						if ("3".equals(day9)) {
							if ("2".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("1".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("9".equals(day9)) {
							if ("10".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("11".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(day3)) {
							if ("2".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("1".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("9".equals(day3)) {
							if ("10".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("11".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Yb7 ①:4、10
					} else if ("Yb7".equals(day)) {
						// 左
						if ("4".equals(day10)) {
							if ("3".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("2".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("10".equals(day10)) {
							if ("11".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("12".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(day4)) {
							if ("3".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("2".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("10".equals(day4)) {
							if ("11".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("12".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Yb8 ②:5、11
					} else if ("Yb8".equals(day)) {
						// 左
						if ("5".equals(day11)) {
							if ("4".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("3".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("11".equals(day11)) {
							if ("12".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("1".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(day5)) {
							if ("4".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("3".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("11".equals(day5)) {
							if ("12".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("1".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Yb9 ③:6、12
					} else if ("Yb9".equals(day)) {
						// 左
						if ("6".equals(day12)) {
							if ("5".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("4".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("12".equals(day12)) {
							if ("1".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("2".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(day6)) {
							if ("5".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("4".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("12".equals(day6)) {
							if ("1".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("2".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Yb10 ④:7、1
					} else if ("Yb10".equals(day)) {
						// 左
						if ("7".equals(day13)) {
							if ("6".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("5".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("1".equals(day13)) {
							if ("2".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("3".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(day7)) {
							if ("6".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("5".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("1".equals(day7)) {
							if ("2".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("3".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Yb11 ⑤:8、2
					} else if ("Yb11".equals(day)) {
						// 左
						if ("8".equals(day14)) {
							if ("7".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("6".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("2".equals(day14)) {
							if ("3".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("4".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(day8)) {
							if ("7".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("6".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("2".equals(day8)) {
							if ("3".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("4".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Yb12 ⑥:9、3
					} else if ("Yb12".equals(day)) {
						// 左
						if ("9".equals(day15)) {
							if ("10".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("11".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("3".equals(day15)) {
							if ("4".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("5".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(day9)) {
							if ("8".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("7".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("3".equals(day9)) {
							if ("4".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("5".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Yb13 ⑦:10、4
					} else if ("Yb13".equals(day)) {
						// 左
						if ("10".equals(day16)) {
							if ("9".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("8".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("4".equals(day16)) {
							if ("5".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("6".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(day10)) {
							if ("9".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("8".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("4".equals(day10)) {
							if ("5".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("6".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Yb14 ⑧:11、5
					} else if ("Yb14".equals(day)) {
						// 左
						if ("11".equals(day17)) {
							if ("10".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("9".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("5".equals(day17)) {
							if ("6".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("7".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(day11)) {
							if ("10".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("9".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("5".equals(day11)) {
							if ("6".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("7".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Yb15 ⑨:12、6
					} else if ("Yb15".equals(day)) {
						// 左
						if ("12".equals(day18)) {
							if ("11".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("10".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("6".equals(day18)) {
							if ("7".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("8".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(day12)) {
							if ("11".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("10".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("6".equals(day12)) {
							if ("7".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("8".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Yb16 ⑩:1、7
					} else if ("Yb16".equals(day)) {
						// 左
						if ("1".equals(day1)) {
							if ("12".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("11".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("7".equals(day1)) {
							if ("8".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("9".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(day13)) {
							if ("12".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("11".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("7".equals(day13)) {
							if ("8".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("9".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Yb17 ⑪:2、8
					} else if ("Yb17".equals(day)) {
						// 左
						if ("2".equals(day2)) {
							if ("1".equals(day1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("12".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("8".equals(day2)) {
							if ("9".equals(day1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("10".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(day14)) {
							if ("1".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("12".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("8".equals(day14)) {
							if ("9".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("10".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Yb18 ⑫:3、9
					} else if ("Yb18".equals(day)) {
						// 左
						if ("3".equals(day3)) {
							if ("2".equals(day2)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("1".equals(day1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("9".equals(day3)) {
							if ("10".equals(day2)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("11".equals(day1)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(day15)) {
							if ("2".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("1".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("9".equals(day15)) {
							if ("10".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("11".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}

				}
			}
		}

		// b行を見た結果がない場合、a行の結果を見る
		if (null != aLine) {
			if (starMap.size() == 0) {
				for (String day : aLine) {
					// Ya1 ⑩:1、7
					if ("Ya1".equals(day)) {
						// 左
						if ("1".equals(day4)) {
							if ("12".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("11".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("7".equals(day4)) {
							if ("8".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("9".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(day7)) {
							if ("12".equals(day8)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("11".equals(day9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						} else if ("7".equals(day7)) {
							if ("8".equals(day8)) {
								starMap.put("YR2", TEXT.RED_STAR);
							}
							if ("9".equals(day9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
						}
						// Ya2 ⑪:2、8
					} else if ("Ya2".equals(day)) {
						// 左
						if ("2".equals(day5)) {
							if ("1".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("12".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("8".equals(day5)) {
							if ("9".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("10".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(day8)) {
							if ("1".equals(day9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("12".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						} else if ("8".equals(day8)) {
							if ("9".equals(day9)) {
								starMap.put("YR1", TEXT.RED_STAR);
							}
							if ("10".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
						}
						// Ya3 ⑫:3、9
					} else if ("Ya3".equals(day)) {
						// 左
						if ("3".equals(day6)) {
							if ("2".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("1".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("9".equals(day6)) {
							if ("10".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("11".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(day9)) {
							if ("2".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("1".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						} else if ("9".equals(day9)) {
							if ("10".equals(day1)) {
								starMap.put("Y1", TEXT.RED_STAR);
							}
							if ("11".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
						}
						// Ya4 ①:4、10
					} else if ("Ya4".equals(day)) {
						// 左
						if ("4".equals(day7)) {
							if ("3".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("2".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("10".equals("10")) {
							if ("11".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("12".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(day1)) {
							if ("3".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("2".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						} else if ("10".equals(day1)) {
							if ("11".equals(day2)) {
								starMap.put("Y2", TEXT.RED_STAR);
							}
							if ("12".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
						}
						// Ya5 ②:5、11
					} else if ("Ya5".equals(day)) {
						// 左
						if ("5".equals(day8)) {
							if ("4".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("3".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("11".equals(day8)) {
							if ("12".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("1".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(day2)) {
							if ("4".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("3".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						} else if ("11".equals(day2)) {
							if ("12".equals(day3)) {
								starMap.put("Y3", TEXT.RED_STAR);
							}
							if ("1".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
						}
						// Ya6 ③:6、12
					} else if ("Ya6".equals(day)) {
						// 左
						if ("6".equals(day9)) {
							if ("5".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("4".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("12".equals(day9)) {
							if ("1".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("2".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(day3)) {
							if ("5".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("4".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						} else if ("12".equals(day3)) {
							if ("1".equals(day4)) {
								starMap.put("Y4", TEXT.RED_STAR);
							}
							if ("2".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
						}
						// Ya7 ④:7、1
					} else if ("Ya7".equals(day)) {
						// 左
						if ("7".equals(day10)) {
							if ("6".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("5".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("1".equals(day10)) {
							if ("2".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("3".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// 右
						if ("7".equals(day4)) {
							if ("6".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("5".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						} else if ("1".equals(day4)) {
							if ("2".equals(day5)) {
								starMap.put("Y5", TEXT.RED_STAR);
							}
							if ("3".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
						}
						// Ya8 ⑤:8、2
					} else if ("Ya8".equals(day)) {
						// 左
						if ("8".equals(day11)) {
							if ("7".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("6".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("2".equals(day11)) {
							if ("3".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("4".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// 右
						if ("8".equals(day5)) {
							if ("7".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("6".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						} else if ("2".equals(day5)) {
							if ("3".equals(day6)) {
								starMap.put("Y6", TEXT.RED_STAR);
							}
							if ("4".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
						}
						// Ya9 ⑥:9、3
					} else if ("Ya9".equals(day)) {
						// 左
						if ("9".equals(day12)) {
							if ("8".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("7".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("3".equals(day12)) {
							if ("4".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("5".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}
						// 右
						if ("9".equals(day6)) {
							if ("8".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("7".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						} else if ("3".equals(day6)) {
							if ("4".equals(day7)) {
								starMap.put("Y7", TEXT.RED_STAR);
							}
							if ("5".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
						}
						// Ya10 ⑦:10、4
					} else if ("Ya10".equals(day)) {
						// 左
						if ("10".equals(day13)) {
							if ("9".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("8".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("4".equals(day13)) {
							if ("5".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("6".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}
						// 右
						if ("10".equals(day7)) {
							if ("9".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("8".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						} else if ("4".equals(day7)) {
							if ("5".equals(day8)) {
								starMap.put("Y8", TEXT.RED_STAR);
							}
							if ("6".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
						}
						// Ya11 ⑧:11、5
					} else if ("Ya11".equals(day)) {
						// 左
						if ("11".equals(day14)) {
							if ("10".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("9".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("5".equals(day14)) {
							if ("6".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("7".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}
						// 右
						if ("11".equals(day8)) {
							if ("10".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("9".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						} else if ("5".equals(day8)) {
							if ("6".equals(day9)) {
								starMap.put("Y9", TEXT.RED_STAR);
							}
							if ("7".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
						}

						// Ya12 ⑨:12、6
					} else if ("Ya12".equals(day)) {
						// 左
						if ("12".equals(day15)) {
							if ("11".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("10".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("6".equals(day15)) {
							if ("7".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("8".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}
						// 右
						if ("12".equals(day9)) {
							if ("11".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("10".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						} else if ("6".equals(day9)) {
							if ("7".equals(day10)) {
								starMap.put("Y10", TEXT.RED_STAR);
							}
							if ("8".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
						}

						// Ya13 ⑩:1、7
					} else if ("Ya13".equals(day)) {
						// 左
						if ("1".equals(day16)) {
							if ("12".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("11".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("7".equals(day16)) {
							if ("8".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("9".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}
						// 右
						if ("1".equals(day10)) {
							if ("12".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("11".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						} else if ("7".equals(day10)) {
							if ("8".equals(day11)) {
								starMap.put("Y11", TEXT.RED_STAR);
							}
							if ("9".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
						}

						// Ya14 ⑪:2、8
					} else if ("Ya14".equals(day)) {
						// 左
						if ("2".equals(day17)) {
							if ("1".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("12".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("8".equals(day17)) {
							if ("9".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("10".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}
						// 右
						if ("2".equals(day11)) {
							if ("1".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("12".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						} else if ("8".equals(day11)) {
							if ("9".equals(day12)) {
								starMap.put("Y12", TEXT.RED_STAR);
							}
							if ("10".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
						}

						// Ya15 ⑫:3、9
					} else if ("Ya15".equals(day)) {
						// 左
						if ("3".equals(day18)) {
							if ("2".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("1".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("9".equals(day18)) {
							if ("10".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
							if ("11".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}
						// 右
						if ("3".equals(day12)) {
							if ("2".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("1".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						} else if ("9".equals(day12)) {
							if ("10".equals(day13)) {
								starMap.put("Y13", TEXT.RED_STAR);
							}
							if ("11".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
						}

						// Ya16 ①:4、10
					} else if ("Ya16".equals(day)) {
						// 左
						if ("4".equals(day4)) {
							if ("3".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("2".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("10".equals(day4)) {
							if ("11".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
							if ("12".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
						// 右
						if ("4".equals(day13)) {
							if ("3".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("2".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						} else if ("10".equals(day13)) {
							if ("11".equals(day14)) {
								starMap.put("Y14", TEXT.RED_STAR);
							}
							if ("12".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
						}

						// Ya17 ②:5、11
					} else if ("Ya17".equals(day)) {
						// 左
						if ("5".equals(day5)) {
							if ("4".equals(day4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("3".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						} else if ("11".equals(day5)) {
							if ("12".equals(day4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
							if ("1".equals(day18)) {
								starMap.put("Y18", TEXT.RED_STAR);
							}
						}
						// 右
						if ("5".equals(day14)) {
							if ("4".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("3".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						} else if ("11".equals(day14)) {
							if ("12".equals(day15)) {
								starMap.put("Y15", TEXT.RED_STAR);
							}
							if ("1".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
						}

						// Ya18 ③:6、12
					} else if ("Ya18".equals(day)) {
						// 左
						if ("6".equals(day6)) {
							if ("5".equals(day5)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("4".equals(day4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						} else if ("12".equals(day6)) {
							if ("1".equals(day5)) {
								starMap.put("YL2", TEXT.RED_STAR);
							}
							if ("2".equals(day4)) {
								starMap.put("YL1", TEXT.RED_STAR);
							}
						}
						// 右
						if ("6".equals(day15)) {
							if ("5".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("4".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						} else if ("12".equals(day15)) {
							if ("1".equals(day16)) {
								starMap.put("Y16", TEXT.RED_STAR);
							}
							if ("2".equals(day17)) {
								starMap.put("Y17", TEXT.RED_STAR);
							}
						}
					}

				}
			}
		}
	}


    /**
     * <PRE>
     * 処理名：基本数字が〇を付け数字を変換する
     * <br>
     * @param maruResult　年、月、日〇を付けた結果
     * @param aLine a行のリスト
     * @param bLine b行のリスト
     * @param cLine c行のリスト
     * @param dLine d行のリスト
     */
	private void lineSortPro(List<String> maruResult, List<String> aLine, List<String> bLine, List<String> cLine,
			List<String> dLine) {
		for (String result : maruResult) {
			if (result.contains("a")) {
				aLine.add(result);
			} else if (result.contains("b")) {
				bLine.add(result);
			} else if (result.contains("c")) {
				cLine.add(result);
			} else if (result.contains("d")) {
				dLine.add(result);
			}
		}
	}

	// get,set---------------------------------------------------------
    // ----------------------------------------------------------------

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


	public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}


	public String getYear1() {
		return year1;
	}


	public void setYear1(String year1) {
		this.year1 = year1;
	}


	public String getYear2() {
		return year2;
	}


	public void setYear2(String year2) {
		this.year2 = year2;
	}


	public String getYear3() {
		return year3;
	}


	public void setYear3(String year3) {
		this.year3 = year3;
	}


	public String getYear4() {
		return year4;
	}


	public void setYear4(String year4) {
		this.year4 = year4;
	}


	public String getYear5() {
		return year5;
	}


	public void setYear5(String year5) {
		this.year5 = year5;
	}


	public String getYear6() {
		return year6;
	}


	public void setYear6(String year6) {
		this.year6 = year6;
	}


	public String getYear7() {
		return year7;
	}


	public void setYear7(String year7) {
		this.year7 = year7;
	}


	public String getYear8() {
		return year8;
	}


	public void setYear8(String year8) {
		this.year8 = year8;
	}


	public String getYear9() {
		return year9;
	}


	public void setYear9(String year9) {
		this.year9 = year9;
	}


	public String getYear10() {
		return year10;
	}


	public void setYear10(String year10) {
		this.year10 = year10;
	}


	public String getYear11() {
		return year11;
	}


	public void setYear11(String year11) {
		this.year11 = year11;
	}


	public String getYear12() {
		return year12;
	}


	public void setYear12(String year12) {
		this.year12 = year12;
	}


	public String getYear13() {
		return year13;
	}


	public void setYear13(String year13) {
		this.year13 = year13;
	}


	public String getYear14() {
		return year14;
	}


	public void setYear14(String year14) {
		this.year14 = year14;
	}


	public String getYear15() {
		return year15;
	}


	public void setYear15(String year15) {
		this.year15 = year15;
	}


	public String getYear16() {
		return year16;
	}


	public void setYear16(String year16) {
		this.year16 = year16;
	}


	public String getYear17() {
		return year17;
	}


	public void setYear17(String year17) {
		this.year17 = year17;
	}


	public String getYear18() {
		return year18;
	}


	public void setYear18(String year18) {
		this.year18 = year18;
	}


	public String getMonth1() {
		return month1;
	}


	public void setMonth1(String month1) {
		this.month1 = month1;
	}


	public String getMonth2() {
		return month2;
	}


	public void setMonth2(String month2) {
		this.month2 = month2;
	}


	public String getMonth3() {
		return month3;
	}


	public void setMonth3(String month3) {
		this.month3 = month3;
	}


	public String getMonth4() {
		return month4;
	}


	public void setMonth4(String month4) {
		this.month4 = month4;
	}


	public String getMonth5() {
		return month5;
	}


	public void setMonth5(String month5) {
		this.month5 = month5;
	}


	public String getMonth6() {
		return month6;
	}


	public void setMonth6(String month6) {
		this.month6 = month6;
	}


	public String getMonth7() {
		return month7;
	}


	public void setMonth7(String month7) {
		this.month7 = month7;
	}


	public String getMonth8() {
		return month8;
	}


	public void setMonth8(String month8) {
		this.month8 = month8;
	}


	public String getMonth9() {
		return month9;
	}


	public void setMonth9(String month9) {
		this.month9 = month9;
	}


	public String getMonth10() {
		return month10;
	}


	public void setMonth10(String month10) {
		this.month10 = month10;
	}


	public String getMonth11() {
		return month11;
	}


	public void setMonth11(String month11) {
		this.month11 = month11;
	}


	public String getMonth12() {
		return month12;
	}


	public void setMonth12(String month12) {
		this.month12 = month12;
	}


	public String getMonth13() {
		return month13;
	}


	public void setMonth13(String month13) {
		this.month13 = month13;
	}


	public String getMonth14() {
		return month14;
	}


	public void setMonth14(String month14) {
		this.month14 = month14;
	}


	public String getMonth15() {
		return month15;
	}


	public void setMonth15(String month15) {
		this.month15 = month15;
	}


	public String getMonth16() {
		return month16;
	}


	public void setMonth16(String month16) {
		this.month16 = month16;
	}


	public String getMonth17() {
		return month17;
	}


	public void setMonth17(String month17) {
		this.month17 = month17;
	}


	public String getMonth18() {
		return month18;
	}


	public void setMonth18(String month18) {
		this.month18 = month18;
	}


	public String getDay1() {
		return day1;
	}


	public void setDay1(String day1) {
		this.day1 = day1;
	}


	public String getDay2() {
		return day2;
	}


	public void setDay2(String day2) {
		this.day2 = day2;
	}


	public String getDay3() {
		return day3;
	}


	public void setDay3(String day3) {
		this.day3 = day3;
	}


	public String getDay4() {
		return day4;
	}


	public void setDay4(String day4) {
		this.day4 = day4;
	}


	public String getDay5() {
		return day5;
	}


	public void setDay5(String day5) {
		this.day5 = day5;
	}


	public String getDay6() {
		return day6;
	}


	public void setDay6(String day6) {
		this.day6 = day6;
	}


	public String getDay7() {
		return day7;
	}


	public void setDay7(String day7) {
		this.day7 = day7;
	}


	public String getDay8() {
		return day8;
	}


	public void setDay8(String day8) {
		this.day8 = day8;
	}


	public String getDay9() {
		return day9;
	}


	public void setDay9(String day9) {
		this.day9 = day9;
	}


	public String getDay10() {
		return day10;
	}


	public void setDay10(String day10) {
		this.day10 = day10;
	}


	public String getDay11() {
		return day11;
	}


	public void setDay11(String day11) {
		this.day11 = day11;
	}


	public String getDay12() {
		return day12;
	}


	public void setDay12(String day12) {
		this.day12 = day12;
	}


	public String getDay13() {
		return day13;
	}


	public void setDay13(String day13) {
		this.day13 = day13;
	}


	public String getDay14() {
		return day14;
	}


	public void setDay14(String day14) {
		this.day14 = day14;
	}


	public String getDay15() {
		return day15;
	}


	public void setDay15(String day15) {
		this.day15 = day15;
	}


	public String getDay16() {
		return day16;
	}


	public void setDay16(String day16) {
		this.day16 = day16;
	}


	public String getDay17() {
		return day17;
	}


	public void setDay17(String day17) {
		this.day17 = day17;
	}


	public String getDay18() {
		return day18;
	}


	public void setDay18(String day18) {
		this.day18 = day18;
	}


	public String getERR_MSG() {
		return ERR_MSG;
	}

	public BaseNum getBaseNum() {
		return baseNum;
	}

	public void setBaseNum(BaseNum baseNum) {
		this.baseNum = baseNum;
	}

	public Map<String, String> getYearMap() {
		return yearMap;
	}

	public void setYearMap(Map<String, String> yearMap) {
		this.yearMap = yearMap;
	}

	public Map<String, String> getMonthMap() {
		return monthMap;
	}

	public void setMonthMap(Map<String, String> monthMap) {
		this.monthMap = monthMap;
	}

	public Map<String, String> getDayMap() {
		return dayMap;
	}

	public void setDayMap(Map<String, String> dayMap) {
		this.dayMap = dayMap;
	}

	public Map<String, String> getStarMap() {
		return starMap;
	}

	public void setStarMap(Map<String, String> starMap) {
		this.starMap = starMap;
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


}
