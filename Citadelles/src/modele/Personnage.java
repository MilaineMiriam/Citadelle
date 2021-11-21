package modele;

/**
 * 
 * @author DAMKAM Milaine 17/11/2021
 *
 */
public abstract class Personnage {
	private String nom;
	private int rang;
	private String caracteristiques;
	private Joueur joueur;
	private boolean assassine;
	private boolean vole;

	public Personnage(String nom, int rang, String caracteristiques) {
		super();
		this.nom = nom;
		this.rang = rang;
		this.caracteristiques = caracteristiques;
		this.joueur = null;
		this.assassine = false;
		this.vole = false;
	}

	public String getNom() {
		return nom;
	}

	public int getRang() {
		return rang;
	}

	public String getCaracteristiques() {
		return caracteristiques;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public boolean getAssassine() {
		return assassine;
	}

	public boolean getVole() {
		return vole;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public void setAssassine() {
		this.assassine = true;
	}

	public void setVole() {
		this.vole = true;
	}

	public void ajouterPieces() {
		if (assassine != true && joueur != null) {
			joueur.ajouterPieces(2);
		}
	}

	public void ajouterQuartier(Quartier nouveau) {
		if (assassine != true && joueur != null) {
			joueur.ajouterQuartierDansMain(nouveau);
		}
	}

	public void construire(Quartier nouveau) {
		if (assassine != true && joueur != null) {
			joueur.ajouterQuartierDansCite(nouveau);
		}

	}

	public void percevoirRessourcesSpecifiques() {
		if (assassine != true && joueur != null) {
			System.out.println("aucune ressource specifique");
		}
	}

	public abstract void utiliserPouvoir();

	public void reinitialiser() {
		this.joueur = null;
		this.assassine = false;
		this.vole = false;

	}

}
