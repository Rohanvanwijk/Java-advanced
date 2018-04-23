package week1_boomshine;

import javax.swing.JFrame;

public class BoomshineApplicatie extends JFrame{
	public BoomshineApplicatie() {
		// TODO Auto-generated constructor stub
		this.setBounds(400, 400, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Boomshine");
		Bubble bubble = new Bubble();
		BoomshineView view = new BoomshineView();
		BubbleView bview = new BubbleView(bubble);
		this.add(view);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BoomshineApplicatie();

	}

}
