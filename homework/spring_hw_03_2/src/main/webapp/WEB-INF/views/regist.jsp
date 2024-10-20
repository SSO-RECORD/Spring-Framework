<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 사용자 관리</title>
</head>
<body>
	<h1>SSAFY 사용자 관리</h1>
	<!-- 코드작성 -->
	<hr>
	<h4>사용자 정보 입력</h4>
	<form action="./regist" method="post">
		<table>
			<tr>
				<td><label for="userid">아이디</label></td>
				<td><input type="text" id="userid" name="id"
					placeholder="id"></td>
			</tr>
			<tr>
				<td><label for="userpw">비밀번호</label></td>
				<td><input type="password" id="userpw" name="password"
					placeholder="password"></td>
			</tr>
			<tr>
				<td><label for="username">이름</label></td>
				<td><input type="text" id="username" name="name"
					placeholder="name"></td>
			</tr>
			<tr>
				<td><label for="useremail">이메일</label></td>
				<td><input type="email" id="useremail" name="email"
					placeholder="email"></td>
			</tr>
			<tr>
				<td><label for="userage">나이</label></td>
				<td><input type="number" id="userage" name="age" value="0"
					placeholder="age" min="0"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="등록"> <input
					type="reset" value="초기화"></td>
			</tr>
		</table>
	</form>
</body>
</html>