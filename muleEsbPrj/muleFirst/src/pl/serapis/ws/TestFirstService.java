/**
 * TestFirstService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.serapis.ws;

public interface TestFirstService extends javax.xml.rpc.Service {
    public java.lang.String getTestFirstAddress();

    public pl.serapis.ws.TestFirst getTestFirst() throws javax.xml.rpc.ServiceException;

    public pl.serapis.ws.TestFirst getTestFirst(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
