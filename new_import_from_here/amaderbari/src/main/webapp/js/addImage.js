//copyme
     	function CopyMe(oFileInput, sTargetID) {
            var arrTemp = oFileInput.value.split('\\');
            confirm("SOMTHING " + arrTemp);
            document.getElementById(sTargetID).value = arrTemp[arrTemp.length - 1];
        }
     	