package pl.serapis.ws;

public class TestFirstProxy implements pl.serapis.ws.TestFirst {
  private String _endpoint = null;
  private pl.serapis.ws.TestFirst testFirst = null;
  
  public TestFirstProxy() {
    _initTestFirstProxy();
  }
  
  public TestFirstProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestFirstProxy();
  }
  
  private void _initTestFirstProxy() {
    try {
      testFirst = (new pl.serapis.ws.TestFirstServiceLocator()).getTestFirst();
      if (testFirst != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testFirst)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testFirst)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testFirst != null)
      ((javax.xml.rpc.Stub)testFirst)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pl.serapis.ws.TestFirst getTestFirst() {
    if (testFirst == null)
      _initTestFirstProxy();
    return testFirst;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (testFirst == null)
      _initTestFirstProxy();
    return testFirst.add(a, b);
  }
  
  
}