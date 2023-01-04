<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::login</title>
	</head>
<body>
	<h3>User1 로그인</h3>

	<form action="/Ch04/user1/login" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" placeholder="아이디 입력"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pass" placeholder="비밀번호 입력"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="등록">
				</td>
			</tr>
		</table>
	</form>
	<div>
        <h3>회원 로그인 안내</h3>
        <p>
            아직 회원이 아니시면 회원으로 가입하세요.
        </p>
        <div>
            <a href="#">아이디 |</a>
            <a href="#">비밀번호찾기 |</a>
            <a href="#">회원가입</a>
        </div>                    
    </div>
</body>
</html>