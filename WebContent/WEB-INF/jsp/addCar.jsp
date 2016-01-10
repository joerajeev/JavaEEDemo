<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
 <div class="container">
	 <form action="${pageContext.request.contextPath}/cars" method="post">
		<div class="form-group">
			<label for="reg">Registration</label>
			<input name="reg" type="text" class="form-control"><br>
		</div>
		<div class="form-group">
			<label for="make">Make</label>
			<input name="make" type="text" class="form-control"><br>
		</div>
		<div class="form-group">
			<label for="model">Model</label>
			<input name="model" type="text" class="form-control"><br>
		</div>
		<div class="form-group">
			<label for="year">Year</label>
			<input name="year" type="text" class="form-control"><br>
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	 </form>
 </div>
</body>
</html>