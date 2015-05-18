<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>ADD FLAT</title>
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
                <form:form role="form" action="addFlat" method="post" modelAttribute="flat">
                    <h2> ADD FLATS ONCE TO MANAGE ANYTIME </h2>
                    <hr class="colorgraph">
                    <div class="row">
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="ownerEmail" type="text" name="ownerEmail" id="ownerEmail" class="form-control input-lg" placeholder="Owner Email" tabindex="1"></form:input>
                                <form:errors path="ownerEmail" cssclass="error"></form:errors>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="renterEmail" type="text" name="renterEmail" id="renterEmail" class="form-control input-lg" placeholder="Renter Email" tabindex="2"></form:input>
                                <form:errors path="renterEmail" cssclass="error"></form:errors>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <form:input path="mapUrl" type="text" name="mapUrl" id="mapUrl" class="form-control input-lg" placeholder="Map Url" tabindex="4"></form:input>
                        <form:errors path="mapUrl" cssclass="error"></form:errors>
                    </div>
                    <div class="row">
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="squareFoot" type="text" name="squareFoot" id="squareFoot" class="form-control input-lg" placeholder="Square Foot" tabindex="5"></form:input>
                                <form:errors path="squareFoot" cssclass="error"></form:errors>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6">
                            <div class="form-group">
                                <form:input path="rent" type="squareFoot" name="rent" id="rent" class="form-control input-lg" placeholder="Rent" tabindex="6"></form:input>
                                <form:errors path="rent" cssclass="error"></form:errors>
                            </div>
                        </div>
                    </div>
                    <hr class="colorgraph">
                    <div class="row">
                        <div class="col-xs-12 col-md-6"><input type="submit" value="Register" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
                        <div class="col-xs-12 col-md-6"><a href="/amaderbari" class="btn btn-success btn-block btn-lg">ADD Flat</a></div>
                    </div>
                </form:form>
            </div>
        </div>
        </div>
</body>
</html>
