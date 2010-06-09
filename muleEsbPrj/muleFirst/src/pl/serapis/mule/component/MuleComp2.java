package pl.serapis.mule.component;

import java.util.ArrayList;
import java.util.List;

import org.mule.component.simple.LogComponent;

public class MuleComp2 extends LogComponent implements IMuleComp2{

	public List<String> getParamsName(String name) {

		List<String> list = new ArrayList<String>();
		list.add(name);
//		list.add("string2");
//		list.add("string3");
//		list.add("string4");
//		list.add("string5");
		
		return list;
	}

}
