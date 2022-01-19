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

<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/body.css"/>


<style type="text/css">
	#div0{width:100%; height:80%; }
	#div2{width:100%; height:100%; text-align:center}
</style>

</head>

<div id="calendar_box">
	<div id="calendar_detailed">
		<!-- request�L���� -->
<!-- 		<table class="tableCalendar"> -->
		<s:form action="process" class="tableCalendar">
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

			<td><input type="text" id="user18" name="user18" required maxlength="3" size="3"></td>
			<td><input type="text" id="user17" name="user17" required maxlength="3" size="3"></td>
			<td><input type="text" id="user16" name="user16" required maxlength="3" size="3"></td>
			<td><input type="text" id="user15" name="user15" required maxlength="3" size="3"></td>
			<td><input type="text" id="user14" name="user14" required maxlength="3" size="3"></td>
			<td><input type="text" id="user13" name="user13" required maxlength="3" size="3"></td>
			<td><input type="text" id="user12" name="user12" required maxlength="3" size="3"></td>
			<td><input type="text" id="user11" name="user11" required maxlength="3" size="3"></td>
			<td><input type="text" id="user10" name="user10" required maxlength="3" size="3"></td>
			<td><input type="text" id="user9" name="user9" required maxlength="3" size="3"></td>
			<td><input type="text" id="user8" name="user8" required maxlength="3" size="3"></td>
			<td><input type="text" id="user7" name="user7" required maxlength="3" size="3"></td>
			<td><input type="text" id="user6" name="user6" required maxlength="3" size="3"></td>
			<td><input type="text" id="user5" name="user5" required maxlength="3" size="3"></td>
			<td><input type="text" id="user4" name="user4" required maxlength="3" size="3"></td>
			<td><input type="text" id="user3" name="user3" required maxlength="3" size="3"></td>
			<td><input type="text" id="user2" name="user2" required maxlength="3" size="3"></td>
			<td><input type="text" id="user1" name="user1" required maxlength="3" size="3"></td>
			<td class="item"><ul><li>番号</li></ul></td>
			</tr>

				<div>
				<!-- <input type="submit" value="Log in" /> -->
				<input type="submit" value="実行" class="btn btn-primary" id="js-btn-login" onclick="value_seting()"/>
			</div>
			</s:form><!-- form -->
<!-- 		</table> -->
	</div>
</div>
			<div id = "div0">
				<div>
					<a href="toRegister.action" >騎手登録</a>
				</div>
			</div>
		 <c:if test="${request.errMsg!=null}">
			 <div>
				<span class="help-block u-errormessage" id="js-server-helpinfo" style="color: red;"> ${request.errMsg}</span>
			</div>
		 </c:if>
