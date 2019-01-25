package fr.aberwag.oiseauxmgt.oiseau;

public class Canard  extends Oiseau implements Volant, Nageur{

	public Canard() {
		super();
	}

	public Canard(boolean plumes, String nom, double taille, String regime, double poids, int age, String couleur) {
		super(plumes, nom, taille, regime, poids, age, couleur);
	}

	@Override
	public void nager() {
		System.out.println("Je nage aussi");
	}

	@Override
	public void voler() {
		System.out.println("Je vole aussi");
	}

}
