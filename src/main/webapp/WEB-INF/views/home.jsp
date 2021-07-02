<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<head> 
    <title>Getting Started: Serving Web Content</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
	
</head>
<body>
	<div class="container-fluid">
		<div class="jumbotron jumbotron-fluid text-center">
			<div class="container">
				<h1 class="display-4">TACO LOCO</h1>
			</div>
		</div>
		<hr>
		<form action="getTotal" method="post" modelAttribute="order" id="orderForm">
		  <div class="row text-center">
		    <div class="col">
		    	<h5>VEGGIE</h5>
		    	<label for="veggieTaco">$2.50</label>
		    	<input type="number" class="form-control" name="veggieTacos" required>
		    </div>
		    <div class="col">
		    	<h5>CHICKEN</h5>
		    	<label for="chickenTaco">$3.00</label>
		    	<input type="number" class="form-control" name="chickenTacos" required>
		    </div>
		    <div class="col">
		    	<h5>BEEF</h5>
		    	<label for="beefTaco">$3.00</label>
		    	<input type="number" class="form-control" name="beefTacos" required>
		    </div>
		    <div class="col">
		    	<h5>CHORIZO</h5>
		    	<label for="chorizoTaco">$3.50</label>
		    	<input type="number" class="form-control" name="chorizoTacos" required>
		    </div>
		  </div>
		  <br>
		  <hr>
			<div class="row text-center">
				<div class="col">
					<button type="submit" class="btn btn-dark" id="submit">SUBMIT ORDER</button>
				</div>
			</div>
		</form>
	</div>
	<script> 
		$("input[type='number']").val('0');
	</script>	
</body>