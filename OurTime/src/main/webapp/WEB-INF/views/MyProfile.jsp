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
    <title>Our Time My Profile</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/checkout/">
	<script src="resources/js/MyProfile.js"></script>
    

    <!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="resources/css/form-validation.css" rel="stylesheet">
  </head>
  <body class="bg-light">
    
<div class="container" >
  <main>
    <div class="py-5 text-center">
      <img class="d-block mx-auto mb-4" src="resources/img/ourTime.jpg" alt="" width="72" height="57">
      <h2>My Profile</h2>
      <p class="lead">회원님의 소중한 정보입니다. <br> 수정또는 탈퇴가 가능합니다.</p>
    </div>

      <div class="col-md-7 col-lg-8">
        <form class="needs-validation" novalidate style="margin-left:450px;" name="frm2">
        <h4 class="mb-3">Information</h4>
          
            <div class="col-12">
              <label for="name" class="form-label">Name</label>
              <div class="input-group">
                <input type="text" class="form-control" id="name" name="name" value="${MyProfile.name}" required readonly="readonly">
              </div>
            </div>
            
            
            <div class="col-12">
              <label for="username" class="form-label">Username</label>
              <div class="input-group">
                <span class="input-group-text">@</span>
                <input type="text" class="form-control" id="username" name="userName" placeholder="Username" required value="${MyProfile.userName}" readonly="readonly">
              </div>
            </div>

            <div class="col-12">
              <label for="address" class="form-label">Password</label>
              <input type="password" class="form-control" id="address" name="password" value="${MyProfile.password}" readonly="readonly" >
            </div>
            
            <div class="col-12">
              <label for="email" class="form-label">Email <span class="text-muted">(Optional)</span></label>
              <input type="email" class="form-control" id="email" name="Email" value="${loginEmail}" readonly="readonly">
            </div>

          <hr class="my-4">

          <input class="w-50 btn btn-primary btn-lg" type="submit" value="수정하기" style="float: left; border: 0;"  onclick="btn_click('Update')">
          <input class="w-50 btn btn-primary btn-lg" type="submit" value="탈퇴하기" style="background-color: gray; border: 0;"onclick="btn_click('Delete')">
        </form>
      </div>
  </main>
    </div>
 

  <footer class="my-5 pt-5 text-muted text-center text-small">
    <p class="mb-1">&copy; 2017–2020 Company Name</p>
    <ul class="list-inline">
      <li class="list-inline-item"><a href="#">Privacy</a></li>
      <li class="list-inline-item"><a href="#">Terms</a></li>
      <li class="list-inline-item"><a href="#">Support</a></li>
    </ul>
  </footer>



    <script src="resources/js/bootstrap.bundle.min.js"></script>

      <script src="resources/js/form-validation.js"></script>
  </body>
</html>
