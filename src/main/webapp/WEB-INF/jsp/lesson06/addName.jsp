<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

<%-- AJAX를 사용하려면 jquery 원본 필요 --%>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>

<!-- 부트스트랩 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<h1>회원정보추가</h1>
			<div class="form-group">
				<label for="name"><b>이름</b></label>
				<div class="d-flex">
					<input type="text" id="name" class="form-control col-3">
					<button type="button" class="btn btn-info" id="nameCheckBtn">중복확인</button>
				</div>
				<small id="nameStatusArea"></small>	
			</div>
			
			<button type="button" class="btn btn-success" id="joinBtn">가입하기</button>
	</div>
	
<script>
$(document).ready(function(){
	// 중복확인 버튼 클릭
	$("#nameCheckBtn").on('click', function(){
		// #nameStatusArea 하위 태그들을 초기화
		$('#nameStatusArea').empty();
		
		let name = $("#name").val().trim();
		
		// validation
		if (name == "") {
			$("#nameStatusArea").append('<span class="text-danger">이름이 비어있습니다.</span>');
			return;
		}
		// 이름이 중복됐는지 체크 -> AJAX 통신
		$.ajax({
			// request
			type:"get"	//기본적으로 get이기 때문에 생략가능
			,url:"/lesson06/ex02/is_duplication"
			,data:{"name":name}	
			
			// response
			,success:function(data) {
				// {"isDuplication":true}
				// {"code":500, "errorMessange":"실패한이유"}
					if (data.isDuplication) {
						$("#nameStatusArea").append('<span class="text-danger">이름이 중복입니다.</span>');
					}
			}
			,error:function(request, status, error) {
				alert("중복확인에 실패했습니다. 관리자에게 문의해주세요.");
			}
		});
		
		
	});
	
	// 가입 버튼 클릭
	$("#joinBtn").on('click', function(){
		// nameStatusArea 상자 하위 노드들(태그들)이 있는지 확인
		console.log($("#nameStatusArea").children().length);
		if ($("#nameStatusArea").children().length == 0) {
			alert("서버호출가능");
		} else {
			alert("서버호출불가");
		}
	});
	
	
});

</script>
</body>
</html>