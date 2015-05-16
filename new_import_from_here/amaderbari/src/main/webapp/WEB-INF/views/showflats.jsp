<%@page import="sdp.ratajo.amaderbari.dto.addresspack.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>
<body>
	<% Address addr = (Address) request.getAttribute("addr"); %>
	You were searching for ${addr.getAddressArgument1()} and ${addr.getAddressArgument2() }
</body>
</html>