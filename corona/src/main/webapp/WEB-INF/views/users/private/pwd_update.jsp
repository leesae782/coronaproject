<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/private/pwd_update.jsp</title>
</head>
<body>
<div class="container">
	<c:choose>
		<c:when test="${isSuccess }">
			<script>
				alert("${id} 님 비밀번호를 수정 했습니다.");
				location.href="info.do";
			</script>

		</c:when>
		<c:otherwise>
			<script>
				alert("비밀번호 수정 실패");
				location.href="pwd_updateform.do";
			</script>

		</c:otherwise>
	</c:choose>
</div>
</body>
</html>





