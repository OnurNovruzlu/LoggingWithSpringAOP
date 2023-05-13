<%@ page import="java.util.List" %>
<%@ page import="az.coftea.rest.TodoDto" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>TODO LIST</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<nav class="navbar bg-primary" data-bs-theme="dark">
  <div class="container-todo">
    <a class="navbar-brand" href="/">TODO List</a>
    <a class="navbar-brand" href="/addTodo">Add TODO</a>
  </div>
</nav>
<%
	List<TodoDto> todos= (List<TodoDto>) request.getAttribute("todos");
	for (int i=0;i< todos.size();i++){
%>
<div class="setir-divi">
	<div class="name-divi"><span><%=todos.get(i).getName()%></span></div>
	<div class="butonlar-divi">
		<form action="/update" method="post">
			<input type="hidden" name="id" value="<%=todos.get(i).getId()%>">
			<input type="text" name="name" placeholder="Enter new Name">
			<button class="btn btn-primary">Update</button>
		</form>
		<form action="/delete" method="post">
			<input type="hidden" name="id" value="<%=todos.get(i).getId()%>">
			<button class="btn btn-danger">Delete</button>
		</form>
	</div>
</div>
<%}%>
</body>
</html>