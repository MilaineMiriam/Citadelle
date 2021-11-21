package modele;

public class Quartier {
	public static String[] TYPE_QUARTIERS = {"RELIGIEUX", "MILITAIRE", "NOBLE", "COMMERCANT", "MERVEILLE"};
	private String nom;
	private String type;
	private int coutConstruction;
	private String caracteristiques;
	
	
	public Quartier() {
		super();
		this.nom ="";
		this.type = "";
		this.coutConstruction = 0;
		this.caracteristiques = "";
	}
	
	public Quartier(String nom, String type, int coutConstruction, String caracteristiques) {
		super();
		this.nom = nom;
		this.type = type;
		this.coutConstruction = coutConstruction;
		this.caracteristiques = caracteristiques;
	}
	public Quartier(String nom, String type, int coutConstruction) {
		super();
		this.nom = nom;
		this.type = type;
		this.coutConstruction = coutConstruction;
		this.caracteristiques = "";
	}

	public String getNom() {
		 return this.nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		for(int i=0;i< TYPE_QUARTIERS.length;i++) {
			if( TYPE_QUARTIERS[i].equals(type)) {
				this.type = type;
				return;}
		}
		this.type ="";
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public int getCout() {
		return coutConstruction;
	}
	public void setCout(int coutConstruction) {
		if(coutConstruction>=1 && coutConstruction<=6) {
		this.coutConstruction = coutConstruction;
		}
		else {
		this.coutConstruction = 0;
		}
		
	}
	public String getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	

}
