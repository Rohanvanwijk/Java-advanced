package whitebox_server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import whitebox_shared.*;

public class ClientHandler implements Runnable
{
    private Socket socket;
    private ObjectInputStream reader;
    private WhiteboardServer server; 
    
    public ClientHandler( Socket clientSocket, WhiteboardServer server )
    {
        socket = clientSocket;
        this.server = server;
        try
        {
            reader = new ObjectInputStream( socket.getInputStream() );
        }
        catch ( IOException ex )
        {
            ex.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        Object message;
        try
        {
            while ( ( message = reader.readObject() ) != null)
            {
                System.out.println( "read - " + message );
                server.tellEveryone( (Message) message );
            }
        }
        catch ( ClassNotFoundException | IOException e )
        {
            e.printStackTrace();
        }
    }
}
