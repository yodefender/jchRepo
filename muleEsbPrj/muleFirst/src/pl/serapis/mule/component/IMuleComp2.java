package pl.serapis.mule.component;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IMuleComp2 {
	
	@WebMethod(operationName="getParamsName")
	public List<String> getParamsName(String name);

}
