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

		<h2>상품 상세 정보</h2>
		<a class="btn btn-warning"
			href="${root}/product?action=goUpdatePage&code=${product.code}">수정</a>
		<a class="btn btn-danger"
			href="${root}/product/delete?productCode=${product.code}">삭제</a>
		<table class="table table-striped">
			<tr>
				<td>코드</td>
				<td>${product.code}</td>
			</tr>
			<tr>
				<td>모델명</td>
				<td>${product.model}</td>
			</tr>
			<tr>
				<td>가격</td>
				<td>${product.price}</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${product.id}</td>
			</tr>
			<tr>
				<td>등록일</td>
				<td>${product.register_date}</td>
			</tr>
			<tr>
				<td>상세설명</td>
				<td>${product.desc}</td>
			</tr>
		</table>

	</div>
	<%@ include file="/WEB-INF/views/common/footer.jsp"%>