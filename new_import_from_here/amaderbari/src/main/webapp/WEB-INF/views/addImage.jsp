<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="ImageUpload" action="addImage" method="POST" enctype="multipart/form-data">
		<div>
		Select images:  
			<input type="text" id="box"/> 
			<input type="file" id="UploadFile" name="UploadFile"  onchange="CopyMe(this,'box');" accept="image/*" size="40" style="width: 91px;" multiple />
		<br><br>  
		<input type="submit" value="Upload" /><br><br>
		</div>
	</form> 
</body>
</html>