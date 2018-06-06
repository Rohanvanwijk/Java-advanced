package whitebox_shared;

import java.io.Serializable;

public abstract class Message implements Serializable
{

    
    public Message()
    {
    	
    }

    public String getSender()
    {
        return sender;
    }

    public abstract Message asTextMessage();
}
