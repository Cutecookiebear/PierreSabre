package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
    public int seFaireExtorquer() {
    	int argentPerdu=argent;
    	argent-=argentPerdu;
    	parler("J'ai tout perdu! Le monde est trop injuste...");
    	return argentPerdu; 
    }
	public void recevoir(int don) {
		argent+=don;
		parler(don+" sous! Je te remercie généreux donateur!");
	}
}
