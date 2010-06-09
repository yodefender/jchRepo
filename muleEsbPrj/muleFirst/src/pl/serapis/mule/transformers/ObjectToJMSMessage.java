package pl.serapis.mule.transformers;

import java.util.List;

import javax.jms.Message;

import org.mule.api.MuleMessage;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.Transformer;
import org.mule.api.transformer.TransformerException;
import org.mule.transport.jms.transformers.AbstractJmsTransformer;

public class ObjectToJMSMessage implements Transformer{

    public Object transform(int licz, String outputEncoding) throws TransformerException
    {
        try
        {

            Object result = new Object();

            return result;
        }
        catch (Exception e)
        {
            throw new TransformerException(this, e);
        }
    }

	public Class getReturnClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getSourceTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAcceptNull() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isIgnoreBadInput() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSourceTypeSupported(Class aClass) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setReturnClass(Class theClass) {
		// TODO Auto-generated method stub
		
	}

	public Object transform(Object src) throws TransformerException {
		// TODO Auto-generated method stub
		return null;
	}

	public ImmutableEndpoint getEndpoint() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEndpoint(ImmutableEndpoint endpoint) {
		// TODO Auto-generated method stub
		
	}

	public void initialise() throws InitialisationException {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

}
