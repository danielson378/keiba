<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="org.apache.struts2.ServletActionContext"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>

<%
// HttpServletRequest request = ServletActionContext.getRequest();
	String dateStr = (String) request.getAttribute("dateStr");

	String yearStr = dateStr.substring(0, 4);
	String monthStr = dateStr.substring(4, 6);

	int year = Integer.parseInt(yearStr);
	int month = Integer.parseInt(monthStr);

//-----------------------------------------------------------------
	SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd");

	Date date =sdf.parse(dateStr);

	Calendar cal = Calendar.getInstance();

	cal.setTime(date);
	cal.add(cal.MONTH, -1);
	Date lastMonthDate = cal.getTime();
	String lastMonth = sdf.format(lastMonthDate);

	cal.setTime(date);
	cal.add(cal.MONTH,+1);
	Date nestMonthDate = cal.getTime();
	String nestMonth = sdf.format(nestMonthDate);
//-----------------------------------------------------------------

// 	int year = (int)request.getAttribute("yy");
// 	int month = (int)request.getAttribute("mm");
%>

<!-- タイプ宣言はHTML5のものを使用する -->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Top</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/buttons.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/reset.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/base.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/base_rwd.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts_rwd.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/font.css">

<!-- component ver.2 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts_ver2.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts_ver2_rwd.css">
<!-- component ver.3 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts_ver3.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts_ver3_rwd.css">

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/holdings.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/holdings_rwd.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/form.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/form_rwd.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/calendar/parts_assist.css">

<style>
div#box {
	width: 600px;
	margin-left: auto;
	margin-right: auto;
}

div#ichikawa {
	position: relative;
	float: left;
}

div#ichikawa>a {
	width: 252px
}

div#motoyawata {
	position: relative;
	float: right;
}

#calendar_detailed {
	margin: 0 auto;
	width: 100%;
	height: auto;
}

div#month_select {
	margin: 0 auto;
	width: 100%;
	height: auto;
}

#month {
	float: left;
	margin: 0 auto;
	width:93px;
	padding-right: 10px;
	padding-left: 10px;
}

#last_month, #nest_month {
	float: left;
	border: 1px solid #b6b6b6;
	padding-right: 5px;
	padding-left: 5px;
	background-color:#f3f3f3;
}

div#calendar_box {
	margin: 0 auto;
	width: 80%;
	height: auto;
	margin-top: 30px; /*此处讲解margin的用法，设置content与上面header元素之间的距离*/
}

#container {
	margin: 0 auto;
	width: 80%;
	height: auto;
}
</style>
<script type="text/javascript">
function lastMonth() {
	<%

	%>
}
</script>
</head>
<body>
lastMonth=<%=lastMonth %>
<br>
nestMonth=<%=nestMonth %>
	<div id="container">
		<s:form action="to_top">
			<input type="hidden" name="year" value=>
			<div class="menu">
				<section id="content">
					<div id="box">
						<div style="height: 20px"></div>
						<div id="ichikawa">
							<a href="" class="button button-royal button-pill button-giant"
								name="ichikawa">売上</a>
						</div>
						<div id="motoyawata">
							<a href="" class="button button-royal button-pill button-giant"
								name="motoyawata">本八幡店</a>
						</div>
						<div class="">
							<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>
						</div>
					</div>

				</section>
				<!-- content -->
			</div>
			<br>
			<br>
			<br>
			<div id="month_select">
				<div id="last_month">
<!-- 					<a href="to_top" class="" name="lastMonth">◀</a> -->
					<button type="submit" name="date" value=<%=lastMonth %>>◀</button>
				</div>
				<div id="month">
					<p class="fsMaximum tBold"><%=year %>年<%=month %>月</p>
				</div>
				<div id="nest_month">
<!-- 					<a href="to_top" class="" name="nestMonth">▶</a> -->
					<button type="submit" name="date" value=<%=nestMonth %>>▶</button>

				</div>
			</div>
			<div id="calendar_box">
				<div id="calendar_detailed">
					<!-- request可有可無し -->
					${request.calendar}
				</div>
			</div>
		</s:form>
		<!-- form -->
	</div>
	<!-- container -->
</body>
</html>