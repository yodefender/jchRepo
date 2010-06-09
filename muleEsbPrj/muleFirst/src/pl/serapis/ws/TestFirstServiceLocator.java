/**
 * TestFirstServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.serapis.ws;

public class TestFirstServiceLocator extends org.apache.axis.client.Service implements pl.serapis.ws.TestFirstService {

    public TestFirstServiceLocator() {
    }


    public TestFirstServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestFirstServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestFirst
    private java.lang.String TestFirst_address = "http://192.168.0.210:8080/TestWS/TestFirst";

    public java.lang.String getTestFirstAddress() {
        return TestFirst_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestFirstWSDDServiceName = "TestFirst";

    public java.lang.String getTestFirstWSDDServiceName() {
        return TestFirstWSDDServiceName;
    }

    public void setTestFirstWSDDServiceName(java.lang.String name) {
        TestFirstWSDDServiceName = name;
    }

    public pl.serapis.ws.TestFirst getTestFirst() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestFirst_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestFirst(endpoint);
    }

    public pl.serapis.ws.TestFirst getTestFirst(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.serapis.ws.TestFirstSoapBindingStub _stub = new pl.serapis.ws.TestFirstSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestFirstWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestFirstEndpointAddress(java.lang.String address) {
        TestFirst_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.serapis.ws.TestFirst.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.serapis.ws.TestFirstSoapBindingStub _stub = new pl.serapis.ws.TestFirstSoapBindingStub(new java.net.URL(TestFirst_address), this);
                _stub.setPortName(getTestFirstWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TestFirst".equals(inputPortName)) {
            return getTestFirst();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.serapis.pl", "TestFirstService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.serapis.pl", "TestFirst"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestFirst".equals(portName)) {
            setTestFirstEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
