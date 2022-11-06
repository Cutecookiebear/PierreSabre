package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
public static void main(String args[]) {
	Commercant marco = new Commercant("Marco","the",15);
	Yakuza yakulenoir = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
	Ronin roro = new Ronin("Roro","shochu",60);
	yakulenoir.direBonjour();
	yakulenoir.extorquer(marco);
	roro.direBonjour();
	roro.donner(marco);
	
}
}
