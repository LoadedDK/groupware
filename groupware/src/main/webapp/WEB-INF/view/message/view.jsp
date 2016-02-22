<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쪽지 보기</title>
</head>
<body>
<h2>쪽지 보기</h2>
<table>
	<tr>
		<th>글번호</th><td>${message.no }</td>
	</tr>
		<tr>
		<th>제목</th><td>${message.title}</td>
	</tr>
		<tr>
		<th>내용</th><td>${message.content }</td>
	</tr>
		<tr>
		<th>보낸사람</th><td>${message.sender}</td>
	</tr>
		<tr>
		<th>받은사람</th><td>${message.receiver}</td>
	</tr>
		<tr>
		<th>보낸시간</th><td>${message.sdate}</td>
	</tr>
		<tr>
		<th>확인시간</th><td>${message.rdate }</td>
	</tr>
	<tr>
		<td colspan="2">
		<a href="delete.do?no=${message.no }"><button>삭제</button></a>
		<a href="list.do?no=${message.no }"><button>쪽지 리스트</button></a>
		
		</td>
	</tr>
</table>
</body>
</html>