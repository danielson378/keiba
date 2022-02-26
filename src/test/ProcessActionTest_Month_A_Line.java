package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Month_A_Line {





 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	// Ya1左
	public void starProTest1_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth2("11");
		processAction.setMonth3("12");
		processAction.setMonth4("1");

		processAction.setMonth10("7");
		processAction.setMonth11("8");
		processAction.setMonth12("9");

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

		yearMaruResult.add("Ya1");
		monthMaruResult.add("Ma1");
		dayMaruResult.add("Da1");

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
	// Ya1右
	public void starProTest1_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth4("7");
		processAction.setMonth3("8");
		processAction.setMonth2("9");

		processAction.setMonth10("1");
		processAction.setMonth11("12");
		processAction.setMonth12("11");

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

		yearMaruResult.add("Ya1");
		monthMaruResult.add("Ma1");
		dayMaruResult.add("Da1");

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
	// Ya2左
	public void starProTest2_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("12");
		processAction.setMonth4("1");
		processAction.setMonth5("2");

		processAction.setMonth1("10");
		processAction.setMonth12("9");
		processAction.setMonth11("8");

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

		yearMaruResult.add("Ya2");
		monthMaruResult.add("Ma2");
		dayMaruResult.add("Da2");

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
	// Ya2右
	public void starProTest2_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("10");
		processAction.setMonth4("9");
		processAction.setMonth5("8");

		processAction.setMonth1("12");
		processAction.setMonth12("1");
		processAction.setMonth11("2");

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

		yearMaruResult.add("Ya2");
		monthMaruResult.add("Ma2");
		dayMaruResult.add("Da2");

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
	// Ya3左
	public void starProTest3_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("3");
		processAction.setMonth5("2");
		processAction.setMonth4("1");

		processAction.setMonth12("9");
		processAction.setMonth1("10");
		processAction.setMonth2("11");

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

		yearMaruResult.add("Ya3");
		monthMaruResult.add("Ma3");
		dayMaruResult.add("Da3");

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
	// Ya3右
	public void starProTest3_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("9");
		processAction.setMonth5("10");
		processAction.setMonth4("11");

		processAction.setMonth12("3");
		processAction.setMonth1("2");
		processAction.setMonth2("1");

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

		yearMaruResult.add("Ya3");
		monthMaruResult.add("Ma3");
		dayMaruResult.add("Da3");

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
	// Ya4 左
	public void starProTest4_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("4");
		processAction.setMonth6("3");
		processAction.setMonth5("2");

		processAction.setMonth1("10");
		processAction.setMonth2("11");
		processAction.setMonth3("12");

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

		yearMaruResult.add("Ya4");
		monthMaruResult.add("Ma4");
		dayMaruResult.add("Da4");

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
	// Ya4右
	public void starProTest4_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("10");
		processAction.setMonth6("11");
		processAction.setMonth5("12");

		processAction.setMonth1("4");
		processAction.setMonth2("3");
		processAction.setMonth3("2");

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

		yearMaruResult.add("Ya4");
		monthMaruResult.add("Ma4");
		dayMaruResult.add("Da4");

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
	// Ya5左
	public void starProTest5_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("5");
		processAction.setMonth7("4");
		processAction.setMonth6("3");

		processAction.setMonth2("11");
		processAction.setMonth3("12");
		processAction.setMonth4("1");

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

		yearMaruResult.add("Ya5");
		monthMaruResult.add("Ma5");
		dayMaruResult.add("Da5");

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
	// Ya5右
	public void starProTest5_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("11");
		processAction.setMonth7("12");
		processAction.setMonth6("1");

		processAction.setMonth2("5");
		processAction.setMonth3("4");
		processAction.setMonth4("3");

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

		yearMaruResult.add("Ya5");
		monthMaruResult.add("Ma5");
		dayMaruResult.add("Da5");

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
	// Ya6左
	public void starProTest6_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("6");
		processAction.setMonth8("5");
		processAction.setMonth7("4");

		processAction.setMonth3("12");
		processAction.setMonth4("1");
		processAction.setMonth5("2");

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

		yearMaruResult.add("Ya6");
		monthMaruResult.add("Ma6");
		dayMaruResult.add("Da6");

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
	// Ya6右
	public void starProTest6_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("12");
		processAction.setMonth8("1");
		processAction.setMonth7("2");

		processAction.setMonth3("6");
		processAction.setMonth4("5");
		processAction.setMonth5("4");

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

		yearMaruResult.add("Ya6");
		monthMaruResult.add("Ma6");
		dayMaruResult.add("Da6");

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
	// Ya7左
	public void starProTest7_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("7");
		processAction.setMonth9("6");
		processAction.setMonth8("5");

		processAction.setMonth4("1");
		processAction.setMonth5("2");
		processAction.setMonth6("3");

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

		yearMaruResult.add("Ya7");
		monthMaruResult.add("Ma7");
		dayMaruResult.add("Da7");

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
	// Ya7右·
	public void starProTest7_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("1");
		processAction.setMonth9("2");
		processAction.setMonth8("3");

		processAction.setMonth4("7");
		processAction.setMonth5("6");
		processAction.setMonth6("5");

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

		yearMaruResult.add("Ya7");
		monthMaruResult.add("Ma7");
		dayMaruResult.add("Da7");

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
	// Ya8左
	public void starProTest8_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("8");
		processAction.setMonth10("7");
		processAction.setMonth9("6");

		processAction.setMonth5("2");
		processAction.setMonth6("3");
		processAction.setMonth7("4");

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

		yearMaruResult.add("Ya8");
		monthMaruResult.add("Ma8");
		dayMaruResult.add("Da8");

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
	// Ya8右
	public void starProTest8_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("2");
		processAction.setMonth10("3");
		processAction.setMonth9("4");

		processAction.setMonth5("8");
		processAction.setMonth6("7");
		processAction.setMonth7("6");

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

		yearMaruResult.add("Ya8");
		monthMaruResult.add("Ma8");
		dayMaruResult.add("Da8");

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
	// Ya9左
	public void starProTest9_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("9");
		processAction.setMonth11("8");
		processAction.setMonth10("7");

		processAction.setMonth6("3");
		processAction.setMonth7("4");
		processAction.setMonth8("5");

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

		yearMaruResult.add("Ya9");
		monthMaruResult.add("Ma9");
		dayMaruResult.add("Da9");

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
	// Ya9右
	public void starProTest9_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("3");
		processAction.setMonth11("4");
		processAction.setMonth10("5");

		processAction.setMonth6("9");
		processAction.setMonth7("8");
		processAction.setMonth8("7");

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

		yearMaruResult.add("Ya9");
		monthMaruResult.add("Ma9");
		dayMaruResult.add("Da9");

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
	// Ya10左
	public void starProTest10_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("10");
		processAction.setMonth12("9");
		processAction.setMonth11("8");

		processAction.setMonth7("4");
		processAction.setMonth8("5");
		processAction.setMonth9("6");

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

		yearMaruResult.add("Ya10");
		monthMaruResult.add("Ma10");
		dayMaruResult.add("Da10");

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
	// Ya10右
	public void starProTest10_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("4");
		processAction.setMonth12("5");
		processAction.setMonth11("6");

		processAction.setMonth7("10");
		processAction.setMonth8("9");
		processAction.setMonth9("8");

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

		yearMaruResult.add("Ya10");
		monthMaruResult.add("Ma10");
		dayMaruResult.add("Da10");

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
	// Ya11左
	public void starProTest11_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("11");
		processAction.setMonth13("10");
		processAction.setMonth12("9");

		processAction.setMonth8("5");
		processAction.setMonth9("6");
		processAction.setMonth10("7");

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

		yearMaruResult.add("Ya11");
		monthMaruResult.add("Ma11");
		dayMaruResult.add("Da11");

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
	// Ya11右
	public void starProTest11_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("5");
		processAction.setMonth13("6");
		processAction.setMonth12("7");

		processAction.setMonth8("11");
		processAction.setMonth9("10");
		processAction.setMonth10("9");

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

		yearMaruResult.add("Ya11");
		monthMaruResult.add("Ma11");
		dayMaruResult.add("Da11");

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
	// Ya12左
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("12");
		processAction.setMonth14("11");
		processAction.setMonth13("10");

		processAction.setMonth9("6");
		processAction.setMonth10("7");
		processAction.setMonth11("8");

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

		yearMaruResult.add("Ya12");
		monthMaruResult.add("Ma12");
		dayMaruResult.add("Da12");

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
	// Ya12右
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("6");
		processAction.setMonth14("7");
		processAction.setMonth13("8");

		processAction.setMonth9("12");
		processAction.setMonth10("11");
		processAction.setMonth11("10");

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

		yearMaruResult.add("Ya12");
		monthMaruResult.add("Ma12");
		dayMaruResult.add("Da12");

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
	// Ya13左
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("1");
		processAction.setMonth15("12");
		processAction.setMonth14("11");

		processAction.setMonth10("7");
		processAction.setMonth11("8");
		processAction.setMonth12("9");

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

		yearMaruResult.add("Ya13");
		monthMaruResult.add("Ma13");
		dayMaruResult.add("Da13");

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
	// Ya13右
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("7");
		processAction.setMonth15("8");
		processAction.setMonth14("9");

		processAction.setMonth10("1");
		processAction.setMonth11("12");
		processAction.setMonth12("11");

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

		yearMaruResult.add("Ya13");
		monthMaruResult.add("Ma13");
		dayMaruResult.add("Da13");

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
	// Ya14左
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("2");
		processAction.setMonth16("1");
		processAction.setMonth15("12");

		processAction.setMonth11("8");
		processAction.setMonth12("9");
		processAction.setMonth13("10");

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

		yearMaruResult.add("Ya14");
		monthMaruResult.add("Ma14");
		dayMaruResult.add("Da14");

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
	// Ya14右
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("8");
		processAction.setMonth16("9");
		processAction.setMonth15("10");

		processAction.setMonth11("2");
		processAction.setMonth12("1");
		processAction.setMonth13("12");

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

		yearMaruResult.add("Ya14");
		monthMaruResult.add("Ma14");
		dayMaruResult.add("Da14");

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
	// Ya15左
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("3");
		processAction.setMonth17("2");
		processAction.setMonth16("1");

		processAction.setMonth12("9");
		processAction.setMonth13("10");
		processAction.setMonth14("11");

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

		yearMaruResult.add("Ya15");
		monthMaruResult.add("Ma15");
		dayMaruResult.add("Da15");

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
	// Ya15右
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("9");
		processAction.setMonth17("10");
		processAction.setMonth16("11");

		processAction.setMonth12("3");
		processAction.setMonth13("2");
		processAction.setMonth14("1");

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

		yearMaruResult.add("Ya15");
		monthMaruResult.add("Ma15");
		dayMaruResult.add("Da15");

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
	// Ya16左
	public void tarProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("4");
		processAction.setMonth18("3");
		processAction.setMonth17("2");

		processAction.setMonth13("10");
		processAction.setMonth14("11");
		processAction.setMonth15("12");

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

		yearMaruResult.add("Ya16");
		monthMaruResult.add("Ma16");
		dayMaruResult.add("Da16");

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
	// Ya16右
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("10");
		processAction.setMonth18("11");
		processAction.setMonth17("12");

		processAction.setMonth13("4");
		processAction.setMonth14("3");
		processAction.setMonth15("2");

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

		yearMaruResult.add("Ya16");
		monthMaruResult.add("Ma16");
		dayMaruResult.add("Da16");

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
	// Ya17左
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("5");
		processAction.setMonth7("4");
		processAction.setMonth18("3");

		processAction.setMonth14("11");
		processAction.setMonth15("12");
		processAction.setMonth16("1");

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

		yearMaruResult.add("Ya17");
		monthMaruResult.add("Ma17");
		dayMaruResult.add("Da17");

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
	// Ya17右
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("11");
		processAction.setMonth7("12");
		processAction.setMonth18("1");

		processAction.setMonth14("5");
		processAction.setMonth15("4");
		processAction.setMonth16("3");

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

		yearMaruResult.add("Ya17");
		monthMaruResult.add("Ma17");
		dayMaruResult.add("Da17");

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
	// Ya18左
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("6");
		processAction.setMonth8("5");
		processAction.setMonth7("4");

		processAction.setMonth15("12");
		processAction.setMonth16("1");
		processAction.setMonth17("2");

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

		yearMaruResult.add("Ya18");
		monthMaruResult.add("Ma18");
		dayMaruResult.add("Da18");

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
	// Ya18右
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("12");
		processAction.setMonth8("1");
		processAction.setMonth7("2");

		processAction.setMonth15("6");
		processAction.setMonth16("5");
		processAction.setMonth17("4");

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

		yearMaruResult.add("Ya18");
		monthMaruResult.add("Ma18");
		dayMaruResult.add("Da18");

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
