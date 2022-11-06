package petparade;

public class LoudDog extends Dog {
	public LoudDog() {
		super();
	}

	public LoudDog(String name) {
		super(name);
	}

	public String speak() {
		return super.speak().repeat(2);
	}
}
