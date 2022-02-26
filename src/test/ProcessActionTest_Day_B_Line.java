package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Day_B_Line {





 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	// Yb1左
	public void starProTest1_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay2("8");
		processAction.setDay3("9");
		processAction.setDay4("10");

		processAction.setDay10("4");
		processAction.setDay11("5");
		processAction.setDay12("6");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb1");
		monthMaruResult.add("Mb1");
		dayMaruResult.add("Db1");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("DR2"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	// Yb1右
	public void starProTest1_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay4("4");
		processAction.setDay3("5");
		processAction.setDay2("6");

		processAction.setDay10("10");
		processAction.setDay11("9");
		processAction.setDay12("8");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb1");
		monthMaruResult.add("Mb1");
		dayMaruResult.add("Db1");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("DR2"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	// Yb2左
	public void starProTest2_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay3("9");
		processAction.setDay4("10");
		processAction.setDay5("11");

		processAction.setDay1("7");
		processAction.setDay12("6");
		processAction.setDay11("5");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb2");
		monthMaruResult.add("Mb2");
		dayMaruResult.add("Db2");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}


	@Test
	// Yb2右
	public void starProTest2_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay3("7");
		processAction.setDay4("6");
		processAction.setDay5("5");

		processAction.setDay1("9");
		processAction.setDay12("10");
		processAction.setDay11("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb2");
		monthMaruResult.add("Mb2");
		dayMaruResult.add("Db2");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	// Yb3左
	public void starProTest3_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay6("12");
		processAction.setDay5("11");
		processAction.setDay4("10");

		processAction.setDay12("6");
		processAction.setDay1("7");
		processAction.setDay2("8");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb3");
		monthMaruResult.add("Mb3");
		dayMaruResult.add("Db3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
	}


	@Test
	// Yb3右
	public void starProTest3_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay6("6");
		processAction.setDay5("7");
		processAction.setDay4("8");

		processAction.setDay12("12");
		processAction.setDay1("11");
		processAction.setDay2("10");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb3");
		monthMaruResult.add("Mb3");
		dayMaruResult.add("Db3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
	}

	@Test
	// Yb4 左
	public void starProTest4_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("1");
		processAction.setDay6("12");
		processAction.setDay5("11");

		processAction.setDay1("7");
		processAction.setDay2("8");
		processAction.setDay3("9");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb4");
		monthMaruResult.add("Mb4");
		dayMaruResult.add("Db4");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
	 	assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
	}

	@Test
	// Yb4右
	public void starProTest4_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("7");
		processAction.setDay6("8");
		processAction.setDay5("9");

		processAction.setDay1("1");
		processAction.setDay2("12");
		processAction.setDay3("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb4");
		monthMaruResult.add("Mb4");
		dayMaruResult.add("Db4");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
	 	assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
	}

	@Test
	// Yb5左
	public void starProTest5_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("2");
		processAction.setDay7("1");
		processAction.setDay6("12");

		processAction.setDay2("8");
		processAction.setDay3("9");
		processAction.setDay4("10");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb5");
		monthMaruResult.add("Mb5");
		dayMaruResult.add("Db5");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
	 	assertEquals(processAction.getStarMap().get("D3"),  test);
	 	assertEquals(processAction.getStarMap().get("D4"),  test);
	}

	@Test
	// Yb5右
	public void starProTest5_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("8");
		processAction.setDay7("9");
		processAction.setDay6("10");

		processAction.setDay2("2");
		processAction.setDay3("1");
		processAction.setDay4("12");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb5");
		monthMaruResult.add("Mb5");
		dayMaruResult.add("Db5");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
	}


	@Test
	// Yb6左
	public void starProTest6_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("3");
		processAction.setDay8("2");
		processAction.setDay7("1");

		processAction.setDay3("9");
		processAction.setDay4("10");
		processAction.setDay5("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb6");
		monthMaruResult.add("Mb6");
		dayMaruResult.add("Db6");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
	}


	@Test
	// Yb6右
	public void starProTest6_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("9");
		processAction.setDay8("10");
		processAction.setDay7("11");

		processAction.setDay3("3");
		processAction.setDay4("2");
		processAction.setDay5("1");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb6");
		monthMaruResult.add("Mb6");
		dayMaruResult.add("Db6");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
	}


	@Test
	// Yb7左
	public void starProTest7_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay10("4");
		processAction.setDay9("3");
		processAction.setDay8("2");

		processAction.setDay4("10");
		processAction.setDay5("11");
		processAction.setDay6("12");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb7");
		monthMaruResult.add("Mb7");
		dayMaruResult.add("Db7");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
	}


	@Test
	// Yb7右·
	public void starProTest7_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay10("10");
		processAction.setDay9("11");
		processAction.setDay8("12");

		processAction.setDay4("4");
		processAction.setDay5("3");
		processAction.setDay6("2");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb7");
		monthMaruResult.add("Mb7");
		dayMaruResult.add("Db7");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
	}


	@Test
	// Yb8左
	public void starProTest8_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay11("5");
		processAction.setDay10("4");
		processAction.setDay9("3");

		processAction.setDay5("11");
		processAction.setDay6("12");
		processAction.setDay7("1");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb8");
		monthMaruResult.add("Mb8");
		dayMaruResult.add("Db8");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
	}


	@Test
	// Yb8右
	public void starProTest8_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay11("11");
		processAction.setDay10("12");
		processAction.setDay9("1");

		processAction.setDay5("5");
		processAction.setDay6("4");
		processAction.setDay7("3");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb8");
		monthMaruResult.add("Mb8");
		dayMaruResult.add("Db8");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
	}


	@Test
	// Yb9左
	public void starProTest9_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay12("6");
		processAction.setDay11("5");
		processAction.setDay10("4");

		processAction.setDay6("12");
		processAction.setDay7("1");
		processAction.setDay8("2");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb9");
		monthMaruResult.add("Mb9");
		dayMaruResult.add("Db9");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
	}


	@Test
	// Yb9右
	public void starProTest9_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay12("12");
		processAction.setDay11("1");
		processAction.setDay10("2");

		processAction.setDay6("6");
		processAction.setDay7("5");
		processAction.setDay8("4");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb9");
		monthMaruResult.add("Mb9");
		dayMaruResult.add("Db9");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
	}

	@Test
	// Yb10左
	public void starProTest10_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay13("7");
		processAction.setDay12("6");
		processAction.setDay11("5");

		processAction.setDay7("1");
		processAction.setDay8("2");
		processAction.setDay9("3");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb10");
		monthMaruResult.add("Mb10");
		dayMaruResult.add("Db10");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
	}

	@Test
	// Yb10右
	public void starProTest10_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay13("1");
		processAction.setDay12("2");
		processAction.setDay11("3");

		processAction.setDay7("7");
		processAction.setDay8("6");
		processAction.setDay9("5");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb10");
		monthMaruResult.add("Mb10");
		dayMaruResult.add("Db10");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
	}


	@Test
	// Yb11左
	public void starProTest11_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay14("8");
		processAction.setDay13("7");
		processAction.setDay12("6");

		processAction.setDay8("2");
		processAction.setDay9("3");
		processAction.setDay10("4");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb11");
		monthMaruResult.add("Mb11");
		dayMaruResult.add("Db11");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D13"),  test);
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D10"),  test);
	}


	@Test
	// Yb11右
	public void starProTest11_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay14("2");
		processAction.setDay13("3");
		processAction.setDay12("4");

		processAction.setDay8("8");
		processAction.setDay9("7");
		processAction.setDay10("6");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb11");
		monthMaruResult.add("Mb11");
		dayMaruResult.add("Db11");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D13"),  test);
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D10"),  test);
	}


	@Test
	// Yb12左
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay15("9");
		processAction.setDay14("8");
		processAction.setDay13("7");

		processAction.setDay9("3");
		processAction.setDay10("4");
		processAction.setDay11("5");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb12");
		monthMaruResult.add("Mb12");
		dayMaruResult.add("Db12");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D14"),  test);
	 	assertEquals(processAction.getStarMap().get("D13"),  test);
        assertEquals(processAction.getStarMap().get("D10"),  test);
        assertEquals(processAction.getStarMap().get("D11"),  test);
	}


	@Test
	// Yb12右
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay15("3");
		processAction.setDay14("4");
		processAction.setDay13("5");

		processAction.setDay9("9");
		processAction.setDay10("8");
		processAction.setDay11("7");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb12");
		monthMaruResult.add("Mb12");
		dayMaruResult.add("Db12");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D14"),  test);
	 	assertEquals(processAction.getStarMap().get("D13"),  test);
        assertEquals(processAction.getStarMap().get("D10"),  test);
        assertEquals(processAction.getStarMap().get("D11"),  test);
	}

	@Test
	// Yb13左
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay16("10");
		processAction.setDay15("9");
		processAction.setDay14("8");

		processAction.setDay10("4");
		processAction.setDay11("5");
		processAction.setDay12("6");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb13");
		monthMaruResult.add("Mb13");
		dayMaruResult.add("Db13");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
	 	assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
	}

	@Test
	// Yb13右
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay16("4");
		processAction.setDay15("5");
		processAction.setDay14("6");

		processAction.setDay10("10");
		processAction.setDay11("9");
		processAction.setDay12("8");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb13");
		monthMaruResult.add("Mb13");
		dayMaruResult.add("Db13");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
	 	assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
	}

	@Test
	// Yb14左
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay17("11");
		processAction.setDay16("10");
		processAction.setDay15("9");

		processAction.setDay11("5");
		processAction.setDay12("6");
		processAction.setDay13("7");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb14");
		monthMaruResult.add("Mb14");
		dayMaruResult.add("Db14");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
	}

	@Test
	// Yb14右
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay17("5");
		processAction.setDay16("6");
		processAction.setDay15("7");

		processAction.setDay11("11");
		processAction.setDay12("10");
		processAction.setDay13("9");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb14");
		monthMaruResult.add("Mb14");
		dayMaruResult.add("Db14");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
	}

	@Test
	// Yb15左
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay18("12");
		processAction.setDay17("11");
		processAction.setDay16("10");

		processAction.setDay12("6");
		processAction.setDay13("7");
		processAction.setDay14("8");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb15");
		monthMaruResult.add("Mb15");
		dayMaruResult.add("Db15");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
	}

	@Test
	// Yb15右
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay18("6");
		processAction.setDay17("7");
		processAction.setDay16("8");

		processAction.setDay12("12");
		processAction.setDay13("11");
		processAction.setDay14("10");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb15");
		monthMaruResult.add("Mb15");
		dayMaruResult.add("Db15");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
	}

	@Test
	// Yb16左
	public void tarProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("1");
		processAction.setDay18("12");
		processAction.setDay17("11");

		processAction.setDay13("7");
		processAction.setDay14("8");
		processAction.setDay15("9");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb16");
		monthMaruResult.add("Mb16");
		dayMaruResult.add("Db16");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
	}

	@Test
	// Yb16右
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("7");
		processAction.setDay18("8");
		processAction.setDay17("9");

		processAction.setDay13("1");
		processAction.setDay14("12");
		processAction.setDay15("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb16");
		monthMaruResult.add("Mb16");
		dayMaruResult.add("Db16");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
	}

	@Test
	// Yb17左
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("2");
		processAction.setDay7("1");
		processAction.setDay18("12");

		processAction.setDay14("8");
		processAction.setDay15("9");
		processAction.setDay16("10");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb17");
		monthMaruResult.add("Mb17");
		dayMaruResult.add("Db17");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
	}

	@Test
	// Yb17右
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("8");
		processAction.setDay7("9");
		processAction.setDay18("10");

		processAction.setDay14("2");
		processAction.setDay15("1");
		processAction.setDay16("12");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb17");
		monthMaruResult.add("Mb17");
		dayMaruResult.add("Db17");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
	}

	@Test
	// Yb18左
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("3");
		processAction.setDay8("2");
		processAction.setDay7("1");

		processAction.setDay15("9");
		processAction.setDay16("10");
		processAction.setDay17("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb18");
		monthMaruResult.add("Mb18");
		dayMaruResult.add("Db18");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("DL2"),  test);
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D17"),  test);
	}

	@Test
	// Yb18右
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("9");
		processAction.setDay8("10");
		processAction.setDay7("11");

		processAction.setDay15("3");
		processAction.setDay16("2");
		processAction.setDay17("1");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
		List<String> yearMaruResult = new ArrayList<String>();
		List<String> monthMaruResult = new ArrayList<String>();
		List<String> dayMaruResult = new ArrayList<String>();

		// 年情報
		List<String> aryYears = new ArrayList<String>();
		// 月情報
		List<String> aryMonths = new ArrayList<String>();
		// 日情報
		List<String> aryDays = new ArrayList<String>();

		yearMaruResult.add("Yb18");
		monthMaruResult.add("Mb18");
		dayMaruResult.add("Db18");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("DL2"),  test);
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D17"),  test);
	}




}
