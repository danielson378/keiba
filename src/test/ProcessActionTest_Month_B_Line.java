package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Month_B_Line {




 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	// Yb1左
	public void starProTest1_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth2("8");
		processAction.setMonth3("9");
		processAction.setMonth4("10");

		processAction.setMonth10("4");
		processAction.setMonth11("5");
		processAction.setMonth12("6");

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
		dayMaruResult.add("Dd1");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("M3"),  test);
        assertEquals(processAction.getStarMap().get("M2"),  test);
        assertEquals(processAction.getStarMap().get("MR2"),  test);
        assertEquals(processAction.getStarMap().get("MR1"),  test);
	}

	@Test
	// Yb1右
	public void starProTest1_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth4("4");
		processAction.setMonth3("5");
		processAction.setMonth2("6");

		processAction.setMonth10("10");
		processAction.setMonth11("9");
		processAction.setMonth12("8");

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
		dayMaruResult.add("Dd1");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("M3"),  test);
        assertEquals(processAction.getStarMap().get("M2"),  test);
        assertEquals(processAction.getStarMap().get("MR2"),  test);
        assertEquals(processAction.getStarMap().get("MR1"),  test);
	}

	@Test
	// Yb2左
	public void starProTest2_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("9");
		processAction.setMonth4("10");
		processAction.setMonth5("11");

		processAction.setMonth1("7");
		processAction.setMonth12("6");
		processAction.setMonth11("5");

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
		dayMaruResult.add("Dd2");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("M4"),  test);
        assertEquals(processAction.getStarMap().get("M3"),  test);
        assertEquals(processAction.getStarMap().get("M1"),  test);
        assertEquals(processAction.getStarMap().get("MR1"),  test);
	}


	@Test
	// Yb2右
	public void starProTest2_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("7");
		processAction.setMonth4("6");
		processAction.setMonth5("5");

		processAction.setMonth1("9");
		processAction.setMonth12("10");
		processAction.setMonth11("11");

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
		dayMaruResult.add("Dd2");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("M4"),  test);
        assertEquals(processAction.getStarMap().get("M3"),  test);
        assertEquals(processAction.getStarMap().get("M1"),  test);
        assertEquals(processAction.getStarMap().get("MR1"),  test);
	}

	@Test
	// Yb3左
	public void starProTest3_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("12");
		processAction.setMonth5("11");
		processAction.setMonth4("10");

		processAction.setMonth12("6");
		processAction.setMonth1("7");
		processAction.setMonth2("8");

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
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M5"),  test);
        assertEquals(processAction.getStarMap().get("M4"),  test);
        assertEquals(processAction.getStarMap().get("M1"),  test);
        assertEquals(processAction.getStarMap().get("M2"),  test);
	}


	@Test
	// Yb3右
	public void starProTest3_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("6");
		processAction.setMonth5("7");
		processAction.setMonth4("8");

		processAction.setMonth12("12");
		processAction.setMonth1("11");
		processAction.setMonth2("10");

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
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M5"),  test);
        assertEquals(processAction.getStarMap().get("M4"),  test);
        assertEquals(processAction.getStarMap().get("M1"),  test);
        assertEquals(processAction.getStarMap().get("M2"),  test);
	}

	@Test
	// Yb4 左
	public void starProTest4_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("1");
		processAction.setMonth6("12");
		processAction.setMonth5("11");

		processAction.setMonth1("7");
		processAction.setMonth2("8");
		processAction.setMonth3("9");

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
		dayMaruResult.add("Dd4");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M6"),  test);
	 	assertEquals(processAction.getStarMap().get("M5"),  test);
	 	assertEquals(processAction.getStarMap().get("M2"),  test);
        assertEquals(processAction.getStarMap().get("M3"),  test);
	}

	@Test
	// Yb4右
	public void starProTest4_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("7");
		processAction.setMonth6("8");
		processAction.setMonth5("9");

		processAction.setMonth1("1");
		processAction.setMonth2("12");
		processAction.setMonth3("11");

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
		dayMaruResult.add("Dd4");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M6"),  test);
	 	assertEquals(processAction.getStarMap().get("M5"),  test);
	 	assertEquals(processAction.getStarMap().get("M2"),  test);
        assertEquals(processAction.getStarMap().get("M3"),  test);
	}

	@Test
	// Yb5左
	public void starProTest5_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("2");
		processAction.setMonth7("1");
		processAction.setMonth6("12");

		processAction.setMonth2("8");
		processAction.setMonth3("9");
		processAction.setMonth4("10");

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
		dayMaruResult.add("Dd5");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M7"),  test);
	 	assertEquals(processAction.getStarMap().get("M6"),  test);
	 	assertEquals(processAction.getStarMap().get("M3"),  test);
	 	assertEquals(processAction.getStarMap().get("M4"),  test);
	}

	@Test
	// Yb5右
	public void starProTest5_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("8");
		processAction.setMonth7("9");
		processAction.setMonth6("10");

		processAction.setMonth2("2");
		processAction.setMonth3("1");
		processAction.setMonth4("12");

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
		dayMaruResult.add("Dd5");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M7"),  test);
	 	assertEquals(processAction.getStarMap().get("M6"),  test);
        assertEquals(processAction.getStarMap().get("M3"),  test);
        assertEquals(processAction.getStarMap().get("M4"),  test);
	}


	@Test
	// Yb6左
	public void starProTest6_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("3");
		processAction.setMonth8("2");
		processAction.setMonth7("1");

		processAction.setMonth3("9");
		processAction.setMonth4("10");
		processAction.setMonth5("11");

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
		dayMaruResult.add("Dd6");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M8"),  test);
	 	assertEquals(processAction.getStarMap().get("M7"),  test);
        assertEquals(processAction.getStarMap().get("M4"),  test);
        assertEquals(processAction.getStarMap().get("M5"),  test);
	}


	@Test
	// Yb6右
	public void starProTest6_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("9");
		processAction.setMonth8("10");
		processAction.setMonth7("11");

		processAction.setMonth3("3");
		processAction.setMonth4("2");
		processAction.setMonth5("1");

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
		dayMaruResult.add("Dd6");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M8"),  test);
	 	assertEquals(processAction.getStarMap().get("M7"),  test);
        assertEquals(processAction.getStarMap().get("M4"),  test);
        assertEquals(processAction.getStarMap().get("M5"),  test);
	}


	@Test
	// Yb7左
	public void starProTest7_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("4");
		processAction.setMonth9("3");
		processAction.setMonth8("2");

		processAction.setMonth4("10");
		processAction.setMonth5("11");
		processAction.setMonth6("12");

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
		dayMaruResult.add("Dd7");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M9"),  test);
	 	assertEquals(processAction.getStarMap().get("M8"),  test);
        assertEquals(processAction.getStarMap().get("M5"),  test);
        assertEquals(processAction.getStarMap().get("M6"),  test);
	}


	@Test
	// Yb7右·
	public void starProTest7_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("10");
		processAction.setMonth9("11");
		processAction.setMonth8("12");

		processAction.setMonth4("4");
		processAction.setMonth5("3");
		processAction.setMonth6("2");

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
		dayMaruResult.add("Dd7");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M9"),  test);
	 	assertEquals(processAction.getStarMap().get("M8"),  test);
        assertEquals(processAction.getStarMap().get("M5"),  test);
        assertEquals(processAction.getStarMap().get("M6"),  test);
	}


	@Test
	// Yb8左
	public void starProTest8_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("5");
		processAction.setMonth10("4");
		processAction.setMonth9("3");

		processAction.setMonth5("11");
		processAction.setMonth6("12");
		processAction.setMonth7("1");

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
		dayMaruResult.add("Dd8");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M10"),  test);
	 	assertEquals(processAction.getStarMap().get("M9"),  test);
        assertEquals(processAction.getStarMap().get("M6"),  test);
        assertEquals(processAction.getStarMap().get("M7"),  test);
	}


	@Test
	// Yb8右
	public void starProTest8_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("11");
		processAction.setMonth10("12");
		processAction.setMonth9("1");

		processAction.setMonth5("5");
		processAction.setMonth6("4");
		processAction.setMonth7("3");

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
		dayMaruResult.add("Dd8");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M10"),  test);
	 	assertEquals(processAction.getStarMap().get("M9"),  test);
        assertEquals(processAction.getStarMap().get("M6"),  test);
        assertEquals(processAction.getStarMap().get("M7"),  test);
	}


	@Test
	// Yb9左
	public void starProTest9_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("6");
		processAction.setMonth11("5");
		processAction.setMonth10("4");

		processAction.setMonth6("12");
		processAction.setMonth7("1");
		processAction.setMonth8("2");

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
		dayMaruResult.add("Dd9");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M11"),  test);
	 	assertEquals(processAction.getStarMap().get("M10"),  test);
        assertEquals(processAction.getStarMap().get("M7"),  test);
        assertEquals(processAction.getStarMap().get("M8"),  test);
	}


	@Test
	// Yb9右
	public void starProTest9_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("12");
		processAction.setMonth11("1");
		processAction.setMonth10("2");

		processAction.setMonth6("6");
		processAction.setMonth7("5");
		processAction.setMonth8("4");

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
		dayMaruResult.add("Dd9");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M11"),  test);
	 	assertEquals(processAction.getStarMap().get("M10"),  test);
        assertEquals(processAction.getStarMap().get("M7"),  test);
        assertEquals(processAction.getStarMap().get("M8"),  test);
	}

	@Test
	// Yb10左
	public void starProTest10_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("7");
		processAction.setMonth12("6");
		processAction.setMonth11("5");

		processAction.setMonth7("1");
		processAction.setMonth8("2");
		processAction.setMonth9("3");

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
		dayMaruResult.add("Dd10");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M12"),  test);
	 	assertEquals(processAction.getStarMap().get("M11"),  test);
        assertEquals(processAction.getStarMap().get("M8"),  test);
        assertEquals(processAction.getStarMap().get("M9"),  test);
	}

	@Test
	// Yb10右
	public void starProTest10_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("1");
		processAction.setMonth12("2");
		processAction.setMonth11("3");

		processAction.setMonth7("7");
		processAction.setMonth8("6");
		processAction.setMonth9("5");

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
		dayMaruResult.add("Dd10");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M12"),  test);
	 	assertEquals(processAction.getStarMap().get("M11"),  test);
        assertEquals(processAction.getStarMap().get("M8"),  test);
        assertEquals(processAction.getStarMap().get("M9"),  test);
	}


	@Test
	// Yb11左
	public void starProTest11_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("8");
		processAction.setMonth13("7");
		processAction.setMonth12("6");

		processAction.setMonth8("2");
		processAction.setMonth9("3");
		processAction.setMonth10("4");

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
		dayMaruResult.add("Dd11");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M13"),  test);
	 	assertEquals(processAction.getStarMap().get("M12"),  test);
        assertEquals(processAction.getStarMap().get("M9"),  test);
        assertEquals(processAction.getStarMap().get("M10"),  test);
	}


	@Test
	// Yb11右
	public void starProTest11_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("2");
		processAction.setMonth13("3");
		processAction.setMonth12("4");

		processAction.setMonth8("8");
		processAction.setMonth9("7");
		processAction.setMonth10("6");

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
		dayMaruResult.add("Dd11");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M13"),  test);
	 	assertEquals(processAction.getStarMap().get("M12"),  test);
        assertEquals(processAction.getStarMap().get("M9"),  test);
        assertEquals(processAction.getStarMap().get("M10"),  test);
	}


	@Test
	// Yb12左
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("9");
		processAction.setMonth14("8");
		processAction.setMonth13("7");

		processAction.setMonth9("3");
		processAction.setMonth10("4");
		processAction.setMonth11("5");

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
		dayMaruResult.add("Dd12");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M14"),  test);
	 	assertEquals(processAction.getStarMap().get("M13"),  test);
        assertEquals(processAction.getStarMap().get("M10"),  test);
        assertEquals(processAction.getStarMap().get("M11"),  test);
	}


	@Test
	// Yb12右
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("3");
		processAction.setMonth14("4");
		processAction.setMonth13("5");

		processAction.setMonth9("9");
		processAction.setMonth10("8");
		processAction.setMonth11("7");

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
		dayMaruResult.add("Dd12");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M14"),  test);
	 	assertEquals(processAction.getStarMap().get("M13"),  test);
        assertEquals(processAction.getStarMap().get("M10"),  test);
        assertEquals(processAction.getStarMap().get("M11"),  test);
	}

	@Test
	// Yb13左
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("10");
		processAction.setMonth15("9");
		processAction.setMonth14("8");

		processAction.setMonth10("4");
		processAction.setMonth11("5");
		processAction.setMonth12("6");

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
		dayMaruResult.add("Dd13");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M15"),  test);
	 	assertEquals(processAction.getStarMap().get("M14"),  test);
        assertEquals(processAction.getStarMap().get("M11"),  test);
        assertEquals(processAction.getStarMap().get("M12"),  test);
	}

	@Test
	// Yb13右
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("4");
		processAction.setMonth15("5");
		processAction.setMonth14("6");

		processAction.setMonth10("10");
		processAction.setMonth11("9");
		processAction.setMonth12("8");

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
		dayMaruResult.add("Dd13");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M15"),  test);
	 	assertEquals(processAction.getStarMap().get("M14"),  test);
        assertEquals(processAction.getStarMap().get("M11"),  test);
        assertEquals(processAction.getStarMap().get("M12"),  test);
	}

	@Test
	// Yb14左
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("11");
		processAction.setMonth16("10");
		processAction.setMonth15("9");

		processAction.setMonth11("5");
		processAction.setMonth12("6");
		processAction.setMonth13("7");

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
		dayMaruResult.add("Dd14");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M16"),  test);
	 	assertEquals(processAction.getStarMap().get("M15"),  test);
        assertEquals(processAction.getStarMap().get("M12"),  test);
        assertEquals(processAction.getStarMap().get("M13"),  test);
	}

	@Test
	// Yb14右
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("5");
		processAction.setMonth16("6");
		processAction.setMonth15("7");

		processAction.setMonth11("11");
		processAction.setMonth12("10");
		processAction.setMonth13("9");

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
		dayMaruResult.add("Dd14");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M16"),  test);
	 	assertEquals(processAction.getStarMap().get("M15"),  test);
        assertEquals(processAction.getStarMap().get("M12"),  test);
        assertEquals(processAction.getStarMap().get("M13"),  test);
	}

	@Test
	// Yb15左
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("12");
		processAction.setMonth17("11");
		processAction.setMonth16("10");

		processAction.setMonth12("6");
		processAction.setMonth13("7");
		processAction.setMonth14("8");

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
		dayMaruResult.add("Dd15");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M17"),  test);
	 	assertEquals(processAction.getStarMap().get("M16"),  test);
        assertEquals(processAction.getStarMap().get("M13"),  test);
        assertEquals(processAction.getStarMap().get("M14"),  test);
	}

	@Test
	// Yb15右
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("6");
		processAction.setMonth17("7");
		processAction.setMonth16("8");

		processAction.setMonth12("12");
		processAction.setMonth13("11");
		processAction.setMonth14("10");

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
		dayMaruResult.add("Dd15");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M17"),  test);
	 	assertEquals(processAction.getStarMap().get("M16"),  test);
        assertEquals(processAction.getStarMap().get("M13"),  test);
        assertEquals(processAction.getStarMap().get("M14"),  test);
	}

	@Test
	// Yb16左
	public void tarProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("1");
		processAction.setMonth18("12");
		processAction.setMonth17("11");

		processAction.setMonth13("7");
		processAction.setMonth14("8");
		processAction.setMonth15("9");

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
		dayMaruResult.add("Dd16");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M18"),  test);
	 	assertEquals(processAction.getStarMap().get("M17"),  test);
        assertEquals(processAction.getStarMap().get("M14"),  test);
        assertEquals(processAction.getStarMap().get("M15"),  test);
	}

	@Test
	// Yb16右
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("7");
		processAction.setMonth18("8");
		processAction.setMonth17("9");

		processAction.setMonth13("1");
		processAction.setMonth14("12");
		processAction.setMonth15("11");

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
		dayMaruResult.add("Dd16");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("M18"),  test);
	 	assertEquals(processAction.getStarMap().get("M17"),  test);
        assertEquals(processAction.getStarMap().get("M14"),  test);
        assertEquals(processAction.getStarMap().get("M15"),  test);
	}

	@Test
	// Yb17左
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("2");
		processAction.setMonth7("1");
		processAction.setMonth18("12");

		processAction.setMonth14("8");
		processAction.setMonth15("9");
		processAction.setMonth16("10");

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
		dayMaruResult.add("Dd17");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("ML1"),  test);
	 	assertEquals(processAction.getStarMap().get("M18"),  test);
        assertEquals(processAction.getStarMap().get("M15"),  test);
        assertEquals(processAction.getStarMap().get("M16"),  test);
	}

	@Test
	// Yb17右
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("8");
		processAction.setMonth7("9");
		processAction.setMonth18("10");

		processAction.setMonth14("2");
		processAction.setMonth15("1");
		processAction.setMonth16("12");

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
		dayMaruResult.add("Dd17");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("ML1"),  test);
	 	assertEquals(processAction.getStarMap().get("M18"),  test);
        assertEquals(processAction.getStarMap().get("M15"),  test);
        assertEquals(processAction.getStarMap().get("M16"),  test);
	}

	@Test
	// Yb18左
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("3");
		processAction.setMonth8("2");
		processAction.setMonth7("1");

		processAction.setMonth15("9");
		processAction.setMonth16("10");
		processAction.setMonth17("11");

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
		dayMaruResult.add("Dd18");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("ML2"),  test);
	 	assertEquals(processAction.getStarMap().get("ML1"),  test);
        assertEquals(processAction.getStarMap().get("M16"),  test);
        assertEquals(processAction.getStarMap().get("M17"),  test);
	}

	@Test
	// Yb18右
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("9");
		processAction.setMonth8("10");
		processAction.setMonth7("11");

		processAction.setMonth15("3");
		processAction.setMonth16("2");
		processAction.setMonth17("1");

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
		dayMaruResult.add("Dd18");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("ML2"),  test);
	 	assertEquals(processAction.getStarMap().get("ML1"),  test);
        assertEquals(processAction.getStarMap().get("M16"),  test);
        assertEquals(processAction.getStarMap().get("M17"),  test);
	}



}
