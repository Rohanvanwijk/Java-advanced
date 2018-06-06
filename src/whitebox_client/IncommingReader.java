package whitebox_client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import whitebox_shared.WhiteboardMessage;


public class IncommingReader implements Runnable
{
    private ObjectInputStream reader;
    private Client client;
    
    public IncommingReader(Socket socket, Client c)
    {
        this.client = c;
        try
        {
            reader = new ObjectInputStream(socket.getInputStream());
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
        new Thread(this).start();
    }

    @Override
    public void run()
    {
        Object object;
        try
        {
            while ( ( object = reader.readObject() ) != null)
            {
                if ( object instanceof WhiteboardMessage )
                {
                    WhiteboardMessage message = (WhiteboardMessage) object;
                    System.out.println( message );
                    client.addIncomming(message);
                    
                }
                else 
                    System.out.println( "illegal message type: " + object.getClass().getSimpleName()  );
            }
        }
        catch ( ClassNotFoundException | IOException e )
        {
            e.printStackTrace();
        }
    }
}

