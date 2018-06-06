package whitebox_client;

import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import vb_shared.TextMessage;
import whitebox_shared.WhiteboardMessage;

public class ClientView extends JFrame implements Observer{

	private Client client;
	public static void main(String[] args) {
		String adres = "localhost";
		int port = 4242;
		String name = "linux";
		new ClientView(adres, port, name);

	}
	
	public ClientView(String adres, int port, String name) {
		client = new Client(adres, port, name);
		client.addObserver(this);
		
		maakGUI(client.getName());
	}
	
	private void maakGUI(String naam) {
		setTitle("Client - " + naam);
		setBounds(100, 100, 640, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}

	   @Override
	    public void update( Observable o, Object object )
	    {
	        if (object instanceof WhiteboardMessage)
	        {
	            WhiteboardMessage message = (WhiteboardMessage)object;
	            System.out.println(message.toString());
	        }
	    }

}
