<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>customer::modify</title>
	</head>
	<body>
		<h3>고객등록</h3>
		<a href="/BookStore/">처음으로</a>
		<a href="/BookStore/customer/list">고객목록</a>
		
		<form action="/BookStore/customer/modify" method="post">
			<table border="1">
				<tr>
					<td>도서번호</td>
					<td><input type="text" name="custId" value="${customers.custId}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>도서명</td>
					<td><input type="text" name="custName" value="${customers.name}"></td>
				</tr>
				<tr>
					<td>출판사</td>
					<td><input type="text" name="address" value="${customers.address}"></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="number" name="phone" value="${customers.phone}"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="수정"></td>
				</tr>
			</table>
		</form>
	</body>
</html>