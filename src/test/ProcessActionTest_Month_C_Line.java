package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Month_C_Line {



 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	// Yc1左
	public void starProTest1_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth2("5");
		processAction.setMonth3("6");
		processAction.setMonth4("7");

		processAction.setMonth10("1");
		processAction.setMonth11("2");
		processAction.setMonth12("3");

		Map<String, String> starMap = new HashMap<String, String>();

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

		yearMaruResult.add("Yc1");
		monthMaruResult.add("Mc1");
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
	// Yc1右
	public void starProTest1_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth4("1");
		processAction.setMonth3("2");
		processAction.setMonth2("3");

		processAction.setMonth10("7");
		processAction.setMonth11("6");
		processAction.setMonth12("5");

		Map<String, String> starMap = new HashMap<String, String>();

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

		yearMaruResult.add("Yc1");
		monthMaruResult.add("Mc1");
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
	// Yc2左
	public void starProTest2_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("6");
		processAction.setMonth4("7");
		processAction.setMonth5("8");

		processAction.setMonth1("4");
		processAction.setMonth12("3");
		processAction.setMonth11("2");

		Map<String, String> starMap = new HashMap<String, String>();

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

		yearMaruResult.add("Yc2");
		monthMaruResult.add("Mc2");
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
	// Yc2右
	public void starProTest2_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("4");
		processAction.setMonth4("3");
		processAction.setMonth5("2");

		processAction.setMonth1("6");
		processAction.setMonth12("7");
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

		yearMaruResult.add("Yc2");
		monthMaruResult.add("Mc2");
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
	// Yc3左
	public void starProTest3_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("9");
		processAction.setMonth5("8");
		processAction.setMonth4("7");

		processAction.setMonth12("3");
		processAction.setMonth1("4");
		processAction.setMonth2("5");

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

		yearMaruResult.add("Yc3");
		monthMaruResult.add("Mc3");
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
	// Yc3右
	public void starProTest3_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("3");
		processAction.setMonth5("4");
		processAction.setMonth4("5");

		processAction.setMonth12("9");
		processAction.setMonth1("8");
		processAction.setMonth2("7");

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

		yearMaruResult.add("Yc3");
		monthMaruResult.add("Mc3");
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
	// Yc4 左
	public void starProTest4_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("10");
		processAction.setMonth6("9");
		processAction.setMonth5("8");

		processAction.setMonth1("4");
		processAction.setMonth2("5");
		processAction.setMonth3("6");

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

		yearMaruResult.add("Yc4");
		monthMaruResult.add("Mc4");
		dayMaruResult.add("Dd3");

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
	// Yc4右
	public void starProTest4_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("4");
		processAction.setMonth6("5");
		processAction.setMonth5("6");

		processAction.setMonth1("10");
		processAction.setMonth2("9");
		processAction.setMonth3("8");

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

		yearMaruResult.add("Yc4");
		monthMaruResult.add("Mc4");
		dayMaruResult.add("Dd3");

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
	// Yc5左
	public void starProTest5_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("11");
		processAction.setMonth7("10");
		processAction.setMonth6("9");

		processAction.setMonth2("5");
		processAction.setMonth3("6");
		processAction.setMonth4("7");

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

		yearMaruResult.add("Yc5");
		monthMaruResult.add("Mc5");
		dayMaruResult.add("Dd3");

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
	// Yc5右
	public void starProTest5_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("5");
		processAction.setMonth7("6");
		processAction.setMonth6("7");

		processAction.setMonth2("11");
		processAction.setMonth3("10");
		processAction.setMonth4("9");

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

		yearMaruResult.add("Yc5");
		monthMaruResult.add("Mc5");
		dayMaruResult.add("Dd3");

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
	// Yc6左
	public void starProTest6_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("12");
		processAction.setMonth8("11");
		processAction.setMonth7("10");

		processAction.setMonth3("6");
		processAction.setMonth4("7");
		processAction.setMonth5("8");

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

		yearMaruResult.add("Yc6");
		monthMaruResult.add("Mc6");
		dayMaruResult.add("Dd3");

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
	// Yc6右
	public void starProTest6_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("6");
		processAction.setMonth8("7");
		processAction.setMonth7("8");

		processAction.setMonth3("12");
		processAction.setMonth4("11");
		processAction.setMonth5("10");

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

		yearMaruResult.add("Yc6");
		monthMaruResult.add("Mc6");
		dayMaruResult.add("Dd3");

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
	// Yc7左
	public void starProTest7_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("1");
		processAction.setMonth9("12");
		processAction.setMonth8("11");

		processAction.setMonth4("7");
		processAction.setMonth5("8");
		processAction.setMonth6("9");

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

		yearMaruResult.add("Yc7");
		monthMaruResult.add("Mc7");
		dayMaruResult.add("Dd3");

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
	// Yc7右·
	public void starProTest7_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("7");
		processAction.setMonth9("8");
		processAction.setMonth8("9");

		processAction.setMonth4("1");
		processAction.setMonth5("12");
		processAction.setMonth6("11");

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

		yearMaruResult.add("Yc7");
		monthMaruResult.add("Mc7");
		dayMaruResult.add("Dd3");

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
	// Yc8左
	public void starProTest8_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("2");
		processAction.setMonth10("1");
		processAction.setMonth9("12");

		processAction.setMonth5("8");
		processAction.setMonth6("9");
		processAction.setMonth7("10");

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

		yearMaruResult.add("Yc8");
		monthMaruResult.add("Mc8");
		dayMaruResult.add("Dd3");

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
	// Yc8右
	public void starProTest8_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("8");
		processAction.setMonth10("9");
		processAction.setMonth9("10");

		processAction.setMonth5("2");
		processAction.setMonth6("1");
		processAction.setMonth7("12");

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

		yearMaruResult.add("Yc8");
		monthMaruResult.add("Mc8");
		dayMaruResult.add("Dd3");

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
	// Yc9左
	public void starProTest9_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("3");
		processAction.setMonth11("2");
		processAction.setMonth10("1");

		processAction.setMonth6("9");
		processAction.setMonth7("10");
		processAction.setMonth8("11");

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

		yearMaruResult.add("Yc9");
		monthMaruResult.add("Mc9");
		dayMaruResult.add("Dd3");

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
	// Yc9右
	public void starProTest9_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("9");
		processAction.setMonth11("10");
		processAction.setMonth10("11");

		processAction.setMonth6("3");
		processAction.setMonth7("2");
		processAction.setMonth8("1");

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

		yearMaruResult.add("Yc9");
		monthMaruResult.add("Mc9");
		dayMaruResult.add("Dd3");

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
	// Yc10左
	public void starProTest10_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("4");
		processAction.setMonth12("3");
		processAction.setMonth11("2");

		processAction.setMonth7("10");
		processAction.setMonth8("11");
		processAction.setMonth9("12");

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

		yearMaruResult.add("Yc10");
		monthMaruResult.add("Mc10");
		dayMaruResult.add("Dd3");

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
	// Yc10右
	public void starProTest10_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("10");
		processAction.setMonth12("11");
		processAction.setMonth11("12");

		processAction.setMonth7("4");
		processAction.setMonth8("3");
		processAction.setMonth9("2");

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

		yearMaruResult.add("Yc10");
		monthMaruResult.add("Mc10");
		dayMaruResult.add("Dd3");

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
	// Yc11左
	public void starProTest11_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("5");
		processAction.setMonth13("4");
		processAction.setMonth12("3");

		processAction.setMonth8("11");
		processAction.setMonth9("12");
		processAction.setMonth10("1");

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

		yearMaruResult.add("Yc11");
		monthMaruResult.add("Mc11");
		dayMaruResult.add("Dd3");

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
	// Yc11右
	public void starProTest11_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("11");
		processAction.setMonth13("12");
		processAction.setMonth12("1");

		processAction.setMonth8("5");
		processAction.setMonth9("4");
		processAction.setMonth10("3");

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

		yearMaruResult.add("Yc11");
		monthMaruResult.add("Mc11");
		dayMaruResult.add("Dd3");

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
	// Yc12左
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("6");
		processAction.setMonth14("5");
		processAction.setMonth13("4");

		processAction.setMonth9("12");
		processAction.setMonth10("1");
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

		yearMaruResult.add("Yc12");
		monthMaruResult.add("Mc12");
		dayMaruResult.add("Dd3");

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
	// Yc12右
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("12");
		processAction.setMonth14("1");
		processAction.setMonth13("2");

		processAction.setMonth9("6");
		processAction.setMonth10("5");
		processAction.setMonth11("4");

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

		yearMaruResult.add("Yc12");
		monthMaruResult.add("Mc12");
		dayMaruResult.add("Dd3");

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
	// Yc13左
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("7");
		processAction.setMonth15("6");
		processAction.setMonth14("5");

		processAction.setMonth10("1");
		processAction.setMonth11("2");
		processAction.setMonth12("3");

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

		yearMaruResult.add("Yc13");
		monthMaruResult.add("Mc13");
		dayMaruResult.add("Dd3");

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
	// Yc13右
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("1");
		processAction.setMonth15("2");
		processAction.setMonth14("3");

		processAction.setMonth10("7");
		processAction.setMonth11("6");
		processAction.setMonth12("5");

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

		yearMaruResult.add("Yc13");
		monthMaruResult.add("Mc13");
		dayMaruResult.add("Dd3");

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
	// Yc14左
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("8");
		processAction.setMonth16("7");
		processAction.setMonth15("6");

		processAction.setMonth11("2");
		processAction.setMonth12("3");
		processAction.setMonth13("4");

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

		yearMaruResult.add("Yc14");
		monthMaruResult.add("Mc14");
		dayMaruResult.add("Dd3");

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
	// Yc14右
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("2");
		processAction.setMonth16("3");
		processAction.setMonth15("4");

		processAction.setMonth11("8");
		processAction.setMonth12("7");
		processAction.setMonth13("6");

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

		yearMaruResult.add("Yc14");
		monthMaruResult.add("Mc14");
		dayMaruResult.add("Dd3");

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
	// Yc15左
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("9");
		processAction.setMonth17("8");
		processAction.setMonth16("7");

		processAction.setMonth12("3");
		processAction.setMonth13("4");
		processAction.setMonth14("5");

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

		yearMaruResult.add("Yc15");
		monthMaruResult.add("Mc15");
		dayMaruResult.add("Dd3");

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
	// Yc15右
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("3");
		processAction.setMonth17("4");
		processAction.setMonth16("5");

		processAction.setMonth12("9");
		processAction.setMonth13("8");
		processAction.setMonth14("7");

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

		yearMaruResult.add("Yc15");
		monthMaruResult.add("Mc15");
		dayMaruResult.add("Dd3");

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
	// Yc16左
	public void tarProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("10");
		processAction.setMonth18("9");
		processAction.setMonth17("8");

		processAction.setMonth13("4");
		processAction.setMonth14("5");
		processAction.setMonth15("6");

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

		yearMaruResult.add("Yc16");
		monthMaruResult.add("Mc16");
		dayMaruResult.add("Dd3");

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
	// Yc16右
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("4");
		processAction.setMonth18("5");
		processAction.setMonth17("6");

		processAction.setMonth13("10");
		processAction.setMonth14("9");
		processAction.setMonth15("8");

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

		yearMaruResult.add("Yc16");
		monthMaruResult.add("Mc16");
		dayMaruResult.add("Dd3");

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
	// Yc17左
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("11");
		processAction.setMonth7("10");
		processAction.setMonth18("9");

		processAction.setMonth14("5");
		processAction.setMonth15("6");
		processAction.setMonth16("7");

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

		yearMaruResult.add("Yc17");
		monthMaruResult.add("Mc17");
		dayMaruResult.add("Dd3");

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
	// Yc17右
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("5");
		processAction.setMonth7("6");
		processAction.setMonth18("7");

		processAction.setMonth14("11");
		processAction.setMonth15("10");
		processAction.setMonth16("9");

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

		yearMaruResult.add("Yc17");
		monthMaruResult.add("Mc17");
		dayMaruResult.add("Dd3");

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
	// Yc18左
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("12");
		processAction.setMonth8("11");
		processAction.setMonth7("10");

		processAction.setMonth15("6");
		processAction.setMonth16("7");
		processAction.setMonth17("8");

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

		yearMaruResult.add("Yc18");
		monthMaruResult.add("Mc18");
		dayMaruResult.add("Dd3");

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
	// Yc18右
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("6");
		processAction.setMonth8("7");
		processAction.setMonth7("8");

		processAction.setMonth15("12");
		processAction.setMonth16("11");
		processAction.setMonth17("10");

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

		yearMaruResult.add("Yc18");
		monthMaruResult.add("Mc18");
		dayMaruResult.add("Dd3");

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
