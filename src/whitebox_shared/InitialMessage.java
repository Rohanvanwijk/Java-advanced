package whitebox_shared;

import java.awt.Color;

import javax.swing.ImageIcon;

public class InitialMessage extends ClientMessage
{
    private String naam;
    private Color color;
    
    public InitialMessage(String naam,  Color color)
    {
        this.naam = naam;
        this.color = color;
    }

    public String getNaam()
    {
        return naam;
    }

    public Color getColor()
    {
        return color;
    }

  

    @Override
    public Message asTextMessage()
    {
        return new TextMessage(sender, "entered");
    }

}

