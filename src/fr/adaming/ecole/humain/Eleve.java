package fr.adaming.ecole.humain;

public class Eleve extends Humain {

	String classe ;
	int niveaux ;
	
	
	
	
	
	public Eleve() {
		super();
		
	}





	public Eleve(String classe, int niveaux) {
		super();
		this.classe = classe;
		this.niveaux = niveaux;
	}





	public void apprendre() {
		System.out.println("J'apprends...");
	}
	
	
}
