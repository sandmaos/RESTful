package mws;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebService;
//import com.helloweenvsfei.util.ip.ipSeeker;


@WebService(endpointInterface = "mws.MathServiceContract")
public class MathServiceContractImp implements MathServiceContract{
	
	 @Override
	 public String sendRequest(String input) {
		 {
		        HttpURLConnection con = null;  
		        //BufferedReader buffer = null; 
		        //StringBuffer resultBuffer = null;  
		        try {
		            URL url = new URL("http://localhost:1118/calcrest/addition/input/"+input); 	       
		            con = (HttpURLConnection) url.openConnection(); 		           
		            con.setRequestMethod("POST");  		   
		            con.setRequestProperty("Content-Type", "application/json;charset=GBK");  
		            con.setDoOutput(true);	
		            con.setDoInput(true);		                      
		            con.setUseCaches(false);
//		            int responseCode = con.getResponseCode();
//		            if(responseCode == HttpURLConnection.HTTP_OK){
//		                InputStream inputStream = con.getInputStream();
//		                resultBuffer = new StringBuffer();
//		                String line;
//		                buffer = new BufferedReader(new InputStreamReader(inputStream, "GBK"));
//		                while ((line = buffer.readLine()) != null) {
//		                    resultBuffer.append(line);
//		                }
//		                return resultBuffer.toString();
//		            }
		            return url.toString();
		        }catch(Exception e) {
		            e.printStackTrace();
		        }
		        return "";
		    }
    }
	
	 
	 
    double result;
 
    
    @Override
    public double test(double num1, double num2){
        result = (num1 + num2)/5;
        return result;
    }
      
    
}