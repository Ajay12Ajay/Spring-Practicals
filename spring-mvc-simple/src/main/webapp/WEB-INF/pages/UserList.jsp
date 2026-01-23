<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<div align="center">
		<h1 style="color: navy">UserList</h1>
		<span style="color: green">${success}</span>
		<sf:form method="post" modelAttribute="form">

			<table>
				<tr>
					<th>FirstName</th>
					<td><sf:input path="firstName" /> <input type="submit"
						name="operation" value="search"></td>
				</tr>
			</table>


			<table style="width: 100%" border="1px">
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Login</th>
					<th>PassWord</th>
					<th>DOB</th>
					<th>Address</th>
				</tr>

				<c:forEach items="${list}" var="user">
					<tr>
						<td><c:out value="${user.id}"></c:out></td>
						<td><c:out value="${user.firstName}"></c:out></td>
						<td><c:out value="${user.lastName}"></c:out></td>
						<td><c:out value="${user.login}"></c:out></td>
						<td><c:out value="${user.password}"></c:out></td>
						<td><fmt:formatDate value="${user.dob}" pattern="dd/MM/yyyy" /></td>
						<td><c:out value="${user.address}"></c:out></td>
					</tr>
				</c:forEach>
			</table>

			<table style="width: 100%">
				<tr>
					<td style="width: 25%" al><input type="submit"
						name="operation" value="previous"></td>
					<td style="width: 25%" align="center"><input type="submit"
						name="operation" value="add"></td>
					<td style="width: 25%" align="center"><input type="submit"
						name="operation" value="delete"></td>
					<td style="width: 25%" align="right"><input type="submit"
						name="operation" value="next"></td>
				</tr>
			</table>


		</sf:form>
	</div>


</body>
</html>