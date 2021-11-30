/*
 * Created on 10 Sep 2013
 * Revised 22 Oct 2017
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.tutorial.jaxrs.calc;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("addition")
public class CalcREST {
	public static int scale=5;
	static String[] result = new String[scale];
	
	public String[] invokeIP_Query (String input) {
		URL url;	
		HttpURLConnection connection = null;

		try {
			String urlS = "https://api01.aliyun.venuscn.com/ip?ip="+ input;
			System.out.println(input+"...........................");
			System.out.println(urlS);
			System.out.print('\n');
			Long time1=System.currentTimeMillis();
			url = new URL(urlS);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Authorization","APPCODE 65af6dab7db74d28ad4c7b835d5dfc48");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			Long time2=System.currentTimeMillis();
			//System.out.print(time2-time1);
			//int responseCode = connection.getResponseCode();			
			BufferedReader Reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
			
			String IP_info[];
			String reply;			
			while ((reply = Reader.readLine()) != null) {
				System.out.println(reply);
				reply = reply.replaceAll("\"", "");
				IP_info = reply.split(",");			
				result[0] = IP_info[2].split(":")[1].toString();
					
				result[1] = IP_info[3].split(":")[1].toString();
				
				result[2] = IP_info[5].split(":")[1].toString();
				
				result[3] = IP_info[7].split(":")[1].toString();
				
				result[4] = IP_info[8].split(":")[1].toString();;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

    @GET
    @Path("/input/{input}")
    @Produces(MediaType.TEXT_HTML)
    public String add(@PathParam("input") String input) {
    	invokeIP_Query (input);
    	int i=0;
    	String[] resopnse=new String[scale];
    	
    	for(i=0;i<scale;i++) {
    		resopnse[i]=result[i];
    	}
    	for(i=0;i<scale;i++) {
    		if(resopnse[i]==null)
    			resopnse[i]="Unknown";
    	}
    	 	
    	return "<!doctype html>\r\n" + "<html>\r\n" + "<meta charset=\"utf-8\">\r\n" + "<body>\r\n" + "<style type=\"text/css\">\r\n" + 
    			"#mytxt{\r\n" + "width:300px;\r\n" + "height:200px;\r\n" + "background:#93a875;\r\n" + "}\r\n" + 
    			
    			".myfont1{\r\n" + "font-size:30px;\r\n" + "font-style:normal;\r\n" + "font-weight:bold;\r\n" + "font-family:宋体;\r\n" + "}\r\n" + 
    			
    			".myfont2{\r\n" + "font-size:25px;\r\n" + "font-style:italic;\r\n" + "font-weight:initial;\r\n" + "font-family:方正姚体;\r\n" + "}\r\n" + 
    			
    			
    			"  #white{\r\n" + 
    			"    color:white;\r\n" + 
    			"    }\r\n" + 
    			"  </style>\r\n" + 
    			
    			"  <div id=\"mytxt\">\r\n" + 
    			"    <p1 id=\"white\" style=\"position:absolute; left:30px; top:40px\" class=\"myfont2\">"+"isp:"+resopnse[0]+"</p1>\n" + 
    			"    <p2 id=\"white\" style=\"position:absolute; left:30px; top:70px\" class=\"myfont2\">"+"area:"+resopnse[1]+"</p2>\r\n" + 
    			"    <p3 id=\"white\" style=\"position:absolute; left:30px; top:100px\" class=\"myfont2\">"+"region:"+resopnse[2]+"</p3>\r\n" + 
    			"    <p4 id=\"white\" style=\"position:absolute; left:30px; top:130px\" class=\"myfont2\">"+"city:"+resopnse[3]+"</p4>\r\n" + 
    			"    <p5 id=\"white\" style=\"position:absolute; left:30px; top:160px\" class=\"myfont2\">"+"countryID:"+resopnse[4]+"</p4>\r\n" + 
    			"  </div>\r\n" + 
    			"</body>\r\n" + 
    			"</html>";

    }
   
}
