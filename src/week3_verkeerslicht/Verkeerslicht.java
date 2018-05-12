package week3_verkeerslicht;

public class Verkeerslicht {
	LichtToestand toestand;
	
	LichtToestand uit;
	LichtToestand rood;
	LichtToestand groen;
	LichtToestand oranje;
	LichtToestand knipperen;
	
	public Verkeerslicht() {
		rood = new ToestandRood(this);
		groen = new ToestandGroen(this);
		oranje = new ToestandOranje(this);
		knipperen = new ToestandKnipperen(this);
		uit = new ToestandUit(this);
		
		toestand = uit;
	}

	public void setToestand(LichtToestand NewToestand) {
		toestand = NewToestand;
	}

}
