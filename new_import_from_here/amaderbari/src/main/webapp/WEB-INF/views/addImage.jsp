<head>
	<title>ADD IMAGE</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/signup.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

    <script type="text/javascript" src="js/signup.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
  //copyme
 	function CopyMe(oFileInput, sTargetID) {
        var arrTemp = oFileInput.value;
        confirm("SOMTHING " + arrTemp);
        document.getElementById(sTargetID).value = arrTemp;
    }
    </script>

</head>
<body>
	<form name="ImageUpload" action="addImage" method="POST" enctype="multipart/form-data">
		<div>
		Select images:
			<br> 
			<input type="text" id="box1" name="image1"/> 
			<input type="file" id="UploadFile1" onchange="CopyMe(this,'box1');"/>
			<br>
			<input type="text" id="box2" name="image2"/>
			<input type="file" id="UploadFile2"  onchange="CopyMe(this,'box2');" />
			<br>
			<input type="text" id="box3" name="image3"/>
			<input type="file" id="UploadFile3"  onchange="CopyMe(this,'box3');"  />
			<br>
			<input type="text" id="box4" name="image4"/>
			<input type="file" id="UploadFile4"  onchange="CopyMe(this,'box4');" />
			<br>
			<input type="text" id="box5" name="image5"/>
			<input type="file" id="UploadFile5" onchange="CopyMe(this,'box5');" />
			
		<br><br>  
		<input type="submit" value="Upload" /><br><br>
		</div>
	</form> 
</body>
</html>