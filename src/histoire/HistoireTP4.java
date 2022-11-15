package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain h = new Humain("Prof", "kambucha",1);
		h.direBonjour ();
        h.boire ();
        Commercant c = new Commercant("Marco","thé", 35);
        c.direBonjour ();
        c.boire();

	}

}
