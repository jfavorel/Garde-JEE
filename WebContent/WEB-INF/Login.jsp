<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./ASSETS/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link rel="stylesheet" type="text/css" href="./ASSETS/login.css">

<title>Insert title here</title>
</head>
<body>

	
	<div class="container">
		<div class="wrapper">
			<form action="Login" method="post" class="form-signin">
				<h3 class="form-signin-heading">Connexion</h3>
				<hr class="colorgraph">
				<br>
				 <input type="text" class="form-control" name="nom"	placeholder="Username" required="" autofocus="" />
				  <input type="password" class="form-control" name="prenom" placeholder="Email" required="" />

				<button class="btn btn-md btn-primary btn-block" name="Submit" value="Login" type="Submit">Login</button>
			</form>
			
		</div>
		<form action="Register" method="get" class="form-signin">
			<button class="btn btn-md btn-primary btn-block" name="register" value="Register" type="Submit">Register</button>
		</form>
	</div>

</body>
</html>