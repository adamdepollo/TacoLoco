<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>TACO LOCO</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid text-center">
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
				<h1 class="display-4">TACO LOCO</h1>
			</div>
		</div>
		<hr>
		<h4>Your total is:</h4>
		<span>$</span><span>${total}</span>
	</div>
</body>