<%@ page language = "java" contentType = "text/html; charset = ISO-8859-1"
   pageEncoding = "ISO-8859-1"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, target-densityDpi=device-dpi, user-scalable=no"/>
<title>Login Page</title>

<link rel="stylesheet" type="text/css" href="css/OM.css">

<body>
	<form action = "uservalidation">
    <!-- Code Starts Here-->
	<div class="container3">
        <div class="loginForm ">                
            <div class="selectWidth95">
            	<input name="userId" id="userId" type="text" class="inputboxBg" size="15" maxlength="15" placeholder="st764v">
            </div>
            <div class="spacer1"></div>
            <div class="selectWidth95">
            	<input name="password" type="password" class="inputboxBg" placeholder="st764v">
            </div>            
            <div class="container alignCenter">             
                <span class="floatLeft marginTop15">  
                    <a href="#" title="Login Information">
                    	<button class="roundedButtoninfo" type="button" align="top"> </button>
                    </a>
                </span>        
                <input class="loginButtonblue" id="" type="submit" value=" Login " />
            </div>
        </div>
	</div>
    <!-- Code Ends Here-->			
   </form>
</body>
</html>