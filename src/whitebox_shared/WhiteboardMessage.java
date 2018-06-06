package whitebox_shared;

import java.awt.Image;

import javax.swing.ImageIcon;

public class WhiteboardMessage extends ServerMessage
{

    protected ImageIcon image;

    public WhiteboardMessage( Image image )
    {
        super();
        this.image = new ImageIcon(image);
    }

    public Image getImage()
    {
        return image.getImage();
    }

	@Override
	public Message asTextMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}