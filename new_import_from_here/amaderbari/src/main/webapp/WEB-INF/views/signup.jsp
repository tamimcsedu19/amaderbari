<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Sign Up</title>
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
                <form:form role="form" action="signup" method="post" modelAttribute="user">
                    <h2>Please Sign Up <small>It's free and always will be.</small></h2>
                    <hr class="colorgraph">
                    <div class="row">
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="first_name" type="text" name="first_name" id="first_name" class="form-control input-lg" placeholder="First Name" tabindex="1"></form:input>
                                <form:errors path="first_name" cssclass="error"></form:errors>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="last_name" type="text" name="last_name" id="last_name" class="form-control input-lg" placeholder="Last Name" tabindex="2"></form:input>
                                <form:errors path="last_name" cssclass="error"></form:errors>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <form:input path="email" type="email" name="email" id="email" class="form-control input-lg" placeholder="Email Address" tabindex="4"></form:input>
                        <form:errors path="email" cssclass="error"></form:errors>
                    	${userExistsError}
                    </div>
                    <div class="row">
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="password" type="password" name="password" id="password" class="form-control input-lg" placeholder="Password" tabindex="5"></form:input>
                                <form:errors path="password" cssclass="error"></form:errors>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="password_confirmation" type="password" name="password_confirmation" id="password_confirmation" class="form-control input-lg" placeholder="Confirm Password" tabindex="6"></form:input>
                                <form:errors path="password_confirmation" cssclass="error"></form:errors>
                            </div>
                        </div>
                    </div>
                    <hr class="colorgraph">
                    <div class="row">
                        <div class="col-xs-12 col-md-6"><input type="submit" value="Register" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
                        <div class="col-xs-12 col-md-6"><a href="/amaderbari" class="btn btn-success btn-block btn-lg">Sign In</a></div>
                    </div>
                </form:form>
            </div>
        </div>
        </div>
</body>
</html>
