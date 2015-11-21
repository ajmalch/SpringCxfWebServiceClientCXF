package com.example.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-11-01T20:40:54.687+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://webservice.example.com/", name = "IBankAccountService")
@XmlSeeAlso({ObjectFactory.class})
public interface IBankAccountService {

    @WebMethod
    @RequestWrapper(localName = "addUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetails")
    @ResponseWrapper(localName = "addUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.AddUserDetailsResponse")
    public void addUserDetails(
        @WebParam(name = "user", targetNamespace = "")
        com.example.webservice.UserDetails user
    );

    @WebMethod
    @RequestWrapper(localName = "getUserDetails", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetails")
    @ResponseWrapper(localName = "getUserDetailsResponse", targetNamespace = "http://webservice.example.com/", className = "com.example.webservice.GetUserDetailsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.example.webservice.UserDetails getUserDetails(
        @WebParam(name = "userName", targetNamespace = "")
        java.lang.String userName
    );
}
