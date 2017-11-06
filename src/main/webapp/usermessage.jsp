<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="images/favicon.png" />
<!-- Style Sheet-->
<link rel="stylesheet" href="style.css" />
<link rel='stylesheet' id='bootstrap-css-css'
	href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='responsive-css-css'
	href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='pretty-photo-css-css'
	href='css/prettyPhotoaeb9.css?ver=3.1.4' type='text/css' media='all' />
<link rel='stylesheet' id='main-css-css' href='css/main5152.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='custom-css-css'
	href='css/custom5152.html' type='text/css' media='all' />
<script type="text/javascript" src="js/jQuery.min.js"></script>
<link rel="stylesheet" href="css/zerogrid.css">
<link rel="stylesheet" href="css/style.css">
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/menu.css">
<script src="js/jquery1111.min.js" type="text/javascript"></script>
<script src="js/script.js"></script>
<link href="owl-carousel/owl.carousel.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="bootstrap/bootstrap.min.css"/>
<script type="text/javascript" src="bootstrap/bootstrap.min.js"></script>
<title>个人中心</title>
<style type="text/css">
form {
	margin: 0px;
}

td {
	font-size: 12px;
}

h2 {
	margin: 2px
}

li {
	position: relative;
	list-style: none;
}

li:hover #ge {
	display: block;
}

#state {
	display: none;
	position: relative;
	right: -485px;
}

#headimage {
	position: relative;
	right: -550px;
}

#headimg {
	border-radius: 50%;
	width: 100px;
	height: 100px;
	display: block;
	position: relative;
	right: -540px;
}
</style>
<script type="text/javascript">
	function check(form) {
		with (form) {
			if (bookCount.value == "") {
				alert("请输入更新数量！");
				return false;
			}
			if (isNaN(bookCount.value)) {
				alert("格式错误！");
				return false;
			}
			return true;
		}
	}
</script>
<script type="text/javascript">
	$(function() {
		$(".search-tag-line:last").click(function() {
			$(".search-tag-line:last").css("display", "none");
			$("#state").css("display", "block");
			$("#state").attr("value", $("p:first").val);
		})
		$("#state").change(function() {
			$.ajax({
				url : "user_updatestate",
				data : {
					"state" : $("#state").val()
				},
				type : "post",
				success : function(data) {
					$("#state").css("display", "none");
					$(".search-tag-line:last").css("display", "block");
					$(".search-tag-line:last").text(data);
				}
			})
		})
		$("#headimage").css("display", "none");
		$("h3 a").click(function() {
			$("input[type='file']").click();
			// 			alert($("input[type='file']").val());
			$("#headimg").attr("src", $("input[type='file']").val());//图片更改失败
			$("#headimage").css("display", "block");
			return false;
		})
		$("#headimage").submit(function() {
			$("#headimage").css("display", "none");
		})
		$("#logout").click(function() {
			$.ajax({
				url : $("#logout").attr("href"),
				success : function() {
					$("#tdNode").empty();
					$("#tdNode").append("<font>退出成功</font>");
					location.href = "index.jsp";
				}
			})
			return false;
		})
	})
