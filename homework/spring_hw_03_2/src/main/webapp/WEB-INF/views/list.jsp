<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 사용자 관리</title>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: center; /* 모든 데이터 가운데 정렬 */
    }
    /* 숫자 데이터를 가운데 정렬 */
    td.numeric {
        text-align: center;
    }
</style>
</head>
<body>
	<h1>사용자 목록</h1>

	<%-- request 영역에 users로 등록된 리스트를 반복문을 이용해 출력한다. --%>
	<!-- 코드작성 -->
	<table>
		<thead>
			<tr class="text-center">
				<th scope="col">아이디</th>
				<th scope="col">비밀번호</th>
				<th scope="col">이름</th>
				<th scope="col">이메일</th>
				<th scope="col">나이</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr class="text-center">
					<td>${user.id}</td>
					<td>${user.password}</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td class="numeric">${user.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="">홈으로</a>
	<a href="">추가등록</a>
</body>
</html>