package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Day_D_Line {


 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	public void starProTest1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay2("2");
		processAction.setDay3("3");
		processAction.setDay4("4");

		processAction.setDay10("10");
		processAction.setDay11("11");
		processAction.setDay12("12");

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
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("DR2"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	public void starProTest2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay2("12");
		processAction.setDay3("11");
		processAction.setDay4("10");

		processAction.setDay10("4");
		processAction.setDay11("3");
		processAction.setDay12("2");

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
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("DR2"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	public void starProTest3() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay3("3");
		processAction.setDay4("4");
		processAction.setDay5("5");

		processAction.setDay1("1");
		processAction.setDay11("11");
		processAction.setDay12("12");

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
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}


	@Test
	public void starProTest4() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay3("1");
		processAction.setDay4("12");
		processAction.setDay5("11");

		processAction.setDay1("3");
		processAction.setDay11("5");
		processAction.setDay12("4");

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
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	public void starProTest5() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay6("6");
		processAction.setDay5("5");
		processAction.setDay4("4");

		processAction.setDay12("12");
		processAction.setDay1("1");
		processAction.setDay2("2");

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
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
	}


	@Test
	// Yd3
	public void starProTest6() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay6("12");
		processAction.setDay5("1");
		processAction.setDay4("2");

		processAction.setDay12("6");
		processAction.setDay1("5");
		processAction.setDay2("4");

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
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
	}

	@Test
	// Yd4
	public void starProTest7() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("7");
		processAction.setDay6("6");
		processAction.setDay5("5");

		processAction.setDay1("1");
		processAction.setDay2("2");
		processAction.setDay3("3");

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
		dayMaruResult.add("Dd4");

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
	// Yd4
	public void starProTest8() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("1");
		processAction.setDay6("2");
		processAction.setDay5("3");

		processAction.setDay1("7");
		processAction.setDay2("6");
		processAction.setDay3("5");

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
		dayMaruResult.add("Dd4");

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
	// Yd5
	public void starProTest9() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("8");
		processAction.setDay7("7");
		processAction.setDay6("6");

		processAction.setDay2("2");
		processAction.setDay3("3");
		processAction.setDay4("4");

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
		dayMaruResult.add("Dd5");

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
	// Yd5
	public void starProTest10() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("2");
		processAction.setDay7("3");
		processAction.setDay6("4");

		processAction.setDay2("8");
		processAction.setDay3("7");
		processAction.setDay4("6");

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
		dayMaruResult.add("Dd5");

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
	// Yd6
	public void starProTest11() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("9");
		processAction.setDay8("8");
		processAction.setDay7("7");

		processAction.setDay3("3");
		processAction.setDay4("4");
		processAction.setDay5("5");

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
		dayMaruResult.add("Dd6");

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
	// Yd6
	public void starProTest12() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("3");
		processAction.setDay8("4");
		processAction.setDay7("5");

		processAction.setDay3("9");
		processAction.setDay4("8");
		processAction.setDay5("7");

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
		dayMaruResult.add("Dd6");

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
	// Yd7
	public void starProTest13() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay10("10");
		processAction.setDay9("9");
		processAction.setDay8("8");

		processAction.setDay4("4");
		processAction.setDay5("5");
		processAction.setDay6("6");

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
		dayMaruResult.add("Dd7");

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
	// Yd7
	public void starProTest14() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay10("4");
		processAction.setDay9("5");
		processAction.setDay8("6");

		processAction.setDay4("10");
		processAction.setDay5("9");
		processAction.setDay6("8");

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
		dayMaruResult.add("Dd7");

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
	// Yd8
	public void starProTest15() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay11("11");
		processAction.setDay10("10");
		processAction.setDay9("9");

		processAction.setDay5("5");
		processAction.setDay6("6");
		processAction.setDay7("7");

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
		dayMaruResult.add("Dd8");

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
	// Yd8
	public void starProTest16() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay11("5");
		processAction.setDay10("6");
		processAction.setDay9("7");

		processAction.setDay5("11");
		processAction.setDay6("10");
		processAction.setDay7("9");

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
		dayMaruResult.add("Dd8");

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
	// Yd9
	public void starProTest17() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay12("12");
		processAction.setDay11("11");
		processAction.setDay10("10");

		processAction.setDay6("6");
		processAction.setDay7("7");
		processAction.setDay8("8");

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
		dayMaruResult.add("Dd9");

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
	// Yd9
	public void starProTest18() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay12("6");
		processAction.setDay11("7");
		processAction.setDay10("8");

		processAction.setDay6("12");
		processAction.setDay7("11");
		processAction.setDay8("10");

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
		dayMaruResult.add("Dd9");

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
	// Yd10
	public void starProTest19() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay13("1");
		processAction.setDay12("12");
		processAction.setDay11("11");

		processAction.setDay7("7");
		processAction.setDay8("8");
		processAction.setDay9("9");

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
		dayMaruResult.add("Dd10");

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
	// Yd10
	public void starProTest20() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay13("7");
		processAction.setDay12("8");
		processAction.setDay11("9");

		processAction.setDay7("1");
		processAction.setDay8("12");
		processAction.setDay9("11");

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
		dayMaruResult.add("Dd10");

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
	// Yd11
	public void starProTest21() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay14("2");
		processAction.setDay13("1");
		processAction.setDay12("12");

		processAction.setDay8("8");
		processAction.setDay9("9");
		processAction.setDay10("10");

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
		dayMaruResult.add("Dd11");

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
	// Yd11
	public void starProTest22() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay14("8");
		processAction.setDay13("9");
		processAction.setDay12("10");

		processAction.setDay8("2");
		processAction.setDay9("1");
		processAction.setDay10("12");

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
		dayMaruResult.add("Dd11");

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
	// Yd12
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay15("3");
		processAction.setDay14("2");
		processAction.setDay13("1");

		processAction.setDay9("9");
		processAction.setDay10("10");
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

		yearMaruResult.add("Yd12");
		monthMaruResult.add("Md12");
		dayMaruResult.add("Dd12");

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
	// Yd12
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay15("9");
		processAction.setDay14("10");
		processAction.setDay13("11");

		processAction.setDay9("3");
		processAction.setDay10("2");
		processAction.setDay11("1");

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
		dayMaruResult.add("Dd12");

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
	// Yd13
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay16("4");
		processAction.setDay15("3");
		processAction.setDay14("2");

		processAction.setDay10("10");
		processAction.setDay11("11");
		processAction.setDay12("12");

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
		dayMaruResult.add("Dd13");

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
	// Yd13
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay16("10");
		processAction.setDay15("11");
		processAction.setDay14("12");

		processAction.setDay10("4");
		processAction.setDay11("3");
		processAction.setDay12("2");

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
		dayMaruResult.add("Dd13");

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
	// Yd14
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay17("5");
		processAction.setDay16("4");
		processAction.setDay15("3");

		processAction.setDay11("11");
		processAction.setDay12("12");
		processAction.setDay13("1");

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
		dayMaruResult.add("Dd14");

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
	// Yd14
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay17("11");
		processAction.setDay16("12");
		processAction.setDay15("1");

		processAction.setDay11("5");
		processAction.setDay12("4");
		processAction.setDay13("3");

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
		dayMaruResult.add("Dd14");

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
	// Yd15
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay18("6");
		processAction.setDay17("5");
		processAction.setDay16("4");

		processAction.setDay12("12");
		processAction.setDay13("1");
		processAction.setDay14("2");

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
		dayMaruResult.add("Dd15");

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
	// Yd15
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay18("12");
		processAction.setDay17("1");
		processAction.setDay16("2");

		processAction.setDay12("6");
		processAction.setDay13("5");
		processAction.setDay14("4");

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
		dayMaruResult.add("Dd15");

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
	// Yd16
	public void starProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("7");
		processAction.setDay18("6");
		processAction.setDay17("5");

		processAction.setDay13("1");
		processAction.setDay14("2");
		processAction.setDay15("3");

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
		dayMaruResult.add("Dd16");

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
	// Yd16
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("1");
		processAction.setDay18("2");
		processAction.setDay17("3");

		processAction.setDay13("7");
		processAction.setDay14("6");
		processAction.setDay15("5");

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
		dayMaruResult.add("Dd16");

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
	// Yd17
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("8");
		processAction.setDay7("7");
		processAction.setDay18("6");

		processAction.setDay14("2");
		processAction.setDay15("3");
		processAction.setDay16("4");

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
		dayMaruResult.add("Dd17");

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
	// Yd17
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("2");
		processAction.setDay7("3");
		processAction.setDay18("4");

		processAction.setDay14("8");
		processAction.setDay15("7");
		processAction.setDay16("6");

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
		dayMaruResult.add("Dd17");

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
	// Yd18
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("9");
		processAction.setDay8("8");
		processAction.setDay7("7");

		processAction.setDay15("3");
		processAction.setDay16("4");
		processAction.setDay17("5");

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
		dayMaruResult.add("Dd18");

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
	// Yd18
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("3");
		processAction.setDay8("4");
		processAction.setDay7("5");

		processAction.setDay15("9");
		processAction.setDay16("8");
		processAction.setDay17("7");

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
		dayMaruResult.add("Dd18");

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
