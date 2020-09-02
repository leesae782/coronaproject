<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<table class="table">
		<tr>
			<th>작성자</th>
			<td>${dto.writer}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.title }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${dto.viewCount }</td>
		</tr>
		<tr>
			<th>작성일자</th>
			<td>${dto.regdate }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${dto.content }</td>
		</tr>						
	</table>
	<c:if test="${dto.writer eq id }">
		<a href="${pageContext.request.contextPath }/cafe/private/updateform.do?num=${dto.num}">
	<button class="btn btn-primary">수정</button>
	</a>
		<a href="${pageContext.request.contextPath }/cafe/private/delete.do?num=${dto.num}">
	<button class="btn btn-primary">삭제</button>
	</a>
	</c:if>
	
	
	<p><a href="list.do">목록으로 돌아가기</a></p>
</div>
</body>
</html>