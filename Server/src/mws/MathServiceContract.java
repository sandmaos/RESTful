package mws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MathServiceContract {	
	
	@WebMethod
	public String sendRequest(String input);
	
		
	@WebMethod
	public double test(double num1, double num2);
		
}