<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>JSTL Core 라이브러리(1)</title>
</head>
<body>
	<h2> 1. 변수 정의하기 (c:set)</h2>
	<c:set var="number1" value="100" />
	<c:set var="number2">250</c:set>
	number1: ${number1} <br>
	number2: ${number2}	<br>
	number1 + number2: ${number1 + number2} 
	
	<h2> 2. 변수 출력하기 (c:out)</h2>
	number1: <c:out value="${number1}" /><br>
	<c:out value="Hello world" /><br>
	<%-- 문구 그대로 출력된다 jsp주석만 먹힘--%>
	<c:out value="<script>alert('얼럿창 띄우기')</script>" /><br>
	<c:out value="<script>alert('얼럿창 띄우기')</script>" escapeXml="true"/><br>
	<%-- 스크립트가 수행된다.--%>
	<%-- 	<c:out value="<script>alert('얼럿창 띄우기')</script>" escapeXml="false"/><br> --%>
	
	<h2> 3. 조건문 (c:if)</h2>
	<c:if test="${number1 > 50}">
		number1은 50보다 크다. <br>
	</c:if>
	
	<c:if test="${number1 == 100}">
		number1은 100과 같다.<br>
	</c:if>
	
	<c:if test="${number1 eq 100}">
		number1은 100과 같다.<br>
	</c:if>
	<c:if test="${number1 ne 222}">
		number1은 222가 아니다.<br>
	</c:if>
	<c:if test ="${!empty number1}">
		number1은 비어있지 않다<br>
	</c:if>
<!-- 	아래 방법이 더 정석 -->
	<c:if test ="${not empty number1}">
		number1은 비어있지 않다<br>
	</c:if>
	
</body>
</html>