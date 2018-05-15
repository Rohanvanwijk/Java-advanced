package week2_boomshine;

public class GroeiController implements Runnable{
	Bubble buble;
	public GroeiController(Bubble b) {
		this.buble = b;
		Thread t = new Thread(this);
		t.start();
		System.out.println(t.getName() + " -Groei");
		
	}

	@Override
	public void run() {
		while(buble.getStraal() < 51) {
			buble.groei();
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
