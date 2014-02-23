/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.anneke;

/**
 *
 * @author HOME
 */
public class WebServiceClient {
    
    public static void main(String[] args) {
        
        TestWebService_Service service = new TestWebService_Service();
        TestWebService servicePort = service.getTestWebServicePort();
        String hello = servicePort.test("Artemka", "Anneke");
                
        System.out.println(hello);
   }
}
