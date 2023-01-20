package ex3.Annimaux;

import ex3.RegimentAlimentaire;

/**
 * Représente un animal
 * @author Vincent
 *
 */
public abstract class Animal extends Object{
	
	private String noms;
	private RegimentAlimentaire comportements;
	
	public Animal(String noms, RegimentAlimentaire comportements) {
		super();
		this.noms = noms;
		this.comportements = comportements;
	}

	/** Getter
	 * @return the noms
	 */
	public String getNoms() {
		return noms;
	}

	/** Getter
	 * @return the comportements
	 */
	public RegimentAlimentaire getComportements() {
		return comportements;
	}

	
	
}
