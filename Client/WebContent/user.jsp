<%@ page import="mws.MathServiceContractImpService" %> 
<%@ page import="mws.MathServiceContract" %> 
<%@ page import="mws.MathServiceContractImpService" %> 
<%@ page import="mws.MathServiceContract" %> 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
 <html> 
 	<head> 
 		<title>Client</title> 
 	</head> 
 	<body bgcolor="#f1f1f1"> 
 	<div style="width:500px; height:200px; margin:15px auto; border:1px solid ">
 		<div style="width:190px; height:150px; margin:10px auto;">
 		<% try { 
 			MathServiceContractImpService mathServiceContractImpService = new MathServiceContractImpService(); 
 			MathServiceContract mathServiceContract = mathServiceContractImpService.getMathServiceContractImpPort(); 
 			 %> 		
 			<p>IP Home Location Query<p>
 			<div >
    			<form action="user.jsp" method="post">
        		<table>
            <tr>
                
            </tr>
             <tr>
                <td>Input:</td>
                 <td><input type="text" name="ip" placeholder="ip address"></td>
            </tr>
            
             <tr>
                 <td colspan="2">
                 <br>
                <input type="submit" value="Submit">
                 <input type="reset" value="Reset" >
             	</tr>
         		</table>
     		</form><br>
     	<div style="color: #ff4e40">
   <%
   response.setIntHeader("Refresh", 60);
   Calendar calendar = new GregorianCalendar();
   String am_pm;
   int hour = calendar.get(Calendar.HOUR);
   int minute = calendar.get(Calendar.MINUTE);
   if(calendar.get(Calendar.AM_PM) != 0)
	   hour+=12;
   String CT=new String();
   if(minute<10)
	   CT = hour+":"+0+ minute ;
   else CT = hour+":"+ minute ;
   out.println("Current Time: " + CT + "\n");
   %>
	</div>
   <%
   request.setCharacterEncoding("utf-8");
   String input = request.getParameter("ip");
   //out.println(mathServiceContract.tset());
   if(input!=null)
		response.setHeader("Refresh", "0;url="+mathServiceContract.sendRequest(input)); 
	%>
		<%	 
 				}
 		catch (Exception e){
					e.printStackTrace(); 
						} %> 
		</div>
	</div>
<script>
	form.projectPorperty.value = '${user.projectPorperty}';
</script>
 		
	</body>
</html>