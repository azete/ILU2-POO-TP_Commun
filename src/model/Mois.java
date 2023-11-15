package model;

public class Mois {
	private String nom;
	private int nbJour;
	private boolean[] jours;
	
	public Mois (String nom) {
		this.setNom(nom);
		this.jour= jour [nbJour];
	}

	public boolean estLibre(String jour) {
		if (jours[Integer.valueOf(jour)]) {
			return true;
		}
		return false;
	}
	public void reserver() {
		
	}
}
