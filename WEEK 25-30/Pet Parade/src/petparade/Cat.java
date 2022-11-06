package petparade;

public class Cat extends Pet {
	public Cat(String name) {
		super(name);
	}

	public Cat() {
		super("Bob");
	}

	public String speak() {
		return "meow";
	}

	public static void main(String[] args) {
		Cat bruh = new Cat();
		System.out.println(bruh.speak());
		LoudDog poop = new LoudDog();
		System.out.println(poop.speak());
		Kennel kens = new Kennel();
		kens.allSpeak();
	}
}
