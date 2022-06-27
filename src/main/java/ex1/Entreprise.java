package ex1;

import java.util.Date;
/**
 * Classe représentant une Entreprise
 * @author Vincent
 *
 */
public class Entreprise {
	
	/** Constructeur
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param date_Creation
	 */
	public Entreprise(int siret, String nom, String adresse, Date date_Creation) {
		super();
		Siret = siret;
		Nom = nom;
		this.adresse = adresse;
		this.date_Creation = date_Creation;
	}


	/** Numéro de siret de l'entreprise 
	 */
	private int Siret;
	/**
	 * nom de l'entreprise
	 */
	private String Nom;
	/**
	 * adresse de l'entreprise
	 */
	private String adresse;
	/**
	 * date de création de l'entreprise
	 */
	private Date date_Creation;
	/**
	 * Capital maximum possible pour une entreprise
	 */
	public static final int capitalMax = 3000000;
	
	
	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return Siret;
	}


	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		Siret = siret;
	}


	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}


	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}


	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/** Getter
	 * @return the date_Creation
	 */
	public Date getDate_Creation() {
		return date_Creation;
	}


	/** Getter
	 * @return the capitalmax
	 */
	public static int getCapitalmax() {
		return capitalMax;
	}

	/**
	 * affiche les détails de l'objet dans une console
	 */
	public void afficherStatut(){
		System.out.println(
				" siret " + this.Siret +"  "
				+" nom " + this.Nom
				+" \n addresse " + this.adresse
				+" \n date de création "+ this.date_Creation
				);
	}
	
}
