package vb_chatClient;



import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Observable;

import vb_shared.InitialMessage;
import vb_shared.Message;
import vb_shared.TextMessage;

public class ChatClient extends Observable
{
    private String name;
    private Socket socket;
    private ObjectOutputStream writer;

    public ChatClient( String address, int port, String name )
    {
        this.name = name;
        setUpNetworking( address, port );
        
        sendMessage( new InitialMessage( name, "I love to chat", null, null ) );
        
        new IncommingReader(socket, this);
    }
    
    public void setUpNetworking( String address, int port )
    {
        try 
        {
            socket = new Socket( address, port );
            writer = new ObjectOutputStream( socket.getOutputStream() );
            System.out.println( "network connection established" );
        }
        catch ( IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void sendMessage( Message message )
    {
        try
        {
            writer.writeObject( message );
            writer.flush();
        }
        catch ( Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void addIncomming( TextMessage message )
    {
        setChanged();
        notifyObservers( message );
    }

    public String getName()
    {
        return name;
    }
}

