<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<head>
	<title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <h1>Manage your flats easily from anywhere</h1>
                </div>
                 <div class="col-md-2"></div>
            </div>
            <div class="row">

                <div class="col-md-2"></div>
                <div id="searchdiv" class="col-md-8">
                    <form name="search-box" action="searchFlat" method="GET" class="form-inline" role="form">
                        <div class="form-group">
                            <label for="col1val"></label>
                            <input type="text" class="form-control" name="country" placeholder="Enter country">
                        </div>
                        
                        <div class="form-group">
                            <label for="col1val"></label>
                            <input type="text" class="form-control" name="col1val" placeholder="Enter division">
                        </div>
                        
                        <div class="form-group">
                            <label for="col1val"></label>
                            <input type="text" class="form-control" name="col2val" placeholder="Enter city">
                        </div>
                        
                        <br>
                        <br>
                        <div class="col-md-4"></div>
                        <button type="submit" class="btn btn-default">Search Flats</button>
                    </form>

                </div>
                <div class="col-md-3"></div>
            </div>
        </div>







</body>



</html>
