package whitebox_client;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import whitebox_shared.WhiteboardMessage;

public class IconPanel extends JPanel {
	private WhiteboardMessage message;
	
	public IconPanel(WhiteboardMessage m) {
		this.message = m;
		
		
		
		
		
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = message.getImage();
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }

}
