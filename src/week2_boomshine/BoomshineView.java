package week2_boomshine;


import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		
		
		for (int i = 0; i < 10; i++) {
			BubbleView b = new BubbleView(new Bubble(frameWidth, frameHeight));
			b.setBounds(0, 0, frameWidth, frameHeight);
			this.add(b);
		}
		
		
		
		this.addMouseListener(new MouseListener() {
			
			
			
			@Override
			public void mousePressed(MouseEvent e) {
				Point middelpunt = e.getPoint();
				createBuble(middelpunt);
				System.out.println(middelpunt);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
		
	}
	
	public void createBuble(Point middelpunt) {
		Bubble b = new Bubble(frameWidth, frameHeight);
		b.setMiddelpunt(middelpunt);
		b.setSnelheid(0);
		b.setStraal(0);
		BubbleView bv = new BubbleView(b);
		bv.setBounds(0, 0, frameWidth, frameHeight);
		this.add(bv);
	}

}
