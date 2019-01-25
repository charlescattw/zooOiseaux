package fr.aberwag.oiseauxmgt.oiseau;

public class Manchot extends Oiseau  implements Nageur{

	public Manchot() {
		super();
	}

	public Manchot(boolean plumes, String nom, double taille, String regime, double poids, int age, String couleur) {
		super(plumes, nom, taille, regime, poids, age, couleur);
	}

	@Override
	public void nager() {
		System.out.println("Je nage!!!");
		
	}

}
