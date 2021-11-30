package mws;

import mws.MathServiceContractImp; 
import javax.xml.ws.*; 
public class ServiceStart { 
	public static void main(String[] args) { 
		try { 
			Endpoint.publish("http://localhost:5555/mws/mathservice", new MathServiceContractImp()); 
			System.out.println("My Math Service is Available Now"); 			
			} 
		catch (Exception e) { e.printStackTrace(); 
			} 
		} 
	}

//http://localhost:5555/mws/mathservice?wsdl