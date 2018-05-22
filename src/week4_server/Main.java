package week4_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Main {
	

	public Main() {
		// TODO Auto-generated constructor stub, rohan is cool
	}

	public static void main(String[] args) {
		int teller = 0;
		String[] advice = {"The way get started is to quit talking and begin doing.", 
							"The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty.", 
							"Don�t let yesterday take up too much of today.", 
							"Leaders are never satisfied; they continually strive to be better.",
							"hahaha"};
		try {
			ServerSocket SS = new ServerSocket(4242);
			
			System.out.println("server starting...");
			while(true) {
				
				Socket socket = SS.accept();
				System.out.println("client connected" + teller);
				
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());
				BufferedReader br = new BufferedReader(isr);
		
				
				String message = br.readLine();
				System.out.println(message);
				
				Random rnd = new Random();
				
				if(message != null) {
					PrintStream ps = new PrintStream(socket.getOutputStream());
					ps.println(advice[teller]);
				}
				teller++;
				
			}
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
