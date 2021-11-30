/*
 * Created on 10 Sep 2013
 * Revised 22 Oct 2017
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.tutorial.jaxrs.calc;

import java.io.IOException;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
 
public class CalcRESTStartUp {
 
    static final String BASE_URI = "http://localhost:1118/calcrest/";
 
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServerFactory.create(BASE_URI);
            server.start();
            System.out.println("Press Enter to stop the server. ");
            System.in.read();
            server.stop(0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}