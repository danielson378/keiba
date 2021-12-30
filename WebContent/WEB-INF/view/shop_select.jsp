<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- タイプ宣言はHTML5のものを使用する -->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>店舗選択</title>
<link rel="stylesheet" type="text/css" href="css/buttons.css" />

<style>
	div#box{
		width: 600px; margin-left: auto; margin-right: auto;
	}
 	div#ichikawa{
 		position:relative; float:left;
 	}
 	div#ichikawa > a{
 		width:252px}
 	div#motoyawata{
 		position:relative; float:right;
 	}
</style>
<script type="text/javascript">
</script>
</head>
<body>
<div class="container">
	<section id="content">
		<s:form action="to_top">
			<div id="box">
				<div style="height:100px"></div>
				<div id="ichikawa">
					<!--a标签执行action，直接把action名写在href里 -->
					<a href="to_top" class="button button-royal button-pill button-giant" name="ichikawa">市川店</a>
				</div>
				<div id="motoyawata">
					<a href="to_top" class="button button-royal button-pill button-giant" name="motoyawata">本八幡店</a>
				</div>
				 <div class="">
					<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>			</div>
				<div>

			</div>
		 </s:form><!-- form -->
	</section><!-- content -->
</div>
<!-- container -->


<br><br><br><br>
<div style="text-align:center;">
</div>
</body>
</html>