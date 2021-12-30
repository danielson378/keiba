<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>騎手番号入力</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/reset.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/base.css">

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/parts.css">
<!-- component ver.3 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/parts_ver3.css">


<style type="text/css">
	#div0{width:100%; height:80%; }
	#div2{width:100%; height:100%; text-align:center}
</style>

</head>

<div id="calendar_box">
	<div id="calendar_detailed">
		<!-- request�L���� -->
		<table class="tableCalendar">
			<!-- 項番 -->
			<br>
			<br>
			<br>
			<br>
			<br>
			<div id = "div0">
				<div id = "div2"><font size=5>騎手番号入力</font></div>
			</div>

			<thead>

				<tr>
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
				<th class="tRed01">7</th>
				<th>6</th>
				<th>5</th>
				<th>4</th>
				<th>3</th>
				<th>2</th>
				<th class="tBlue01">1</th>
				<th></th>
				</tr>
			</thead>
			<tr>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td><input type="text" id="name" name="name" required minlength="4" maxlength="8" size="3"></td>
			<td class="item"><ul><li>番号</li></ul></td>
			</tr>

		</table>
	</div>
</div>