package whitebox_client;


import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import java.util.Observable;


import whitebox_shared.*;


public class Client extends Observable {
	private Socket socket;
	private String name;
	private WhiteboardMessage message;
	private ObjectOutputStream writer;

	
	
	public Client(String adres, int poort, String name) {
		this.name = name;
		setup(adres, poort);
		
		sendMessage(new InitialMessage(name, "hoiiii", null, null));
		
		new IncommingReader(socket, this);
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
	
	   public void sendMessage(Message message)
	    {
	        try
	        {
	            writer.writeObject(message);
	            writer.flush();
	        }
	        catch ( Exception ex)
	        {
	            ex.printStackTrace();
	        }
	    }
	
	public String getName() {
		return name;
	}
	
	public WhiteboardMessage getMessage() {
		return message;
	}
	
	  public void addIncomming( WhiteboardMessage message )
	    {
	        setChanged();
	        notifyObservers( message );
	    }
}
