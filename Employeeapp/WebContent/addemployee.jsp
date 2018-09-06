<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Employee Page</title>
</head>
<body bgcolor="pink">
<h1>Add New Employee</h1>
<hr>
<form action="addemployee" method="post">
<label>Employee Id: </label>
<input type="text" name="empId"size="15"/>
<br> <br>
<label>Employee Name: </label>
<input type="text" name="empName"size="15"/>
<br> <br>
<label>Employee Salary: </label>
<input type="text" name="empSalary"size="15"/>
<br> <br>
<label>Employee Department: </label>
	<select name="empDept">
		<option value="">----select----</option>
		<option value="IT">IT</option>
		<option value="ADMIN">ADMIN</option>
		<option value="ACCOUNTS">ACCOUNTS</option>
		<option value="HR">HR</option>
		</select> <br> 
		<input type="submit" value="Add Employee"/>

</form>
</body>
</html>