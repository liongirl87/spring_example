<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<title>${title}</title>
</head>
<body>
	<div class="container">
		<h1>${title}</h1>
		
		<table class="table table-striped">
			<tr>
				<th>번호</th>
				<td>${user.id}</td>		
			</tr>
			<tr>
				<th>이름</th>
				<td>${user.name}</td>		
			</tr>
			<tr>
				<th>생년월일</th>
				<td>${user.yyyymmdd}</td>		
			</tr>
			<tr>
				<th>이메일</th>
				<td>${user.email}</td>		
			</tr>
			<tr>
				<th>자기소개</th>
				<td>${user.introduce}</td>		
			</tr>
			<tr>
				<th>생성일</th>
				<td>${user.createdAt}</td>		
			</tr>
			<tr>
				<th>수정일</th>
				<td>${user.updatedAt}</td>		
			</tr>
		</table>
	</div>
	
	
</body>
</html>