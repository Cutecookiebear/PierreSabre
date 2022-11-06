package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
public static void main(String args[]) {
	Commercant marco = new Commercant("Marco","the",15);
	Yakuza yakulenoir = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
	yakulenoir.direBonjour();
	yakulenoir.extorquer(marco);
}
}
