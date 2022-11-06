package petparade;

public class Dog extends Pet {
	public Dog(String name) {
		super(name);
	}

	public Dog() {
		super("Barky");
	}

	public String speak() {
		return "dog-sound";
	}
}