</script>
</head>
<body>
	<div id='cssmenu' class="align-center">
			<ul>
			   <li class="active"><a href="${pageContext.request.contextPath}/index.jsp"><span>主页</span></a></li>
			   <li class='has-sub'><a href='javascript:void(0)'><span>分享</span></a>
				  <ul >
					 <li class='has-sub'><a href='javascript:void(0)'><span>关于我</span></a>
						<ul>
						   <li><a href='${pageContext.request.contextPath}/mood.jsp'><span>我的心情</span></a></li>
						   <li class='last'><a href='javascript:void(0)'><span>我的上传</span></a></li>
						</ul>
					 </li>
					 <li class='has-sub'><a href='javascript:void(0)'><span>看看别人</span></a>
						<ul>
						   <li><a href='javascript:void(0)'><span>大家状态</span></a></li>
						   <li class='last'><a id='login' href='javascript:void(0)'><span>找找东西</span></a></li>
						</ul>
					 </li>
				  </ul>
			   </li>
			   <li><a href='${pageContext.request.contextPath}/single.jsp'><span>关于我们</span></a></li>
			   <li class='last'><a href='${pageContext.request.contextPath}/contact.jsp'><span>投诉信</span></a></li>
			   <li class='last'>
			   	<c:if test="${empty sessionScope.user.userName }">
			   		<a id='loginmodal' href='javascript:void(0)'><span>登录</span></a>
			   		<li class='last'><a id='registrationmodal' href='javascript:void(0)'><span>注册</span></a></li>
			   	</c:if>
			   	<c:if test="${!empty sessionScope.user.userName }">
			   		<a href='${pageContext.request.contextPath}/usermessage.jsp'><span>${sessionScope.user.userName}</span></a>
			   	</c:if>
			   </li>
			</ul>
		</div>
	<div class="search-area-wrapper">
		<div class="search-area container">
			<h3 class="search-header">
				<a href="#"> <img id="headimg" alt="updateimage" title="点击更改头像"
					src="${sessionScope.user.userImg }">
				</a>
			</h3>
			<form id="headimage"
				action="${pageContext.request.contextPath}/user_updateheadimage"
				method="post" enctype="multipart/form-data">
				<input type="file" style="display: none" name="file" /> <input
					type="hidden" value="personCenter" name="filevalue" /> <input
					type="submit" value="确认上传" />
			</form>
			<p class="search-tag-line">积分：${sessionScope.user.userScore}</p>
			<p class="search-tag-line">${sessionScope.user.state }</p>
			<input id="state" name="state" type="text"
				value="${sessionScope.user.state }" />
		</div>
	</div>
	<div
		style="background: url(images/beijintu.jpg); background-size：100 %; background-repeat: repeat;">
		<div>
			<table align="center" width="500" border="0" height="300"
				cellpadding="10" cellspacing="5">
				<tr>
					<td align="center" colspan="3">
						<h2>用户个人中心</h2>
					</td>
				</tr>
				<tr>
					<td align="center">用户名：</td>
					<td align="left">${sessionScope.user.userName }</td>
				</tr>
				<tr>
					<td align="center">用户电话：</td>
					<td align="left">
						${sessionScope.user.userPhone }
					</td>
				</tr>
				<tr align="right">
					<td align="center">性别：</td>
					<td align="left">${sessionScope.user.gender == '0'?'男':'女'}</td>
				</tr>
				
				<tr>
					<td align="center">地址</td>
					<td align="left">${sessionScope.user.userAddress }</td>
				</tr>
				<tr align="center">
					<td id="tdNode" colspan="2" align="center"></td>
				</tr>
				<tr align="center">
					<td colspan="2"><a id='updatemessage' href="javascript:void(0)">修改资料</a></td>
				</tr>
				<tr align="center">
					<td colspan="2"><a id="logout"
						href="${pageContext.request.contextPath}/user_logout">退出登录</a></td>
				</tr>
				<tr align="center">
					<td colspan="2"><a href="index.jsp">返回首页</a></td>
				</tr>
			</table>
		</div>
		<footer id="footer-wrapper"> <!-- end of #footer --> <!-- Footer Bottom -->
		<div id="footer-bottom-wrapper">
			<div id="footer-bottom" class="container">
				<div class="row">
					<div class="span6">
						<p class="copyright">
							ZZ宝贝成长计划有限公司<br> 联系方式:15579272298<br> QQ:785683769
						</p>
					</div>
					<div class="span6">
						<!-- Social Navigation -->
						<ul class="social-nav clearfix">
							<li class="linkedin"><a target="_blank" href="#"></a></li>
							<li class="stumble"><a target="_blank" href="#"></a></li>
							<li class="google"><a target="_blank" href="#"></a></li>
							<li class="deviantart"><a target="_blank" href="#"></a></li>
							<li class="flickr"><a target="_blank" href="#"></a></li>
							<li class="skype"><a target="_blank" href="#"></a></li>
							<li class="rss"><a target="_blank" href="#"></a></li>
							<li class="twitter"><a target="_blank" href="#"></a></li>
							<li class="facebook"><a target="_blank" href="#"></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		</footer>
</body>
</html>