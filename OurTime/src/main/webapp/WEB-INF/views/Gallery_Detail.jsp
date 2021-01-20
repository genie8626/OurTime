<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.79.0">
<title>Gallery_Detail</title>
<link href="resources/css/Gallery_Detail.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/home.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="resources/js/Gallery_Reply.js"></script>
<script src="resources/js/Gallery_Detail.js"></script>
<script src="resources/js/bootstrap.bundle.min.js"></script>
</head>
<header>
  <div class="collapse bg-dark" id="navbarHeader">
    <div class="container" style="background-color:#212529; ">
      <div class="row">
        <div class="col-sm-8 col-md-7 py-4">
          <h4 class="text-white">About</h4>
          <p class="text-muted">
          	이 갤러리는 저의 첫 개인 포트폴리오 입니다.<br>
          	회원가입 후 사진을 업로드하여 자신의 생각을 댓글로 표현해주십시오.<br>
          	회원가입CRUD, 로그인 세션, 갤러리 CRUD, 댓글 CRUD를 구현 해 보았습니다.
          </p>
        </div>
        <div class="col-sm-4 offset-md-1 py-4">
          <h4 class="text-white">Contact</h4>
          <ul class="list-unstyled">
            <li><a href="https://www.instagram.com/genie_is_adorable" class="text-white">Instagram</a></li>
            <li><a href="https://www.facebook.com/profile.php?id=100006451516582" class="text-white">Facebook</a></li>
            <li><a href="https://github.com/genie8626" class="text-white">GitHub</a></li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="navbar navbar-dark bg-dark shadow-sm">
    <div class="container">
      <a href="/OurTime" class="navbar-brand d-flex align-items-center">
        <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" aria-hidden="true" class="me-2" viewBox="0 0 24 24"><path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"/><circle cx="12" cy="13" r="4"/></svg>
        <strong>OurTime</strong>
      </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </div>
</header>


<body>
<div class="container" style="width: 100%">
<form name="frm5">
	<!-- picture -->
	 <div class="row" id="home"  style="float: left; width: 500px;">
	   	<div class="col-md-6" style="margin-left: 100px; margin-top: 5px;" >
	     	<img style="width:400px;; height: 400px;" class="img-fluid" src="brdUpload/display?fileName=${detail.filename}" alt="cactus image"/>
	   	</div> <!-- col right END -->
	 </div> <!-- row #home END -->
	  	
	   
	  	<!-- 제목 설명 -->
	<div style="float: right; width: 500px;">   
	    	<div class="col-md-6 text-center" >
	    		<img id="logo" class="img-fluid" src="resources/img/ourTime.jpg" alt="logo" height="70" width="70"/>
	     		 <h4>글쓴이</h4>
	     		 <p>${detail.email}</p>
	     		 <h4>제목</h4>
	     		 <p>${detail.title}</p>
	   		</div> <!-- col left END -->
	   
	  
	 	 <div class="row" id ="about">
	     	 <div class="col-md-6 my-auto ">
	         <h4 class="text-center">내용</h4>
	        <p style="text-align: center;"> ${detail.content}
	        </p>
	        </div> <!-- col-6 END -->
	
	 	 </div><!-- row #about END -->
	</div>




<!-- 댓글 -->
  <div class="row" id ="contact" style="clear: both; margin-top: 500px; margin-left: 400px;" >
   
    <div class="col-md-6">
       <h4 class="text-center">Comment</h4>
      <!-- start form-->
	 <form>
		 <div class="form-group">
		<label for="form_name">User E-Mail: </label>
		<input type="text" id="replyPpl" name="replyPpl" class="form-control" value="${loginEmail}" readonly="readonly">
		<input type="hidden" name="no" id="no" class="form-control" value="${detail.no}" readonly="readonly">
		                  
		</div>
		
		          <div class="form-group">
		  <label for="form_Message">Message: </label>
		 <textarea class="form-control" rows="5" id="replyText" name="replyText"></textarea>      
		                </div>
		  <div class="replyList">
			<ul id="replies"></ul>
			
		<div><button id="replyAddBtn">댓글 작성</button></div>
		<br><br>
		</div>
		
		<hr class="my-4">
	          
	</form>
	<div id="control Box" style="width: 100%; margin-bottom: 100px;margin-top: 100px;">
		<c:if test="${loginEmail==detail.email}">
          <input class="w-50 btn btn-primary btn-lg" type="submit" value="수정" style="float: left; border: 0;"  onclick="btn_click('Update')">
          <input class="w-50 btn btn-primary btn-lg" type="submit" value="삭제" style="background-color: gray; border: 0;"onclick="btn_click('Delete')">
        </c:if>
	</div><!-- control Box end -->
 	
      <!-- form END-->
    </div><!-- col-6 END -->
  </div><!-- row #contact END -->
</form>
</div> <!-- container END -->
</body>
</html>