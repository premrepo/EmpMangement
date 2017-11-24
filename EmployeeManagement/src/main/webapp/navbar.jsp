<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css">
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
<script type="text/javascript">
	function validate() {
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		if (username.length == 0 || password.length == 0) {
			alert("Please enter username and password !")
			return false;
		}
		return true;
	}
</script>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<a class="navbar-brand" href="#"> Employee Management </a>

	<!-- Links -->
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" href="register.jsp">Register</a>
		</li>
		<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
		<li class="nav-item"><a class="nav-link" href="index.jsp">Login</a>
		</li>
	</ul>
</nav>