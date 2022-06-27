package ex2;

/**
 * Représent un livertA
 * @author Vincent
 *
 */
public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Constructeur
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		if(tauxRemuneration>0) {
			this.tauxRemuneration = tauxRemuneration;
		}
		else {
			this.tauxRemuneration = 0;
		}
		
	}
	
	/**
	 * applique le taux de rémunération annuelle 
	 */
	public void appliquerRemuAnnuelle(){			
			this.ajouterMontant(this.getSolde() * (tauxRemuneration/100));
	}
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Setter
	 * volontairement vide un livret A ne peux pas avoir de découvert autorisé 
	 * et donc ne peux peux pas non-plus le modifier
	 * @param decouvert the découvert to set
	 */
	@Override
	public void setDecouvert(double decouvert) {
	}
	
}
