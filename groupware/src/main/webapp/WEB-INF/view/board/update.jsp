<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자유게시판</title>
<script type="text/javascript" src="../js/jquery-1.12.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
<h2>자유게시판 글수정</h2>
<form action="update.do" method="post">
	<input type="hidden" name="no" value="${board.no }"/>
	<label for="title">글제목</label>
	<input type="text" name="title" id="title" value="${board.title }"/><br/>
	<label for="content">글내용</label>
	<textarea rows="7" cols="60" name="content" id="content">${board.content}</textarea><br/>
	<label for="writer">작성자</label>
	<input type="text" value="${login.name }" readonly="readonly"/><br/>
	<input type="hidden" name="writer" value="${login.id }">
	<button>수정</button>
	<button type="button" onclick="history.back()">취소</button>
</form>
</body>
</html>