package ex3;

import ex3.Annimaux.Mammifere;
import ex3.Annimaux.Poisson;
import ex3.Annimaux.Reptile;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		
		zoo.AddAnimal(new Mammifere("Gazelle",RegimentAlimentaire.HERBIVORE ),new ZooZone("Savane", 10) );
		
		zoo.AddAnimal(new Mammifere("Zèbre",RegimentAlimentaire.HERBIVORE),zoo.getZone("Savane"));
		
		
		zoo.AddAnimal(new Mammifere("Lion", RegimentAlimentaire.CARNIVORE),new ZooZone("Zone Carnivore", 10));
		
		zoo.AddAnimal(new Mammifere("Panthère",RegimentAlimentaire.CARNIVORE), zoo.getZone("Zone Carnivore"));
		zoo.AddAnimal(new Poisson("Requin blanc",RegimentAlimentaire.HERBIVORE) , new ZooZone("Aquarium", 0.2));
		zoo.AddAnimal(new Poisson("Truite dorée", RegimentAlimentaire.HERBIVORE), zoo.getZone("Aquarium"));
		zoo.AddAnimal(new Reptile("Boa constrictor",RegimentAlimentaire.CARNIVORE),new ZooZone("Ferme Reptile",0.1)); 
		zoo.AddAnimal(new Reptile("Python", RegimentAlimentaire.CARNIVORE),zoo.getZone("Ferme Reptile"));
		
		zoo.afficherListeAnimaux();
	}

}
