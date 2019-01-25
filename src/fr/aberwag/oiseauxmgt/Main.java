package fr.aberwag.oiseauxmgt;

import fr.aberwag.oiseauxmgt.oiseau.Aigle;
import fr.aberwag.oiseauxmgt.oiseau.Autruche;
import fr.aberwag.oiseauxmgt.oiseau.Canard;
import fr.aberwag.oiseauxmgt.oiseau.Manchot;
import fr.aberwag.oiseauxmgt.oiseau.Pigeon;

public class Main {
	public static void main(String[] args) {
		Pigeon vaillant = 
				new Pigeon(true, "Vaillant", 12.5d, "Fast Food", 12.5d, 12, "Gris");	
		System.out.println("===============================");
		System.out.println(vaillant.getNom());
		vaillant.courir();
		vaillant.voler();
		
		System.out.println("===============================");
		
		Manchot petitManchot = 
				new Manchot(false, "Petit Manchot", 12, "AZERTY", 13, 2, "Noire");
		System.out.println(petitManchot.getNom());
		petitManchot.jouer();
		petitManchot.nager();

		System.out.println("===============================");
		Autruche autr = 
				new Autruche(true, "Autruche XYZ", 500, "Son regime", 12345, 12, "Jaune");
		System.out.println(autr.getNom());
		autr.dormir();
		
		System.out.println("===============================");
		Aigle aigle = 
				new Aigle(true, "Aigle Royal", 120, "AZE", 300, 12, "Blanc");
		System.out.println(aigle.getNom());
		aigle.voler();
		aigle.manger();
		System.out.println("===============================");
		Canard donald = 
				new Canard(true, "Donald", 100, "xyz", 12, 100, "Blanc");
		System.out.println(donald.getNom());
		donald.nager();
		donald.voler();
		donald.courir();
	}
}
