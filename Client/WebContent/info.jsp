<%@ page import="mws.MathServiceContractImpService" %> 
<%@ page import="mws.MathServiceContract" %> 
<%@ page import="mws.MathServiceContractImpService" %> 
<%@ page import="mws.MathServiceContract" %> 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <html> 
 	<head> 
 		<title>Client</title> 
 	</head> 
 	<body> 
 		<%
  			try { 
  		  		 			MathServiceContractImpService mathServiceContractImpService = new MathServiceContractImpService(); 
  		  		 			MathServiceContract mathServiceContract = mathServiceContractImpService.getMathServiceContractImpPort(); 			
  		  		 				}
  		  		 		catch (Exception e){
  		  				e.printStackTrace(); 
  		  					}
  		%> 
						
		<br> <p>Information:</p>
 		get Server Info:
        <%=application.getServerInfo()%>
        <br>
        get Context Path:
        <%=application.getContextPath()%>
         <br>
 		get Real Path:
 		 <%=application.getRealPath("/Application.jsp")%> 
	</body>
</html>