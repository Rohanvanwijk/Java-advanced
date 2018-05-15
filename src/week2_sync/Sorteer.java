package week2_sync;

public class Sorteer implements Runnable{
	private int[] array;
	
	public Sorteer(int[] a) {
		this.array = a;
		Thread t = new Thread(this);
		t.start();
	}
	
	public synchronized void bubbleSort() {

	    int n = array.length;

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {
	        	checkandswap(j);
	      
	        }
	    }
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

	@Override
	public void run() {
		bubbleSort();
		
	}

}
