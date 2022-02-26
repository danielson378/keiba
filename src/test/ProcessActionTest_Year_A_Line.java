package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.beautyred.action.ProcessAction;

public class ProcessActionTest_Year_A_Line {




 	String test = "<span class=\"tRed01\">★</span>";

	@Test
	// Ya1左
	public void starProTest1_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear2("11");
		processAction.setYear3("12");
		processAction.setYear4("1");

		processAction.setYear10("7");
		processAction.setYear11("8");
		processAction.setYear12("9");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md1");
		dayMaruResult.add("Dd1");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("Y3"),  test);
        assertEquals(processAction.getStarMap().get("Y2"),  test);
        assertEquals(processAction.getStarMap().get("YR2"),  test);
        assertEquals(processAction.getStarMap().get("YR1"),  test);
	}

	@Test
	// Ya1右
	public void starProTest1_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear4("7");
		processAction.setYear3("8");
		processAction.setYear2("9");

		processAction.setYear10("1");
		processAction.setYear11("12");
		processAction.setYear12("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md1");
		dayMaruResult.add("Dd1");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("Y3"),  test);
        assertEquals(processAction.getStarMap().get("Y2"),  test);
        assertEquals(processAction.getStarMap().get("YR2"),  test);
        assertEquals(processAction.getStarMap().get("YR1"),  test);
	}

	@Test
	// Ya2左
	public void starProTest2_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear3("12");
		processAction.setYear4("1");
		processAction.setYear5("2");

		processAction.setYear1("10");
		processAction.setYear12("9");
		processAction.setYear11("8");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md2");
		dayMaruResult.add("Dd2");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("Y4"),  test);
        assertEquals(processAction.getStarMap().get("Y3"),  test);
        assertEquals(processAction.getStarMap().get("Y1"),  test);
        assertEquals(processAction.getStarMap().get("YR1"),  test);
	}


	@Test
	// Ya2右
	public void starProTest2_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear3("10");
		processAction.setYear4("9");
		processAction.setYear5("8");

		processAction.setYear1("12");
		processAction.setYear12("1");
		processAction.setYear11("2");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md2");
		dayMaruResult.add("Dd2");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
        assertEquals(processAction.getStarMap().get("Y4"),  test);
        assertEquals(processAction.getStarMap().get("Y3"),  test);
        assertEquals(processAction.getStarMap().get("Y1"),  test);
        assertEquals(processAction.getStarMap().get("YR1"),  test);
	}

	@Test
	// Ya3左
	public void starProTest3_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear6("3");
		processAction.setYear5("2");
		processAction.setYear4("1");

		processAction.setYear12("9");
		processAction.setYear1("10");
		processAction.setYear2("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y5"),  test);
        assertEquals(processAction.getStarMap().get("Y4"),  test);
        assertEquals(processAction.getStarMap().get("Y1"),  test);
        assertEquals(processAction.getStarMap().get("Y2"),  test);
	}


	@Test
	// Ya3右
	public void starProTest3_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear6("9");
		processAction.setYear5("10");
		processAction.setYear4("11");

		processAction.setYear12("3");
		processAction.setYear1("2");
		processAction.setYear2("1");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y5"),  test);
        assertEquals(processAction.getStarMap().get("Y4"),  test);
        assertEquals(processAction.getStarMap().get("Y1"),  test);
        assertEquals(processAction.getStarMap().get("Y2"),  test);
	}

	@Test
	// Ya4 左
	public void starProTest4_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear7("4");
		processAction.setYear6("3");
		processAction.setYear5("2");

		processAction.setYear1("10");
		processAction.setYear2("11");
		processAction.setYear3("12");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y6"),  test);
	 	assertEquals(processAction.getStarMap().get("Y5"),  test);
	 	assertEquals(processAction.getStarMap().get("Y2"),  test);
        assertEquals(processAction.getStarMap().get("Y3"),  test);
	}

	@Test
	// Ya4右
	public void starProTest4_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear7("10");
		processAction.setYear6("11");
		processAction.setYear5("12");

		processAction.setYear1("4");
		processAction.setYear2("3");
		processAction.setYear3("2");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y6"),  test);
	 	assertEquals(processAction.getStarMap().get("Y5"),  test);
	 	assertEquals(processAction.getStarMap().get("Y2"),  test);
        assertEquals(processAction.getStarMap().get("Y3"),  test);
	}

	@Test
	// Ya5左
	public void starProTest5_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear8("5");
		processAction.setYear7("4");
		processAction.setYear6("3");

		processAction.setYear2("11");
		processAction.setYear3("12");
		processAction.setYear4("1");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y7"),  test);
	 	assertEquals(processAction.getStarMap().get("Y6"),  test);
	 	assertEquals(processAction.getStarMap().get("Y3"),  test);
	 	assertEquals(processAction.getStarMap().get("Y4"),  test);
	}

	@Test
	// Ya5右
	public void starProTest5_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear8("11");
		processAction.setYear7("12");
		processAction.setYear6("1");

		processAction.setYear2("5");
		processAction.setYear3("4");
		processAction.setYear4("3");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y7"),  test);
	 	assertEquals(processAction.getStarMap().get("Y6"),  test);
        assertEquals(processAction.getStarMap().get("Y3"),  test);
        assertEquals(processAction.getStarMap().get("Y4"),  test);
	}


	@Test
	// Ya6左
	public void starProTest6_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear9("6");
		processAction.setYear8("5");
		processAction.setYear7("4");

		processAction.setYear3("12");
		processAction.setYear4("1");
		processAction.setYear5("2");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y8"),  test);
	 	assertEquals(processAction.getStarMap().get("Y7"),  test);
        assertEquals(processAction.getStarMap().get("Y4"),  test);
        assertEquals(processAction.getStarMap().get("Y5"),  test);
	}


	@Test
	// Ya6右
	public void starProTest6_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear9("12");
		processAction.setYear8("1");
		processAction.setYear7("2");

		processAction.setYear3("6");
		processAction.setYear4("5");
		processAction.setYear5("4");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y8"),  test);
	 	assertEquals(processAction.getStarMap().get("Y7"),  test);
        assertEquals(processAction.getStarMap().get("Y4"),  test);
        assertEquals(processAction.getStarMap().get("Y5"),  test);
	}


	@Test
	// Ya7左
	public void starProTest7_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear10("7");
		processAction.setYear9("6");
		processAction.setYear8("5");

		processAction.setYear4("1");
		processAction.setYear5("2");
		processAction.setYear6("3");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y9"),  test);
	 	assertEquals(processAction.getStarMap().get("Y8"),  test);
        assertEquals(processAction.getStarMap().get("Y5"),  test);
        assertEquals(processAction.getStarMap().get("Y6"),  test);
	}


	@Test
	// Ya7右·
	public void starProTest7_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear10("1");
		processAction.setYear9("2");
		processAction.setYear8("3");

		processAction.setYear4("7");
		processAction.setYear5("6");
		processAction.setYear6("5");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y9"),  test);
	 	assertEquals(processAction.getStarMap().get("Y8"),  test);
        assertEquals(processAction.getStarMap().get("Y5"),  test);
        assertEquals(processAction.getStarMap().get("Y6"),  test);
	}


	@Test
	// Ya8左
	public void starProTest8_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear11("8");
		processAction.setYear10("7");
		processAction.setYear9("6");

		processAction.setYear5("2");
		processAction.setYear6("3");
		processAction.setYear7("4");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y10"),  test);
	 	assertEquals(processAction.getStarMap().get("Y9"),  test);
        assertEquals(processAction.getStarMap().get("Y6"),  test);
        assertEquals(processAction.getStarMap().get("Y7"),  test);
	}


	@Test
	// Ya8右
	public void starProTest8_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear11("2");
		processAction.setYear10("3");
		processAction.setYear9("4");

		processAction.setYear5("8");
		processAction.setYear6("7");
		processAction.setYear7("6");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y10"),  test);
	 	assertEquals(processAction.getStarMap().get("Y9"),  test);
        assertEquals(processAction.getStarMap().get("Y6"),  test);
        assertEquals(processAction.getStarMap().get("Y7"),  test);
	}


	@Test
	// Ya9左
	public void starProTest9_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear12("9");
		processAction.setYear11("8");
		processAction.setYear10("7");

		processAction.setYear6("3");
		processAction.setYear7("4");
		processAction.setYear8("5");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y11"),  test);
	 	assertEquals(processAction.getStarMap().get("Y10"),  test);
        assertEquals(processAction.getStarMap().get("Y7"),  test);
        assertEquals(processAction.getStarMap().get("Y8"),  test);
	}


	@Test
	// Ya9右
	public void starProTest9_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear12("3");
		processAction.setYear11("4");
		processAction.setYear10("5");

		processAction.setYear6("9");
		processAction.setYear7("8");
		processAction.setYear8("7");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y11"),  test);
	 	assertEquals(processAction.getStarMap().get("Y10"),  test);
        assertEquals(processAction.getStarMap().get("Y7"),  test);
        assertEquals(processAction.getStarMap().get("Y8"),  test);
	}

	@Test
	// Ya10左
	public void starProTest10_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear13("10");
		processAction.setYear12("9");
		processAction.setYear11("8");

		processAction.setYear7("4");
		processAction.setYear8("5");
		processAction.setYear9("6");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y12"),  test);
	 	assertEquals(processAction.getStarMap().get("Y11"),  test);
        assertEquals(processAction.getStarMap().get("Y8"),  test);
        assertEquals(processAction.getStarMap().get("Y9"),  test);
	}

	@Test
	// Ya10右
	public void starProTest10_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear13("4");
		processAction.setYear12("5");
		processAction.setYear11("6");

		processAction.setYear7("10");
		processAction.setYear8("9");
		processAction.setYear9("8");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y12"),  test);
	 	assertEquals(processAction.getStarMap().get("Y11"),  test);
        assertEquals(processAction.getStarMap().get("Y8"),  test);
        assertEquals(processAction.getStarMap().get("Y9"),  test);
	}


	@Test
	// Ya11左
	public void starProTest11_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear14("11");
		processAction.setYear13("10");
		processAction.setYear12("9");

		processAction.setYear8("5");
		processAction.setYear9("6");
		processAction.setYear10("7");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y13"),  test);
	 	assertEquals(processAction.getStarMap().get("Y12"),  test);
        assertEquals(processAction.getStarMap().get("Y9"),  test);
        assertEquals(processAction.getStarMap().get("Y10"),  test);
	}


	@Test
	// Ya11右
	public void starProTest11_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear14("5");
		processAction.setYear13("6");
		processAction.setYear12("7");

		processAction.setYear8("11");
		processAction.setYear9("10");
		processAction.setYear10("9");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

