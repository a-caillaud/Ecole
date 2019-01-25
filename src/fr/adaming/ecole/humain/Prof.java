package fr.adaming.ecole.humain;

public class Prof extends Humain {

	String diplome ;
	int salaire ;
	
	
	// source : generate from superclass --> permet d'instancier depuis super classe, sans préciser paramètre
	

	public Prof() {
		super();
		
	}

// source : generate from using field, permet d'instancier depuis super classe, en précisant paramètres dans super classe
	public Prof(String diplome, int salaire) {
		super();
		this.diplome = diplome;
		this.salaire = salaire;
	}

	//permet de préciser seulement salaire en instanciant classe dans super classe
	public Prof(int salaire) {
		super();
		this.salaire = salaire;
	}
	
	public void enseigne() {
		System.out.println("J'enseigne...");
	}
//source : generate to string : pour générer les variables que l'on veut, et donc on peut appeler cette méthode dans super classe
	@Override
	public String toString() {
		return "Prof [diplome=" + diplome + ", salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom + ", age="
				+ age + ", adresse=" + adresse + ", sexe=" + sexe + "]";
	}
	
	
}
