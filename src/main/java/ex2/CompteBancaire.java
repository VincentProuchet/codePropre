package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvertAutorise : un découvert est autorisé seulement pour les comptes courants */
	private double decouvertAutorise;
		
	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		
		this.solde = solde;
		this.decouvertAutorise = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Débite un montant au solde
	 *  controle d'intégrité
	 *  n'eefectueras pas l'opération si le solde résultant
	 *  devait être inférieur au découvert autorisé 
	 * @param montant
	 */
	public void debiterMontant(double montant){
			if (this.solde - montant > decouvertAutorise){
				this.solde = solde - montant;
			}
			
	}
	/** Reste de l'ancienne implémentation
	 * laissé pour garder la compatibilité de tout code dépendent 
	 * 
	 */
	@Deprecated
	public void appliquerRemuAnnuelle(){
	}
	
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvertAutorise;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvertAutorise = decouvert;
	}
}
