<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/nav.jsp"%>
	<div class="container p-4">
		<h2>로그인</h2>
		
		<!-- 오류 메시지를 출력할 공간 추가 -->
		<c:if test="${not empty msg}">
			<div class="alert alert-danger">${msg}</div>
		</c:if>
		
		<form action="${root}/user/login" method="post">
			<input type="hidden" name="action" value="login">
			<div class="form-group">
				<label for="id">id:</label> <input type="text" class="form-control"
					id="id" name="id" placeholder="ID 입력"
					value="${cookie.person_id.value}">
			</div>
			<div class="form-group">
				<label for="pw">Password:</label> <input type="password"
					class="form-control" id="pw" name="pw" placeholder="비밀번호 입력">
			</div>
			<div class="form-group form-check">
				<label class="form-check-label"> 
				<input class="form-check-input" type="checkbox" name="remember" value="ok">
					아이디 기억하기
				</label>
			</div>
			<button type="submit" class="btn btn-primary">로그인</button>
			<a class="btn btn-warning" href="${root}/user/goJoin">회원가입</a>
			<a class="btn btn-secondary" href="${root}">메인 페이지로</a>
		</form>
	</div>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>