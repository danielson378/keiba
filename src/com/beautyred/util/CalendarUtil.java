package com.beautyred.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarUtil {

	// 月の名前。
	private final String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

	// 各月の日数
	private final int[] dom = {
			31, 28, 31, 30,
			31, 30, 31, 31,
			30, 31, 30, 31
	};

	/* 日を出力する位置を計算する */
	/**
	 * <table>
	 * タグ返す
	 *
	 * @param resultMap
	 *            key:日付、value:件数のHashMap
	 * @param outputCal
	 *            カレンダーを表示する月
	 * @throws Exception
	 */
	public String print(Calendar outputCal) throws Exception {
		return null;
	}

	public String printHoliday(/*HashMap<String, String> untreatedMap, HashMap<String, String> treatedMap,*/
			Calendar outputCal) throws ParseException {

		int yy = outputCal.get(Calendar.YEAR);
		int mm = outputCal.get(Calendar.MONTH);

		// 月を文字列に変換
		String mmStr = Integer.toString(mm + 1);
		if (mmStr.length() == 1) {
			mmStr = "0" + mmStr;
		}

		// 日を文字列として格納する。
		String ddStr = null;
		// ある日に登録された未処理件数を格納。
		String untreatedNum = null;
		// ある日に登録された処理済件数を格納。
		String treatedNum = null;

		/** この月の１日までに必要な空白を数を計算する。 */
		int leadGap = 0;
		/** 各CSSの名前 */
		final String tableCalendar = "tableCalendar";// テーブル用CSS
		final String weekdayClass = "weekday";// 平日用CSS
		final String fetedayClass = "weekday";// 平日用CSS
		final String emptydayClass = "";// 空用CSS
		final String todayClass = "today";// 本日用CSS
		final String days = "days";// 本日用CSS

		final String tRed01 = "tRed01";// 赤文言CSS
		final String tBlue01 = "tBlue01";// 青文言CSS

		StringBuffer tableBuffer = new StringBuffer();

//		tableBuffer.append("<p class=\"fsMaximum tBold\" >" + yy + "年" + (mm + 1) + "月" + "</p>");
		tableBuffer.append("<table class=\""+tableCalendar+"\">");
		tableBuffer.append("<thead>");
		tableBuffer.append("<tr>");
		tableBuffer.append("<th class=\""+tRed01+"\">日</th>");
		tableBuffer.append("<th>月</th>");
		tableBuffer.append("<th>火</th>");
		tableBuffer.append("<th>水</th>");
		tableBuffer.append("<th>木</th>");
		tableBuffer.append("<th>金</th>");
		tableBuffer.append("<th class=\""+tBlue01+"\">土</th>");
		tableBuffer.append("</tr>");
		tableBuffer.append("</thead>");

		// カレンダーインスタンスを作成

		GregorianCalendar calendar = new GregorianCalendar(yy, mm, 1);

		// 月初めまでの空白の日数を計算する。
		// 日曜日の場合はget(Calendar.DAY_OF_WEEK)は1を返すので1引いて01にする
		// leadGap = calendar.get(Calendar.DAY_OF_WEEK)-1;
		// 日曜日を右端に待って生きたいので5足して7のあまりを求める
		// leadGap = (calendar.getActualMaximum(Calendar.DAY_OF_WEEK)+5)%7;
		leadGap = calendar.get(Calendar.DAY_OF_WEEK)-1;
//      月曜日一番左の場合
//		if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
//			leadGap = 6;
//		} else {
//			leadGap = calendar.get(Calendar.DAY_OF_WEEK)-2;
//		}


		int daysInMonth = dom[mm];
		// 閏年２月な場合は日数を増やす
		if (calendar.isLeapYear(calendar.get(Calendar.YEAR)) && mm == 1) {
			daysInMonth += 1;
		}

		tableBuffer.append("<tr>");
		// その月の１日までの欄を空白で埋めていく
		for (int i = 0; i < leadGap; i++) {
			tableBuffer.append("<td class=\""+emptydayClass+"\"></td>");
		}

		// 日の情報を取得空欄の時は平日
		String dayInfo = null;

		// 日数
		int index = 1;
		// その月の最終日になるまで数値を埋める
		for (index = 1; index <= daysInMonth; index++) {

			// 行の始めには<tr>を足す
			if ((leadGap + index) % 7 == 1) {
				tableBuffer.append("<tr>");
			}

			ddStr = Integer.toString(index);
			if (ddStr.length() == 1) {
				ddStr = "0" + ddStr;
			}

			dayInfo = KtHoliday.getHolidayName(new GregorianCalendar(yy, mm, index));

			// 日の表示
			// 未処理件数を取得（データが存在しない場合はリンクを作成しない）
			/*untreatedNum = untreatedMap.get(mmStr + ddStr);
			if (untreatedNum == null) {
				untreatedNum = "未：0件";
			} else {
				// ファイルがあった場合には<a>タグを追加する
				untreatedNum = "<span class='tRed01'>未：" + untreatedNum + "件</span>";
			}*/

			// 処理済件数取得
			/*treatedNum = treatedMap.get(mmStr + ddStr);
			if (treatedNum == null) {
				treatedNum = "済：0件";
			} else {
				// ファイルがあった場合には<a>タグを追加する
				treatedNum = "済：" + treatedNum + "件";
			}*/

			String paraDate = null;
			if (index < 10) {
				paraDate = yy + mmStr + "0" + index;
			} else {
				paraDate = yy + mmStr + index;
			}

			if (dayInfo.equals("")) {
				// 平日
				tableBuffer.append("<td><p class=\""+days+"\"><a herf=\"kanri05.do?paraDate=" + paraDate + "\">"+index+"</a></p><ul><li>" + untreatedNum + "</li><li>" + treatedNum + "</li></ul></td>");
			} else if (dayInfo.equals("日曜日")) {
				// 日曜日
				tableBuffer.append("<td><p class=\"" + days + "\"><a herf=\"kanri05.do?paraDate=" + paraDate + "\">"
						+ index + "</a></p><ul><li>" + untreatedNum + "</li><li>" + treatedNum + "</li></ul></td>");
			} else if (dayInfo.equals("土曜日")) {
				// 土曜日
				tableBuffer.append("<td><p class=\"" + days + "\"><a herf=\"kanri05.do?paraDate=" + paraDate + "\">"
						+ index + "</a></p><ul><li>" + untreatedNum + "</li><li>" + treatedNum + "</li></ul></td>");
			} else /*if (dayInfo.equals("祝日"))*/ {
				// 祝日
				tableBuffer.append("<td><p class=\"" + days + "\"><a class=\"" + tRed01
						+ "\" herf=\"kanri05.do?paraDate=" + paraDate + "\">" + index + "</a></p><ul><li>"
						+ untreatedNum + "</li><li>" + treatedNum + "</li></ul></td>");
			}
			// 行末になったら改行
			if ((leadGap + index) % 7 == 0) {
				tableBuffer.append("</tr>");
			}
		}
		// この時点でindexは最終日+1の状態
		// 残りを空白で埋めるよ
		Calendar cal = Calendar.getInstance();

		for (cal.set(yy, mm, index); cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY; cal.add(Calendar.DAY_OF_MONTH,
				1)) {
			tableBuffer.append("<td class=\""+emptydayClass+"\"></td>");
		}

		tableBuffer.append("</tr></table>");

		return tableBuffer.toString();

	}
}
