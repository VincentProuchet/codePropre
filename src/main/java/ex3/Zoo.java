package ex3;

import java.util.HashSet;

import ex3.Annimaux.Animal;

/**
 * Représente un Zoo
 * 
 * @author Vincent
 *
 */
public class Zoo {

	/** nom */
	private String nom;
	private HashSet<ZooZone> zones;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.zones = new HashSet<>();
	}

	/**
	 * Ajoute un annimal à la zone passée en paramètre si la zone n'existe pas elle
	 * sera crées
	 * 
	 * @param annimal
	 * @param zone
	 */
	public void AddAnimal(Animal animal, ZooZone zone) {
		if (zone != null && animal != null) {
			zone.addAnimal(animal);
			this.zones.add(zone);
		}

	}

	/**
	 * ajoute la zone au set les doublons seront ignorés
	 * 
	 * @param zone
	 */
	public void ajouterZone(ZooZone zone) {
		this.zones.add(zone);
	}

	/**
	 * affiche la liste de tous les animaux
	 * Zone par zone
	 */
	public void afficherListeAnimaux() {
		for (ZooZone zone : this.zones) {
			System.out.println("_______________________");
			System.out.println(zone.getNom());
			System.out.println("=======================");
			zone.afficherListeAnimaux();
			;
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**Renvoi la zone don le nom correspond à celui 
	 * passé en paramètre
	 * 
	 * @param zone
	 * @return
	 */
	public ZooZone getZone(String zone) {
		for (ZooZone z : this.zones) {
			if (z.getNom().equals(zone)) {
				return z;
			}
		}
		return null;

	}
}
