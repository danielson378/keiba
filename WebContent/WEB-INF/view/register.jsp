<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- タイプ宣言はHTML5のものを使用する -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>騎手登録画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/body.css" />
<script type="text/javascript">

</script>
</head>
<body>
	<!-- 入力フォームはStruts2のタグを使用します -->
	<s:form action="register" method="post" namespace="/">
		<s:actionmessage />
		<s:textfield name="id" label="ID" required="true" />
		<s:textfield name="name" label="名前" required="true" />
		<s:textfield name="birthday" label="誕生日" placeholder="例:1990/07/10"
			required="true" />
		<s:submit value="実行" />
	</s:form>
	<c:if test="${request.msg!=null}">
		<div>
			<span class="help-block u-errormessage" id="js-server-helpinfo"
				style="color: red;"> ${request.msg}</span>
		</div>
	</c:if>
</body>
</html>