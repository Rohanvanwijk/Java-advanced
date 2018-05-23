package whitebox_client;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class ClientView extends JFrame implements Observer{

	public static void main(String[] args) {
		String adres = "localost";
		int port = 7171;
		String name = "linux";
		

	}
	
	public ClientView(String adres, int port, String name) {
		Client client = new Client(adres, port, name);
		client.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
