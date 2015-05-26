<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>ADD ADDRESS</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/signup.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

    <script type="text/javascript" src="js/signup.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">

        <div class="row">
            <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                <form:form role="form" action="addAddress" method="post" modelAttribute="address">
                    <h2 align="center"> ADD FLATS ONCE TO MANAGE ANYTIME </h2>
                    <hr class="colorgraph">
                    
                    <div class="form-group">
                         <div class="form-group">
                             <form:input path="country" type="text" name="country" class="form-control input-lg" placeholder="Country" tabindex="1"></form:input>
                             <form:errors path="country" cssclass="error"></form:errors>
                          </div>
                     </div>
                     <div class="form-group">
                          <div class="form-group">
                              <form:input path="addressArgument1" type="text" name="addressArgument1" id="addressArgument1" class="form-control input-lg" placeholder="Division" tabindex="2"></form:input>
                              <form:errors path="addressArgument1" cssclass="error"></form:errors>
                          </div>
                     </div>
                    
                    <div class="form-group">
                        <form:input path="addressArgument2" type="text" name="addressArgument2" id="addressArgument2" class="form-control input-lg" placeholder="City" tabindex="4"></form:input>
                        <form:errors path="addressArgument2" cssclass="error"></form:errors>
                    </div>
                    <!-- extra argument add -->
                    <hr class="colorgraph">
                    <div class="row">
                        <div class="col-xs-12 col-md-6"><input type="submit" value="ADD ADDRESS" class="btn btn-primary btn-block btn-lg" tabindex="6"></div>
                        <div class="col-xs-12 col-md-6"><a href="/amaderbari" class="btn btn-success btn-block btn-lg">HOME</a></div>
                    </div>
                </form:form>
            </div>
        </div> <!-- address container end -->
        <div class="row">
        	<h2 align="center"> Want to add some image? </h2>
        	<hr class="colorgraph">
            <div class="row">
                 <div><a href="/amaderbari" class="btn btn-success btn-block btn-lg">ADD PICTURES</a></div>
            </div>
        </div>
   </div> <!-- container end -->
</body>
</html>
