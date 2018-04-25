package week1_boomshine;

import java.awt.Color;
import java.awt.Point;
import java.util.Observable;
import java.util.Random;

import javafx.scene.transform.Translate;

public class Bubble extends Observable {
	private Point middelpunt;
	private Color kleur;
	private int straal, dx, dy;
	private int snelheid;
	private int frameWidth;
	private int frameHeight;
	
	public Bubble(int frameWidth, int frameHeight) {
		this.frameHeight = frameHeight;
		this.frameWidth = frameWidth;
		init();
	
	
	}
	
	public Point getMiddelpunt() {
		return middelpunt;
	}

	public int getStraal() {
		return straal;
	}
	
	public Color getKleur() {
		return kleur;
	}

	public void init() {
		Random rnd = new Random();
		middelpunt = new Point(100 + rnd.nextInt(400), 100 + rnd.nextInt(500));
		straal = 10 + rnd.nextInt(60);
		kleur = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
	
		dx = 1;
		dy = -1;
		snelheid = 2 + rnd.nextInt(10);
	}
	
	public void move() {
		flip();
		
		if(straal < 20) {
			int x = middelpunt.x + getdx()*(snelheid + 4);
			int y = middelpunt.y + getdy()*(snelheid +4);
			kleur = new Color(255, 1, 1);
			middelpunt.setLocation(x, y);
		}
		int x = middelpunt.x + getdx()*snelheid;
		int y = middelpunt.y + getdy()*snelheid;
	
		middelpunt.setLocation(x, y);
	
		setChanged();
		notifyObservers();
		
	}
	
	public int getdx() {
		return dx;
	}
	
	public int getdy() {
		return dy;
	}
	
	private void flip() {
		if(middelpunt.x >= frameWidth || middelpunt.x <= 0) {
			if(dx == 1) {
				dx = -1;
			} else {
				dx = 1;
			}
		
		}
		if(middelpunt.y >= frameHeight || middelpunt.y <= 0) {
			if(dy == 1) {
				dy = -1;
			} else {
				dy = 1;
			}
		}
	}
	
	

}
