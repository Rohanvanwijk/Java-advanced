package week2_bubblesort;

public class Sorteer implements Runnable{
	private Main main;
	private int[] array;
	private int counter;

	public Sorteer(int[] array) {
		this.array = array;
		
		
		Thread t = new Thread(this);
		t.start();
	}
	
	private void checkandswap(int j) {
		
		//synchronized(ints)
		int temp = 0;
		if (array[j - 1] > array[j]) {
            temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
        }
	}
	
	//print() --> synchronized
	
	public void bubbleSort() {

	    int n = array.length;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {
	        	checkandswap(j);
	      
	        }
	    }
	}

	@Override
	public void run() {
		
		//race cond sync
		bubbleSort();
		
		//while !sorted
		//counter = 0
		//counter = 0 dan sorted true
		//break
		
	}
	
}
