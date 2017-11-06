<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="style/default.css" rel="stylesheet" type="text/css" media="screen" />
<link href="style/google-map.css" rel="stylesheet" type="text/css" media="screen" />
<link href="style/print.css" rel="stylesheet" type="text/css" media="print" />
<link href="http://fonts.googleapis.com/css?family=Oswald" rel="stylesheet" type="text/css" />
<script src="js/jQuery.min.js" type="text/javascript"></script>
<script src="js/functions.js" type="text/javascript"></script>
<script src="contact-form/contact-form.js" type="text/javascript"></script>
<script type="text/javascript" src="fancybox/jquery.mousewheel-3.0.4.pack.js"></script>
<script type="text/javascript" src="fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="fancybox/jquery.fancybox-1.3.4.css" media="screen" />
<script src="js/popup.js" type="text/javascript"></script>
<script type="text/javascript" src="js/styleswitch.js"></script>
<link rel="stylesheet" type="text/css" href="style/big.css" title="big" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/blue.css" title="blue" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/blue2.css" title="blue2" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/br.css" title="br" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/brown.css" title="brown" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/bs.css" title="bs" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/cgrey.css" title="cgrey" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/dark.css" title="dark" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/orange.css" title="orange" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/purple.css" title="purple" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/white.css" title="white" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/yellow.css" title="yellow" media="screen" />
<link rel="alternate stylesheet" type="text/css" href="style/mini.css" title="mini" media="screen" />
<link href="style/popup.css" rel="stylesheet" type="text/css" media="screen" />
<style type="text/css">
.onpage-style-switcher {
	width: 40px;
	position: absolute;
	margin-top: 170px;
	padding-top: 10px;
	padding-bottom: 10px;
	background-color: #fff;
}
.onpage-style-switcher li {
	padding: 0px;
	margin: 1px 0px 0px 0px;
}
.onpage-style-switcher li a {
	color: #fff;
	text-shadow: none;
}
.onpage-style-switcher li a div:hover {
	padding-right: 20px;
}
</style>
</head>
<body>
	<ul class="onpage-style-switcher">
		<li><a href="style/style=white" rel="white" class="styleswitch"><div style="background-color: #5FB053; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=big" rel="big" class="styleswitch"><div style="background-color: #1f3862; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=yellow" rel="yellow" class="styleswitch"><div style="background-color: #fdff01; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=br" rel="br" class="styleswitch"><div style="background-color: #9a1b1f; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=bs" rel="bs" class="styleswitch"><div style="background-color: #eb374b; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=brown" rel="brown" class="styleswitch"><div style="background-color: #2f2913; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=mini" rel="mini" class="styleswitch"><div style="background-color: #dedede; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=cgrey" rel="cgrey" class="styleswitch"><div style="background-color: #3c3d3f; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=orange" rel="orange" class="styleswitch"><div style="background-color: #bd492a; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=dark" rel="dark" class="styleswitch"><div style="background-color: #111111; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=blue2" rel="blue2" class="styleswitch"><div style="background-color: #359ccf; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=purple" rel="purple" class="styleswitch"><div style="background-color: #d34699; height: 25px; width: 30px;"></div></a></li>
		<li><a href="style/style=blue" rel="blue" class="styleswitch"><div style="background-color: #90d3d9; height: 25px; width: 30px;"></div></a></li>
	</ul>
	<div id="mydiv" class="success" style="display: none;">Thank you for contacting me!</div>
	<div style="clear: both;"></div>
	<div id="map-wrapper">
		<div id="topLine"></div>
		<div id="topPanel">
			<div id="googleMap" class="googleMap" data-zoom="8"
				data-latitude="31.229009" data-longitude="73.859312"
				data-title="Rana Hunting Resort Restaurant"></div>
			<div class="gwrap">
				<div id="topPanelHandle">
					<span>Map</span>
				</div>
			</div>
		</div>
	</div>
	<header class="header">
		<div class="headerwrapper">
			<h2>${sessionScope.user.userName}</h2>
			<div class="clearfix"></div>
			<h6>${sessionScope.user.state}</h6>
		</div>
	</header>
	<div id="wrapper">
		<section id="contents">
			<div id="form">
				<div class="section">
					<h5>说点什么吧</h5>
					<form id='shareform' method='post'>
						<textarea id='textarea' name='letter'></textarea>
						<input id='file' type="file" name="file" />
						<input id='shareinput' type='submit' value='submit' />
					</form>
				</div>
				<br />
			</div>
			<div id="main">
				<div class="section">
					<!-- 主体 -->
				</div>
				<br />
			</div>
			<div style="clear: both;"></div>
		</section>
	</div>
	<script src="js/jquery.prettyPhoto.js" type="text/javascript"
		charset="utf-8"></script>
	<script type="text/javascript" charset="utf-8">
		$(function() {
			$("#shareinput").click(function(){
					var formData = new FormData($("#shareform")[0]);
					$.ajax({
						type : "post",
						url : "${pageContext.request.contextPath}/share-mood",
						data : formData,
						async : false,
						cache : false,
						contentType : false,
						processData : false,
						success : function(result) {
							if(result.message=='ok'){
								toPage(1);
								$("#textarea").val("");
								$("file").val();
							}
						}
					});
				return false;
			});
			toPage(1);
			$("a[rel=gallery]").fancybox(
					{
						'transitionIn' : 'none',
						'transitionOut' : 'none',
						'titlePosition' : 'over',
						'titleFormat' : function(title, currentArray,
								currentIndex, currentOpts) {
							return '<span id="fancybox-title-over">Image '
									+ (currentIndex + 1) + ' / '
									+ currentArray.length
									+ (title.length ? ' &nbsp; ' + title : '')
									+ '</span>';
						}
					});

			$('#bandar').css('display', 'none');
			var sentParts = window.location.href.toString().split('?');
			if (sentParts.length > 1)
				if (sentParts[1] = 'sent') {
					$('#mydiv').css('display', '');
					setTimeout(function() {
						$('#mydiv').fadeOut('fast');
					}, 3000);
				}
			
			function toPage(pageSize){
				$("#main").find("div").eq(0).empty();
				$.ajax({
					url : "${pageContext.request.contextPath}/user-share-list",
					data : {"offSet" : pageSize},
					type : "post",
					success : function(result){
// 						{
// 							"nid":2,
// 							"letter":"对于java而言，万物皆对象.",
// 							"letterimage":null,
// 							"lettervedio":null,
// 							"thumbsCount":null,
// 							"thumbsUserId":"5,6",
// 							"createTime":"2017-10-29  21:08",
// 							"userName":"冷静",
// 							"userImg":null,
// 							"userId":5,
// 							"comments":[{
// 								"cid":2,
// 								"content":"对对对，可以的!",
// 								"userId":6,
// 								"userName":"安然",
// 								"userImg":null,
// 								"nid":2,
// 								"answers":[{
// 									"aid":1,
// 									"content":"hello",
// 									"huserId":5,
// 									"huserName":"冷静",
// 									"huserImg":null,
// 									"buserId":6,
// 									"buserName":"安然",
// 									"buserImg":null,
// 									"cid":2,
// 									"zanswers":[{
// 										"zid":1,
// 										"content":"hi",
// 										"huserId":6,
// 										"huserName":"安然",
// 										"huserImg":null,
// 										"buserId":5,
// 										"buserName":"冷静",
// 										"buserImg":null,
// 										"aid":1
// 										}]}]}]}]}
						var rows = result.rows;
						var pageTotal = result.pageTotal;
						for(var i=0;i<rows.length;i++){
							var workDivNode = $("<div class='work_item'></div>");
							var timeDivNode = $("<div class='year'>"+rows[i].createTime+"</div>");
							var nameHNode = $("<a href='#'><h3>"+rows[i].userName+"</h3></a>");
							var brNode = $("<br/>")
							var pNode = $("<p>"+rows[i].letter+"</p>");
							var imgDiv=$("<div></div>");
							if(rows[i].letterimage!=null)
								var img = $(imgDiv).append($("<img style='width:150px;height:150px' src='"+rows[i].letterimage+"' />"));
							
							$(workDivNode).append($(timeDivNode)).append($(nameHNode)).append($(brNode)).append($(pNode)).append($(imgDiv));
							
							$(workDivNode).append($(brNode)).append($(brNode));
							
							var opDivNode = $("<div></div>");
							var pNode=$("<a href='javascript:void(0)'>评论</a>");
							var dzNode=$("<a href='javascript:void(0)'>点赞99</a>");
							var usernId="${sessionScope.user.userId}";
							console.log(usernId);
							if(rows[i].userId==usernId){
								var dNode=$("<a class='deleteNews' href='#'>删除</a>");
							}else{
								var dNode=$("<a></a>");
							}
							$(opDivNode).append($(pNode)).append($(dzNode)).append($(dNode)).appendTo($(workDivNode));
							
							var ulNode=$("<ul></ul>");
							var comments = rows[i].comments;
							
							for(var j = 0;j < comments.length;j++){
								var liNode=$("<li></li>");
								
								$(liNode).append("<a href='#'>"+comments[j].userName+"&nbsp;</a>评论:"+comments[j].content+"&nbsp;<a href='#'>删除</a>").appendTo($(ulNode));
								
								var hNode=$("<ul></ul>");
								var answers = comments[j].answers;
								
								for(var m=0;m<answers.length;m++){
									var hliNode=$("<li></li>");
									
									$("<a href='#'>"+answers[m].huserName+"</a>&nbsp;回复<a href='#'>"+answers[m].buserName+"</a>:"+answers[m].content+"&nbsp;<a href='#'>删除</a>").appendTo($(hliNode));
									$(hliNode).appendTo(hNode);
									
									var zanswers = answers[m].zanswers;
									
									for(var n=0;n<zanswers.length;n++){
										var bliNode=$("<li></li>");
										$("<a href='#'>"+zanswers[n].huserName+"</a>&nbsp;回复<a href='#'>"+zanswers[n].buserName+"</a>:"+zanswers[m].content+"&nbsp;<a href='#'>删除</a>").appendTo($(bliNode));
										$(bliNode).appendTo(hNode);
									}
								}
								$(hNode).appendTo($(ulNode));
							}
							
							$(ulNode).appendTo($(workDivNode));
				
							$(workDivNode).appendTo($("#main").find("div").eq(0));
						}
						for(var pagenum=1;pagenum<=pageTotal;pagenum++){
							$("<a href='javascript:void(0)'>第"+pagenum+"页</a>").appendTo($(workDivNode));
						}
						$("<p id='pageId'>共"+pageTotal+"页</p>").appendTo($("#main").find("div").eq(0));
					}
	            });
		}
// 				$(".deleteNews").live("each",function(index){
// 						alert(index);
// 						$(this).on("click",function(){
// 							$.ajax({
// 								url : "${pageContext.request.contextPath}/newsletter-delete",
// 								data : {"nid":id},
// 								type : "post",
// 								success : function(){
// 									toPage(1);
// 								}
// 							});
// 						return false;
// 						}
// 				}
		});
	</script>
	<script type="text/javascript" src="js/twitter.js"></script>
	<div id="popupContact">
		<a id="popupContactClose"><img src="images/x.gif" alt="Close" /></a>
		<h2>Lets Meet!</h2>
		<p id="contactArea">
		<div id="contact-form">
			<form name="contact" action="<?=$_SERVER['PHP_SELF']?>" method="post"
				onSubmit="return validateForm();">
				<table cellpadding="8" cellspacing="10">
					<tr>
						<td><label>Your Name <span class="req">*</span></label></td>
					</tr>
					<tr>
						<td><input type="text" id="sender_name" name="sender_name" /></td>
					</tr>
					<tr>
						<td><label>Your E-Mail <span class="req">*</span></label></td>
					</tr>
					<tr>
						<td><input type="text" id="sender_email" name="sender_email" /></td>
					</tr>
					<tr>
						<td><label>Message </label></td>
					</tr>
					<tr>
						<td><textarea id="sender_message" name="sender_message"
								cols="" rows="" style="width: 380px; height: 80px;"></textarea></td>
					</tr>
					<tr>
						<td><input type="submit" name="submitForm" value="Submit"
							class="button m grey-gloss" /> <span id="bandar"><img
								src="images/loader.gif" alt="Progress indicator..." /></span></td>
					</tr>
					<tr>
						<td colspan="4">
							<p id="form_errors"></p>
							<p id="form_thanks"></p>
						</td>
					</tr>
				</table>
			</form>
		</div>
		</p>
	</div>
	<div id="backgroundPopup"></div>
</body>
</html>