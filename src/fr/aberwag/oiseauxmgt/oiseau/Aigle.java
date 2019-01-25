package fr.aberwag.oiseauxmgt.oiseau;

public class Aigle extends Oiseau implements Volant {

	public Aigle() {
		super();
	}

	public Aigle(boolean plumes, String nom, double taille, String regime, double poids, int age, String couleur) {
		super(plumes, nom, taille, regime, poids, age, couleur);
	}

	@Override
	public void voler() {
		System.out.println("Je vole");
	}

}
