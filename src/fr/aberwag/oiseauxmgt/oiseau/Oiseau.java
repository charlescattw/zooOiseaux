package fr.aberwag.oiseauxmgt.oiseau;

public class Oiseau {
	protected boolean plumes;
	protected String nom;
	protected double taille;
	protected String regime;
	protected double poids;
	protected int age ;
	protected String couleur;
	public Oiseau() {
		super();
	}
	public Oiseau(boolean plumes, String nom, double taille, String regime, double poids, int age, String couleur) {
		super();
		this.plumes = plumes;
		this.nom = nom;
		this.taille = taille;
		this.regime = regime;
		this.poids = poids;
		this.age = age;
		this.couleur = couleur;
	}
	public void manger() {
		System.out.println("Miam miam!");
	}
	
	public void boire() {
		System.out.println("J'ai soif");
	}
	
	public void dormir() {
		System.out.println("zzzzzzzzzzzz");
	}
	
	public void courir() {
		System.out.println("j'aime bien la course");
	}
	public void jouer() {
		System.out.println("je joue");
	}
	
	
	
	/**
	 * @return the plumes
	 */
	public boolean isPlumes() {
		return plumes;
	}
	/**
	 * @param plumes the plumes to set
	 */
	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the taille
	 */
	public double getTaille() {
		return taille;
	}
	/**
	 * @param taille the taille to set
	 */
	public void setTaille(double taille) {
		this.taille = taille;
	}
	/**
	 * @return the regime
	 */
	public String getRegime() {
		return regime;
	}
	/**
	 * @param regime the regime to set
	 */
	public void setRegime(String regime) {
		this.regime = regime;
	}
	/**
	 * @return the poids
	 */
	public double getPoids() {
		return poids;
	}
	/**
	 * @param poids the poids to set
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}
	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	
}
