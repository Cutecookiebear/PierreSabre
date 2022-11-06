package personnages;

public class Humain {
	protected String nom;
	protected String boisson;
	protected int argent;
	
	public Humain(String nom,String boisson,int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	protected void parler(String texte) {
		System.out.println("["+nom+"] : "+texte+"\n");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson+".");
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	public void acheter(String bien,int prix) {
		if(argent>=prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}
}
