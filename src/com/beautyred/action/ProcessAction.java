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

        // 騎手誕生日を取得
        for (String user : jockeyNoDto.getAryUser()) {

        	// 騎手誕生日の年、月、日どちらかnullの場合、FAILDを返却する
        	if (null == getJockeysInfo(user).getYear()
        			|| null == getJockeysInfo(user).getMonth()
        			|| null == getJockeysInfo(user).getDay()) {

                errMsg = ERR_MSG + "[" + user + "]";
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
		year13 = chenge12Pro(aryJockeysBirthdayDto.get(12).getYear());
		year14 = chenge12Pro(aryJockeysBirthdayDto.get(13).getYear());
		year15 = chenge12Pro(aryJockeysBirthdayDto.get(14).getYear());
		year16 = chenge12Pro(aryJockeysBirthdayDto.get(15).getYear());
		year17 = chenge12Pro(aryJockeysBirthdayDto.get(16).getYear());
		year18 = chenge12Pro(aryJockeysBirthdayDto.get(17).getYear());

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
		month13 = chenge12Pro(aryJockeysBirthdayDto.get(12).getMonth());
		month14 = chenge12Pro(aryJockeysBirthdayDto.get(13).getMonth());
		month15 = chenge12Pro(aryJockeysBirthdayDto.get(14).getMonth());
		month16 = chenge12Pro(aryJockeysBirthdayDto.get(15).getMonth());
		month17 = chenge12Pro(aryJockeysBirthdayDto.get(16).getMonth());
		month18 = chenge12Pro(aryJockeysBirthdayDto.get(17).getMonth());

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
		day13 = chenge12Pro(aryJockeysBirthdayDto.get(12).getDay());
		day14 = chenge12Pro(aryJockeysBirthdayDto.get(13).getDay());
		day15 = chenge12Pro(aryJockeysBirthdayDto.get(14).getDay());
		day16 = chenge12Pro(aryJockeysBirthdayDto.get(15).getDay());
		day17 = chenge12Pro(aryJockeysBirthdayDto.get(16).getDay());
		day18 = chenge12Pro(aryJockeysBirthdayDto.get(17).getDay());

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
    	int result = target;
		return String.valueOf(result);
	}


	/**
     * input画面入力した騎手番号を取得する
     * <br>
     * @return　
     * @throws Exception
     */
    private JockeyNoDto getJockeyNoDto() {
    	JockeyNoDto jockeyNoDto = new JockeyNoDto();
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
    	aryUser.add(user13);
    	aryUser.add(user14);
    	aryUser.add(user15);
    	aryUser.add(user16);
    	aryUser.add(user17);
    	aryUser.add(user18);
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
	private void maruPro(List<String> aryYears, List<String> aryMonths, List<String> aryDays, List yearResult, List monthResult, List dayResult) {

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

		for (String year : yearMaruResult) {
			// Yd1 ①:4、10
			if ("Yd1".equals(year)) {
				if ("4".equals(year4) || "10".equals(year4)) {
					if (NUM25811.contains(year2)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Yc1 ④:7、10
			else if ("Yc1".equals(year)) {
				if ("7".equals(year4) || "10".equals(year4)) {
					if (NUM25811.contains(year2)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Yb1 ⑦:4、10
			else if ("Yb1".equals(year)) {
				if ("4".equals(year4) || "10".equals(year4)) {
					if (NUM25811.contains(year2)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Ya1 ⑩:1、7
			else if ("Ya1".equals(year)) {
				if ("1".equals(year4) || "7".equals(year4)) {
					if (NUM25811.contains(year2)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Yd2 ②:5、11
			else if ("Yd2".equals(year)) {
				if ("5".equals(year5) || "11".equals(year5)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Yc2 ⑤:2、8
			else if ("Yc2".equals(year)) {
				if ("2".equals(year5) || "8".equals(year5)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Yb2 ⑧:5、11
			else if ("Yb2".equals(year)) {
				if ("5".equals(year5) || "11".equals(year5)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Ya2 ⑪:1、7
			else if ("Ya2".equals(year)) {
				if ("1".equals(year5) || "7".equals(year5)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Yd3 ③:6、12
			else if ("Yd3".equals(year)) {
				if ("6".equals(year6) || "12".equals(year6)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Yc3 ⑥:3、9
			else if ("Yc3".equals(year)) {
				if ("3".equals(year6) || "9".equals(year6)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Yb3 ⑨:6、12
			else if ("Yb3".equals(year)) {
				if ("6".equals(year6) || "12".equals(year6)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Ya3 ⑫:3、9
			else if ("Ya3".equals(year)) {
				if ("3".equals(year6) || "9".equals(year6)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Yd4 ④:7、10
			else if ("Yd4".equals(year)) {
				if ("7".equals(year7) || "10".equals(year7)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
				} else if ("7".equals(year1) || "10".equals(year1)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Yc4 ⑦:4、10
			else if ("Yc4".equals(year)) {
				if ("4".equals(year7) || "10".equals(year7)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
				} else if ("4".equals(year1) || "10".equals(year1)) {
					if (NUM25811.contains(year2)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Yb4 ⑩:1、7
			else if ("Yb4".equals(year)) {
				if ("1".equals(year7) || "7".equals(year7)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
				} else if ("1".equals(year1) || "7".equals(year1)) {
					if (NUM25811.contains(year2)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Ya4 ①:4、10
			else if ("Ya4".equals(year)) {
				if ("4".equals(year7) || "10".equals(year7)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
				} else if ("4".equals(year1) || "10".equals(year1)) {
					if (NUM25811.contains(year2)) {
						starMap.put("Y2", "★");
					}
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
				}
			}
			// Yd5 ⑤:2、8
			else if ("Yd5".equals(year)) {
				if ("2".equals(year8) || "8".equals(year8)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				} else if ("2".equals(year2) || "8".equals(year2)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Yc5 ⑧:5、11
			else if ("Yc5".equals(year)) {
				if ("5".equals(year8) || "11".equals(year8)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				} else if ("5".equals(year2) || "11".equals(year2)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Yb5 ⑪:2、8
			else if ("Yb5".equals(year)) {
				if ("2".equals(year8) || "8".equals(year8)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				} else if ("2".equals(year2) || "8".equals(year2)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Ya5 ②:5、11
			else if ("Ya5".equals(year)) {
				if ("5".equals(year8) || "11".equals(year8)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				} else if ("5".equals(year2) || "11".equals(year2)) {
					if (NUM36912.contains(year3)) {
						starMap.put("Y3", "★");
					}
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
				}
			}
			// Yd6 ⑥:3、9
			else if ("Yd6".equals(year)) {
				if ("3".equals(year9) || "9".equals(year9)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				} else if ("3".equals(year3) || "9".equals(year3)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Yc6 ⑨:6、12
			else if ("Yc6".equals(year)) {
				if ("6".equals(year9) || "12".equals(year9)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				} else if ("6".equals(year3) || "12".equals(year3)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Yb6 ⑫:3、9
			else if ("Yb6".equals(year)) {
				if ("3".equals(year9) || "9".equals(year9)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				} else if ("3".equals(year3) || "9".equals(year3)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Ya6 ③:6、12
			else if ("Ya6".equals(year)) {
				if ("6".equals(year9) || "12".equals(year9)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				} else if ("6".equals(year3) || "112".equals(year3)) {
					if (NUM14710.contains(year4)) {
						starMap.put("Y4", "★");
					}
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
				}
			}
			// Yd7 ⑦:4、10
			else if ("Yd7".equals(year)) {
				if ("4".equals(year10) || "10".equals(year10)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				} else if ("4".equals(year4) || "10".equals(year4)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
				}
			}
			// Yc7 ⑩:1、7
			else if ("Yc7".equals(year)) {
				if ("1".equals(year10) || "7".equals(year10)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				} else if ("1".equals(year4) || "7".equals(year4)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
				}
			}
			// Yb7 ①:4、10
			else if ("Yb7".equals(year)) {
				if ("4".equals(year10) || "10".equals(year10)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				} else if ("3".equals(year4) || "9".equals(year4)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
				}
			}
			// Ya7 ④:7、10
			else if ("Ya7".equals(year)) {
				if ("7".equals(year10) || "10".equals(year10)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				} else if ("6".equals(year4) || "112".equals(year4)) {
					if (NUM25811.contains(year5)) {
						starMap.put("Y5", "★");
					}
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}

				}
			}
			// Yd8 ⑧:5、11
			else if ("Yd8".equals(year)) {
				if ("5".equals(year11) || "11".equals(year11)) {
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				} else if ("5".equals(year5) || "11".equals(year5)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				}
			}
			// Yc8 ⑪:2、8
			else if ("Yc8".equals(year)) {
				if ("2".equals(year11) || "8".equals(year11)) {
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				} else if ("2".equals(year5) || "8".equals(year5)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				}
			}
			// Yb8 ②:5、11
			else if ("Yb8".equals(year)) {
				if ("5".equals(year11) || "11".equals(year11)) {
					if (NUM36912.contains(year9)) {						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				} else if ("5".equals(year5) || "11".equals(year5)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				}
			}
			// Ya8 ⑤:2、8
			else if ("Ya8".equals(year)) {
				if ("2".equals(year11) || "8".equals(year11)) {
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				} else if ("2".equals(year5) || "8".equals(year5)) {
					if (NUM36912.contains(year6)) {
						starMap.put("Y6", "★");
					}
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
				}
			}
			// Yd9 ⑨:6、12
			else if ("Yd9".equals(year)) {
				if ("6".equals(year12) || "12".equals(year12)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				} else if ("6".equals(year6) || "12".equals(year6)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				}
			}
			// Yc9 ⑫:3、9
			else if ("Yc9".equals(year)) {
				if ("3".equals(year12) || "9".equals(year12)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				} else if ("3".equals(year6) || "9".equals(year6)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				}
			}
			// Yb9 ③:6、12
			else if ("Yb9".equals(year)) {
				if ("6".equals(year12) || "12".equals(year12)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				} else if ("6".equals(year6) || "12".equals(year6)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				}
			}
			// Ya9 ⑥:3、9
			else if ("Ya9".equals(year)) {
				if ("3".equals(year12) || "9".equals(year12)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				} else if ("3".equals(year6) || "9".equals(year6)) {
					if (NUM14710.contains(year7)) {
						starMap.put("Y7", "★");
					}
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
				}
			}
			// Yd10 ⑩:1、7
			else if ("Yd10".equals(year)) {
				if ("1".equals(year13) || "7".equals(year13)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				} else if ("1".equals(year7) || "7".equals(year7)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				}
			}
			// Yc10 ①:4、10
			else if ("Yc10".equals(year)) {
				if ("4".equals(year13) || "10".equals(year13)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				} else if ("4".equals(year7) || "10".equals(year7)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				}
			}
			// Yb10 ④:7、10
			else if ("Yb10".equals(year)) {
				if ("7".equals(year13) || "10".equals(year13)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				} else if ("7".equals(year7) || "10".equals(year7)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				}
			}
			// Ya10 ⑦:4、10
			else if ("Ya10".equals(year)) {
				if ("4".equals(year13) || "10".equals(year13)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				} else if ("4".equals(year7) || "10".equals(year7)) {
					if (NUM25811.contains(year8)) {
						starMap.put("Y8", "★");
					}
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
				}
			}
			// Yd11 ⑪:2、8
			else if ("Yd11".equals(year)) {
				if ("2".equals(year14) || "8".equals(year14)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				} else if ("2".equals(year8) || "8".equals(year8)) {
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				}
			}
			// Yc11 ②:5、11
			else if ("Yc11".equals(year)) {
				if ("5".equals(year14) || "11".equals(year14)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				} else if ("5".equals(year8) || "11".equals(year8)) {
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				}
			}
			// Yb11 ⑤:2、8
			else if ("Yb11".equals(year)) {
				if ("2".equals(year14) || "8".equals(year14)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				} else if ("2".equals(year8) || "8".equals(year8)) {
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				}
			}
			// Ya11 ⑧:5、11
			else if ("Ya11".equals(year)) {
				if ("5".equals(year14) || "11".equals(year14)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				} else if ("5".equals(year8) || "11".equals(year8)) {
					if (NUM36912.contains(year9)) {
						starMap.put("Y9", "★");
					}
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
				}
			}
			// Yd12 ⑫:3、9
			else if ("Yd12".equals(year)) {
				if ("3".equals(year15) || "9".equals(year15)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				} else if ("3".equals(year9) || "9".equals(year9)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				}
			}
			// Yc12 ③:6、12
			else if ("Yc12".equals(year)) {
				if ("6".equals(year15) || "12".equals(year15)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				} else if ("6".equals(year9) || "12".equals(year9)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				}
			}
			// Yb12 ⑥:9、3
			else if ("Yb12".equals(year)) {
				if ("9".equals(year15) || "3".equals(year15)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				} else if ("9".equals(year9) || "3".equals(year9)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				}
			}
			// Ya12 ⑨:6、12
			else if ("Ya12".equals(year)) {
				if ("6".equals(year15) || "12".equals(year15)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				} else if ("6".equals(year9) || "12".equals(year9)) {
					if (NUM14710.contains(year10)) {
						starMap.put("Y10", "★");
					}
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
				}
			}
			// Yd13 ①:4、10
			else if ("Yd13".equals(year)) {
				if ("4".equals(year16) || "10".equals(year16)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				} else if ("4".equals(year10) || "10".equals(year10)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				}
			}
			// Yc13 ④:7、10
			else if ("Yc13".equals(year)) {
				if ("7".equals(year16) || "10".equals(year16)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				} else if ("7".equals(year10) || "10".equals(year10)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				}
			}
			// Yb13 ⑦:4、10
			else if ("Yb13".equals(year)) {
				if ("4".equals(year16) || "10".equals(year16)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				} else if ("4".equals(year10) || "10".equals(year10)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				}
			}
			// Ya13 ⑩:1、7
			else if ("Ya13".equals(year)) {
				if ("1".equals(year16) || "7".equals(year16)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				} else if ("1".equals(year10) || "7".equals(year10)) {
					if (NUM25811.contains(year11)) {
						starMap.put("Y11", "★");
					}
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
				}
			}
			// Yd14 ②:5、11
			else if ("Yd14".equals(year)) {
				if ("5".equals(year17) || "11".equals(year17)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				} else if ("5".equals(year11) || "11".equals(year11)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				}
			}
			// Yc14 ⑤:2、8
			else if ("Yc14".equals(year)) {
				if ("2".equals(year17) || "8".equals(year17)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				} else if ("2".equals(year11) || "8".equals(year11)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				}
			}
			// Yb14 ⑧:5、11
			else if ("Yb14".equals(year)) {
				if ("5".equals(year17) || "11".equals(year17)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				} else if ("5".equals(year11) || "11".equals(year11)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				}
			}
			// Ya14 ⑪:2、8
			else if ("Ya14".equals(year)) {
				if ("2".equals(year17) || "8".equals(year17)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				} else if ("2".equals(year11) || "8".equals(year11)) {
					if (NUM36912.contains(year12)) {
						starMap.put("Y12", "★");
					}
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
				}
			}
			// Yd15 ③:6、12
			else if ("Yd15".equals(year)) {
				if ("6".equals(year18) || "12".equals(year18)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				} else if ("6".equals(year12) || "12".equals(year12)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				}
			}
			// Yc15 ⑥:3、9
			else if ("Yc15".equals(year)) {
				if ("3".equals(year18) || "9".equals(year18)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				} else if ("3".equals(year12) || "9".equals(year12)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				}
			}
			// Yb15 ⑨:6、12
			else if ("Yb15".equals(year)) {
				if ("6".equals(year18) || "12".equals(year18)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				} else if ("6".equals(year12) || "12".equals(year12)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				}
			}
			// Ya15 ⑫:3、9
			else if ("Ya15".equals(year)) {
				if ("3".equals(year18) || "9".equals(year18)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				} else if ("3".equals(year12) || "9".equals(year12)) {
					if (NUM14710.contains(year13)) {
						starMap.put("Y13", "★");
					}
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
				}
			}
			// Yd16 ④:7、10
			else if ("Yd16".equals(year)) {
				if ("7".equals(year13) || "10".equals(year13)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				}
			}
			// Yc16 ⑦:4、10
			else if ("Yc16".equals(year)) {
				if ("4".equals(year13) || "10".equals(year13)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				}
			}
			// Yb16 ⑩:1、7
			else if ("Yb16".equals(year)) {
				if ("1".equals(year13) || "7".equals(year13)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				}
			}
			// Ya16 ①:4、10
			else if ("Ya16".equals(year)) {
				if ("4".equals(year13) || "10".equals(year13)) {
					if (NUM25811.contains(year14)) {
						starMap.put("Y14", "★");
					}
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
				}
			}
			// Yd17 ⑤:2、8
			else if ("Yd17".equals(year)) {
				if ("2".equals(year14) || "8".equals(year14)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				}
			}
			// Yc17 ⑧:5、11
			else if ("Yc17".equals(year)) {
				if ("5".equals(year14) || "11".equals(year14)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				}
			}
			// Yb17 ⑪:2、8
			else if ("Yb17".equals(year)) {
				if ("2".equals(year14) || "8".equals(year14)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				}
			}
			// Ya17 ②:5、11
			else if ("Ya17".equals(year)) {
				if ("5".equals(year14) || "11".equals(year14)) {
					if (NUM36912.contains(year15)) {
						starMap.put("Y15", "★");
					}
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
				}
			}
			// Yd18 ⑥:3、9
			else if ("Yd18".equals(year)) {
				if ("3".equals(year15) || "9".equals(year15)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				}
			}
			// Yc18 ⑨:6、12
			else if ("Yc18".equals(year)) {
				if ("6".equals(year15) || "12".equals(year15)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				}
			}
			// Yb18 ⑫:3、9
			else if ("Yb18".equals(year)) {
				if ("3".equals(year15) || "9".equals(year15)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				}
			}
			// Ya18 ③:6、12
			else if ("Yd18".equals(year)) {
				if ("6".equals(year15) || "12".equals(year15)) {
					if (NUM14710.contains(year16)) {
						starMap.put("Y16", "★");
					}
					if (NUM25811.contains(year17)) {
						starMap.put("Y17", "★");
					}
				}
			}
		}

		// 月の行ポイントの数字★を付ける

		for (String month : monthMaruResult) {
			// Md1 ①:4、10
			if ("Md1".equals(month)) {
				if ("4".equals(month4) || "10".equals(month4)) {
					if (NUM25811.contains(month2)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Mc1 ④:7、10
			else if ("Mc1".equals(month)) {
				if ("7".equals(month4) || "10".equals(month4)) {
					if (NUM25811.contains(month2)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Mb1 ⑦:4、10
			else if ("Mb1".equals(month)) {
				if ("4".equals(month4) || "10".equals(month4)) {
					if (NUM25811.contains(month2)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Ma1 ⑩:1、7
			else if ("Ma1".equals(month)) {
				if ("1".equals(month4) || "7".equals(month4)) {
					if (NUM25811.contains(month2)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Md2 ②:5、11
			else if ("Md2".equals(month)) {
				if ("5".equals(month5) || "11".equals(month5)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Mc2 ⑤:2、8
			else if ("Mc2".equals(month)) {
				if ("2".equals(month5) || "8".equals(month5)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Mb2 ⑧:5、11
			else if ("Mb2".equals(month)) {
				if ("5".equals(month5) || "11".equals(month5)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Ma2 ⑪:1、7
			else if ("Ma2".equals(month)) {
				if ("1".equals(month5) || "7".equals(month5)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Md3 ③:6、12
			else if ("Md3".equals(month)) {
				if ("6".equals(month6) || "12".equals(month6)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Mc3 ⑥:3、9
			else if ("Mc3".equals(month)) {
				if ("3".equals(month6) || "9".equals(month6)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Mb3 ⑨:6、12
			else if ("Mb3".equals(month)) {
				if ("6".equals(month6) || "12".equals(month6)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Ma3 ⑫:3、9
			else if ("Ma3".equals(month)) {
				if ("3".equals(month6) || "9".equals(month6)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Md4 ④:7、10
			else if ("Md4".equals(month)) {
				if ("7".equals(month7) || "10".equals(month7)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
				} else if ("7".equals(month1) || "10".equals(month1)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Mc4 ⑦:4、10
			else if ("Mc4".equals(month)) {
				if ("4".equals(month7) || "10".equals(month7)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
				} else if ("4".equals(month1) || "10".equals(month1)) {
					if (NUM25811.contains(month2)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Mb4 ⑩:1、7
			else if ("Mb4".equals(month)) {
				if ("1".equals(month7) || "7".equals(month7)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
				} else if ("1".equals(month1) || "7".equals(month1)) {
					if (NUM25811.contains(month2)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Ma4 ①:4、10
			else if ("Ma4".equals(month)) {
				if ("4".equals(month7) || "10".equals(month7)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
				} else if ("4".equals(month1) || "10".equals(month1)) {
					if (NUM25811.contains(month2)) {
						starMap.put("M2", "★");
					}
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
				}
			}
			// Md5 ⑤:2、8
			else if ("Md5".equals(month)) {
				if ("2".equals(month8) || "8".equals(month8)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				} else if ("2".equals(month2) || "8".equals(month2)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Mc5 ⑧:5、11
			else if ("Mc5".equals(month)) {
				if ("5".equals(month8) || "11".equals(month8)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				} else if ("5".equals(month2) || "11".equals(month2)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Mb5 ⑪:2、8
			else if ("Mb5".equals(month)) {
				if ("2".equals(month8) || "8".equals(month8)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				} else if ("2".equals(month2) || "8".equals(month2)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Ma5 ②:5、11
			else if ("Ma5".equals(month)) {
				if ("5".equals(month8) || "11".equals(month8)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				} else if ("5".equals(month2) || "11".equals(month2)) {
					if (NUM36912.contains(month3)) {
						starMap.put("M3", "★");
					}
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
				}
			}
			// Md6 ⑥:3、9
			else if ("Md6".equals(month)) {
				if ("3".equals(month9) || "9".equals(month9)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				} else if ("3".equals(month3) || "9".equals(month3)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Mc6 ⑨:6、12
			else if ("Mc6".equals(month)) {
				if ("6".equals(month9) || "12".equals(month9)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				} else if ("6".equals(month3) || "12".equals(month3)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Mb6 ⑫:3、9
			else if ("Mb6".equals(month)) {
				if ("3".equals(month9) || "9".equals(month9)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				} else if ("3".equals(month3) || "9".equals(month3)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Ma6 ③:6、12
			else if ("Ma6".equals(month)) {
				if ("6".equals(month9) || "12".equals(month9)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				} else if ("6".equals(month3) || "112".equals(month3)) {
					if (NUM14710.contains(month4)) {
						starMap.put("M4", "★");
					}
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
				}
			}
			// Md7 ⑦:4、10
			else if ("Md7".equals(month)) {
				if ("4".equals(month10) || "10".equals(month10)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				} else if ("4".equals(month4) || "10".equals(month4)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
				}
			}
			// Mc7 ⑩:1、7
			else if ("Mc7".equals(month)) {
				if ("1".equals(month10) || "7".equals(month10)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				} else if ("1".equals(month4) || "7".equals(month4)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
				}
			}
			// Mb7 ①:4、10
			else if ("Mb7".equals(month)) {
				if ("4".equals(month10) || "10".equals(month10)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				} else if ("3".equals(month4) || "9".equals(month4)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
				}
			}
			// Ma7 ④:7、10
			else if ("Ma7".equals(month)) {
				if ("7".equals(month10) || "10".equals(month10)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				} else if ("6".equals(month4) || "112".equals(month4)) {
					if (NUM25811.contains(month5)) {
						starMap.put("M5", "★");
					}
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}

				}
			}
			// Md8 ⑧:5、11
			else if ("Md8".equals(month)) {
				if ("5".equals(month11) || "11".equals(month11)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				} else if ("5".equals(month5) || "11".equals(month5)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				}
			}
			// Mc8 ⑪:2、8
			else if ("Mc8".equals(month)) {
				if ("2".equals(month11) || "8".equals(month11)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				} else if ("2".equals(month5) || "8".equals(month5)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				}
			}
			// Mb8 ②:5、11
			else if ("Mb8".equals(month)) {
				if ("5".equals(month11) || "11".equals(month11)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				} else if ("5".equals(month5) || "11".equals(month5)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				}
			}
			// Ma8 ⑤:2、8
			else if ("Ma8".equals(month)) {
				if ("2".equals(month11) || "8".equals(month11)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				} else if ("2".equals(month5) || "8".equals(month5)) {
					if (NUM36912.contains(month6)) {
						starMap.put("M6", "★");
					}
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
				}
			}
			// Md9 ⑨:6、12
			else if ("Md9".equals(month)) {
				if ("6".equals(month12) || "12".equals(month12)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				} else if ("6".equals(month6) || "12".equals(month6)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				}
			}
			// Mc9 ⑫:3、9
			else if ("Mc9".equals(month)) {
				if ("3".equals(month12) || "9".equals(month12)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				} else if ("3".equals(month6) || "9".equals(month6)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				}
			}
			// Mb9 ③:6、12
			else if ("Mb9".equals(month)) {
				if ("6".equals(month12) || "12".equals(month12)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				} else if ("6".equals(month6) || "12".equals(month6)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				}
			}
			// Ma9 ⑥:3、9
			else if ("Ma9".equals(month)) {
				if ("3".equals(month12) || "9".equals(month12)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				} else if ("3".equals(month6) || "9".equals(month6)) {
					if (NUM14710.contains(month7)) {
						starMap.put("M7", "★");
					}
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
				}
			}
			// Md10 ⑩:1、7
			else if ("Md10".equals(month)) {
				if ("1".equals(month13) || "7".equals(month13)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				} else if ("1".equals(month7) || "7".equals(month7)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				}
			}
			// Mc10 ①:4、10
			else if ("Mc10".equals(month)) {
				if ("4".equals(month13) || "10".equals(month13)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				} else if ("4".equals(month7) || "10".equals(month7)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				}
			}
			// Mb10 ④:7、10
			else if ("Mb10".equals(month)) {
				if ("7".equals(month13) || "10".equals(month13)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				} else if ("7".equals(month7) || "10".equals(month7)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				}
			}
			// Ma10 ⑦:4、10
			else if ("Ma10".equals(month)) {
				if ("4".equals(month13) || "10".equals(month13)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				} else if ("4".equals(month7) || "10".equals(month7)) {
					if (NUM25811.contains(month8)) {
						starMap.put("M8", "★");
					}
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
				}
			}
			// Md11 ⑪:2、8
			else if ("Md11".equals(month)) {
				if ("2".equals(month14) || "8".equals(month14)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				} else if ("2".equals(month8) || "8".equals(month8)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				}
			}
			// Mc11 ②:5、11
			else if ("Mc11".equals(month)) {
				if ("5".equals(month14) || "11".equals(month14)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				} else if ("5".equals(month8) || "11".equals(month8)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				}
			}
			// Mb11 ⑤:2、8
			else if ("Mb11".equals(month)) {
				if ("2".equals(month14) || "8".equals(month14)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				} else if ("2".equals(month8) || "8".equals(month8)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				}
			}
			// Ma11 ⑧:5、11
			else if ("Ma11".equals(month)) {
				if ("5".equals(month14) || "11".equals(month14)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				} else if ("5".equals(month8) || "11".equals(month8)) {
					if (NUM36912.contains(month9)) {
						starMap.put("M9", "★");
					}
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
				}
			}
			// Md12 ⑫:3、9
			else if ("Md12".equals(month)) {
				if ("3".equals(month15) || "9".equals(month15)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				} else if ("3".equals(month9) || "9".equals(month9)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				}
			}
			// Mc12 ③:6、12
			else if ("Mc12".equals(month)) {
				if ("6".equals(month15) || "12".equals(month15)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				} else if ("6".equals(month9) || "12".equals(month9)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				}
			}
			// Mb12 ⑥:9、3
			else if ("Mb12".equals(month)) {
				if ("9".equals(month15) || "3".equals(month15)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				} else if ("9".equals(month9) || "3".equals(month9)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				}
			}
			// Ma12 ⑨:6、12
			else if ("Ma12".equals(month)) {
				if ("6".equals(month15) || "12".equals(month15)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				} else if ("6".equals(month9) || "12".equals(month9)) {
					if (NUM14710.contains(month10)) {
						starMap.put("M10", "★");
					}
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
				}
			}
			// Md13 ①:4、10
			else if ("Md13".equals(month)) {
				if ("4".equals(month16) || "10".equals(month16)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				} else if ("4".equals(month10) || "10".equals(month10)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				}
			}
			// Mc13 ④:7、10
			else if ("Mc13".equals(month)) {
				if ("7".equals(month16) || "10".equals(month16)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				} else if ("7".equals(month10) || "10".equals(month10)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				}
			}
			// Mb13 ⑦:4、10
			else if ("Mb13".equals(month)) {
				if ("4".equals(month16) || "10".equals(month16)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				} else if ("4".equals(month10) || "10".equals(month10)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				}
			}
			// Ma13 ⑩:1、7
			else if ("Ma13".equals(month)) {
				if ("1".equals(month16) || "7".equals(month16)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				} else if ("1".equals(month10) || "7".equals(month10)) {
					if (NUM25811.contains(month11)) {
						starMap.put("M11", "★");
					}
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
				}
			}
			// Md14 ②:5、11
			else if ("Md14".equals(month)) {
				if ("5".equals(month17) || "11".equals(month17)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				} else if ("5".equals(month11) || "11".equals(month11)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				}
			}
			// Mc14 ⑤:2、8
			else if ("Mc14".equals(month)) {
				if ("2".equals(month17) || "8".equals(month17)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				} else if ("2".equals(month11) || "8".equals(month11)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				}
			}
			// Mb14 ⑧:5、11
			else if ("Mb14".equals(month)) {
				if ("5".equals(month17) || "11".equals(month17)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				} else if ("5".equals(month11) || "11".equals(month11)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				}
			}
			// Ma14 ⑪:2、8
			else if ("Ma14".equals(month)) {
				if ("2".equals(month17) || "8".equals(month17)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				} else if ("2".equals(month11) || "8".equals(month11)) {
					if (NUM36912.contains(month12)) {
						starMap.put("M12", "★");
					}
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
				}
			}
			// Md15 ③:6、12
			else if ("Md15".equals(month)) {
				if ("6".equals(month18) || "12".equals(month18)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				} else if ("6".equals(month12) || "12".equals(month12)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				}
			}
			// Mc15 ⑥:3、9
			else if ("Mc15".equals(month)) {
				if ("3".equals(month18) || "9".equals(month18)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				} else if ("3".equals(month12) || "9".equals(month12)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				}
			}
			// Mb15 ⑨:6、12
			else if ("Mb15".equals(month)) {
				if ("6".equals(month18) || "12".equals(month18)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				} else if ("6".equals(month12) || "12".equals(month12)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				}
			}
			// Ma15 ⑫:3、9
			else if ("Ma15".equals(month)) {
				if ("3".equals(month18) || "9".equals(month18)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				} else if ("3".equals(month12) || "9".equals(month12)) {
					if (NUM14710.contains(month13)) {
						starMap.put("M13", "★");
					}
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
				}
			}
			// Md16 ④:7、10
			else if ("Md16".equals(month)) {
				if ("7".equals(month13) || "10".equals(month13)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				}
			}
			// Mc16 ⑦:4、10
			else if ("Mc16".equals(month)) {
				if ("4".equals(month13) || "10".equals(month13)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				}
			}
			// Mb16 ⑩:1、7
			else if ("Mb16".equals(month)) {
				if ("1".equals(month13) || "7".equals(month13)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				}
			}
			// Ma16 ①:4、10
			else if ("Ma16".equals(month)) {
				if ("4".equals(month13) || "10".equals(month13)) {
					if (NUM25811.contains(month14)) {
						starMap.put("M14", "★");
					}
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
				}
			}
			// Md17 ⑤:2、8
			else if ("Md17".equals(month)) {
				if ("2".equals(month14) || "8".equals(month14)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				}
			}
			// Mc17 ⑧:5、11
			else if ("Mc17".equals(month)) {
				if ("5".equals(month14) || "11".equals(month14)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				}
			}
			// Mb17 ⑪:2、8
			else if ("Mb17".equals(month)) {
				if ("2".equals(month14) || "8".equals(month14)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				}
			}
			// Ma17 ②:5、11
			else if ("Ma17".equals(month)) {
				if ("5".equals(month14) || "11".equals(month14)) {
					if (NUM36912.contains(month15)) {
						starMap.put("M15", "★");
					}
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
				}
			}
			// Md18 ⑥:3、9
			else if ("Md18".equals(month)) {
				if ("3".equals(month15) || "9".equals(month15)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				}
			}
			// Mc18 ⑨:6、12
			else if ("Mc18".equals(month)) {
				if ("6".equals(month15) || "12".equals(month15)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				}
			}
			// Mb18 ⑫:3、9
			else if ("Mb18".equals(month)) {
				if ("3".equals(month15) || "9".equals(month15)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				}
			}
			// Ma18 ③:6、12
			else if ("Md18".equals(month)) {
				if ("6".equals(month15) || "12".equals(month15)) {
					if (NUM14710.contains(month16)) {
						starMap.put("M16", "★");
					}
					if (NUM25811.contains(month17)) {
						starMap.put("M17", "★");
					}
				}
			}
		}

		// 日の行ポイントの数字★を付ける

		for (String day : dayMaruResult) {
			// Dd1 ①:4、10
			if ("Dd1".equals(day)) {
				if ("4".equals(day4) || "10".equals(day4)) {
					if (NUM25811.contains(day2)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Dc1 ④:7、10
			else if ("Dc1".equals(day)) {
				if ("7".equals(day4) || "10".equals(day4)) {
					if (NUM25811.contains(day2)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Db1 ⑦:4、10
			else if ("Db1".equals(day)) {
				if ("4".equals(day4) || "10".equals(day4)) {
					if (NUM25811.contains(day2)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Da1 ⑩:1、7
			else if ("Da1".equals(day)) {
				if ("1".equals(day4) || "7".equals(day4)) {
					if (NUM25811.contains(day2)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Dd2 ②:5、11
			else if ("Dd2".equals(day)) {
				if ("5".equals(day5) || "11".equals(day5)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Dc2 ⑤:2、8
			else if ("Dc2".equals(day)) {
				if ("2".equals(day5) || "8".equals(day5)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Db2 ⑧:5、11
			else if ("Db2".equals(day)) {
				if ("5".equals(day5) || "11".equals(day5)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Da2 ⑪:1、7
			else if ("Da2".equals(day)) {
				if ("1".equals(day5) || "7".equals(day5)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Dd3 ③:6、12
			else if ("Dd3".equals(day)) {
				if ("6".equals(day6) || "12".equals(day6)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Dc3 ⑥:3、9
			else if ("Dc3".equals(day)) {
				if ("3".equals(day6) || "9".equals(day6)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Db3 ⑨:6、12
			else if ("Db3".equals(day)) {
				if ("6".equals(day6) || "12".equals(day6)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Da3 ⑫:3、9
			else if ("Da3".equals(day)) {
				if ("3".equals(day6) || "9".equals(day6)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Dd4 ④:7、10
			else if ("Dd4".equals(day)) {
				if ("7".equals(day7) || "10".equals(day7)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
				} else if ("7".equals(day1) || "10".equals(day1)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Dc4 ⑦:4、10
			else if ("Dc4".equals(day)) {
				if ("4".equals(day7) || "10".equals(day7)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
				} else if ("4".equals(day1) || "10".equals(day1)) {
					if (NUM25811.contains(day2)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Db4 ⑩:1、7
			else if ("Db4".equals(day)) {
				if ("1".equals(day7) || "7".equals(day7)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
				} else if ("1".equals(day1) || "7".equals(day1)) {
					if (NUM25811.contains(day2)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Da4 ①:4、10
			else if ("Da4".equals(day)) {
				if ("4".equals(day7) || "10".equals(day7)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
				} else if ("4".equals(day1) || "10".equals(day1)) {
					if (NUM25811.contains(day2)) {
						starMap.put("D2", "★");
					}
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
				}
			}
			// Dd5 ⑤:2、8
			else if ("Dd5".equals(day)) {
				if ("2".equals(day8) || "8".equals(day8)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				} else if ("2".equals(day2) || "8".equals(day2)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Dc5 ⑧:5、11
			else if ("Dc5".equals(day)) {
				if ("5".equals(day8) || "11".equals(day8)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				} else if ("5".equals(day2) || "11".equals(day2)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Db5 ⑪:2、8
			else if ("Db5".equals(day)) {
				if ("2".equals(day8) || "8".equals(day8)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				} else if ("2".equals(day2) || "8".equals(day2)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Da5 ②:5、11
			else if ("Da5".equals(day)) {
				if ("5".equals(day8) || "11".equals(day8)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				} else if ("5".equals(day2) || "11".equals(day2)) {
					if (NUM36912.contains(day3)) {
						starMap.put("D3", "★");
					}
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
				}
			}
			// Dd6 ⑥:3、9
			else if ("Dd6".equals(day)) {
				if ("3".equals(day9) || "9".equals(day9)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				} else if ("3".equals(day3) || "9".equals(day3)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Dc6 ⑨:6、12
			else if ("Dc6".equals(day)) {
				if ("6".equals(day9) || "12".equals(day9)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				} else if ("6".equals(day3) || "12".equals(day3)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Db6 ⑫:3、9
			else if ("Db6".equals(day)) {
				if ("3".equals(day9) || "9".equals(day9)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				} else if ("3".equals(day3) || "9".equals(day3)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Da6 ③:6、12
			else if ("Da6".equals(day)) {
				if ("6".equals(day9) || "12".equals(day9)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				} else if ("6".equals(day3) || "112".equals(day3)) {
					if (NUM14710.contains(day4)) {
						starMap.put("D4", "★");
					}
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
				}
			}
			// Dd7 ⑦:4、10
			else if ("Dd7".equals(day)) {
				if ("4".equals(day10) || "10".equals(day10)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				} else if ("4".equals(day4) || "10".equals(day4)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
				}
			}
			// Dc7 ⑩:1、7
			else if ("Dc7".equals(day)) {
				if ("1".equals(day10) || "7".equals(day10)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				} else if ("1".equals(day4) || "7".equals(day4)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
				}
			}
			// Db7 ①:4、10
			else if ("Db7".equals(day)) {
				if ("4".equals(day10) || "10".equals(day10)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				} else if ("3".equals(day4) || "9".equals(day4)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
				}
			}
			// Da7 ④:7、10
			else if ("Da7".equals(day)) {
				if ("7".equals(day10) || "10".equals(day10)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				} else if ("6".equals(day4) || "112".equals(day4)) {
					if (NUM25811.contains(day5)) {
						starMap.put("D5", "★");
					}
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}

				}
			}
			// Dd8 ⑧:5、11
			else if ("Dd8".equals(day)) {
				if ("5".equals(day11) || "11".equals(day11)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				} else if ("5".equals(day5) || "11".equals(day5)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				}
			}
			// Dc8 ⑪:2、8
			else if ("Dc8".equals(day)) {
				if ("2".equals(day11) || "8".equals(day11)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				} else if ("2".equals(day5) || "8".equals(day5)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				}
			}
			// Db8 ②:5、11
			else if ("Db8".equals(day)) {
				if ("5".equals(day11) || "11".equals(day11)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				} else if ("5".equals(day5) || "11".equals(day5)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				}
			}
			// Da8 ⑤:2、8
			else if ("Da8".equals(day)) {
				if ("2".equals(day11) || "8".equals(day11)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				} else if ("2".equals(day5) || "8".equals(day5)) {
					if (NUM36912.contains(day6)) {
						starMap.put("D6", "★");
					}
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
				}
			}
			// Dd9 ⑨:6、12
			else if ("Dd9".equals(day)) {
				if ("6".equals(day12) || "12".equals(day12)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				} else if ("6".equals(day6) || "12".equals(day6)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				}
			}
			// Dc9 ⑫:3、9
			else if ("Dc9".equals(day)) {
				if ("3".equals(day12) || "9".equals(day12)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				} else if ("3".equals(day6) || "9".equals(day6)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				}
			}
			// Db9 ③:6、12
			else if ("Db9".equals(day)) {
				if ("6".equals(day12) || "12".equals(day12)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				} else if ("6".equals(day6) || "12".equals(day6)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				}
			}
			// Da9 ⑥:3、9
			else if ("Da9".equals(day)) {
				if ("3".equals(day12) || "9".equals(day12)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				} else if ("3".equals(day6) || "9".equals(day6)) {
					if (NUM14710.contains(day7)) {
						starMap.put("D7", "★");
					}
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
				}
			}
			// Dd10 ⑩:1、7
			else if ("Dd10".equals(day)) {
				if ("1".equals(day13) || "7".equals(day13)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				} else if ("1".equals(day7) || "7".equals(day7)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				}
			}
			// Dc10 ①:4、10
			else if ("Dc10".equals(day)) {
				if ("4".equals(day13) || "10".equals(day13)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				} else if ("4".equals(day7) || "10".equals(day7)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				}
			}
			// Db10 ④:7、10
			else if ("Db10".equals(day)) {
				if ("7".equals(day13) || "10".equals(day13)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				} else if ("7".equals(day7) || "10".equals(day7)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				}
			}
			// Da10 ⑦:4、10
			else if ("Da10".equals(day)) {
				if ("4".equals(day13) || "10".equals(day13)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				} else if ("4".equals(day7) || "10".equals(day7)) {
					if (NUM25811.contains(day8)) {
						starMap.put("D8", "★");
					}
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
				}
			}
			// Dd11 ⑪:2、8
			else if ("Dd11".equals(day)) {
				if ("2".equals(day14) || "8".equals(day14)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				} else if ("2".equals(day8) || "8".equals(day8)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				}
			}
			// Dc11 ②:5、11
			else if ("Dc11".equals(day)) {
				if ("5".equals(day14) || "11".equals(day14)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				} else if ("5".equals(day8) || "11".equals(day8)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				}
			}
			// Db11 ⑤:2、8
			else if ("Db11".equals(day)) {
				if ("2".equals(day14) || "8".equals(day14)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				} else if ("2".equals(day8) || "8".equals(day8)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				}
			}
			// Da11 ⑧:5、11
			else if ("Da11".equals(day)) {
				if ("5".equals(day14) || "11".equals(day14)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				} else if ("5".equals(day8) || "11".equals(day8)) {
					if (NUM36912.contains(day9)) {
						starMap.put("D9", "★");
					}
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
				}
			}
			// Dd12 ⑫:3、9
			else if ("Dd12".equals(day)) {
				if ("3".equals(day15) || "9".equals(day15)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				} else if ("3".equals(day9) || "9".equals(day9)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				}
			}
			// Dc12 ③:6、12
			else if ("Dc12".equals(day)) {
				if ("6".equals(day15) || "12".equals(day15)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				} else if ("6".equals(day9) || "12".equals(day9)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				}
			}
			// Db12 ⑥:9、3
			else if ("Db12".equals(day)) {
				if ("9".equals(day15) || "3".equals(day15)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				} else if ("9".equals(day9) || "3".equals(day9)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				}
			}
			// Da12 ⑨:6、12
			else if ("Da12".equals(day)) {
				if ("6".equals(day15) || "12".equals(day15)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				} else if ("6".equals(day9) || "12".equals(day9)) {
					if (NUM14710.contains(day10)) {
						starMap.put("D10", "★");
					}
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
				}
			}
			// Dd13 ①:4、10
			else if ("Dd13".equals(day)) {
				if ("4".equals(day16) || "10".equals(day16)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				} else if ("4".equals(day10) || "10".equals(day10)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				}
			}
			// Dc13 ④:7、10
			else if ("Dc13".equals(day)) {
				if ("7".equals(day16) || "10".equals(day16)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				} else if ("7".equals(day10) || "10".equals(day10)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				}
			}
			// Db13 ⑦:4、10
			else if ("Db13".equals(day)) {
				if ("4".equals(day16) || "10".equals(day16)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				} else if ("4".equals(day10) || "10".equals(day10)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				}
			}
			// Da13 ⑩:1、7
			else if ("Da13".equals(day)) {
				if ("1".equals(day16) || "7".equals(day16)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				} else if ("1".equals(day10) || "7".equals(day10)) {
					if (NUM25811.contains(day11)) {
						starMap.put("D11", "★");
					}
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
				}
			}
			// Dd14 ②:5、11
			else if ("Dd14".equals(day)) {
				if ("5".equals(day17) || "11".equals(day17)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				} else if ("5".equals(day11) || "11".equals(day11)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				}
			}
			// Dc14 ⑤:2、8
			else if ("Dc14".equals(day)) {
				if ("2".equals(day17) || "8".equals(day17)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				} else if ("2".equals(day11) || "8".equals(day11)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				}
			}
			// Db14 ⑧:5、11
			else if ("Db14".equals(day)) {
				if ("5".equals(day17) || "11".equals(day17)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				} else if ("5".equals(day11) || "11".equals(day11)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				}
			}
			// Da14 ⑪:2、8
			else if ("Da14".equals(day)) {
				if ("2".equals(day17) || "8".equals(day17)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				} else if ("2".equals(day11) || "8".equals(day11)) {
					if (NUM36912.contains(day12)) {
						starMap.put("D12", "★");
					}
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
				}
			}
			// Dd15 ③:6、12
			else if ("Dd15".equals(day)) {
				if ("6".equals(day18) || "12".equals(day18)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				} else if ("6".equals(day12) || "12".equals(day12)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				}
			}
			// Dc15 ⑥:3、9
			else if ("Dc15".equals(day)) {
				if ("3".equals(day18) || "9".equals(day18)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				} else if ("3".equals(day12) || "9".equals(day12)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				}
			}
			// Db15 ⑨:6、12
			else if ("Db15".equals(day)) {
				if ("6".equals(day18) || "12".equals(day18)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				} else if ("6".equals(day12) || "12".equals(day12)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				}
			}
			// Da15 ⑫:3、9
			else if ("Da15".equals(day)) {
				if ("3".equals(day18) || "9".equals(day18)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				} else if ("3".equals(day12) || "9".equals(day12)) {
					if (NUM14710.contains(day13)) {
						starMap.put("D13", "★");
					}
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
				}
			}
			// Dd16 ④:7、10
			else if ("Dd16".equals(day)) {
				if ("7".equals(day13) || "10".equals(day13)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				}
			}
			// Dc16 ⑦:4、10
			else if ("Dc16".equals(day)) {
				if ("4".equals(day13) || "10".equals(day13)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				}
			}
			// Db16 ⑩:1、7
			else if ("Db16".equals(day)) {
				if ("1".equals(day13) || "7".equals(day13)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				}
			}
			// Da16 ①:4、10
			else if ("Da16".equals(day)) {
				if ("4".equals(day13) || "10".equals(day13)) {
					if (NUM25811.contains(day14)) {
						starMap.put("D14", "★");
					}
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
				}
			}
			// Dd17 ⑤:2、8
			else if ("Dd17".equals(day)) {
				if ("2".equals(day14) || "8".equals(day14)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				}
			}
			// Dc17 ⑧:5、11
			else if ("Dc17".equals(day)) {
				if ("5".equals(day14) || "11".equals(day14)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				}
			}
			// Db17 ⑪:2、8
			else if ("Db17".equals(day)) {
				if ("2".equals(day14) || "8".equals(day14)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				}
			}
			// Da17 ②:5、11
			else if ("Da17".equals(day)) {
				if ("5".equals(day14) || "11".equals(day14)) {
					if (NUM36912.contains(day15)) {
						starMap.put("D15", "★");
					}
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
				}
			}
			// Dd18 ⑥:3、9
			else if ("Dd18".equals(day)) {
				if ("3".equals(day15) || "9".equals(day15)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				}
			}
			// Dc18 ⑨:6、12
			else if ("Dc18".equals(day)) {
				if ("6".equals(day15) || "12".equals(day15)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				}
			}
			// Db18 ⑫:3、9
			else if ("Db18".equals(day)) {
				if ("3".equals(day15) || "9".equals(day15)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				}
			}
			// Da18 ③:6、12
			else if ("Dd18".equals(day)) {
				if ("6".equals(day15) || "12".equals(day15)) {
					if (NUM14710.contains(day16)) {
						starMap.put("D16", "★");
					}
					if (NUM25811.contains(day17)) {
						starMap.put("D17", "★");
					}
				}
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



}
