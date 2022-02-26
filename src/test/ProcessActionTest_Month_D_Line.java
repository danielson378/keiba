package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Month_D_Line {


 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	public void starProTest1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth2("2");
		processAction.setMonth3("3");
		processAction.setMonth4("4");

		processAction.setMonth10("10");
		processAction.setMonth11("11");
		processAction.setMonth12("12");

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

//		yearMaruResult.add("Yd1");
		monthMaruResult.add("Md1");
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
	public void starProTest2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth2("12");
		processAction.setMonth3("11");
		processAction.setMonth4("10");

		processAction.setMonth10("4");
		processAction.setMonth11("3");
		processAction.setMonth12("2");

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

		yearMaruResult.add("Yd1");
		monthMaruResult.add("Md1");
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
	public void starProTest3() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("3");
		processAction.setMonth4("4");
		processAction.setMonth5("5");

		processAction.setMonth1("1");
		processAction.setMonth11("11");
		processAction.setMonth12("12");

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

		yearMaruResult.add("Yd2");
		monthMaruResult.add("Md2");
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
	public void starProTest4() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth3("1");
		processAction.setMonth4("12");
		processAction.setMonth5("11");

		processAction.setMonth1("3");
		processAction.setMonth11("5");
		processAction.setMonth12("4");

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

		yearMaruResult.add("Yd2");
		monthMaruResult.add("Md2");
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
	public void starProTest5() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("6");
		processAction.setMonth5("5");
		processAction.setMonth4("4");

		processAction.setMonth12("12");
		processAction.setMonth1("1");
		processAction.setMonth2("2");

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

		yearMaruResult.add("Yd3");
		monthMaruResult.add("Md3");
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
	// Yd3
	public void starProTest6() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth6("12");
		processAction.setMonth5("1");
		processAction.setMonth4("2");

		processAction.setMonth12("6");
		processAction.setMonth1("5");
		processAction.setMonth2("4");

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

		yearMaruResult.add("Yd3");
		monthMaruResult.add("Md3");
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
	// Yd4
	public void starProTest7() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("7");
		processAction.setMonth6("6");
		processAction.setMonth5("5");

		processAction.setMonth1("1");
		processAction.setMonth2("2");
		processAction.setMonth3("3");

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

		yearMaruResult.add("Yd4");
		monthMaruResult.add("Md4");
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
	// Yd4
	public void starProTest8() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("1");
		processAction.setMonth6("2");
		processAction.setMonth5("3");

		processAction.setMonth1("7");
		processAction.setMonth2("6");
		processAction.setMonth3("5");

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

		yearMaruResult.add("Yd4");
		monthMaruResult.add("Md4");
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
	// Yd5
	public void starProTest9() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("8");
		processAction.setMonth7("7");
		processAction.setMonth6("6");

		processAction.setMonth2("2");
		processAction.setMonth3("3");
		processAction.setMonth4("4");

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

		yearMaruResult.add("Yd5");
		monthMaruResult.add("Md5");
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
	// Yd5
	public void starProTest10() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("2");
		processAction.setMonth7("3");
		processAction.setMonth6("4");

		processAction.setMonth2("8");
		processAction.setMonth3("7");
		processAction.setMonth4("6");

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

		yearMaruResult.add("Yd5");
		monthMaruResult.add("Md5");
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
	// Yd6
	public void starProTest11() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("9");
		processAction.setMonth8("8");
		processAction.setMonth7("7");

		processAction.setMonth3("3");
		processAction.setMonth4("4");
		processAction.setMonth5("5");

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

		yearMaruResult.add("Yd6");
		monthMaruResult.add("Md6");
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
	// Yd6
	public void starProTest12() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("3");
		processAction.setMonth8("4");
		processAction.setMonth7("5");

		processAction.setMonth3("9");
		processAction.setMonth4("8");
		processAction.setMonth5("7");

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

		yearMaruResult.add("Yd6");
		monthMaruResult.add("Md6");
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
	// Yd7
	public void starProTest13() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("10");
		processAction.setMonth9("9");
		processAction.setMonth8("8");

		processAction.setMonth4("4");
		processAction.setMonth5("5");
		processAction.setMonth6("6");

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

		yearMaruResult.add("Yd7");
		monthMaruResult.add("Md7");
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
	// Yd7
	public void starProTest14() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth10("4");
		processAction.setMonth9("5");
		processAction.setMonth8("6");

		processAction.setMonth4("10");
		processAction.setMonth5("9");
		processAction.setMonth6("8");

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

		yearMaruResult.add("Yd7");
		monthMaruResult.add("Md7");
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
	// Yd8
	public void starProTest15() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("11");
		processAction.setMonth10("10");
		processAction.setMonth9("9");

		processAction.setMonth5("5");
		processAction.setMonth6("6");
		processAction.setMonth7("7");

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

		yearMaruResult.add("Yd8");
		monthMaruResult.add("Md8");
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
	// Yd8
	public void starProTest16() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth11("5");
		processAction.setMonth10("6");
		processAction.setMonth9("7");

		processAction.setMonth5("11");
		processAction.setMonth6("10");
		processAction.setMonth7("9");

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

		yearMaruResult.add("Yd8");
		monthMaruResult.add("Md8");
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
	// Yd9
	public void starProTest17() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("12");
		processAction.setMonth11("11");
		processAction.setMonth10("10");

		processAction.setMonth6("6");
		processAction.setMonth7("7");
		processAction.setMonth8("8");

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

		yearMaruResult.add("Yd9");
		monthMaruResult.add("Md9");
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
	// Yd9
	public void starProTest18() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth12("6");
		processAction.setMonth11("7");
		processAction.setMonth10("8");

		processAction.setMonth6("12");
		processAction.setMonth7("11");
		processAction.setMonth8("10");

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

		yearMaruResult.add("Yd9");
		monthMaruResult.add("Md9");
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
	// Yd10
	public void starProTest19() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("1");
		processAction.setMonth12("12");
		processAction.setMonth11("11");

		processAction.setMonth7("7");
		processAction.setMonth8("8");
		processAction.setMonth9("9");

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

		yearMaruResult.add("Yd10");
		monthMaruResult.add("Md10");
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
	// Yd10
	public void starProTest20() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth13("7");
		processAction.setMonth12("8");
		processAction.setMonth11("9");

		processAction.setMonth7("1");
		processAction.setMonth8("12");
		processAction.setMonth9("11");

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

		yearMaruResult.add("Yd10");
		monthMaruResult.add("Md10");
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
	// Yd11
	public void starProTest21() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("2");
		processAction.setMonth13("1");
		processAction.setMonth12("12");

		processAction.setMonth8("8");
		processAction.setMonth9("9");
		processAction.setMonth10("10");

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

		yearMaruResult.add("Yd11");
		monthMaruResult.add("Md11");
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
	// Yd11
	public void starProTest22() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth14("8");
		processAction.setMonth13("9");
		processAction.setMonth12("10");

		processAction.setMonth8("2");
		processAction.setMonth9("1");
		processAction.setMonth10("12");

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

		yearMaruResult.add("Yd11");
		monthMaruResult.add("Md11");
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
	// Yd12
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("3");
		processAction.setMonth14("2");
		processAction.setMonth13("1");

		processAction.setMonth9("9");
		processAction.setMonth10("10");
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

		yearMaruResult.add("Yd12");
		monthMaruResult.add("Md12");
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
	// Yd12
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth15("9");
		processAction.setMonth14("10");
		processAction.setMonth13("11");

		processAction.setMonth9("3");
		processAction.setMonth10("2");
		processAction.setMonth11("1");

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

		yearMaruResult.add("Yd12");
		monthMaruResult.add("Md12");
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
	// Yd13
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("4");
		processAction.setMonth15("3");
		processAction.setMonth14("2");

		processAction.setMonth10("10");
		processAction.setMonth11("11");
		processAction.setMonth12("12");

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

		yearMaruResult.add("Yd13");
		monthMaruResult.add("Md13");
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
	// Yd13
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth16("10");
		processAction.setMonth15("11");
		processAction.setMonth14("12");

		processAction.setMonth10("4");
		processAction.setMonth11("3");
		processAction.setMonth12("2");

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

		yearMaruResult.add("Yd13");
		monthMaruResult.add("Md13");
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
	// Yd14
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("5");
		processAction.setMonth16("4");
		processAction.setMonth15("3");

		processAction.setMonth11("11");
		processAction.setMonth12("12");
		processAction.setMonth13("1");

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

		yearMaruResult.add("Yd14");
		monthMaruResult.add("Md14");
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
	// Yd14
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth17("11");
		processAction.setMonth16("12");
		processAction.setMonth15("1");

		processAction.setMonth11("5");
		processAction.setMonth12("4");
		processAction.setMonth13("3");

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

		yearMaruResult.add("Yd14");
		monthMaruResult.add("Md14");
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
	// Yd15
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("6");
		processAction.setMonth17("5");
		processAction.setMonth16("4");

		processAction.setMonth12("12");
		processAction.setMonth13("1");
		processAction.setMonth14("2");

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

		yearMaruResult.add("Yd15");
		monthMaruResult.add("Md15");
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
	// Yd15
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth18("12");
		processAction.setMonth17("1");
		processAction.setMonth16("2");

		processAction.setMonth12("6");
		processAction.setMonth13("5");
		processAction.setMonth14("4");

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

		yearMaruResult.add("Yd15");
		monthMaruResult.add("Md15");
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
	// Yd16
	public void starProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("7");
		processAction.setMonth18("6");
		processAction.setMonth17("5");

		processAction.setMonth13("1");
		processAction.setMonth14("2");
		processAction.setMonth15("3");

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

		yearMaruResult.add("Yd16");
		monthMaruResult.add("Md16");
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
	// Yd16
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth7("1");
		processAction.setMonth18("2");
		processAction.setMonth17("3");

		processAction.setMonth13("7");
		processAction.setMonth14("6");
		processAction.setMonth15("5");

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

		yearMaruResult.add("Yd16");
		monthMaruResult.add("Md16");
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
	// Yd17
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("8");
		processAction.setMonth7("7");
		processAction.setMonth18("6");

		processAction.setMonth14("2");
		processAction.setMonth15("3");
		processAction.setMonth16("4");

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

		yearMaruResult.add("Yd17");
		monthMaruResult.add("Md17");
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
	// Yd17
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth8("2");
		processAction.setMonth7("3");
		processAction.setMonth18("4");

		processAction.setMonth14("8");
		processAction.setMonth15("7");
		processAction.setMonth16("6");

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

		yearMaruResult.add("Yd17");
		monthMaruResult.add("Md17");
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
	// Yd18
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("9");
		processAction.setMonth8("8");
		processAction.setMonth7("7");

		processAction.setMonth15("3");
		processAction.setMonth16("4");
		processAction.setMonth17("5");

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

		yearMaruResult.add("Yd18");
		monthMaruResult.add("Md18");
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
	// Yd18
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setMonth9("3");
		processAction.setMonth8("4");
		processAction.setMonth7("5");

		processAction.setMonth15("9");
		processAction.setMonth16("8");
		processAction.setMonth17("7");

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

		yearMaruResult.add("Yd18");
		monthMaruResult.add("Md18");
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
