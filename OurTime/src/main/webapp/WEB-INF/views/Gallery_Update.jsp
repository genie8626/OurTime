<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.79.0">
    <title>Gallery Write</title>
    <!-- --> 
	<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
	<script type="text/javascript" src="resources/js/Board_Upload.js"></script>
    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/checkout/">
    <script src="resources/js/Gallery_Update.js"></script>
     

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
      <h2>글 쓰기</h2>
      <p class="lead">게시글 수정</p>
    </div>

      <div class="col-md-7 col-lg-8">
        <form role="form" onsubmit="return checkIt()" class="needs-validation" novalidate style="margin-left:450px;" name="frm4" enctype="multipart/form-data">
        <h4 class="mb-3"></h4>
           <input type="hidden" class="form-control" id="title" name="no" value="${detail.no}">
            <div class="col-12">
              <label for="name" class="form-label">제목</label>
              <div class="input-group">
                <input type="text" class="form-control" id="title" name="title" value="${detail.title}">
              <div class="invalid-feedback">
                  	제목을 입력해주세요.
                </div>
              </div>
            </div>
            
            <div class="col-12">
              <label for="name" class="form-label">Email</label>
              <div class="input-group">
                <input type="text" class="form-control" id="email" name="email" value="${detail.email}" readonly="readonly">
              <div class="invalid-feedback">
                  	
                </div>
              </div>
            </div>
            
            
            <div class="col-12">
              <label for="username" class="form-label">내용</label>
              <div class="input-group">
                <textarea class="form-control" id="content" name="content"  rows="10">${detail.content}</textarea>
              <div class="invalid-feedback">
              	    내용을 입력해주세요.
                </div>
              </div>
            </div>

            <div class="col-12">
              <label for="address" class="form-label">첨부파일</label>
              <input type="file" class="form-control" id="upload" name="uploadFile" placeholder="ex)1234" >${detail.filename}
              <div class="invalid-feedback">
                  	사진을 업로드 해주세요
              </div>
            </div>
            
      <div class="loadsult">
		<ul>
		</ul>
		</div>

          <hr class="my-4">

     


           <input class="w-50 btn btn-primary btn-lg" type="submit" value="등록" style="float: left; border: 0;"  onclick="btn_click('Update')">
          <input class="w-50 btn btn-primary btn-lg" type="button" value="취소" style="background-color: gray; border: 0;"onclick="btn_click('cancel')">
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