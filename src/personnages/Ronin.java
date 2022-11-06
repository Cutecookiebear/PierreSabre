package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	public void donner(Commercant beneficiaire) {
		int argentDonne = argent/10;
		parler(beneficiaire.nom+" prends ces "+argentDonne+" sous.");
		perdreArgent(argentDonne);
		beneficiaire.recevoir(argentDonne);
				
	}

}
