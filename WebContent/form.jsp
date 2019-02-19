<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/helloweb/join" method="post">
		이메일: 
		<input type="email" name="email" />
		<br><br>
		
		비밀번호: 
		<input type="password" name="password" />
		<br><br>
		
		성별: 
		<input type="radio" name="gender" value="male" checked/>남
		<input type="radio" name="gender" value="female" />여
		<br><br>
		
		생년: 
		<select name="birth-year">
			<option value="1994">1994년</option>
			<option value="1995">1995년</option>
			<option value="1996">1996년</option>
			<option value="1997">1997년</option>
			<option value="1998">1998년</option>
		</select>
		<br><br>
		
		취미: 
		<input type="checkbox" name="hobby" value="reading" />독서
		<input type="checkbox" name="hobby" value="swimming" />수영
		<input type="checkbox" name="hobby" value="coding" />코딩
		<br><br>
		
		자기소개:
		<textarea rows="" cols="" name="self-intro"></textarea> <!-- 주의사항 개행 X -->
		
		<input type="submit" value="가입" />
	</form>
</body>
</html>