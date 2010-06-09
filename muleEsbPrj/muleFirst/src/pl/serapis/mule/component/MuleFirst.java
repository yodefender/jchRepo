package pl.serapis.mule.component;

import java.rmi.RemoteException;

import org.mule.component.simple.LogComponent;

import pl.serapis.ws.TestFirstProxy;

public class MuleFirst extends LogComponent implements IMuleFirst {

	public int add(int i, int j) {
		
		log("this is : "+this.getClass().getName());
		log("params : "+i+" and "+j);

		//call web service
		TestFirstProxy proxy = new TestFirstProxy();
		try {
			
			return proxy.add(i, j);
			
		} catch (RemoteException e) {

			e.printStackTrace();
			
		};
		
		return 0;
	}

}
