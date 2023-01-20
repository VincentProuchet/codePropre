package ex3;

import java.util.HashSet;
import ex3.Annimaux.Animal;

/**
 * Représente une zone du zoo
 * 
 * @author Vincent
 *
 */
public class ZooZone {
	/** nom de la zone */
	private String nom;
	/**
	 * coefficient pour le calcul de la quantitée de nourriture neccessaire à la
	 * zone par jour
	 */
	private double nourritureCoefficient = 0.2; // pour l'aquariume
	/** animaux présent dans la zone */
	private HashSet<Animal> animaux;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param nourritureCoefficient
	 */
	public ZooZone(String nom, double nourritureCoefficient) {
		super();
		this.animaux =new HashSet<>();
		this.nom = nom;
		this.nourritureCoefficient = nourritureCoefficient;
	}

	/**
	 * ajoute l'animal passé en paramètre
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}

	/**
	 * affiche le nom de chaque animal de la zone sous forme de liste
	 */
	public void afficherListeAnimaux() {
		for (Animal a : this.animaux) {
			System.out.println(a.getNoms());
		}
	}

	/**
	 * Calcule et renvoie la nourriture neccessaire pour cette zone par jour en kg
	 * 
	 * @return quantité de nourriture en Kg
	 */
	public double calculerKgsNourritureParJour() {
		return this.animaux.size() * this.nourritureCoefficient;
	}

	/**
	 * Getter
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

	/**
	 * Getter
	 * 
	 * @return the nourritureCoefficient
	 */
	public double getNourritureCoefficient() {
		return nourritureCoefficient;
	}

	/**
	 * Setter
	 * 
	 * @param nourritureCoefficient the nourritureCoefficient to set
	 */
	public void setNourritureCoefficient(double nourritureCoefficient) {
		this.nourritureCoefficient = nourritureCoefficient;
	}
}
