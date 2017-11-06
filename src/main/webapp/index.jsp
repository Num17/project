<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>xiangyue</title>
<link rel="stylesheet" href="css/zerogrid.css">
<link rel="stylesheet" href="css/style.css">
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/menu.css">
<script src="js/jquery1111.min.js" type="text/javascript"></script>
<script src="js/script.js"></script>
<link href="owl-carousel/owl.carousel.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="bootstrap/bootstrap.min.css"/>
<script type="text/javascript" src="bootstrap/bootstrap.min.js"></script>
</head>
<body>	
	<div class="wrap-body">
	<!-- Modal -->
	<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	    <div class="modal-dialog" role="document">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	                <h4 class="modal-title" id="myModalLabel">登录</h4>
	            </div>
	            <div class="modal-body">
	                <form id='loginform' action='${pageContext.request.contextPath}/user-login' method='post'>
					  <div class="form-group">
					    <input name='username' type="text" class="form-control" placeholder="UserName">
					  </div>
					  <div class="form-group">
					    <input name='password' type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
					  </div>
					</form>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	                
	                <button id='loginsubmit' type="button" class="btn btn-primary">登录</button>
	            
	            </div>
	        </div>
	    </div>
	</div>
	<div class="modal fade" id="registrationModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	    <div class="modal-dialog" role="document">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	                <h4 class="modal-title" id="myModalLabel">注册</h4>
	            </div>
	            <div class="modal-body">
	                <form id="desform">
					  <div class="form-group">
					    <input type="text" id = 'checkusername' name="userName" class="form-control" placeholder="用户名">
					  </div>
					  <div class="form-group">
					    <input type="password" name="userPassword" class="form-control" placeholder="密码">
					  </div>
					  <div class="radio">
						  <label>
						    <input type="radio" name="gender" value="0">
						    	男
						  </label>
					 </div>
					 <div class="radio">
						  <label>
						  <input type="radio" name="gender" value="1">
						    	女
						  </label>
					 </div>
					<div class="form-group">
					    <input type="text" name="userPhone" class="form-control" placeholder="电话号码">
					</div>
					<div class="form-group">
					    <input type="text" name="userAddress" class="form-control" placeholder="地址">
					</div>
					<div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	                
	                <button id='resbutton' type="button" class="btn btn-primary">注册</button>
	            
	            	</div>
					</form>
	            </div>
	        </div>
	    </div>
	</div>
		<div id='cssmenu' class="align-center">
			<ul>
			   <li class="active"><a href="${pageContext.request.contextPath}/index.jsp"><span>主页</span></a></li>
			   <li class='has-sub'><a href='javascript:void(0)'><span>分享</span></a>
				  <ul >
					 <li class='has-sub'><a href='javascript:void(0)'><span>关于我</span></a>
						<ul>
						   <li><a href='${pageContext.request.contextPath}/mood.jsp'><span>我的心情</span></a></li>
						   <li class='last'><a href='${pageContext.request.contextPath }/selectAllResourcesAndUsers'><span>我的上传</span></a></li>
						</ul>
					 </li>
					 <li class='has-sub'><a href='javascript:void(0)'><span>看看别人</span></a>
						<ul>
						   <li><a href='othermood.jsp'><span>大家状态</span></a></li>
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
		<header class="">
			<div class="logo">
				<hr class="line-1">
				<a href="javascript:void(0)">畅享</a>
				<span>SHARING</span>
				<hr class="line-1">
			</div>
			<div id="owl-slide" class="owl-carousel">
				<div class="item">
					<img src="images/slider1.jpg" />
				</div>
				<div class="item">
					<img src="images/slider2.jpg" />
				</div>
				<div class="item">
					<img src="images/slider3.jpg" />
				</div>
			</div>
		</header>
		<section id="container">
			<div class="wrap-container">
				<div id="main-content">
					<div class="wrap-content">
						<div class="zerogrid">
							<div class="row">
								<div class="col-1-2">
									<article>
										<div class="post-thumbnail-wrap">
											<a href="single.jsp" class="portfolio-box">
												<img src="images/11.jpg" alt="">
												<div class="portfolio-box-caption">
													<div class="portfolio-box-caption-content">
														<div class="project-text">
															Art and design have always been related, but today, experimentation and personal expression are the name of the game. Homeowners are using art to make a personal statement – your art choice has ...
														</div>
													</div>
												</div>
											</a>
										</div>
										<div class="entry-header ">
											<h3 class="entry-title">Vital Films presents INSIGHT</h3>
											<div class="l-tags"><a href="#">Design</a> / <a href="#">Illustrations</a> / <a href="#">Typography</a></div>
										</div>
									</article>
								</div>
								<div class="col-1-2">
									<article>
										<div class="post-thumbnail-wrap">
											<a href="single.jsp" class="portfolio-box">
												<img src="images/12.jpg" alt="">
												<div class="portfolio-box-caption">
													<div class="portfolio-box-caption-content">
														<div class="project-text">
															Art and design have always been related, but today, experimentation and personal expression are the name of the game. Homeowners are using art to make a personal statement – your art choice has ...
														</div>
													</div>
												</div>
											</a>
										</div>
										<div class="entry-header ">
											<h3 class="entry-title">Branding and Advertisement</h3>
											<div class="l-tags"><a href="#">Design</a> / <a href="#">Illustrations</a> / <a href="#">Typography</a></div>
										</div>
									</article>
								</div>
							</div>
                            <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>
							<div class="row">
								<div class="col-1-2">
									<article>
										<div class="post-thumbnail-wrap">
											<a href="single.jsp" class="portfolio-box">
												<img src="images/13.jpg" alt="">
												<div class="portfolio-box-caption">
													<div class="portfolio-box-caption-content">
														<div class="project-text">
															Art and design have always been related, but today, experimentation and personal expression are the name of the game. Homeowners are using art to make a personal statement – your art choice has ...
														</div>
													</div>
												</div>
											</a>
										</div>
										<div class="entry-header ">
											<h3 class="entry-title">Branding and Advertisement</h3>
											<div class="l-tags"><a href="#">Design</a> / <a href="#">Illustrations</a> / <a href="#">Typography</a></div>
										</div>
									</article>
								</div>
								<div class="col-1-2">
									<article>
										<div class="post-thumbnail-wrap">
											<a href="single.jsp" class="portfolio-box">
												<img src="images/14.jpg" alt="">
												<div class="portfolio-box-caption">
													<div class="portfolio-box-caption-content">
														<div class="project-text">
															Art and design have always been related, but today, experimentation and personal expression are the name of the game. Homeowners are using art to make a personal statement – your art choice has ...
														</div>
													</div>
												</div>
											</a>
										</div>
										<div class="entry-header ">
											<h3 class="entry-title">Branding and Advertisement</h3>
											<div class="l-tags"><a href="#">Design</a> / <a href="#">Illustrations</a> / <a href="#">Typography</a></div>
										</div>
									</article>
								</div>
							</div>
							<div class="row">
								<div class="col-1-2">
									<article>
										<div class="post-thumbnail-wrap">
											<a href="single.jsp" class="portfolio-box">
												<img src="images/1.jpg" alt="">
												<div class="portfolio-box-caption">
													<div class="portfolio-box-caption-content">
														<div class="project-text">
															Art and design have always been related, but today, experimentation and personal expression are the name of the game. Homeowners are using art to make a personal statement – your art choice has ...
														</div>
													</div>
												</div>
											</a>
										</div>
										<div class="entry-header ">
											<h3 class="entry-title">Branding and Advertisement</h3>
											<div class="l-tags"><a href="#">Design</a> / <a href="#">Illustrations</a> / <a href="#">Typography</a></div>
										</div>
									</article>
								</div>
								<div class="col-1-2">
									<article>
										<div class="post-thumbnail-wrap">
											<a href="single.jsp" class="portfolio-box">
												<img src="images/2.jpg" alt="">
												<div class="portfolio-box-caption">
													<div class="portfolio-box-caption-content">
														<div class="project-text">
															Art and design have always been related, but today, experimentation and personal expression are the name of the game. Homeowners are using art to make a personal statement – your art choice has ...
														</div>
													</div>
												</div>
											</a>
										</div>
										<div class="entry-header ">
											<h3 class="entry-title">Branding and Advertisement</h3>
											<div class="l-tags"><a href="#">Design</a> / <a href="#">Illustrations</a> / <a href="#">Typography</a></div>
										</div>
									</article>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<footer>
			<div class="zerogrid wrap-footer">
				<div class="row">
					<div class="bottom-social">
						<a href="#"><i class="fa fa-facebook"></i></a>
						<a href="#"><i class="fa fa-instagram"></i></a>
						<a href="#"><i class="fa fa-twitter"></i></a>
						<a href="#"><i class="fa fa-google-plus"></i></a>
						<a href="#"><i class="fa fa-pinterest"></i></a>
						<a href="#"><i class="fa fa-vimeo"></i></a>
						<a href="#"><i class="fa fa-linkedin"></i></a>
						<a href="#"><i class="fa fa-youtube"></i></a>
					</div>
				</div>
				<div class="copyright">
					Copyright @ - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
				</div>
			</div>
		</footer>
		<script src="owl-carousel/owl.carousel.js"></script>
		<script>
		$(function() {
			
			$("#checkusername").change(function(){
				$.ajax({
					url : "${pageContext.request.contextPath}/user-checkusername",
					data : {"userName":$("#checkusername").val()},
					type : "post",
					success : function(result){
						if(result.message=='no')
							alert("用户名已经存在!");
					}
				});
			});
			
			$("#resbutton").click(function(){
				$.ajax({
					url : "${pageContext.request.contextPath}/user-res",
					data : $("#desform").serialize(),
					type : 'post',
					success : function(result){
						if(result.message=='ok'){
							window.location.reload();
							alert("注册成功!");
							$('#myModal').modal('hide');
						}else
							alert("用户名已经存在!");
					}
				});
			});
			
			$("#loginmodal").click(function(){
				$('#loginModal').modal('show');
			});
			$("#registrationmodal").click(function(){
				$('#registrationModal').modal('show');
			});
			
			$("#loginsubmit").click(function(){
				$.ajax({
					url : "${pageContext.request.contextPath}/user-login",
					data : $("#loginform").serialize(),
					type : 'post',
					success : function(result){
						if(result.message=='ok')
							window.location.reload();
						else
							alert("登录失败，请检查帐号密码");
					}
				});
			});
			
		  $("#owl-slide").owlCarousel({
			autoPlay: 3000,
			items : 1,
			itemsDesktop : [1199,1],
			itemsDesktopSmall : [979,1],
			itemsTablet : [768, 1],
			itemsMobile : [479, 1],
			navigation: true,
			navigationText: ['<i class="fa fa-chevron-left fa-5x"></i>', '<i class="fa fa-chevron-right fa-5x"></i>'],
			pagination: false
		  });
		});
		</script>
	</div>
</body>
</html>