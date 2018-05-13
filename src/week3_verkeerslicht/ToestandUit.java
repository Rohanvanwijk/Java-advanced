package week3_verkeerslicht;

public class ToestandUit implements LichtToestand {
	private Verkeerslicht model;
	
	public ToestandUit(Verkeerslicht model) {
		this.model = model;
	}

	@Override
	public void uit() {
		System.out.println("UIT");

	}

	@Override
	public void rood() {
		System.out.println("verkeers licht staat uit");

	}

	@Override
	public void groen() {
		System.out.println("verkeers licht staat uit");

	}

	@Override
	public void oranje() {
		System.out.println("verkeers licht staat uit");

	}

	@Override
	public void knipperen() {
		System.out.println("verkeers licht staat uit");

	}

}
