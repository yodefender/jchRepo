/**
 * Ptk_channel_sgwServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.centertel.ptk.channel.sgw.registerCustomerComplaint;

public class Ptk_channel_sgwServiceLocator extends org.apache.axis.client.Service implements pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwService {

    public Ptk_channel_sgwServiceLocator() {
    }


    public Ptk_channel_sgwServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Ptk_channel_sgwServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ptk_channel_sgwPort0
    private java.lang.String ptk_channel_sgwPort0_address = "http://stranger2:6655/soap/docLiteral";

    public java.lang.String getptk_channel_sgwPort0Address() {
        return ptk_channel_sgwPort0_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ptk_channel_sgwPort0WSDDServiceName = "ptk_channel_sgwPort0";

    public java.lang.String getptk_channel_sgwPort0WSDDServiceName() {
        return ptk_channel_sgwPort0WSDDServiceName;
    }

    public void setptk_channel_sgwPort0WSDDServiceName(java.lang.String name) {
        ptk_channel_sgwPort0WSDDServiceName = name;
    }

    public pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwPortType getptk_channel_sgwPort0() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ptk_channel_sgwPort0_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getptk_channel_sgwPort0(endpoint);
    }

    public pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwPortType getptk_channel_sgwPort0(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwBindingStub _stub = new pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwBindingStub(portAddress, this);
            _stub.setPortName(getptk_channel_sgwPort0WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setptk_channel_sgwPort0EndpointAddress(java.lang.String address) {
        ptk_channel_sgwPort0_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwBindingStub _stub = new pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwBindingStub(new java.net.URL(ptk_channel_sgwPort0_address), this);
                _stub.setPortName(getptk_channel_sgwPort0WSDDServiceName());
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
        if ("ptk_channel_sgwPort0".equals(inputPortName)) {
            return getptk_channel_sgwPort0();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://centertel.pl/ptk/channel/sgw/registerCustomerComplaint", "ptk_channel_sgwService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://centertel.pl/ptk/channel/sgw/registerCustomerComplaint", "ptk_channel_sgwPort0"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ptk_channel_sgwPort0".equals(portName)) {
            setptk_channel_sgwPort0EndpointAddress(address);
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
