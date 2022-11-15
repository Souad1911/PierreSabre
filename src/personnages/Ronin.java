package personnages;

public class Ronin extends Humain {
	int honneur;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur=1;
		
	}
	
	
	 public void donner(int somme, Commercant c) {
	        perdreArgent(somme);
	        parler(java.lang.String.format("Tiens %s voil� %d sous.", c.getNom(), somme));

	        c.recevoir(somme);
	    }
	 
	 public void provoquer(Yakuza y) {

	        if (this.honneur * 2 > y.getReputation()) {
	            int aYakuza = y.perdre();
	            gagnerArgent(aYakuza);
	            honneur += 1;
	            parler("Je t�ai eu petit yakusa!");
	        } else {
	            parler("Rhooo! Je suis s�r que tu as trich� >:(");
	            honneur -= 1;

	            y.gagner();
	        }

	    }


}
