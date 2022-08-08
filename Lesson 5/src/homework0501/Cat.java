package homework0501;

public class Cat extends Pet {

	public Cat(String name) {
		super();
		this.name = "Cat";
	}
	
	public Cat() {
		this.name = "Cat";
	}

	@Override
	void voice() {
		System.out.println(" Meooooow-Meoooow.");
	}

	@Override
	public String toString() {
		return "I'm " + name + " -";
	}

}