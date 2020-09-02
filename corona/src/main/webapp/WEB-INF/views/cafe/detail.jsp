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
	<br /><br />
	<c:if test="${dto.prevNum ne 0 }">
		<a class="btn btn-outline-info btn-sm" href="detail.do?num=${dto.prevNum }&condition=${condition}&keyword=${encodedK}">
			<svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-chevron-up" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  					<path fill-rule="evenodd" d="M7.646 4.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1-.708.708L8 5.707l-5.646 5.647a.5.5 0 0 1-.708-.708l6-6z"/>
			</svg>
			이전글
		</a>	
	</c:if>
	<c:if test="${dto.nextNum ne 0 }">
		<a class="btn btn-outline-info btn-sm" href="detail.do?num=${dto.nextNum }&condition=${condition}&keyword=${encodedK}">
			<svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-chevron-down" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  				<path fill-rule="evenodd" d="M1.646 4.646a.5.5 0 0 1 .708 0L8 10.293l5.646-5.647a.5.5 0 0 1 .708.708l-6 6a.5.5 0 0 1-.708 0l-6-6a.5.5 0 0 1 0-.708z"/>
			</svg>
			다음글
		</a>	
	</c:if>
	<p><a href="list.do">목록으로 돌아가기</a></p>
</div>
</body>
</html>