<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>入力結果</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/reset.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/base.css">

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts.css">




<!-- component ver.3 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts_ver3.css">





${user1}
<div id="calendar_box">
	<div id="calendar_detailed">
		<table class="tableCalendar">
			<!-- 項番 -->
			<thead>
				<tr>
				<th>L3</th>
				<th>L2</th>
				<th>L1</th>
				<th>18</th>
				<th>17</th>
				<th>16</th>
				<th>15</th>
				<th>14</th>
				<th>13</th>
				<th>12</th>
				<th>11</th>
				<th>10</th>
				<th>9</th>
				<th>8</th>
<!-- 				<th class="tRed01">7</th> -->
				<th>7</th>
				<th>6</th>
				<th>5</th>
				<th>4</th>
				<th>3</th>
				<th>2</th>
<!-- 				<th class="tBlue01">1</th> -->
				<th>1</th>
				<th>R1</th>
				<th>R2</th>
				<th>R3</th></tr>

			</thead>
			<tr>
			<td><ul class="days"><li>${request.yearMap.get("YaL3")}</li><li>${request.yearMap.get("YbL3")}</li><li>${request.yearMap.get("YcL3")}</li><li>${request.yearMap.get("YdL3")}</li><li>&nbsp</li><li>${request.year9}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("YaL2")}</li><li>${request.yearMap.get("YbL2")}</li><li>${request.yearMap.get("YcL2")}</li><li>${request.yearMap.get("YdL2")}</li><li>&nbsp</li><li>${request.year8}</li><li>&nbsp</li></ul></td>
			<td class="borderRight"><ul><li>${request.yearMap.get("YaL1")}</li><li>${request.yearMap.get("YbL1")}</li><li>${request.yearMap.get("YcL1")}</li><li>${request.yearMap.get("YdL1")}</li><li>&nbsp</li><li>${request.year7}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya18")}</li><li>${request.yearMap.get("Yb18")}</li><li>${request.yearMap.get("Yc18")}</li><li>${request.yearMap.get("Yd18")}</li><li>${null eq request.starMap.get("Y18")?"&nbsp":request.starMap.get("Y18")}</li><li>${request.year18}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya17")}</li><li>${request.yearMap.get("Yb17")}</li><li>${request.yearMap.get("Yc17")}</li><li>${request.yearMap.get("Yd17")}</li><li>${null eq request.starMap.get("Y17")?"&nbsp":request.starMap.get("Y17")}</li><li>${request.year17}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya16")}</li><li>${request.yearMap.get("Yb16")}</li><li>${request.yearMap.get("Yc16")}</li><li>${request.yearMap.get("Yd16")}</li><li>${null eq request.starMap.get("Y16")?"&nbsp":request.starMap.get("Y16")}</li><li>${request.year16}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya15")}</li><li>${request.yearMap.get("Yb15")}</li><li>${request.yearMap.get("Yc15")}</li><li>${request.yearMap.get("Yd15")}</li><li>${null eq request.starMap.get("Y15")?"&nbsp":request.starMap.get("Y15")}</li><li>${request.year15}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya14")}</li><li>${request.yearMap.get("Yb14")}</li><li>${request.yearMap.get("Yc14")}</li><li>${request.yearMap.get("Yd14")}</li><li>${null eq request.starMap.get("Y14")?"&nbsp":request.starMap.get("Y14")}</li><li>${request.year14}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya13")}</li><li>${request.yearMap.get("Yb13")}</li><li>${request.yearMap.get("Yc13")}</li><li>${request.yearMap.get("Yd13")}</li><li>${null eq request.starMap.get("Y13")?"&nbsp":request.starMap.get("Y13")}</li><li>${request.year13}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya12")}</li><li>${request.yearMap.get("Yb12")}</li><li>${request.yearMap.get("Yc12")}</li><li>${request.yearMap.get("Yd12")}</li><li>${null eq request.starMap.get("Y12")?"&nbsp":request.starMap.get("Y12")}</li><li>${request.year12}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya11")}</li><li>${request.yearMap.get("Yb11")}</li><li>${request.yearMap.get("Yc11")}</li><li>${request.yearMap.get("Yd11")}</li><li>${null eq request.starMap.get("Y11")?"&nbsp":request.starMap.get("Y11")}</li><li>${request.year11}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya10")}</li><li>${request.yearMap.get("Yb10")}</li><li>${request.yearMap.get("Yc10")}</li><li>${request.yearMap.get("Yd10")}</li><li>${null eq request.starMap.get("Y10")?"&nbsp":request.starMap.get("Y10")}</li><li>${request.year10}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya9")}</li><li>${request.yearMap.get("Yb9")}</li><li>${request.yearMap.get("Yc9")}</li><li>${request.yearMap.get("Yd9")}</li><li>${null eq request.starMap.get("Y9")?"&nbsp":request.starMap.get("Y9")}</li><li>${request.year9}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya8")}</li><li>${request.yearMap.get("Yb8")}</li><li>${request.yearMap.get("Yc8")}</li><li>${request.yearMap.get("Yd8")}</li><li>${null eq request.starMap.get("Y8")?"&nbsp":request.starMap.get("Y8")}</li><li>${request.year8}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya7")}</li><li>${request.yearMap.get("Yb7")}</li><li>${request.yearMap.get("Yc7")}</li><li>${request.yearMap.get("Yd7")}</li><li>${null eq request.starMap.get("Y7")?"&nbsp":request.starMap.get("Y7")}</li><li>${request.year7}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya6")}</li><li>${request.yearMap.get("Yb6")}</li><li>${request.yearMap.get("Yc6")}</li><li>${request.yearMap.get("Yd6")}</li><li>${null eq request.starMap.get("Y6")?"&nbsp":request.starMap.get("Y6")}</li><li>${request.year6}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya5")}</li><li>${request.yearMap.get("Yb5")}</li><li>${request.yearMap.get("Yc5")}</li><li>${request.yearMap.get("Yd5")}</li><li>${null eq request.starMap.get("Y5")?"&nbsp":request.starMap.get("Y5")}</li><li>${request.year5}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya4")}</li><li>${request.yearMap.get("Yb4")}</li><li>${request.yearMap.get("Yc4")}</li><li>${request.yearMap.get("Yd4")}</li><li>${null eq request.starMap.get("Y4")?"&nbsp":request.starMap.get("Y4")}</li><li>${request.year4}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya3")}</li><li>${request.yearMap.get("Yb3")}</li><li>${request.yearMap.get("Yc3")}</li><li>${request.yearMap.get("Yd3")}</li><li>${null eq request.starMap.get("Y3")?"&nbsp":request.starMap.get("Y3")}</li><li>${request.year3}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya2")}</li><li>${request.yearMap.get("Yb2")}</li><li>${request.yearMap.get("Yc2")}</li><li>${request.yearMap.get("Yd2")}</li><li>${null eq request.starMap.get("Y2")?"&nbsp":request.starMap.get("Y2")}</li><li>${request.year2}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("Ya1")}</li><li>${request.yearMap.get("Yb1")}</li><li>${request.yearMap.get("Yc1")}</li><li>${request.yearMap.get("Yd1")}</li><li>${null eq request.starMap.get("Y1")?"&nbsp":request.starMap.get("Y1")}</li><li>${request.year1}</li><li>&nbsp</li></ul></td>
			<td class="borderLeft"><ul><li>${request.yearMap.get("YaR1")}</li><li>${request.yearMap.get("YbR1")}</li><li>${request.yearMap.get("YcR1")}</li><li>${request.yearMap.get("YdR1")}</li><li>&nbsp</li><li>${request.year12}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("YaR2")}</li><li>${request.yearMap.get("YbR2")}</li><li>${request.yearMap.get("YcR2")}</li><li>${request.yearMap.get("YdR2")}</li><li>&nbsp</li><li>${request.year11}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.yearMap.get("YaR3")}</li><li>${request.yearMap.get("YbR3")}</li><li>${request.yearMap.get("YcR3")}</li><li>${request.yearMap.get("YdR3")}</li><li>&nbsp</li><li>${request.year10}</li><li>&nbsp</li></ul></td>
			<td class="item"><ul><li>年</li></ul></td>
			</tr>
			<tr>
			<td><ul class="days"><li>${request.monthMap.get("MaL3")}</li><li>${request.monthMap.get("MbL3")}</li><li>${request.monthMap.get("McL3")}</li><li>${request.monthMap.get("MdL3")}</li><li>&nbsp</li><li>${request.month9}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("MaL2")}</li><li>${request.monthMap.get("MbL2")}</li><li>${request.monthMap.get("McL2")}</li><li>${request.monthMap.get("MdL2")}</li><li>&nbsp</li><li>${request.month8}</li><li>&nbsp</li></ul></td>
			<td class="borderRight"><ul><li>${request.monthMap.get("MaL1")}</li><li>${request.monthMap.get("MbL1")}</li><li>${request.monthMap.get("McL1")}</li><li>${request.monthMap.get("MdL1")}</li><li>&nbsp</li><li>${request.month7}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma18")}</li><li>${request.monthMap.get("Mb18")}</li><li>${request.monthMap.get("Mc18")}</li><li>${request.monthMap.get("Md18")}</li><li>${null eq request.starMap.get("M18")?"&nbsp":request.starMap.get("M18")}</li><li>${request.month18}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma17")}</li><li>${request.monthMap.get("Mb17")}</li><li>${request.monthMap.get("Mc17")}</li><li>${request.monthMap.get("Md17")}</li><li>${null eq request.starMap.get("M17")?"&nbsp":request.starMap.get("M17")}</li><li>${request.month17}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma16")}</li><li>${request.monthMap.get("Mb16")}</li><li>${request.monthMap.get("Mc16")}</li><li>${request.monthMap.get("Md16")}</li><li>${null eq request.starMap.get("M16")?"&nbsp":request.starMap.get("M16")}</li><li>${request.month16}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma15")}</li><li>${request.monthMap.get("Mb15")}</li><li>${request.monthMap.get("Mc15")}</li><li>${request.monthMap.get("Md15")}</li><li>${null eq request.starMap.get("M15")?"&nbsp":request.starMap.get("M15")}</li><li>${request.month15}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma14")}</li><li>${request.monthMap.get("Mb14")}</li><li>${request.monthMap.get("Mc14")}</li><li>${request.monthMap.get("Md14")}</li><li>${null eq request.starMap.get("M14")?"&nbsp":request.starMap.get("M14")}</li><li>${request.month14}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma13")}</li><li>${request.monthMap.get("Mb13")}</li><li>${request.monthMap.get("Mc13")}</li><li>${request.monthMap.get("Md13")}</li><li>${null eq request.starMap.get("M13")?"&nbsp":request.starMap.get("M13")}</li><li>${request.month13}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma12")}</li><li>${request.monthMap.get("Mb12")}</li><li>${request.monthMap.get("Mc12")}</li><li>${request.monthMap.get("Md12")}</li><li>${null eq request.starMap.get("M12")?"&nbsp":request.starMap.get("M12")}</li><li>${request.month12}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma11")}</li><li>${request.monthMap.get("Mb11")}</li><li>${request.monthMap.get("Mc11")}</li><li>${request.monthMap.get("Md11")}</li><li>${null eq request.starMap.get("M11")?"&nbsp":request.starMap.get("M11")}</li><li>${request.month11}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma10")}</li><li>${request.monthMap.get("Mb10")}</li><li>${request.monthMap.get("Mc10")}</li><li>${request.monthMap.get("Md10")}</li><li>${null eq request.starMap.get("M10")?"&nbsp":request.starMap.get("M10")}</li><li>${request.month10}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma9")}</li><li>${request.monthMap.get("Mb9")}</li><li>${request.monthMap.get("Mc9")}</li><li>${request.monthMap.get("Md9")}</li><li>${null eq request.starMap.get("M9")?"&nbsp":request.starMap.get("M9")}</li><li>${request.month9}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma8")}</li><li>${request.monthMap.get("Mb8")}</li><li>${request.monthMap.get("Mc8")}</li><li>${request.monthMap.get("Md8")}</li><li>${null eq request.starMap.get("M8")?"&nbsp":request.starMap.get("M8")}</li><li>${request.month8}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma7")}</li><li>${request.monthMap.get("Mb7")}</li><li>${request.monthMap.get("Mc7")}</li><li>${request.monthMap.get("Md7")}</li><li>${null eq request.starMap.get("M7")?"&nbsp":request.starMap.get("M7")}</li><li>${request.month7}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma6")}</li><li>${request.monthMap.get("Mb6")}</li><li>${request.monthMap.get("Mc6")}</li><li>${request.monthMap.get("Md6")}</li><li>${null eq request.starMap.get("M6")?"&nbsp":request.starMap.get("M6")}</li><li>${request.month6}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma5")}</li><li>${request.monthMap.get("Mb5")}</li><li>${request.monthMap.get("Mc5")}</li><li>${request.monthMap.get("Md5")}</li><li>${null eq request.starMap.get("M5")?"&nbsp":request.starMap.get("M5")}</li><li>${request.month5}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma4")}</li><li>${request.monthMap.get("Mb4")}</li><li>${request.monthMap.get("Mc4")}</li><li>${request.monthMap.get("Md4")}</li><li>${null eq request.starMap.get("M4")?"&nbsp":request.starMap.get("M4")}</li><li>${request.month4}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma3")}</li><li>${request.monthMap.get("Mb3")}</li><li>${request.monthMap.get("Mc3")}</li><li>${request.monthMap.get("Md3")}</li><li>${null eq request.starMap.get("M3")?"&nbsp":request.starMap.get("M3")}</li><li>${request.month3}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma2")}</li><li>${request.monthMap.get("Mb2")}</li><li>${request.monthMap.get("Mc2")}</li><li>${request.monthMap.get("Md2")}</li><li>${null eq request.starMap.get("M2")?"&nbsp":request.starMap.get("M2")}</li><li>${request.month2}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("Ma1")}</li><li>${request.monthMap.get("Mb1")}</li><li>${request.monthMap.get("Mc1")}</li><li>${request.monthMap.get("Md1")}</li><li>${null eq request.starMap.get("M1")?"&nbsp":request.starMap.get("M1")}</li><li>${request.month1}</li><li>&nbsp</li></ul></td>
			<td class="borderLeft"><ul><li>${request.monthMap.get("MaR1")}</li><li>${request.monthMap.get("MbR1")}</li><li>${request.monthMap.get("McR1")}</li><li>${request.monthMap.get("MdR1")}</li><li>&nbsp</li><li>${request.month12}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("MaR2")}</li><li>${request.monthMap.get("MbR2")}</li><li>${request.monthMap.get("McR2")}</li><li>${request.monthMap.get("MdR2")}</li><li>&nbsp</li><li>${request.month11}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.monthMap.get("MaR3")}</li><li>${request.monthMap.get("MbR3")}</li><li>${request.monthMap.get("McR3")}</li><li>${request.monthMap.get("MdR3")}</li><li>&nbsp</li><li>${request.month10}</li><li>&nbsp</li></ul></td>
			<td class="item"><ul><li>月</li></ul></td>
			</tr>
			<tr>
			<td><ul class="days"><li>${request.dayMap.get("DaL3")}</li><li>${request.dayMap.get("DbL3")}</li><li>${request.dayMap.get("DcL3")}</li><li>${request.dayMap.get("DdL3")}</li><li>&nbsp</li><li>${request.day9}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("DaL2")}</li><li>${request.dayMap.get("DbL2")}</li><li>${request.dayMap.get("DcL2")}</li><li>${request.dayMap.get("DdL2")}</li><li>&nbsp</li><li>${request.day8}</li><li>&nbsp</li></ul></td>
			<td class="borderRight"><ul><li>${request.dayMap.get("DaL1")}</li><li>${request.dayMap.get("DbL1")}</li><li>${request.dayMap.get("DcL1")}</li><li>${request.dayMap.get("DdL1")}</li><li>&nbsp</li><li>${request.day7}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da18")}</li><li>${request.dayMap.get("Db18")}</li><li>${request.dayMap.get("Dc18")}</li><li>${request.dayMap.get("Dd18")}</li><li>${null eq request.starMap.get("D18")?"&nbsp":request.starMap.get("D18")}</li><li>${request.day18}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da17")}</li><li>${request.dayMap.get("Db17")}</li><li>${request.dayMap.get("Dc17")}</li><li>${request.dayMap.get("Dd17")}</li><li>${null eq request.starMap.get("D17")?"&nbsp":request.starMap.get("D17")}</li><li>${request.day17}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da16")}</li><li>${request.dayMap.get("Db16")}</li><li>${request.dayMap.get("Dc16")}</li><li>${request.dayMap.get("Dd16")}</li><li>${null eq request.starMap.get("D16")?"&nbsp":request.starMap.get("D16")}</li><li>${request.day16}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da15")}</li><li>${request.dayMap.get("Db15")}</li><li>${request.dayMap.get("Dc15")}</li><li>${request.dayMap.get("Dd15")}</li><li>${null eq request.starMap.get("D15")?"&nbsp":request.starMap.get("D15")}</li><li>${request.day15}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da14")}</li><li>${request.dayMap.get("Db14")}</li><li>${request.dayMap.get("Dc14")}</li><li>${request.dayMap.get("Dd14")}</li><li>${null eq request.starMap.get("D14")?"&nbsp":request.starMap.get("D14")}</li><li>${request.day14}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da13")}</li><li>${request.dayMap.get("Db13")}</li><li>${request.dayMap.get("Dc13")}</li><li>${request.dayMap.get("Dd13")}</li><li>${null eq request.starMap.get("D13")?"&nbsp":request.starMap.get("D13")}</li><li>${request.day13}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da12")}</li><li>${request.dayMap.get("Db12")}</li><li>${request.dayMap.get("Dc12")}</li><li>${request.dayMap.get("Dd12")}</li><li>${null eq request.starMap.get("D12")?"&nbsp":request.starMap.get("D12")}</li><li>${request.day12}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da11")}</li><li>${request.dayMap.get("Db11")}</li><li>${request.dayMap.get("Dc11")}</li><li>${request.dayMap.get("Dd11")}</li><li>${null eq request.starMap.get("D11")?"&nbsp":request.starMap.get("D11")}</li><li>${request.day11}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da10")}</li><li>${request.dayMap.get("Db10")}</li><li>${request.dayMap.get("Dc10")}</li><li>${request.dayMap.get("Dd10")}</li><li>${null eq request.starMap.get("D10")?"&nbsp":request.starMap.get("D10")}</li><li>${request.day10}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da9")}</li><li>${request.dayMap.get("Db9")}</li><li>${request.dayMap.get("Dc9")}</li><li>${request.dayMap.get("Dd9")}</li><li>${null eq request.starMap.get("D9")?"&nbsp":request.starMap.get("D9")}</li><li>${request.day9}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da8")}</li><li>${request.dayMap.get("Db8")}</li><li>${request.dayMap.get("Dc8")}</li><li>${request.dayMap.get("Dd8")}</li><li>${null eq request.starMap.get("D8")?"&nbsp":request.starMap.get("D8")}</li><li>${request.day8}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da7")}</li><li>${request.dayMap.get("Db7")}</li><li>${request.dayMap.get("Dc7")}</li><li>${request.dayMap.get("Dd7")}</li><li>${null eq request.starMap.get("D7")?"&nbsp":request.starMap.get("D7")}</li><li>${request.day7}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da6")}</li><li>${request.dayMap.get("Db6")}</li><li>${request.dayMap.get("Dc6")}</li><li>${request.dayMap.get("Dd6")}</li><li>${null eq request.starMap.get("D6")?"&nbsp":request.starMap.get("D6")}</li><li>${request.day6}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da5")}</li><li>${request.dayMap.get("Db5")}</li><li>${request.dayMap.get("Dc5")}</li><li>${request.dayMap.get("Dd5")}</li><li>${null eq request.starMap.get("D5")?"&nbsp":request.starMap.get("D5")}</li><li>${request.day5}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da4")}</li><li>${request.dayMap.get("Db4")}</li><li>${request.dayMap.get("Dc4")}</li><li>${request.dayMap.get("Dd4")}</li><li>${null eq request.starMap.get("D4")?"&nbsp":request.starMap.get("D4")}</li><li>${request.day4}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da3")}</li><li>${request.dayMap.get("Db3")}</li><li>${request.dayMap.get("Dc3")}</li><li>${request.dayMap.get("Dd3")}</li><li>${null eq request.starMap.get("D3")?"&nbsp":request.starMap.get("D3")}</li><li>${request.day3}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da2")}</li><li>${request.dayMap.get("Db2")}</li><li>${request.dayMap.get("Dc2")}</li><li>${request.dayMap.get("Dd2")}</li><li>${null eq request.starMap.get("D2")?"&nbsp":request.starMap.get("D2")}</li><li>${request.day2}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("Da1")}</li><li>${request.dayMap.get("Db1")}</li><li>${request.dayMap.get("Dc1")}</li><li>${request.dayMap.get("Dd1")}</li><li>${null eq request.starMap.get("D1")?"&nbsp":request.starMap.get("D1")}</li><li>${request.day1}</li><li>&nbsp</li></ul></td>
			<td class="borderLeft"><ul><li>${request.dayMap.get("DaR1")}</li><li>${request.dayMap.get("DbR1")}</li><li>${request.dayMap.get("DcR1")}</li><li>${request.dayMap.get("DdR1")}</li><li>&nbsp</li><li>${request.day12}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("DaR2")}</li><li>${request.dayMap.get("DbR2")}</li><li>${request.dayMap.get("DcR2")}</li><li>${request.dayMap.get("DdR2")}</li><li>&nbsp</li><li>${request.day11}</li><li>&nbsp</li></ul></td>
			<td><ul class="days"><li>${request.dayMap.get("DaR3")}</li><li>${request.dayMap.get("DbR3")}</li><li>${request.dayMap.get("DcR3")}</li><li>${request.dayMap.get("DdR3")}</li><li>&nbsp</li><li>${request.day10}</li><li>&nbsp</li></ul></td>
			<td class="item"><ul><li>日</li></ul></td>
			</tr>
			<!--<tr>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			<td><ul class="days"><li>9</li></ul></td>
			</tr> -->
		</table>
	</div>
</div>