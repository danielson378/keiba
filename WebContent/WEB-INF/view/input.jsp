<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>騎手番号入力</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/reset.css">
<%-- <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/base.css"> --%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/parts.css">
<!-- component ver.3 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/input/parts_ver3.css">
<!-- <link rel="stylesheet" type="text/css" href="css/style2.css"> -->

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/button/style.css">
<!-- <link rel="stylesheet" type="text/css" href="css/style.css" /> -->
<link rel="stylesheet" type="text/css" href="css/body.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/input.js"></script>


<style type="text/css">
	#div0{width:100%; height:80%; }
	#div2{width:100%; height:100%; text-align:center}

    .vertical {
        writing-mode: vertical-rl;
        text-orientation: upright;
        vertical-align: middle;
        text-align: left;
    }
    div.ex {color:#ffffff}
</style>

<script type="text/javascript">

// function nameSelect() {
// 	   var d = document.forms[0];
// 	    d.action="nameSelect";
// 	    d.submit();
// }

// function showName(num){
// 	if (num == "horse18") {
// 		var x = document.getElementById('house18');
// 		console.log(x);
// 		document.getElementById(num).innerHTML = x.value;
// 	}
// }

</script>
</head>

<div id="calendar_box">
	<div id="calendar_detailed">
		<s:form action="process" class="tableCalendar" name="myForm">
			<!-- 項番 -->
			<br>
			<br>
			<div id = "div0">
				<div id = "div2" class="ex"><font size=6>騎手番号入力</font></div>
			</div>
			<br>
			<br>
			<thead>

				<tr>
				<th class="tRed01">18</th>
				<th class="tRed01">17</th>
				<th class="tRed01">16</th>
				<th class="tRed01">15</th>
				<th class="tRed01">14</th>
				<th class="tRed01">13</th>
				<th class="tRed01">12</th>
				<th class="tRed01">11</th>
				<th class="tRed01">10</th>
				<th class="tRed01">9</th>
				<th class="tRed01">8</th>
<!-- 				<th class="tRed01">7</th> -->
				<th class="tRed01">7</th>
				<th class="tRed01">6</th>
				<th class="tRed01">5</th>
				<th class="tRed01">4</th>
				<th class="tRed01">3</th>
				<th class="tRed01">2</th>
<!-- 				<th class="tBlue01">1</th> -->
				<th class="tRed01">1</th>
				<th></th>
				</tr>
			</thead>

			<tr>
			<td><input type="text" id="user18" name="user18" maxlength="3" size="3" value="${request.user18}"></td>
			<td><input type="text" id="user17" name="user17" maxlength="3" size="3" value="${request.user17}"></td>
			<td><input type="text" id="user16" name="user16" maxlength="3" size="3" value="${request.user16}"></td>
			<td><input type="text" id="user15" name="user15" maxlength="3" size="3" value="${request.user15}"></td>
			<td><input type="text" id="user14" name="user14" maxlength="3" size="3" value="${request.user14}"></td>
			<td><input type="text" id="user13" name="user13" maxlength="3" size="3" value="${request.user13}"></td>
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

				<input type="hidden" id="user18Name1" name="user18Name1"  value="${request.user18Name1}">
				<input type="hidden" id="user17Name1" name="user17Name1"  value="${request.user17Name1}">
				<input type="hidden" id="user16Name1" name="user16Name1"  value="${request.user16Name1}">
				<input type="hidden" id="user15Name1" name="user15Name1"  value="${request.user15Name1}">
				<input type="hidden" id="user14Name1" name="user14Name1"  value="${request.user14Name1}">
				<input type="hidden" id="user13Name1" name="user13Name1"  value="${request.user13Name1}">
				<input type="hidden" id="user12Name1" name="user12Name1"  value="${request.user12Name1}">
				<input type="hidden" id="user11Name1" name="user11Name1"  value="${request.user11Name1}">
				<input type="hidden" id="user10Name1" name="user10Name1"  value="${request.user10Name1}">
				<input type="hidden" id="user9Name1" name="user9Name1"  value="${request.user9Name1}">
				<input type="hidden" id="user8Name1" name="user8Name1"  value="${request.user8Name1}">
				<input type="hidden" id="user7Name1" name="user7Name1"  value="${request.user7Name1}">
				<input type="hidden" id="user6Name1" name="user6Name1"  value="${request.user6Name1}">
				<input type="hidden" id="user5Name1" name="user5Name1"  value="${request.user5Name1}">
				<input type="hidden" id="user4Name1" name="user4Name1"  value="${request.user4Name1}">
				<input type="hidden" id="user3Name1" name="user3Name1"  value="${request.user3Name1}">
				<input type="hidden" id="user2Name1" name="user2Name1"  value="${request.user2Name1}">
				<input type="hidden" id="user1Name1" name="user1Name1"  value="${request.user1Name1}">
				<input type="hidden" id="user18Name2" name="user18Name2"  value="${request.user18Name2}">
				<input type="hidden" id="user17Name2" name="user17Name2"  value="${request.user17Name2}">
				<input type="hidden" id="user16Name2" name="user16Name2"  value="${request.user16Name2}">
				<input type="hidden" id="user15Name2" name="user15Name2"  value="${request.user15Name2}">
				<input type="hidden" id="user14Name2" name="user14Name2"  value="${request.user14Name2}">
				<input type="hidden" id="user13Name2" name="user13Name2"  value="${request.user13Name2}">
				<input type="hidden" id="user12Name2" name="user12Name2"  value="${request.user12Name2}">
				<input type="hidden" id="user11Name2" name="user11Name2"  value="${request.user11Name2}">
				<input type="hidden" id="user10Name2" name="user10Name2"  value="${request.user10Name2}">
				<input type="hidden" id="user9Name2" name="user9Name2"  value="${request.user9Name2}">
				<input type="hidden" id="user8Name2" name="user8Name2"  value="${request.user8Name2}">
				<input type="hidden" id="user7Name2" name="user7Name2"  value="${request.user7Name2}">
				<input type="hidden" id="user6Name2" name="user6Name2"  value="${request.user6Name2}">
				<input type="hidden" id="user5Name2" name="user5Name2"  value="${request.user5Name2}">
				<input type="hidden" id="user4Name2" name="user4Name2"  value="${request.user4Name2}">
				<input type="hidden" id="user3Name2" name="user3Name2"  value="${request.user3Name2}">
				<input type="hidden" id="user2Name2" name="user2Name2"  value="${request.user2Name2}">
				<input type="hidden" id="user1Name2" name="user1Name2"  value="${request.user1Name2}">

			<tr>
			<td><input type="text" id="house18" name="house18" maxlength="7" size="3" value="${request.house18}" onchange="showName('horse18')"></td>
			<td><input type="text" id="house17" name="house17" maxlength="5" size="5" value="${request.house17}" onchange="showName('horse17')"></td>
			<td><input type="text" id="house16" name="house16" maxlength="5" size="5" value="${request.house16}" onchange="showName('horse16')"></td>
			<td><input type="text" id="house15" name="house15" maxlength="5" size="5" value="${request.house15}" onchange="showName('horse15')"></td>
			<td><input type="text" id="house14" name="house14" maxlength="5" size="5" value="${request.house14}" onchange="showName('horse14')"></td>
			<td><input type="text" id="house13" name="house13" maxlength="5" size="5" value="${request.house13}" onchange="showName('horse13')"></td>
			<td><input type="text" id="house12" name="house12" maxlength="5" size="5" value="${request.house12}" onchange="showName('horse12')"></td>
			<td><input type="text" id="house11" name="house11" maxlength="5" size="5" value="${request.house11}" onchange="showName('horse11')"></td>
			<td><input type="text" id="house10" name="house10" maxlength="5" size="5" value="${request.house10}" onchange="showName('horse10')"></td>
			<td><input type="text" id="house9" name="house9" maxlength="5" size="5" value="${request.house9}" onchange="showName('horse9')"></td>
			<td><input type="text" id="house8" name="house8" maxlength="5" size="5" value="${request.house8}" onchange="showName('horse8')"></td>
			<td><input type="text" id="house7" name="house7" maxlength="5" size="5" value="${request.house7}" onchange="showName('horse7')"></td>
			<td><input type="text" id="house6" name="house6" maxlength="5" size="5" value="${request.house6}" onchange="showName('horse6')"></td>
			<td><input type="text" id="house5" name="house5" maxlength="5" size="5" value="${request.house5}" onchange="showName('horse5')"></td>
			<td><input type="text" id="house4" name="house4" maxlength="5" size="5" value="${request.house4}" onchange="showName('horse4')"></td>
			<td><input type="text" id="house3" name="house3" maxlength="5" size="5" value="${request.house3}" onchange="showName('horse3')"></td>
			<td><input type="text" id="house2" name="house2" maxlength="5" size="5" value="${request.house2}" onchange="showName('horse2')"></td>
			<td><input type="text" id="house1" name="house1" maxlength="5" size="5" value="${request.house1}" onchange="showName('horse1')"></td>
			<td class="item"><ul><li>馬名</li></ul></td>
			</tr>

			<tr>
			<td class="vertical" id="horse18">${request.house18}</td>
			<td class="vertical" id="horse17">${request.house17}</td>
			<td class="vertical" id="horse16">${request.house16}</td>
			<td class="vertical" id="horse15">${request.house15}</td>
			<td class="vertical" id="horse14">${request.house14}</td>
			<td class="vertical" id="horse13">${request.house13}</td>
			<td class="vertical" id="horse12">${request.house12}</td>
			<td class="vertical" id="horse11">${request.house11}</td>
			<td class="vertical" id="horse10">${request.house10}</td>
			<td class="vertical" id="horse9">${request.house9}</td>
			<td class="vertical" id="horse8">${request.house8}</td>
			<td class="vertical" id="horse7">${request.house7}</td>
			<td class="vertical" id="horse6">${request.house6}</td>
			<td class="vertical" id="horse5">${request.house5}</td>
			<td class="vertical" id="horse4">${request.house4}</td>
			<td class="vertical" id="horse3">${request.house3}</td>
			<td class="vertical" id="horse2">${request.house2}</td>
			<td class="vertical" id="horse1">${request.house1}</td>
			<td class="item"><ul><li>馬名</li></ul></td>
			</tr>

			<div class="divblock">
<!-- 				<input type="submit" value="実行" class="btn btn-primary" id="js-btn-login" onclick="valueSeting()"/> -->
<!-- 				<input type="button" value="一覧" class="btn btn-primary" id="js-btn-login" onclick="nameSelect()"/> -->
<!-- 				<input type="button" value="リセット" class="btn btn-primary" id="js-btn-login" onclick="resetPor()"/> -->
				<input class="button orange" type="submit" value="実行" onclick="valueSeting()"/>
				<input class="button white" type="button" value="一覧" onclick="nameSelect()"/>
				<input class="button white" type="button" value="リセット" onclick="resetPor()"/>
				<a href="toRegister.action" class="button white">騎手登録</a>
				<a href="jockeyInfo.action" class="button white">騎手情報</a>
<%-- 				<s:submit name="method:execute1" value="提交"></s:submit> --%>
<%-- 				<s:submit name="method:execute2" value="提交"></s:submit> --%>
			</div>
		</s:form><!-- form -->
<%-- 		<s:form action="reset"> --%>
<%--         	<s:submit name="method:execute1" value="リセット2"></s:submit> --%>
<%--         </s:form> --%>
	</div>
</div>
<!-- 			<div id = "div0"> -->
<!-- 				<div> -->
<!-- 					<a href="toRegister.action" >騎手登録</a> -->
<!-- 				</div> -->
<!-- 				<div> -->
<!-- 					<a href="jockeyInfo.action" >騎手情報</a> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 				<div class="divblock"> -->
<!-- 					<a href="toRegister.action" class="button white">騎手登録</a> -->
<!-- 					<a href="jockeyInfo.action" class="button white">騎手情報</a> -->
<!-- 				</div> -->

		 <c:if test="${request.errMsg!=null}">
			 <div>
				<span class="help-block u-errormessage" id="js-server-helpinfo" style="color: red;"> ${request.errMsg}</span>
			</div>
		 </c:if>
