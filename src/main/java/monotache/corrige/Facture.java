package monotache.corrige;

import java.util.Date;

public class Facture {

	private Date dateFacture;
	private double montant;
	/** Getter for dateFacture
	 * @return the dateFacture
	 */
	public Date getDateFacture() {
		return dateFacture;
	}
	/** Setter
	 * @param dateFacture the dateFacture to set
	 */
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	/** Getter for montant
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}
	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
}
