<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./ASSETS/css/bootstrap.min.css" rel="stylesheet" media="screen">

<title>Register</title>
</head>
<body>

	<div class="container">
		<div class="wrapper">
			<form action="Login" method="post" class="form-signin">
			<h3 class="form-signin-heading">Register</h3>
				<hr class="colorgraph">
				<br>
				<label>Type de création de compte:</label>
				 <label class="radio-inline"><input type="radio" name="optradio" value=0>par affiliation</label>
    			<label class="radio-inline"><input type="radio" name="optradio" value=1>par création</label>
   				<br>
   				<input type="text" class="form-control" name="type"	placeholder="type" required="" autofocus="" /><br>
				<label>Nom:</label>
				<input type="text" class="form-control" name="nom"	placeholder="Entrer votre nom" required="" autofocus="" /><br>
				<label>Prénom:</label>
				<input type="text" class="form-control" name="prenom"	placeholder="Entrer votre prénom" required="" autofocus="" /><br>
				<label>Email:</label>
				<input type="text" class="form-control" name="email"	placeholder="Entrer votre e-mail" required="" autofocus="" /><br>
				<label>Code postal:</label>
				<input type="text" class="form-control" name="codePostal"	placeholder="Entrer votre code postal" required="" autofocus="" /><br>
				<button class="btn btn-md btn-primary btn-block" name="Creation" value="Creation" type="Submit">Création de compte</button>
			</form>
		</div>
	</div>
</body>
</html>