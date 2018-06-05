package whitebox_client;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import java.util.Observable;

import javax.swing.ImageIcon;

import whitebox_shared.WhiteboardMessage;


public class Client extends Observable {
	private Socket socket;
	private String name;
	private WhiteboardMessage message;
	private ObjectInputStream reader;

	
	public Client(String adres, int poort, String name) {
		this.name = name;
		setup(adres, poort);
		
	}
	
	public void setup(String adres, int poort) {
		try {
			socket = new Socket(adres, poort);
		
			
			
			reader = new ObjectInputStream(socket.getInputStream());
			System.out.println(reader.readObject().toString());
			
			message = (WhiteboardMessage)reader.readObject();
			
			System.out.println("Connection estabilsed");
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return name;
	}
	
	public WhiteboardMessage getMessage() {
		return message;
	}

	

	

}
