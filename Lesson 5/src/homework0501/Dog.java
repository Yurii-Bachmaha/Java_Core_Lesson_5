package homework0501;

public class Dog extends Pet {

	public Dog(String name) {
		super();
		this.name = "Dog";
	}
	
	public Dog() {
		this.name = "Dog";
	}

	@Override
	void voice() {
		System.out.println(" Gaaaaav-Gaaaaav.");
	}

	@Override
	public String toString() {
		return "I'm " + name + " -";
	}

}