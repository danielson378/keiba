package com.beautyred.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.beautyred.util.CalendarUtil;

public class TopAction {

	 /** 処理結果 */
	private interface RESULT{
		// 成功
		String SUCCESS = "success";
		// 失敗
		String FAILD = "faild";
	}

    /** カレンダー文字列 */
	private static final String CALENDAR = "calendar";

	/** ＴＯＰ画面年KEY */
	private static final String YY = "yy";
	/** ＴＯＰ画面月KEY */
	private static final String MM = "mm";

	private String date ;
	private String month ;

    public String execute() throws Exception {

        // 获得请求
        HttpServletRequest  request = ServletActionContext.getRequest();

        Calendar cal = Calendar.getInstance();
        if (date == null) {

        	// 当前时间
        	cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),cal.get(Calendar.DATE));

        	CalendarUtil calendarUtil = new CalendarUtil();

        	// カレンダー文字列取得
        	String strCalendar = calendarUtil.printHoliday(cal);

        	request.setAttribute(CALENDAR, strCalendar);

        	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        	String dateStr = sdf.format(cal.getTime());

        	int yy = cal.get(Calendar.YEAR);
        	int mm = cal.get(Calendar.MONTH);
        	// 当日
        	request.setAttribute(YY, yy);
        	request.setAttribute(MM, mm);
        	request.setAttribute("dateStr", dateStr);

        	return RESULT.SUCCESS;
        } else {

        	String year = date.substring(0, 4);
        	String month = date.substring(4, 6);

        	SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd");

        	Date dateTemp =sdf.parse(date);

//        	Calendar cal = Calendar.getInstance();

        	cal.setTime(dateTemp);

        	// 当前时间
//        	cal.set(Integer.parseInt(year), Integer.parseInt(month),cal.get(Calendar.DATE));

        	CalendarUtil calendarUtil = new CalendarUtil();

        	// カレンダー文字列取得
        	String strCalendar = calendarUtil.printHoliday(cal);

        	request.setAttribute(CALENDAR, strCalendar);

//        	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        	String dateStr = sdf.format(cal.getTime());

        	int yy = cal.get(Calendar.YEAR);
        	int mm = cal.get(Calendar.MONTH);
        	// 当日
        	request.setAttribute(YY, yy);
        	request.setAttribute(MM, mm);
        	request.setAttribute("dateStr", dateStr);


        	return RESULT.SUCCESS;
        }
    }

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}





}
