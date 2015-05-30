<%@page import="sdp.ratajo.amaderbari.dao.AddressDao"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="sdp.ratajo.amaderbari.dao.FlatDao"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="java.util.List"%>
<%@page import="sdp.ratajo.amaderbari.dto.flatpack.Flat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<img  src="logo.png"/>

		<ul class="properties_list">
		<%

			List<Flat> flats = (List<Flat>)request.getAttribute("flats");
			List<Address> addresses = (List<Address>) request.getAttribute("address");
		    for(int i=0; i<flats.size(); ++i)
		    {
		    	Flat flat = flats.get(i);
		    	Address address = addresses.get(i);
		    	out.println(address);
		    	out.println("<div id='flat'>" + "Flat Id : " + flat.getFlatId() + "<br>" +
		    			"Square Feet : " + flat.getSquareFoot() + "<br>" +
		    			"Rent : " + flat.getRent() + "<br> <br> <br> </div>"
		    			);
		    }
		%>
		</ul>

</body>
</html>
