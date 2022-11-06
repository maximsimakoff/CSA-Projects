package petparade;

import java.util.ArrayList;

public class Kennel {
	private ArrayList<Pet> petList = new ArrayList<>();

	public Kennel(ArrayList<Pet> pets) {
		for (Pet pet : pets) {
			petList.add(pet);
		}
	}

	public Kennel() {
		Pet dog = new Dog("Tom");
		Pet cat = new Cat("angela");
		Pet louddog = new LoudDog("Ben");
		petList.add(dog);
		petList.add(cat);
		petList.add(louddog);
	}

	public void allSpeak() {
		for (Pet pet : petList) {
			System.out.println(pet.getName() + " " + pet.speak());
		}
	}
}
