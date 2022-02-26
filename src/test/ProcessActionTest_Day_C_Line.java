package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Day_C_Line {




 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	// Yc1左
	public void starProTest1_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay2("5");
		processAction.setDay3("6");
		processAction.setDay4("7");

		processAction.setDay10("1");
		processAction.setDay11("2");
		processAction.setDay12("3");

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
		dayMaruResult.add("Dc1");

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
		processAction.setDay4("1");
		processAction.setDay3("2");
		processAction.setDay2("3");

		processAction.setDay10("7");
		processAction.setDay11("6");
		processAction.setDay12("5");

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
		dayMaruResult.add("Dc1");

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
		processAction.setDay3("6");
		processAction.setDay4("7");
		processAction.setDay5("8");

		processAction.setDay1("4");
		processAction.setDay12("3");
		processAction.setDay11("2");

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
		dayMaruResult.add("Dc2");

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
		processAction.setDay3("4");
		processAction.setDay4("3");
		processAction.setDay5("2");

		processAction.setDay1("6");
		processAction.setDay12("7");
		processAction.setDay11("8");

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
		dayMaruResult.add("Dc2");

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
		processAction.setDay6("9");
		processAction.setDay5("8");
		processAction.setDay4("7");

		processAction.setDay12("3");
		processAction.setDay1("4");
		processAction.setDay2("5");

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
		dayMaruResult.add("Dc3");

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
		processAction.setDay6("3");
		processAction.setDay5("4");
		processAction.setDay4("5");

		processAction.setDay12("9");
		processAction.setDay1("8");
		processAction.setDay2("7");

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
		dayMaruResult.add("Dc3");

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
		processAction.setDay7("10");
		processAction.setDay6("9");
		processAction.setDay5("8");

		processAction.setDay1("4");
		processAction.setDay2("5");
		processAction.setDay3("6");

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
		dayMaruResult.add("Dc4");

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
		processAction.setDay7("4");
		processAction.setDay6("5");
		processAction.setDay5("6");

		processAction.setDay1("10");
		processAction.setDay2("9");
		processAction.setDay3("8");

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
		dayMaruResult.add("Dc4");

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
		processAction.setDay8("11");
		processAction.setDay7("10");
		processAction.setDay6("9");

		processAction.setDay2("5");
		processAction.setDay3("6");
		processAction.setDay4("7");

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
		dayMaruResult.add("Dc5");

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
		processAction.setDay8("5");
		processAction.setDay7("6");
		processAction.setDay6("7");

		processAction.setDay2("11");
		processAction.setDay3("10");
		processAction.setDay4("9");

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
		dayMaruResult.add("Dc5");

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
		processAction.setDay9("12");
		processAction.setDay8("11");
		processAction.setDay7("10");

		processAction.setDay3("6");
		processAction.setDay4("7");
		processAction.setDay5("8");

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
		dayMaruResult.add("Dc6");

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
		processAction.setDay9("6");
		processAction.setDay8("7");
		processAction.setDay7("8");

		processAction.setDay3("12");
		processAction.setDay4("11");
		processAction.setDay5("10");

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
		dayMaruResult.add("Dc6");

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
		processAction.setDay10("1");
		processAction.setDay9("12");
		processAction.setDay8("11");

		processAction.setDay4("7");
		processAction.setDay5("8");
		processAction.setDay6("9");

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
		dayMaruResult.add("Dc7");

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
		processAction.setDay10("7");
		processAction.setDay9("8");
		processAction.setDay8("9");

		processAction.setDay4("1");
		processAction.setDay5("12");
		processAction.setDay6("11");

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
		dayMaruResult.add("Dc7");

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
		processAction.setDay11("2");
		processAction.setDay10("1");
		processAction.setDay9("12");

		processAction.setDay5("8");
		processAction.setDay6("9");
		processAction.setDay7("10");

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
		dayMaruResult.add("Dc8");

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
		processAction.setDay11("8");
		processAction.setDay10("9");
		processAction.setDay9("10");

		processAction.setDay5("2");
		processAction.setDay6("1");
		processAction.setDay7("12");

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
		dayMaruResult.add("Dc8");

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
		processAction.setDay12("3");
		processAction.setDay11("2");
		processAction.setDay10("1");

		processAction.setDay6("9");
		processAction.setDay7("10");
		processAction.setDay8("11");

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
		dayMaruResult.add("Dc9");

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
		processAction.setDay12("9");
		processAction.setDay11("10");
		processAction.setDay10("11");

		processAction.setDay6("3");
		processAction.setDay7("2");
		processAction.setDay8("1");

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
		dayMaruResult.add("Dc9");

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
		processAction.setDay13("4");
		processAction.setDay12("3");
		processAction.setDay11("2");

		processAction.setDay7("10");
		processAction.setDay8("11");
		processAction.setDay9("12");

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
		dayMaruResult.add("Dc10");

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
		processAction.setDay13("10");
		processAction.setDay12("11");
		processAction.setDay11("12");

		processAction.setDay7("4");
		processAction.setDay8("3");
		processAction.setDay9("2");

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
		dayMaruResult.add("Dc10");

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
		processAction.setDay14("5");
		processAction.setDay13("4");
		processAction.setDay12("3");

		processAction.setDay8("11");
		processAction.setDay9("12");
		processAction.setDay10("1");

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
		dayMaruResult.add("Dc11");

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
		processAction.setDay14("11");
		processAction.setDay13("12");
		processAction.setDay12("1");

		processAction.setDay8("5");
		processAction.setDay9("4");
		processAction.setDay10("3");

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
		dayMaruResult.add("Dc12");

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
		processAction.setDay15("6");
		processAction.setDay14("5");
		processAction.setDay13("4");

		processAction.setDay9("12");
		processAction.setDay10("1");
		processAction.setDay11("2");

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
		dayMaruResult.add("Dc12");

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
		processAction.setDay15("12");
		processAction.setDay14("1");
		processAction.setDay13("2");

		processAction.setDay9("6");
		processAction.setDay10("5");
		processAction.setDay11("4");

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
		dayMaruResult.add("Dc12");

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
		processAction.setDay16("7");
		processAction.setDay15("6");
		processAction.setDay14("5");

		processAction.setDay10("1");
		processAction.setDay11("2");
		processAction.setDay12("3");

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
		dayMaruResult.add("Dc13");

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
		processAction.setDay16("1");
		processAction.setDay15("2");
		processAction.setDay14("3");

		processAction.setDay10("7");
		processAction.setDay11("6");
		processAction.setDay12("5");

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
		dayMaruResult.add("Dc13");

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
		processAction.setDay17("8");
		processAction.setDay16("7");
		processAction.setDay15("6");

		processAction.setDay11("2");
		processAction.setDay12("3");
		processAction.setDay13("4");

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
		dayMaruResult.add("Dc14");

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
		processAction.setDay17("2");
		processAction.setDay16("3");
		processAction.setDay15("4");

		processAction.setDay11("8");
		processAction.setDay12("7");
		processAction.setDay13("6");

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
		dayMaruResult.add("Dc14");

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
		processAction.setDay18("9");
		processAction.setDay17("8");
		processAction.setDay16("7");

		processAction.setDay12("3");
		processAction.setDay13("4");
		processAction.setDay14("5");

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
		dayMaruResult.add("Dc15");

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
		processAction.setDay18("3");
		processAction.setDay17("4");
		processAction.setDay16("5");

		processAction.setDay12("9");
		processAction.setDay13("8");
		processAction.setDay14("7");

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
		dayMaruResult.add("Dc15");

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
		processAction.setDay7("10");
		processAction.setDay18("9");
		processAction.setDay17("8");

		processAction.setDay13("4");
		processAction.setDay14("5");
		processAction.setDay15("6");

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
		dayMaruResult.add("Dc16");

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
		processAction.setDay7("4");
		processAction.setDay18("5");
		processAction.setDay17("6");

		processAction.setDay13("10");
		processAction.setDay14("9");
		processAction.setDay15("8");

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
		dayMaruResult.add("Dc16");

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
		processAction.setDay8("11");
		processAction.setDay7("10");
		processAction.setDay18("9");

		processAction.setDay14("5");
		processAction.setDay15("6");
		processAction.setDay16("7");

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
		dayMaruResult.add("Dc17");

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
		processAction.setDay8("5");
		processAction.setDay7("6");
		processAction.setDay18("7");

		processAction.setDay14("11");
		processAction.setDay15("10");
		processAction.setDay16("9");

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
		dayMaruResult.add("Dc17");

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
		processAction.setDay9("12");
		processAction.setDay8("11");
		processAction.setDay7("10");

		processAction.setDay15("6");
		processAction.setDay16("7");
		processAction.setDay17("8");

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
		dayMaruResult.add("Dc18");

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
		processAction.setDay9("6");
		processAction.setDay8("7");
		processAction.setDay7("8");

		processAction.setDay15("12");
		processAction.setDay16("11");
		processAction.setDay17("10");

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
		dayMaruResult.add("Dc18");

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
