package week3_verkeerslicht;

public class ToestandKnipperen implements LichtToestand {
	private Verkeerslicht model;
	
	public ToestandKnipperen(Verkeerslicht model) {
		this.model = model;
	}

	@Override
	public void uit() {
		System.out.println("kan niet uit");

	}

	@Override
	public void rood() {
		System.out.println("kan niet op rood");

	}

	@Override
	public void groen() {
		System.out.println("kan niet op groen");

	}

	@Override
	public void oranje() {
		System.out.println("kan niet op oranje");

	}

	@Override
	public void knipperen() {
		System.out.println("KNIPPEREN");

	}

}
