package personnages;

public class Humain {
	
private String nom;
private String boisson ;
int argent ;




public Humain(String nom, String boisson, int argent) {
	super();
	this.nom = nom;
	this.boisson = boisson;
	this.argent = argent;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getArgent() {
	return argent;
}
public void setArgent(int argent) {
	this.argent = argent;
}

public void parler(String texte) {
    System.out.println(java.lang.String.format("(%s) - %s", this.nom, texte));
}

public void direBonjour() {
    parler(java.lang.String.format("Bonjour je m'appelle %s et j'aime boire du %s et j'ai %d sous en poche", this.nom, this.boisson, this.argent));
    
}
public void gagnerArgent(int som) {
	 this.argent=argent+som ;
}

public void perdreArgent(int som) {
	 this.argent=argent-som ;
}
}
