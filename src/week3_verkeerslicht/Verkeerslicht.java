package week3_verkeerslicht;

public class Verkeerslicht {
	private LichtToestand toestand;
	
	private LichtToestand uit;
	private LichtToestand rood;
	private LichtToestand groen;
	private LichtToestand oranje;
	private LichtToestand knipperen;
	
	public Verkeerslicht() {
		rood = new ToestandRood(this);
		groen = new ToestandGroen(this);
		oranje = new ToestandOranje(this);
		knipperen = new ToestandKnipperen(this);
		uit = new ToestandUit(this);
		
		this.toestand = uit;
	}
	
	

	public LichtToestand getToestand() { return toestand; }
	public LichtToestand getUit() { return uit; }
	public LichtToestand getRood() { return rood; }
	public LichtToestand getGroen() { return groen; }
	public LichtToestand getOranje() { return oranje; }
	public LichtToestand getKnipperen() { return knipperen; }



	public void setToestand(LichtToestand NewToestand) {
		this.toestand = NewToestand;
	}
	
	public void UitLicht() {
		toestand = uit;
		toestand.uit();
	}
	
	public void RoodLicht() {
		toestand = rood;
		toestand.rood();
		
	}
	
	public void GroenLicht() {
		toestand = groen;
		toestand.groen();
	}
	
	public void OranjeLicht() {
		toestand = oranje;
		toestand.oranje();
	}
	
	public void Knipperen() {
		toestand = knipperen;
		toestand.knipperen();
	}

}
