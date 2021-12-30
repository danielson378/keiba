<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- タイプ宣言はHTML5のものを使用する -->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ログイン</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/body.css"/>
<script type="text/javascript">
</script>
</head>
<body>
<div class="container">
	<section id="content">
		<s:form action="loginEntry">
			<h1>ログイン</h1>
			<div>
				<input type="text" placeholder="ユーザID" required="" id="username" name="username"/>
			</div>
			<div>
				<input type="password" placeholder="パスワード" required="" id="password" name="password"/>
			</div>
			<div class="">
				<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>
			</div>
			<div>
				<!-- <input type="submit" value="Log in" /> -->
				<input type="submit" value="ログイン" class="btn btn-primary" id="js-btn-login" onclick="value_seting()"/>
				<a href="#">パスワードを忘れた場合?</a>
				<!-- <a href="#">Register</a> -->
			</div>
		 </s:form><!-- form -->

<%-- 		 <c:if test="${session.errMsg!=null}"> --%>
		 <c:if test="${request.errMsg!=null}">
			 <div class="button">
				<span class="help-block u-errormessage" id="js-server-helpinfo" style="color: red;"> ${request.errMsg}</span>
			</div>
		 </c:if>
	</section><!-- content -->
</div>
<!-- container -->


<br><br><br><br>
<div style="text-align:center;">
</div>
</body>
</html>