package week2_sync;

import java.util.Random;

public class Main {
	int[] array = new int[100];

	public Main() {
		vulArray();
		print();
		Sorteer s1 = new Sorteer(array);
		
		System.out.println();
		print();
	}
	
	private void vulArray() {
		for (int i = 0; i < array.length; i++) {
			Random rnd = new Random();
			array[i] = rnd.nextInt(1000) + 2;
		}
	}
	
	
	

	
	private void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "|");
		}
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
