<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<head>
	<title>Amader Bari</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="ratajo">
    <!-- Bootstrap core CSS -->

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
<body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <h1 class="">Manage your flats easily from anywhere</h1>
                </div>
                 <div class="col-md-2"></div>
            </div>

            <div class="row row2">
                <div class="col-md-1"></div>
                <div id="searchdiv" class="col-md-8">
                    <form name="search-box" action="searchFlat" method="GET" class="form-inline" role="form">
                        
                        <div class="form-group">
                            <label for="country"></label>
                            <input type="text" class="form-control" name="country" placeholder="Enter country">
                        </div>

                        <div class="form-group">
                            <label for="col1val"></label>
                            <input type="text" class="form-control" name="col1val" placeholder="Enter division">
                        </div>

                        <div class="form-group">
                            <label for="col2val"></label>
                            <input type="text" class="form-control" name="col2val" placeholder="Enter city">
                        </div>

                        <br>
                        <br>
                        <div class="col-md-4"></div>
                        <button type="submit" class="btn btn-default">Search Flats</button>
                    </form>

                </div><!-- col-md-7-->
                <div class="col-md-3">
                          <form class="form-signin">
                                <h2 class="form-signin-heading">Please sign in</h2>
                                <label for="inputEmail" class="sr-only">Email address</label>
                                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
                                <label for="inputPassword" class="sr-only">Password</label>
                                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                                <div class="checkbox">
                                  <label>
                                    <input type="checkbox" value="remember-me"> Remember me
                                  </label>
                                </div>
                                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                              </form>
                              
							  <form action="signup" method="get">
							  	<h3>Don't have an account?</h3>
							  	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button>
							  </form>
							
                </div> <!-- colmd-4 -->
                <div>
                	<form action="addFlat" method="get">
						<h3 align="center">Want to add flats</h3>
						<button class="btn btn-lg btn-primary btn-block" type="submit">ADD FLAT</button>
					</form>
                </div>
            </div><!--/row-->
        </div><!--container-->
</body>



</html>
