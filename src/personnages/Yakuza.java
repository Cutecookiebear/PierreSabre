package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=4;
	
	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
	}
	public void extorquer(Commercant victime) {
		parler("Tiens,tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.nom+", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("J’ai piqué les "+argentVole+" sous de "+victime.nom+", ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi !");	
	}
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait vraiment battre "+nom+" du clan "+clan+"? Je l'ai dépouillé de ses "+gain+" sous.");
	}
	public int perdre() {
		int argentPerdu = argent;
		perdreArgent(argentPerdu);
		reputation -= 1;
		parler("J'ai perdu mon duel et mes "+argentPerdu+" sous, snif... J'ai déshonoré le clan de "+clan+".");
		return argentPerdu;
	}

}
