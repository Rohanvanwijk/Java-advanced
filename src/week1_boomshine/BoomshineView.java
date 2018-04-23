package week1_boomshine;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BoomshineView extends JPanel {
	
	public BoomshineView() {
		//this.setLayout(null);
		Bubble bubble = new Bubble();
		BubbleView b = new BubbleView(bubble);
		
		
		
		this.add(b);
		
		
	}

}
