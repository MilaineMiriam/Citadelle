package modele;

public class Roi extends Personnage {

	public Roi() {
		super("Roi",4, Caracteristiques.ROI);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void utiliserPouvoir() {
		// TODO Auto-generated method stub
		System.out.println("Je prends la couronne");
		 getJoueur().setPossedeCouronne(true);
	

	}
	public void percevoirRessourcesSpecifiques() {
	if(this.getJoueur()==null)
		return;
	int nbQuartierNoble=0;
	for (int i=0; i<this.getJoueur().nbQuartiersDansCite();i++) {
		if(this.getJoueur().getCite()[i].getType().equals(Quartier.TYPE_QUARTIERS[2]))
			nbQuartierNoble++;
	}
	this.getJoueur().ajouterPieces(nbQuartierNoble);
	System.out.println("Grace a vos quartier nobles dans votre cite,vous gagnez "+nbQuartierNoble +" en plus");
	}
	}

		
	


