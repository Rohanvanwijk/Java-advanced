package week2_bubblesort;

import java.util.Random;

public class Main {

	public Main() {
		init();
	}
	
	public static void init() {
		vullArray();
		print();
		new Sorteer(array);
		new Sorteer(array);
		
	
	
	}
	
	private static int[] array = new int[10];

	public static void main(String[] args) {
		new Main();
		
	}
	
	
	
	public static int[] getArray() {
		return array;
	}



	public static void setArray(int[] array) {
		Main.array = array;
	}



	private static void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "|");
		}
	}
	
	private static void vullArray() {
		for (int i = 0; i < array.length; i++) {
			Random rnd = new Random();
			array[i] = 1 + rnd.nextInt(10000);
		
		}
	}
	


	


}
