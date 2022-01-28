<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>騎手情報一覧</title>
<!-- <link rel="stylesheet" type="text/css" href="css/style.css" /> -->
<!-- <link rel="stylesheet" type="text/css" href="css/body.css"/> -->
<script type="text/javascript">
</script>
</head>
<body bgcolor="#FFFFFF">
	<table border="1">
		<tr>
			<td>ID</td>
			<td>氏名</td>
			<td>年</td>
			<td>月</td>
			<td>日</td>
		</tr>
	<s:iterator value="aryJockeyInfoDto" var="JockeyInfoDto">
		<tr>
			<td><s:property value="#JockeyInfoDto.id"/></td>
			<td><s:property value="#JockeyInfoDto.name"/></td>
			<td><s:property value="#JockeyInfoDto.year"/></td>
			<td><s:property value="#JockeyInfoDto.month"/></td>
			<td><s:property value="#JockeyInfoDto.day"/></td>
		</tr>
	</s:iterator>
	</table>
</body>
</html>