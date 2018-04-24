package week1_boomshine;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BoomshineView extends JPanel {
	private int frameWidth;
	private int frameHeight;
	
	public BoomshineView(int widht, int height) {
		this.setLayout(null);
		this.frameWidth = widht;
		this.frameHeight = height;
		
	
		
		for (int i = 0; i < 1000; i++) {
			BubbleView b = new BubbleView(new Bubble(frameWidth, frameHeight));
			b.setBounds(0, 0, frameWidth, frameHeight);
			this.add(b);
		}
		
		
		
		
	}

}
