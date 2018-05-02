<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, target-densityDpi=device-dpi, user-scalable=no"/>
<title>Login Failed</title>

<link rel="stylesheet" type="text/css" href="../css/OM.css">

<body>
    <!-- Code Starts Here-->
    <div class="container1 selectWidth50">
      <div id="alertBox">
        <div class="alertboxContent">
          <div class="spacer1"></div>
          <div>
          	Unable to login, <br>
            please try again.
          </div>
          <div class="spacer2"></div>
          <form action = "relogin">
          <div>
            <input type="submit" value="OK" class="alertButtonblue">
          </div>
          </form>
          <div class="clear"></div>
          <div class="spacer1"></div>
        </div>
      </div>
    </div>
    <!-- Code Ends Here-->

</body>
</html>