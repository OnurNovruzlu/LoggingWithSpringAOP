<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Add TODO</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<nav class="navbar bg-primary" data-bs-theme="dark">
  <div class="container-todo">
    <a class="navbar-brand" href="/">TODO List</a>
    <a class="navbar-brand" href="#">Add TODO</a>
  </div>
</nav>
<section class="forum-div">
<form action="/add" method="post" class="form-myform">
  <div class="mb-1">
    <input type="text" class="form-control" name="name" placeholder="Enter TODO's name">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</section>
</body>
</html>