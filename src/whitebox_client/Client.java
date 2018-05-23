package whitebox_client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Client extends Observable {
	private Socket socket;
	private String name;
	private ObjectOutputStream writer;
	
	public Client(String adres, int poort, String name) {
		this.name = name;
		setup(adres, poort);
		
	}
	
	public void setup(String adres, int poort) {
		try {
			socket = new Socket(adres, poort);
			writer = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("Connection estabilsed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addIncoming() {
		
	}

	

	

}
