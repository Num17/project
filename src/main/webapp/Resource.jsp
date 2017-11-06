<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>BLOG index with sidebar & slider | Amaze UI Examples</title>
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192" href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed"
	href="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileImage"
	content="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">
<link rel="stylesheet" href="assets/css/amazeui.min.css">
<link rel="stylesheet" href="assets/css/app.css">
<style type="text/css">
</style>
</head>

<body id="blog">

	<header class="am-g am-g-fixed blog-fixed blog-text-center blog-header">
	<div class="am-u-sm-8 am-u-sm-centered">
		<h1 class="am-hide-sm-only">畅享</h1>
	</div>
	</header>
	<hr>
	<!-- nav start -->
	<nav class="am-g am-g-fixed blog-fixed blog-nav">
	<button
		class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only blog-button"
		data-am-collapse="{target: '#blog-collapse'}">
		<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
	</button>

	<div class="am-collapse am-topbar-collapse" id="blog-collapse">
		<ul class="am-nav am-nav-pills am-topbar-nav">
			<li class="am-active"><a href="${pageContext.request.contextPath}/index.jsp">首页</a></li>
			<li><a href="${pageContext.request.contextPath}/usermessage.jsp">${sessionScope.user.userName}</a></li>
		</ul>
	</div>
	</nav>
	<hr>
	<!-- nav end -->
	<!-- banner start -->
	<!-- content srart -->
	<div class="am-g am-g-fixed blog-fixed">
		<div class="am-u-md-8 am-u-sm-12">
			<form id="uploadForm" action="uploadFile"
				enctype="multipart/form-data" method="post">
				<input name="file" type="file" /> <span>积分：</span><input
					name="score" type="text" /> <input value="提交" type="submit" />
			</form>
			<h1>资源列表</h1>
			<c:forEach items="${sessionScope.resources}" var="resource">
				<article class="am-g blog-entry-article">
				<div class="am-u-lg-6 am-u-md-12 am-u-sm-12 blog-entry-text">
					<span><a href="#" class="blog-color">${resource.name}</a></span> <span>
					</span> <span>${resource.time}</span>
					<h5>
						<a href="resource/${resource.id}">下载</a>
					</h5>
					<p>
						<span>上传者:</span><span>${resource.user.userName}</span>
					</p>
					<p>
						<a href="#" class="blog-continue">continue reading</a>
					</p>
				</div>
				</article>
			</c:forEach>
		</div>

		<div class="am-u-md-4 am-u-sm-12 blog-sidebar">
			<div class="blog-sidebar-widget blog-bor">
				<h2 class="blog-text-center blog-title">
					<span>About ME</span>
				</h2>
				<img src="${sessionScope.user.userImg}" alt="about me"
					class="blog-entry-img">
				<p>关于我</p>
				<p>${sessionScope.user.state}</p>
			</div>
			<div class="blog-sidebar-widget blog-bor">
				<h2 class="blog-text-center blog-title">
					<span>Contact ME</span>
				</h2>
				<p>
					<a href=""><span
						class="am-icon-qq am-icon-fw am-primary blog-icon"></span></a> <a
						href=""><span class="am-icon-github am-icon-fw blog-icon"></span></a>
					<a href=""><span class="am-icon-weibo am-icon-fw blog-icon"></span></a>
					<a href=""><span class="am-icon-reddit am-icon-fw blog-icon"></span></a>
					<a href=""><span class="am-icon-weixin am-icon-fw blog-icon"></span></a>
				</p>
			</div>
			<div class="blog-clear-margin blog-sidebar-widget blog-bor am-g ">
				<h2 class="blog-title">
					<span>TAG cloud</span>
				</h2>
				<div class="am-u-sm-12 blog-clear-padding">
					<a href="" class="blog-tag">amaze</a> <a href="" class="blog-tag">妹纸
						UI</a> <a href="" class="blog-tag">HTML5</a> <a href=""
						class="blog-tag">这是标签</a> <a href="" class="blog-tag">Impossible</a>
					<a href="" class="blog-tag">开源前端框架</a>
				</div>
			</div>
			<div class="blog-sidebar-widget blog-bor">
				<h2 class="blog-title">
					<span>么么哒</span>
				</h2>
				<ul class="am-list">
					<li><a href="#">每个人都有一个死角， 自己走不出来，别人也闯不进去。</a></li>
					<li><a href="#">我把最深沉的秘密放在那里。</a></li>
					<li><a href="#">你不懂我，我不怪你。</a></li>
					<li><a href="#">每个人都有一道伤口， 或深或浅，盖上布，以为不存在。</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- content end -->



	<footer class="blog-footer">
	<div
		class="am-g am-g-fixed blog-fixed am-u-sm-centered blog-footer-padding">
		<div class="am-u-sm-12 am-u-md-4- am-u-lg-4">
			<h3>社交账号</h3>
			<p>
				<a href=""><span
					class="am-icon-qq am-icon-fw am-primary blog-icon blog-icon"></span></a>
				<a href=""><span
					class="am-icon-github am-icon-fw blog-icon blog-icon"></span></a> <a
					href=""><span
					class="am-icon-weibo am-icon-fw blog-icon blog-icon"></span></a> <a
					href=""><span
					class="am-icon-reddit am-icon-fw blog-icon blog-icon"></span></a> <a
					href=""><span
					class="am-icon-weixin am-icon-fw blog-icon blog-icon"></span></a>
			</p>
			<h3>Credits</h3>
			<p>我们追求卓越，然时间、经验、能力有限。畅享有很多不足的地方，希望大家包容、不吝赐教，给我们提意见、建议。感谢你们！</p>
		</div>
		<div class="am-u-sm-12 am-u-md-4- am-u-lg-4">
			<h1>我们站在巨人的肩膀上</h1>
			<h3>Heroes</h3>
			<p>
			<ul>
				<li>jQuery</li>
				<li>Zepto.js</li>
				<li>Seajs</li>
				<li>LESS</li>
				<li>...</li>
			</ul>
			</p>
		</div>
	</div>
	<div class="blog-text-center">© 2017 畅享</div>
	</footer>





	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="assets/js/jquery.min.js"></script>
	<!--<![endif]-->
	<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
	<script src="assets/js/amazeui.min.js"></script>
</body>
</html>