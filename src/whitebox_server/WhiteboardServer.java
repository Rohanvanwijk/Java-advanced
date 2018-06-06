package whitebox_server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import whitebox_shared.*;

public class WhiteboardServer
{
    private List<ObjectOutputStream> clientOutputStreams = new ArrayList<>();
    
    public WhiteboardServer(int poort)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket( poort );
            while ( true )
            {
                Socket clientSocket = serverSocket.accept();
                ObjectOutputStream writer = new ObjectOutputStream( clientSocket.getOutputStream() );
                clientOutputStreams.add( writer );
                
                Thread t = new Thread( new ClientHandler( clientSocket, this ) );
                t.start();
                System.out.println( "new client connected" );
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        new WhiteboardServer(4242);
    }

    public void tellEveryone( Message message )
    {
        ImageIcon image = new ImageIcon( "snooze.gif");
        
        message = new WhiteboardMessage(image.getImage());
                
        try
        {
            for ( ObjectOutputStream writer : clientOutputStreams )
            {
                writer.writeObject( message );
                writer.flush();
            }
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }

    }
}
