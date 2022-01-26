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

<script type="text/javascript">

function nameSelect() {
	   var d = document.forms[0];
	    d.action="nameSelect";
	    d.submit();

}
</script>
</head>

<div id="calendar_box">
	<div id="calendar_detailed">
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
			<td><input type="text" id="user18" name="user18" required maxlength="3" size="3" value="${request.user18}" pattern=[0-9]*></td>
			<td><input type="text" id="user17" name="user17" required maxlength="3" size="3" value="${request.user17}"></td>
			<td><input type="text" id="user16" name="user16" required maxlength="3" size="3" value="${request.user16}"></td>
			<td><input type="text" id="user15" name="user15" required maxlength="3" size="3" value="${request.user15}"></td>
			<td><input type="text" id="user14" name="user14" required maxlength="3" size="3" value="${request.user14}"></td>
			<td><input type="text" id="user13" name="user13" required maxlength="3" size="3" value="${request.user13}"></td>
			<td><input type="text" id="user12" name="user12" required maxlength="3" size="3" value="${request.user12}"></td>
			<td><input type="text" id="user11" name="user11" required maxlength="3" size="3" value="${request.user11}"></td>
			<td><input type="text" id="user10" name="user10" required maxlength="3" size="3" value="${request.user10}"></td>
			<td><input type="text" id="user9" name="user9" required maxlength="3" size="3" value="${request.user9}"></td>
			<td><input type="text" id="user8" name="user8" required maxlength="3" size="3" value="${request.user8}"></td>
			<td><input type="text" id="user7" name="user7" required maxlength="3" size="3" value="${request.user7}"></td>
			<td><input type="text" id="user6" name="user6" required maxlength="3" size="3" value="${request.user6}"></td>
			<td><input type="text" id="user5" name="user5" required maxlength="3" size="3" value="${request.user5}"></td>
			<td><input type="text" id="user4" name="user4" required maxlength="3" size="3" value="${request.user4}"></td>
			<td><input type="text" id="user3" name="user3" required maxlength="3" size="3" value="${request.user3}"></td>
			<td><input type="text" id="user2" name="user2" required maxlength="3" size="3" value="${request.user2}"></td>
			<td><input type="text" id="user1" name="user1" required maxlength="3" size="3" value="${request.user1}"></td>
			<td class="item"><ul><li>番号</li></ul></td>
			</tr>

			<tr>
			<td><ul><li>&nbsp</li><li>${request.user18Name1}</li><li>${request.user18Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user17Name1}</li><li>${request.user17Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user16Name1}</li><li>${request.user16Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user15Name1}</li><li>${request.user15Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user14Name1}</li><li>${request.user14Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user13Name1}</li><li>${request.user13Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user12Name1}</li><li>${request.user12Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user11Name1}</li><li>${request.user11Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user10Name1}</li><li>${request.user10Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user9Name1}</li><li>${request.user9Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user8Name1}</li><li>${request.user8Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user7Name1}</li><li>${request.user7Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user6Name1}</li><li>${request.user6Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user5Name1}</li><li>${request.user5Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user4Name1}</li><li>${request.user4Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user3Name1}</li><li>${request.user3Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user2Name1}</li><li>${request.user2Name2}</li></ul></td>
			<td><ul><li>&nbsp</li><li>${request.user1Name1}</li><li>${request.user1Name2}</li></ul></td>
			<td class="item"><ul><li>氏名</li></ul></td>
			</tr>

			<tr>
			<td><input type="text" id="house18" name="house18" maxlength="5" size="5" value="${request.house18}"></td>
			<td><input type="text" id="house17" name="house17" maxlength="5" size="5" value="${request.house17}"></td>
			<td><input type="text" id="house16" name="house16" maxlength="5" size="5" value="${request.house16}"></td>
			<td><input type="text" id="house15" name="house15" maxlength="5" size="5" value="${request.house15}"></td>
			<td><input type="text" id="house14" name="house14" maxlength="5" size="5" value="${request.house14}"></td>
			<td><input type="text" id="house13" name="house13" maxlength="5" size="5" value="${request.house13}"></td>
			<td><input type="text" id="house12" name="house12" maxlength="5" size="5" value="${request.house12}"></td>
			<td><input type="text" id="house11" name="house11" maxlength="5" size="5" value="${request.house11}"></td>
			<td><input type="text" id="house10" name="house10" maxlength="5" size="5" value="${request.house10}"></td>
			<td><input type="text" id="house9" name="house9" maxlength="5" size="5" value="${request.house9}"></td>
			<td><input type="text" id="house8" name="house8" maxlength="5" size="5" value="${request.house8}"></td>
			<td><input type="text" id="house7" name="house7" maxlength="5" size="5" value="${request.house7}"></td>
			<td><input type="text" id="house6" name="house6" maxlength="5" size="5" value="${request.house6}"></td>
			<td><input type="text" id="house5" name="house5" maxlength="5" size="5" value="${request.house5}"></td>
			<td><input type="text" id="house4" name="house4" maxlength="5" size="5" value="${request.house4}"></td>
			<td><input type="text" id="house3" name="house3" maxlength="5" size="5" value="${request.house3}"></td>
			<td><input type="text" id="house2" name="house2" maxlength="5" size="5" value="${request.house2}"></td>
			<td><input type="text" id="house1" name="house1" maxlength="5" size="5" value="${request.house1}"></td>
			<td class="item"><ul><li>馬名</li></ul></td>
			</tr>

			<div>
				<!-- <input type="submit" value="Log in" /> -->
				<input type="submit" value="実行" class="btn btn-primary" id="js-btn-login" onclick="value_seting()"/>
				<input type="button" value="一覧" class="btn btn-primary" id="js-btn-login" onclick="nameSelect()"/>
			</div>
			<div>
			</div>
		</s:form><!-- form -->
	</div>
</div>
			<div id = "div0">
				<div>
					<a href="toRegister.action" >騎手登録</a>
				</div>
				<div>
					<a href="jockeyInfo.action" >騎手情報</a>
				</div>
			</div>
		 <c:if test="${request.errMsg!=null}">
			 <div>
				<span class="help-block u-errormessage" id="js-server-helpinfo" style="color: red;"> ${request.errMsg}</span>
			</div>
		 </c:if>
