<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<ul class="navbar-nav me-auto">
		<li class="nav-item"><a class="nav-link"
			href="${root}/">메인</a></li>
		<li class="nav-item"><a class="nav-link"
			href="${root}/product/list">상품 목록</a></li>
		<li class="nav-item"><a class="nav-link"
			href="${root}/product/goRegist">상품 등록</a></li>
	</ul>
	<c:choose>
		<c:when test="${empty userinfo}">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${root}/user?action=goLoginPage">로그인</a></li>
			</ul>
		</c:when>
		<c:otherwise>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="${root }/user?action=goDetailPage">${userinfo.name}님 반갑습니다.</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${root}/user?action=logout">로그아웃</a></li>
			</ul>
		</c:otherwise>
	</c:choose>
</nav>