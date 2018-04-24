package week1_boomshine;

public class BubbleController implements Runnable {
	Bubble buble;
	private boolean doorgaan;
	public BubbleController(Bubble buble) {
		doorgaan = true;
		this.buble = buble;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while(doorgaan) {
			buble.move();
		
	
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
