package modele;

import java.util.ArrayList;
import java.util.Random;

public class Joueur {
	private String nom;
	private int tresor;
	private  Quartier[] cite;
	private  int nbQuartiers;
	private ArrayList<Quartier> main =new ArrayList();
	private boolean possedeCouronne;
	
	
	public Joueur(String nom) {
		super();
		this.nom = nom;
		this.tresor = 0;
		this.cite = new Quartier[8];
		this.nbQuartiers = 0;
		this.main =  new ArrayList<Quartier>();
		this.possedeCouronne = false;
	}
	public boolean getPossedeCouronne() {
		return possedeCouronne;
	}
	public void setPossedeCouronne(boolean possedeCouronne) {
		this.possedeCouronne = possedeCouronne;
	}
	public String getNom() {
		return nom;
	}
	public int nbPieces() {
		return tresor ;
	}
	public int nbQuartiersDansCite() {
		return nbQuartiers ;
	}
	public Quartier[] getCite() {
		return cite;
	}
	public int getNbQuartiers() {
		return nbQuartiers;
	}
	public ArrayList<Quartier> getMain() {
		return main;
	}
	public int nbQuartiersDansMain() {
		return main.size() ;
	}
	public void ajouterPieces(int  Pièces ) {
		if(Pièces>=0) {
		tresor = tresor + Pièces;
		}
	}
	public void retirerPieces(int  Pieces ) {
		if(Pieces<=tresor&&Pieces>=0) {
		tresor = tresor - Pieces;
		}
	}
		public void ajouterQuartierDansCite(Quartier quartier ) {
			if(nbQuartiers<8) {
			cite[nbQuartiers]=quartier;
			nbQuartiers++;
			}
			
		
	}
		public boolean quartierPresentDansCite(String quartier) {
			for( int i=0; i<nbQuartiers;i++) {
				
				if(cite[i]!=null&&cite[i].getNom().equals(quartier)) {
					return true;
				}
			}
			return false;
		}
		public Quartier  retirerQuartierDansCite(String quartier) {
			Quartier quartSupprime=null;
			for(int i=0;i<nbQuartiers;i++) {
				if(cite[i]!=null&&cite[i].getNom().equals(quartier)){
					quartSupprime=cite[i];
					cite[i]=null;
					nbQuartiers--;
				}
			}
			return quartSupprime;
		}
			public void ajouterQuartierDansMain(Quartier nom) {
				main.add(nom);
			}
		
public Quartier retirerQuartierDansMain() {
	Random generateur = new Random();
	int numeroHasard = generateur.nextInt(this.nbQuartiersDansMain());
	Quartier retour=main.get(numeroHasard);
	main.remove(numeroHasard);
	return retour;
	
}
		
		


public void reinitialiser() {
	tresor=0;
	main =  new ArrayList<Quartier>();
	cite = new Quartier[8];
}
	
	
}
