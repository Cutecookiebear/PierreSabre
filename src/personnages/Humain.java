package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	private int nbConnaissances=0;
	private Humain[] connaissances = new Humain[30];
	
	
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
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void memoriser(Humain humain) {
		if (nbConnaissances==30) {
			for(int i=0;i<nbConnaissances+1;i++) {
				connaissances[i] = connaissances[i+1];
			}
		}
		else {
			nbConnaissances++;
		}
		connaissances[nbConnaissances-1]=humain;
	}
	
	public void listerConnaissance() {
		String nomsConnaissances="";
		for(int i=0;i<nbConnaissances;i++) {
			nomsConnaissances += connaissances[i].nom + ",";
		}
		parler("Je connais beaucoup de monde dont : "+nomsConnaissances);
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
}
