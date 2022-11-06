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
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(force>=adversaire.getReputation()) {
			parler("Je t'ai eu petit Yakuza!");
			int argentGagne = adversaire.perdre();
			gagnerArgent(argentGagne);
		}
		else {
			int argentPerdu = argent;
			perdreArgent(argentPerdu);
			honneur -= 1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argentPerdu);
		}
	}

}
