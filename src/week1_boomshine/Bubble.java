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
	
	public Bubble() {
		// TODO Auto-generated constructor stub
		init();
		Random rnd = new Random();
		straal = 10 + rnd.nextInt(60);
		kleur = Color.RED;
		middelpunt = new Point(100 + rnd.nextInt(400), 100 + rnd.nextInt(500));
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
		middelpunt = new Point(rnd.nextInt(400), rnd.nextInt(200));
		straal = rnd.nextInt(200);
	}
	
	public void move() {
		dx *= -1;
		dy *= -1;
		Translate.translate(dx, dy);
		setChanged();
		notifyObservers();
		
	}

}
