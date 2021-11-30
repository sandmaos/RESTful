/*
 * Created on 10 Sep 2013
 * Revised 22 Oct 2017
 *
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.tutorial.jaxrs.calc.client;

import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
 
public class CalcRESTClient {
    static final String REST_URI = "http://localhost:1118/calcrest";
    static final String PATH = "/addition/input/";
 
    public static void main(String[] args) {
 
        String input ="218.18.228.178";
 
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource service = client.resource(REST_URI);
 
        WebResource addService = service.path(PATH).path(input);
        System.out.println("Add Response: " + getResponse(addService));
        System.out.println("Add Output as Text: " + getOutputAsText(addService));
        System.out.println("---------------------------------------------------");
    }
 
    private static String getResponse(WebResource service) {
        return service.accept(MediaType.TEXT_XML).get(ClientResponse.class).toString();
    }
 
    private static String getOutputAsXML(WebResource service) {
        return service.accept(MediaType.TEXT_XML).get(String.class);
    }
 
    private static String getOutputAsText(WebResource service) {
        return service.accept(MediaType.TEXT_PLAIN).get(String.class);
    }
}
