<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
   <head>
		<meta name="viewport" http-equiv="X-UA-Compatible" content="IE=edge,width=device-width, initial-scale=1" />
		<title>Product Manager </title>
		<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
		<link rel="stylesheet" type="text/css" href="../css/OM.css">
		
		<script type="text/javascript" >
	$(document).ready(function() {
		$('#updateSubmitBtn').click(function(){	
			
			var canAdd = performValidationForUpdate();
			if(canAdd != false){
				$.ajax({
				       type: 'POST',
				       url:'addProduct.action?productId='+ $("#productId").val()+'&productName='+$("#productName").val()+'&productDescription='+$("#productDescription").val()+'&relatedProducts='+$("#relatedProducts").val()+'&quantity='+$("#quantity").val(),
				       success: 
				    	   function()
		        	        {
		        	            alert('Record Updated Successfully');
		        	        }
				});
			}

		});
		
		
		$('#updthomePageBtn').click(function(){
			var form = $("#updateproductForm");
			$(form).attr("action", "homePage.action");
			$(form).submit();
		});
		
		function performValidationForUpdate(){
			
			if( $('#productName').val()=="" ||  $('#productDescription').val()=="" ||  $('#relatedProducts').val()==""){
				alert('Required Field(s) Missing');
				return false;		
			}
			
		}
	});
</script>
   </head>

	<body>		
	    <!--Code Starts Here-->
	    <form method="post" enctype="multipart/form-data" id="updateproductForm">
		    <div class="container">
		    	        
		        <div class="headerBarblock">
		        	<div class="floatLeft boldText">&minus;</div>
		            <div class="floatLeft paddingLeft10">Update Producy Inventory</div>
		            <div class="clear"></div>
		        </div>
		        
		         <div class="alignCenter padding15 greybgContent">
     	                <div class="floatLeft selectWidth15">PRODUCT ID</div>
     	                <div class="floatLeft selectWidth15">PRODUCT NAME</div>
		                <div class="floatLeft selectWidth15">DESCRIPTION</div>
		                <div class="floatLeft selectWidth30">RELATED PRODUCTS</div>
		                <div class="floatLeft selectWidth10">QUANTITY</div>
		                <div class="clear"></div>
		            </div>
		            <div class="spacer"></div>  
		            
		            <s:iterator value="productDetailsForUpdateList">
		                <div class="alignCenter padding15">
		                
                            <div class="floatLeft selectWidth15">
		                        <input name="productId" id="productId" type="text" class="inputboxBg selectWidth60" size="15" maxlength="15" value="<s:property value="productId" />" disabled="disabled">
		                    </div>     	
		                    <div class="floatLeft selectWidth15">
		                        <input name="productName" id="productName" type="text" class="inputboxBg selectWidth60" size="15" maxlength="15" value="<s:property value="productName" />">
		                    </div>
		                    <div class="floatLeft selectWidth15">
		                        <input name="productDescription" id="productDescription" type="text" class="inputboxBg selectWidth80" size="80" maxlength="100" value="<s:property value="productDescription" />">
		                    </div>
		                    <div class="floatLeft selectWidth30">
		                        <input name="relatedProducts" id="relatedProducts" type="text" class="inputboxBg selectWidth80" size="60" maxlength="60" value="<s:property value="relatedProducts" />">
		                    </div> 
		                    <div class="floatLeft selectWidth15">
		                        <input name="quantity" id="quantity" type="text" class="inputboxBg selectWidth80" size="60" maxlength="60" value="<s:property value="quantity" />">
		                    </div>                    
		                    <div class="clear"></div>
		                </div>
		                <div class="spacer"></div>
		            </s:iterator>
	               
		    	<!-- Below class to show LEFT and Right border -->
		        <div class="headercontentblock1">                      
		            <div class="container1"> 
		                    
		                    <div class="clear"></div>
		                    <div class="spacer2"></div>                	
		                </div>
		                <div class="clear"></div>                                                            	                
		            </div>
		            
		            <div class="container1"> 
		                <div class="floatLeft selectWidth85 marginLeft20">
		                	<div class="floatLeft selectWidth15">
		                        <input type="button" id="updateSubmitBtn" value=" Update Product " class="greenButton">
		                    </div>  
		                    
		                    <div class="floatLeft selectWidth15">
		                        <input type="button" id="updthomePageBtn" value=" Home " class="greenButton" >
		                    </div>                
		                    
		                    <div class="clear"></div>
		                    <div class="spacer2"></div>
		                </div>
		                <div class="clear"></div>                                            	                
	                </div>

		        </div>
		        <!-- End to show LEFT and Right border -->
		        <!-- Below class to show Bottom border with LEFT and RIGHT rounded corners. -->
		    	<div class="headercontentblock0"></div>
		    	<!-- End to show Bottom border with LEFT and RIGHT rounded corners. -->
		    	<div class="spacer2"></div>        
		    </div>
	    </form>
	    <!--Code Ends Here-->
	
	</body>

</html>
