package whitebox_shared;

import java.io.Serializable;

public abstract class Message implements Serializable
{
	String sender;
    
    public Message()
    {
    	
    }

    public String getSender()
    {
        return sender;
    }

    public abstract Message asTextMessage();
}
