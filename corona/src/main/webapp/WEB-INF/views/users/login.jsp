<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/login.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<c:choose>
		<c:when test="${isSuccess }">
			
			<script>
				alert("${id} 님 로그인 되었습니다.");
				location.href = "${url}";
			</script>

		</c:when>
		<c:otherwise>
			<script>
				alert("아이디 혹은 비밀번호가 틀려요!");
				location.href = "loginform.do?url=${encodedUrl }";
			</script>			

		</c:otherwise>
	</c:choose>
</div>
</body>
</html>








