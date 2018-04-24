package week1_boomshine;

import javax.swing.JFrame;

public class BoomshineApplicatie extends JFrame{
	public BoomshineApplicatie() {
		// TODO Auto-generated constructor stub
		int frameWidth = 800;
		int frameHeight = 800;
		this.setBounds(400, 400, frameWidth, frameHeight);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Boomshine");
	
		//BubbleView b1 = new BubbleView(new Bubble());
		BoomshineView view = new BoomshineView(frameWidth, frameHeight);
	
		this.add(view);
		//this.add(b1);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BoomshineApplicatie();

	}

}
