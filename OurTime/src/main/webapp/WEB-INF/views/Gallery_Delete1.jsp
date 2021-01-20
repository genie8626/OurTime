<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.79.0">
    <title>Our Time Gallery</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/album/">
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/home.css" rel="stylesheet">
    <script src="resources/js/bootstrap.bundle.min.js"></script>
   
  </head>
  <body>
    
<header>
  <div class="collapse bg-dark" id="navbarHeader">
    <div class="container">
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
      <a href="#" class="navbar-brand d-flex align-items-center">
        <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" aria-hidden="true" class="me-2" viewBox="0 0 24 24"><path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"/><circle cx="12" cy="13" r="4"/></svg>
        <strong>OurTime</strong>
      </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
  </div>
</header>
<form action="/OurTime/" method="get">

	<div style="height: 500px; text-align: center;">
		<h3 style="margin-top: 200px;">게시글이 삭제되었습니다</h3>
		<input style="margin-top: 100px;" class="w-20 btn btn-primary btn-lg" type="submit" value="홈으로 가기">
	</div>
</form>
<footer class="text-muted py-5">
  <div class="container">
    <p class="float-end mb-1">
      <a href="#">Back to top</a>
    </p>
    <p class="mb-1">Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>
    <p class="mb-0">New to Bootstrap? <a href="/">Visit the homepage</a> or read our <a href="../getting-started/introduction/">getting started guide</a>.</p>
  </div>
</footer>



      
  </body>
</html>
