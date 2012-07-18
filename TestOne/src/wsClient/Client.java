package wsClient;

import java.rmi.RemoteException;

import localhost.ptk.channel.sgw.registerCustomerComplaint.DocRegisterCustomerComplaintIn2;
import localhost.ptk.channel.sgw.registerCustomerComplaint.DocRegisterCustomerComplaintIn2Address;
import localhost.ptk.channel.sgw.registerCustomerComplaint.DocRegisterCustomerComplaintIn2ContactPhone;
import localhost.ptk.channel.sgw.registerCustomerComplaint.DocRegisterCustomerComplaintIn2Object;
import localhost.ptk.channel.sgw.registerCustomerComplaint.DocRegisterCustomerComplaintOut2;
import pl.centertel.ptk.channel.sgw.registerCustomerComplaint.Ptk_channel_sgwPortTypeProxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ptk_channel_sgwPortTypeProxy proxy = new Ptk_channel_sgwPortTypeProxy();
		proxy.setEndpoint("http://jch:jch@stranger2:6655/soap/docLiteral");
		DocRegisterCustomerComplaintIn2 documentIn = new DocRegisterCustomerComplaintIn2();
		documentIn.setObject(new DocRegisterCustomerComplaintIn2Object("1", null, null, null, null, null, null, null, null, null, null));
		documentIn.setAddress(new DocRegisterCustomerComplaintIn2Address("1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
		documentIn.setContactPhone(new DocRegisterCustomerComplaintIn2ContactPhone("1", null));
		documentIn.setServiceType("1");
		documentIn.setService("1");
		documentIn.setServiceDetailed("1");
		documentIn.setSymptom("1");
		documentIn.setSymptomDetailed("1");
		documentIn.setContactMethod("1");
		DocRegisterCustomerComplaintOut2 documentOut;
		try {
			
			documentOut = proxy.registerCustomerComplaint(documentIn);
			
			System.out.println(documentOut.getResult().getErrorCode());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
