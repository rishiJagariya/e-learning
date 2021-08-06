<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<form action="" onsubmit="" method="post">
		<div class="form-group">
			<label for="UserType">Type of User</label> 
			<br/>
			<div class="form-check-inline">
				<label class="form-check-label" for="trainer">Trainer</label>
				<input class="form-check-input" type="radio" name="trainer" id="trainer" value="trainer" > 
			
				<label class="form-check-label" for="female">Student</label>
				<input class="form-check-input" type="radio" name="student" id="student" value="student"> 
			</div>
		</div>
		<!-- 
			usertype
			username 
			password
			confirm password
			name
			dob
		 -->
	</form>

</body>
</html>