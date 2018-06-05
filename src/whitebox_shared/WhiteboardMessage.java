package whitebox_shared;

import java.awt.Image;

import javax.swing.ImageIcon;

public class WhiteboardMessage
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
}