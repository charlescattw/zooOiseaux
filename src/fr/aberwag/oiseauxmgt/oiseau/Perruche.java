package fr.aberwag.oiseauxmgt.oiseau;

public class Perruche extends Oiseau implements Volant {

	public Perruche() {
		super();
	}

	public Perruche(boolean plumes, String nom, double taille, String regime, double poids, int age, String couleur) {
		super(plumes, nom, taille, regime, poids, age, couleur);
	}

	@Override
	public void voler() {
		System.out.println("Je vole aussi");
		
	}

}
