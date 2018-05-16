package week4_client;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		try {
			
			for(int i=0; i < 3; i++) {
			Socket socket = new Socket("localhost", 4242);
			PrintStream p = new PrintStream(socket.getOutputStream());
			
			p.println("from client to server");
			
			InputStreamReader in = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(in);
			
			String m = br.readLine();
			System.out.println(m);
			
			socket.close();
			in.close();
			br.close();
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}

		


