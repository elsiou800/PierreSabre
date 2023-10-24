package personnages;

public class Humain {
	
	private String nom;
	private String boissonFavorite;
	private int argentPossede;
	
	public String getNom() {
		return nom;
	}
	public int getArgentPossede() {
		return argentPossede;

	}
	public Humain(String nom, String boissonFavorite, int argentPossede) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argentPossede = argentPossede;
	}
	private void parler(String texte) {
		System.out.println("<<" + texte + ">>");
	}
	public void gagnerArgent(int gain) {
		argentPossede += gain;
	}
	public void perdreArgent(int perte) {
		argentPossede -= perte;
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite );
	}
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	public void acheter(String bien , int prix) {
		if (prix < getArgentPossede()){
			parler("J'ai " + getArgentPossede() + " sous en poche. Je vais pouvoir m'offrir un " + bien +" à " + prix + " sous");
			perdreArgent(prix);}
		else {
			parler("Je n'ai plus que " + getArgentPossede() + " sous en poche. Je ne peux même pas m'offrir un "+bien+ " à "+prix+ " sous.");}
	}
	
	
	}
	
	
	
	

	

