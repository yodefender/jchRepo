package pl.serapis.mule.component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IMuleFirst {
	
	@WebMethod(operationName="add")
	public int add(@WebParam(name="i")int i,@WebParam(name="j") int j);

}