//	 	String test = "<span class=\"tRed01\">★</span>";
	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y13"),  test);
	 	assertEquals(processAction.getStarMap().get("Y12"),  test);
        assertEquals(processAction.getStarMap().get("Y9"),  test);
        assertEquals(processAction.getStarMap().get("Y10"),  test);
	}


	@Test
	// Ya12左
	public void starProTest12_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear15("12");
		processAction.setYear14("11");
		processAction.setYear13("10");

		processAction.setYear9("6");
		processAction.setYear10("7");
		processAction.setYear11("8");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y14"),  test);
	 	assertEquals(processAction.getStarMap().get("Y13"),  test);
        assertEquals(processAction.getStarMap().get("Y10"),  test);
        assertEquals(processAction.getStarMap().get("Y11"),  test);
	}


	@Test
	// Ya12右
	public void starProTest12_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear15("6");
		processAction.setYear14("7");
		processAction.setYear13("8");

		processAction.setYear9("12");
		processAction.setYear10("11");
		processAction.setYear11("10");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y14"),  test);
	 	assertEquals(processAction.getStarMap().get("Y13"),  test);
        assertEquals(processAction.getStarMap().get("Y10"),  test);
        assertEquals(processAction.getStarMap().get("Y11"),  test);
	}

	@Test
	// Ya13左
	public void starProTest13_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear16("1");
		processAction.setYear15("12");
		processAction.setYear14("11");

		processAction.setYear10("7");
		processAction.setYear11("8");
		processAction.setYear12("9");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y15"),  test);
	 	assertEquals(processAction.getStarMap().get("Y14"),  test);
        assertEquals(processAction.getStarMap().get("Y11"),  test);
        assertEquals(processAction.getStarMap().get("Y12"),  test);
	}

	@Test
	// Ya13右
	public void starProTest13_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear16("7");
		processAction.setYear15("8");
		processAction.setYear14("9");

		processAction.setYear10("1");
		processAction.setYear11("12");
		processAction.setYear12("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y15"),  test);
	 	assertEquals(processAction.getStarMap().get("Y14"),  test);
        assertEquals(processAction.getStarMap().get("Y11"),  test);
        assertEquals(processAction.getStarMap().get("Y12"),  test);
	}

	@Test
	// Ya14左
	public void starProTest14_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear17("2");
		processAction.setYear16("1");
		processAction.setYear15("12");

		processAction.setYear11("8");
		processAction.setYear12("9");
		processAction.setYear13("10");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y16"),  test);
	 	assertEquals(processAction.getStarMap().get("Y15"),  test);
        assertEquals(processAction.getStarMap().get("Y12"),  test);
        assertEquals(processAction.getStarMap().get("Y13"),  test);
	}

	@Test
	// Ya14右
	public void starProTest14_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear17("8");
		processAction.setYear16("9");
		processAction.setYear15("10");

		processAction.setYear11("2");
		processAction.setYear12("1");
		processAction.setYear13("12");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y16"),  test);
	 	assertEquals(processAction.getStarMap().get("Y15"),  test);
        assertEquals(processAction.getStarMap().get("Y12"),  test);
        assertEquals(processAction.getStarMap().get("Y13"),  test);
	}

	@Test
	// Ya15左
	public void starProTest15_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear18("3");
		processAction.setYear17("2");
		processAction.setYear16("1");

		processAction.setYear12("9");
		processAction.setYear13("10");
		processAction.setYear14("11");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y17"),  test);
	 	assertEquals(processAction.getStarMap().get("Y16"),  test);
        assertEquals(processAction.getStarMap().get("Y13"),  test);
        assertEquals(processAction.getStarMap().get("Y14"),  test);
	}

	@Test
	// Ya15右
	public void starProTest15_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear18("9");
		processAction.setYear17("10");
		processAction.setYear16("11");

		processAction.setYear12("3");
		processAction.setYear13("2");
		processAction.setYear14("1");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y17"),  test);
	 	assertEquals(processAction.getStarMap().get("Y16"),  test);
        assertEquals(processAction.getStarMap().get("Y13"),  test);
        assertEquals(processAction.getStarMap().get("Y14"),  test);
	}

	@Test
	// Ya16左
	public void tarProTest16_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear7("4");
		processAction.setYear18("3");
		processAction.setYear17("2");

		processAction.setYear13("10");
		processAction.setYear14("11");
		processAction.setYear15("12");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y18"),  test);
	 	assertEquals(processAction.getStarMap().get("Y17"),  test);
        assertEquals(processAction.getStarMap().get("Y14"),  test);
        assertEquals(processAction.getStarMap().get("Y15"),  test);
	}

	@Test
	// Ya16右
	public void starProTest16_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear7("10");
		processAction.setYear18("11");
		processAction.setYear17("12");

		processAction.setYear13("4");
		processAction.setYear14("3");
		processAction.setYear15("2");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("Y18"),  test);
	 	assertEquals(processAction.getStarMap().get("Y17"),  test);
        assertEquals(processAction.getStarMap().get("Y14"),  test);
        assertEquals(processAction.getStarMap().get("Y15"),  test);
	}

	@Test
	// Ya17左
	public void starProTest17_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear8("5");
		processAction.setYear7("4");
		processAction.setYear18("3");

		processAction.setYear14("11");
		processAction.setYear15("12");
		processAction.setYear16("1");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("YL1"),  test);
	 	assertEquals(processAction.getStarMap().get("Y18"),  test);
        assertEquals(processAction.getStarMap().get("Y15"),  test);
        assertEquals(processAction.getStarMap().get("Y16"),  test);
	}

	@Test
	// Ya17右
	public void starProTest17_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear8("11");
		processAction.setYear7("12");
		processAction.setYear18("1");

		processAction.setYear14("5");
		processAction.setYear15("4");
		processAction.setYear16("3");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("YL1"),  test);
	 	assertEquals(processAction.getStarMap().get("Y18"),  test);
        assertEquals(processAction.getStarMap().get("Y15"),  test);
        assertEquals(processAction.getStarMap().get("Y16"),  test);
	}

	@Test
	// Ya18左
	public void starProTest18_1() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear9("6");
		processAction.setYear8("5");
		processAction.setYear7("4");

		processAction.setYear15("12");
		processAction.setYear16("1");
		processAction.setYear17("2");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("YL2"),  test);
	 	assertEquals(processAction.getStarMap().get("YL1"),  test);
        assertEquals(processAction.getStarMap().get("Y16"),  test);
        assertEquals(processAction.getStarMap().get("Y17"),  test);
	}

	@Test
	// Ya18右
	public void starProTest18_2() {
		ProcessAction processAction = new ProcessAction();
		processAction.setYear9("12");
		processAction.setYear8("1");
		processAction.setYear7("2");

		processAction.setYear15("6");
		processAction.setYear16("5");
		processAction.setYear17("4");

		// 〇を付けた結果をLISTに詰める（★を付ける計算のため）
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
		monthMaruResult.add("Md3");
		dayMaruResult.add("Dd3");

		aryYears = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryMonths = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");
		aryDays = Arrays.asList("9", "6", "8", "8", "2", "10", "12", "11", "10", "10", "4", "2", "5", "10", "4", "3", "2", "4");

	 	processAction.starPro(yearMaruResult, monthMaruResult, dayMaruResult, aryYears, aryMonths, aryDays);
	 	assertEquals(processAction.getStarMap().get("YL2"),  test);
	 	assertEquals(processAction.getStarMap().get("YL1"),  test);
        assertEquals(processAction.getStarMap().get("Y16"),  test);
        assertEquals(processAction.getStarMap().get("Y17"),  test);
	}



}
