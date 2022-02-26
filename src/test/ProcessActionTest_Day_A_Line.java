package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Day_A_Line {






 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	// Ya1左
	public void starProTest1_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay2("11");
		processAction.setDay3("12");
		processAction.setDay4("1");

		processAction.setDay10("7");
		processAction.setDay11("8");
		processAction.setDay12("9");

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
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("DR2"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	// Ya1右
	public void starProTest1_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay4("7");
		processAction.setDay3("8");
		processAction.setDay2("9");

		processAction.setDay10("1");
		processAction.setDay11("12");
		processAction.setDay12("11");

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
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("DR2"),  test);
        assertEquals(processAction.getStarMap().get("DR1"),  test);
	}

	@Test
	// Ya2左
	public void starProTest2_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay3("12");
		processAction.setDay4("1");
		processAction.setDay5("2");

		processAction.setDay1("10");
		processAction.setDay12("9");
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

		yearMaruResult.add("Ya2");
		monthMaruResult.add("Ma2");
		dayMaruResult.add("Da2");

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
	// Ya2右
	public void starProTest2_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay3("10");
		processAction.setDay4("9");
		processAction.setDay5("8");

		processAction.setDay1("12");
		processAction.setDay12("1");
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

		yearMaruResult.add("Ya2");
		monthMaruResult.add("Ma2");
		dayMaruResult.add("Da2");

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
	// Ya3左
	public void starProTest3_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay6("3");
		processAction.setDay5("2");
		processAction.setDay4("1");

		processAction.setDay12("9");
		processAction.setDay1("10");
		processAction.setDay2("11");

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
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
	}


	@Test
	// Ya3右
	public void starProTest3_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay6("9");
		processAction.setDay5("10");
		processAction.setDay4("11");

		processAction.setDay12("3");
		processAction.setDay1("2");
		processAction.setDay2("1");

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
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D1"),  test);
        assertEquals(processAction.getStarMap().get("D2"),  test);
	}

	@Test
	// Ya4 左
	public void starProTest4_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("4");
		processAction.setDay6("3");
		processAction.setDay5("2");

		processAction.setDay1("10");
		processAction.setDay2("11");
		processAction.setDay3("12");

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
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
	 	assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
	}

	@Test
	// Ya4右
	public void starProTest4_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("10");
		processAction.setDay6("11");
		processAction.setDay5("12");

		processAction.setDay1("4");
		processAction.setDay2("3");
		processAction.setDay3("2");

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
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
	 	assertEquals(processAction.getStarMap().get("D5"),  test);
	 	assertEquals(processAction.getStarMap().get("D2"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
	}

	@Test
	// Ya5左
	public void starProTest5_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("5");
		processAction.setDay7("4");
		processAction.setDay6("3");

		processAction.setDay2("11");
		processAction.setDay3("12");
		processAction.setDay4("1");

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
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
	 	assertEquals(processAction.getStarMap().get("D3"),  test);
	 	assertEquals(processAction.getStarMap().get("D4"),  test);
	}

	@Test
	// Ya5右
	public void starProTest5_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("11");
		processAction.setDay7("12");
		processAction.setDay6("1");

		processAction.setDay2("5");
		processAction.setDay3("4");
		processAction.setDay4("3");

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
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
	 	assertEquals(processAction.getStarMap().get("D6"),  test);
        assertEquals(processAction.getStarMap().get("D3"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
	}


	@Test
	// Ya6左
	public void starProTest6_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("6");
		processAction.setDay8("5");
		processAction.setDay7("4");

		processAction.setDay3("12");
		processAction.setDay4("1");
		processAction.setDay5("2");

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
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
	}


	@Test
	// Ya6右
	public void starProTest6_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("12");
		processAction.setDay8("1");
		processAction.setDay7("2");

		processAction.setDay3("6");
		processAction.setDay4("5");
		processAction.setDay5("4");

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
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
	 	assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D4"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
	}


	@Test
	// Ya7左
	public void starProTest7_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay10("7");
		processAction.setDay9("6");
		processAction.setDay8("5");

		processAction.setDay4("1");
		processAction.setDay5("2");
		processAction.setDay6("3");

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
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
	}


	@Test
	// Ya7右·
	public void starProTest7_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay10("1");
		processAction.setDay9("2");
		processAction.setDay8("3");

		processAction.setDay4("7");
		processAction.setDay5("6");
		processAction.setDay6("5");

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
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
	 	assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D5"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
	}


	@Test
	// Ya8左
	public void starProTest8_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay11("8");
		processAction.setDay10("7");
		processAction.setDay9("6");

		processAction.setDay5("2");
		processAction.setDay6("3");
		processAction.setDay7("4");

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
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
	}


	@Test
	// Ya8右
	public void starProTest8_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay11("2");
		processAction.setDay10("3");
		processAction.setDay9("4");

		processAction.setDay5("8");
		processAction.setDay6("7");
		processAction.setDay7("6");

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
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
	 	assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D6"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
	}


	@Test
	// Ya9左
	public void starProTest9_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay12("9");
		processAction.setDay11("8");
		processAction.setDay10("7");

		processAction.setDay6("3");
		processAction.setDay7("4");
		processAction.setDay8("5");

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
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
	}


	@Test
	// Ya9右
	public void starProTest9_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay12("3");
		processAction.setDay11("4");
		processAction.setDay10("5");

		processAction.setDay6("9");
		processAction.setDay7("8");
		processAction.setDay8("7");

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
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
	 	assertEquals(processAction.getStarMap().get("D10"),  test);
        assertEquals(processAction.getStarMap().get("D7"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
	}

	@Test
	// Ya10左
	public void starProTest10_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay13("10");
		processAction.setDay12("9");
		processAction.setDay11("8");

		processAction.setDay7("4");
		processAction.setDay8("5");
		processAction.setDay9("6");

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
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
	}

	@Test
	// Ya10右
	public void starProTest10_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay13("4");
		processAction.setDay12("5");
		processAction.setDay11("6");

		processAction.setDay7("10");
		processAction.setDay8("9");
		processAction.setDay9("8");

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
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
	 	assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D8"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
	}


	@Test
	// Ya11左
	public void starProTest11_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay14("11");
		processAction.setDay13("10");
		processAction.setDay12("9");

		processAction.setDay8("5");
		processAction.setDay9("6");
		processAction.setDay10("7");

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
	 	assertEquals(processAction.getStarMap().get("D13"),  test);
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D10"),  test);
	}


	@Test
	// Ya11右
	public void starProTest11_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay14("5");
		processAction.setDay13("6");
		processAction.setDay12("7");

		processAction.setDay8("11");
		processAction.setDay9("10");
		processAction.setDay10("9");

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
	 	assertEquals(processAction.getStarMap().get("D13"),  test);
	 	assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D9"),  test);
        assertEquals(processAction.getStarMap().get("D10"),  test);
	}


	@Test
	// Ya12左
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay15("12");
		processAction.setDay14("11");
		processAction.setDay13("10");

		processAction.setDay9("6");
		processAction.setDay10("7");
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

		yearMaruResult.add("Ya12");
		monthMaruResult.add("Ma12");
		dayMaruResult.add("Da12");

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
	// Ya12右
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay15("6");
		processAction.setDay14("7");
		processAction.setDay13("8");

		processAction.setDay9("12");
		processAction.setDay10("11");
		processAction.setDay11("10");

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
	 	assertEquals(processAction.getStarMap().get("D14"),  test);
	 	assertEquals(processAction.getStarMap().get("D13"),  test);
        assertEquals(processAction.getStarMap().get("D10"),  test);
        assertEquals(processAction.getStarMap().get("D11"),  test);
	}

	@Test
	// Ya13左
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay16("1");
		processAction.setDay15("12");
		processAction.setDay14("11");

		processAction.setDay10("7");
		processAction.setDay11("8");
		processAction.setDay12("9");

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
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
	 	assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
	}

	@Test
	// Ya13右
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay16("7");
		processAction.setDay15("8");
		processAction.setDay14("9");

		processAction.setDay10("1");
		processAction.setDay11("12");
		processAction.setDay12("11");

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
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
	 	assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D11"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
	}

	@Test
	// Ya14左
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay17("2");
		processAction.setDay16("1");
		processAction.setDay15("12");

		processAction.setDay11("8");
		processAction.setDay12("9");
		processAction.setDay13("10");

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
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
	}

	@Test
	// Ya14右
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay17("8");
		processAction.setDay16("9");
		processAction.setDay15("10");

		processAction.setDay11("2");
		processAction.setDay12("1");
		processAction.setDay13("12");

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
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
	 	assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D12"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
	}

	@Test
	// Ya15左
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay18("3");
		processAction.setDay17("2");
		processAction.setDay16("1");

		processAction.setDay12("9");
		processAction.setDay13("10");
		processAction.setDay14("11");

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
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
	}

	@Test
	// Ya15右
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay18("9");
		processAction.setDay17("10");
		processAction.setDay16("11");

		processAction.setDay12("3");
		processAction.setDay13("2");
		processAction.setDay14("1");

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
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
	 	assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D13"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
	}

	@Test
	// Ya16左
	public void tarProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("4");
		processAction.setDay18("3");
		processAction.setDay17("2");

		processAction.setDay13("10");
		processAction.setDay14("11");
		processAction.setDay15("12");

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
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
	}

	@Test
	// Ya16右
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay7("10");
		processAction.setDay18("11");
		processAction.setDay17("12");

		processAction.setDay13("4");
		processAction.setDay14("3");
		processAction.setDay15("2");

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
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
	 	assertEquals(processAction.getStarMap().get("D17"),  test);
        assertEquals(processAction.getStarMap().get("D14"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
	}

	@Test
	// Ya17左
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("5");
		processAction.setDay7("4");
		processAction.setDay18("3");

		processAction.setDay14("11");
		processAction.setDay15("12");
		processAction.setDay16("1");

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
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
	}

	@Test
	// Ya17右
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay8("11");
		processAction.setDay7("12");
		processAction.setDay18("1");

		processAction.setDay14("5");
		processAction.setDay15("4");
		processAction.setDay16("3");

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
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
	 	assertEquals(processAction.getStarMap().get("D18"),  test);
        assertEquals(processAction.getStarMap().get("D15"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
	}

	@Test
	// Ya18左
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("6");
		processAction.setDay8("5");
		processAction.setDay7("4");

		processAction.setDay15("12");
		processAction.setDay16("1");
		processAction.setDay17("2");

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
	 	assertEquals(processAction.getStarMap().get("DL2"),  test);
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D17"),  test);
	}

	@Test
	// Ya18右
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setDay9("12");
		processAction.setDay8("1");
		processAction.setDay7("2");

		processAction.setDay15("6");
		processAction.setDay16("5");
		processAction.setDay17("4");

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
	 	assertEquals(processAction.getStarMap().get("DL2"),  test);
	 	assertEquals(processAction.getStarMap().get("DL1"),  test);
        assertEquals(processAction.getStarMap().get("D16"),  test);
        assertEquals(processAction.getStarMap().get("D17"),  test);
	}





}
