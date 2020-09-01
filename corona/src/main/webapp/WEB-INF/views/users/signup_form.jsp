<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/signup_form.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />

</head>
<body>

<div class="container">
	<h1> 회원가입 페이지</h1>
	<form action="signup.do" method="post">
		<div class="form-group">
			<label for="id">아이디</label>
			<input type="text" id="id" name ="id" class="form-control" />
		</div>
		<div class="form-group">
			<label for="pwd">비밀번호</label>
			<input type="password" id="pwd" name ="pwd" class="form-control" />
		</div>
		<div class="form-group">
			<label for="pwd2">비밀번호확인</label>
			<input type="password" id="pwd2" name ="pwd2" class="form-control" />
		</div>
		<div class="form-group">
			<label for="email">이메일</label>
			<input type="text" id="email" name ="email" class="form-control" />
		</div>
		
		<button class="btn btn-outline-dark" type="submit">가입하기</button>
		<button class="btn btn-outline-dark" type="reset">다시작성</button>
	</form>
</div>
</body>
</html>