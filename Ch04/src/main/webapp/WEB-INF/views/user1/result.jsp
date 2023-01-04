<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::result</title>
	</head>
<body>
	<h3>User1 정보</h3>
	<p>
		아이디 :	${user1VO.uid}<br>
		이름   :	${user1VO.name}<br>
		나이   :	${user1VO.age}<br>
		휴대폰 :	${user1VO.hp}<br>
	</p>
	
	<a href="/Ch04/user1/register">등록하기</a>
	
</body>
</html>