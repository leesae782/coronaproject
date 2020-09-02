<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록보기</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h1>게시글 목록</h1>
	<table class="table">
		<thead class="thead">
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>조회수</th>
				<th>작성일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tmp" items="${list }">
				<tr>
				<td>${tmp.num }</td>
				<td>${tmp.writer }</td>
				<td><a href="detail.do?num=${tmp.num }">${tmp.title }</a></td>
				<td>${tmp.viewCount }</td>
				<td>${tmp.regdate }</td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
	<a href="private/insertform.do"><button class="btn btn-primary">새글작성</button></a>
</div>
	
	
</body>
</html>