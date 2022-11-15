package personnages;

public class Yakuza extends Humain {

	private int reputation = 0;
	private String clan;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant c) {
		int argentDuCommercant = c.seFaireExtorquer();
		this.reputation += 1;
		gagnerArgent(argentDuCommercant);
		parler(java.lang.String.format("J’ai piqué le fric de %s", c.getNom()));

	}

	public void gagner() {
		this.reputation += 1;
		parler("Victoire!! J'ai gagné mon duel !");
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	public int perdre() {
		int argent = getArgent();
		perdreArgent(argent);
		this.reputation -= 1;

		parler(java.lang.String.format("J’ai perdu mon duel et mes %d sous, snif...", argent));

		return argent;
	}

}
