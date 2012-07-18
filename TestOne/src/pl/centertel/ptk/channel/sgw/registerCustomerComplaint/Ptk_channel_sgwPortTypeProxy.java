package pl.centertel.ptk.channel.sgw.registerCustomerComplaint;

public class Ptk_channel_sgwPortTypeProxy implements pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwPortType {
  private String _endpoint = null;
  private pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwPortType ptk_channel_sgwPortType = null;
  
  public Ptk_channel_sgwPortTypeProxy() {
    _initPtk_channel_sgwPortTypeProxy();
  }
  
  public Ptk_channel_sgwPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPtk_channel_sgwPortTypeProxy();
  }
  
  private void _initPtk_channel_sgwPortTypeProxy() {
    try {
      ptk_channel_sgwPortType = (new pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwServiceLocator()).getptk_channel_sgwPort0();
      if (ptk_channel_sgwPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ptk_channel_sgwPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ptk_channel_sgwPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ptk_channel_sgwPortType != null)
      ((javax.xml.rpc.Stub)ptk_channel_sgwPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwPortType getPtk_channel_sgwPortType() {
    if (ptk_channel_sgwPortType == null)
      _initPtk_channel_sgwPortTypeProxy();
    return ptk_channel_sgwPortType;
  }
  
  public localhost.ptk.channel.sgw.registerCustomerComplaint.DocRegisterCustomerComplaintOut2 registerCustomerComplaint(localhost.ptk.channel.sgw.registerCustomerComplaint.DocRegisterCustomerComplaintIn2 docRegisterCustomerComplaintIn) throws java.rmi.RemoteException{
    if (ptk_channel_sgwPortType == null)
      _initPtk_channel_sgwPortTypeProxy();
    return ptk_channel_sgwPortType.registerCustomerComplaint(docRegisterCustomerComplaintIn);
  }
  
  
}