package week1_boomshine;

public class BubbleController implements Runnable {
	Bubble buble;
	
	public BubbleController(Bubble buble) {
		this.buble = buble;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("b1 thread");
		buble.move();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
