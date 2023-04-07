<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>

<title>학생 정보 추가</title>
</head>
<body>
	<div class="container">
		<h1>학생 정보 추가</h1>
		<form method="post" action="/lesson04/ex02/add_student">
			<div class="form-group">
				<label> 이름 <input type="text" name="name"
					class="form-control">
				</label>
			</div>
			<div class="form-group">
				<label> 휴대폰번호 <input type="text" name="phoneNumber"
					class="form-control">
				</label>
			</div>
			<div class="form-group">
				<label> 이메일주소 <input type="text" name="email"
					class="form-control">
				</label>
			</div>
			<div class="form-group">
				<label> 장례희망 <input type="text" name="dreamJob" class="form-control">
				</label>
			</div>
			<button type="submit" class="btn btn-info">추가</button>
			
		</form>
	</div>

</body>
</html>