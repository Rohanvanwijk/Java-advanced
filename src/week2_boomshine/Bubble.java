package week2_boomshine;

import java.awt.Color;
import java.awt.Point;
import java.util.Observable;
import java.util.Random;

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

	public void setSnelheid(int snelheid) {
		this.snelheid = snelheid;
	}

	public void setStraal(int straal) {
		this.straal = straal;
	}

	public int getSnelheid() {
		return snelheid;
	}

	public void setMiddelpunt(Point middelpunt) {
		this.middelpunt = middelpunt;
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
		straal = 40;
		kleur = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));

		dx = 1;
		dy = -1;
		snelheid = 2 + rnd.nextInt(10);
	}

	public void move() {
		flip();

		int x = middelpunt.x + getdx() * snelheid;
		int y = middelpunt.y + getdy() * snelheid;

		middelpunt.setLocation(x, y);

		setChanged();
		notifyObservers();

	}

	public void groei() {

		straal++;
		setChanged();
		notifyObservers();

	}

	private int getdx() {
		return dx;
	}

	private int getdy() {
		return dy;
	}

	private void flip() {
		if (middelpunt.x >= frameWidth || middelpunt.x <= 0) {
			if (dx == 1) {
				dx = -1;
			} else {
				dx = 1;
			}

		}
		if (middelpunt.y >= frameHeight || middelpunt.y <= 0) {
			if (dy == 1) {
				dy = -1;
			} else {
				dy = 1;
			}
		}
	}

}
