package homework0501;

public class Cow extends Pet {

	public Cow(String name) {
		super();
		this.name = "Cow";
	}

	public Cow() {
		this.name = "Cow";
	}

	@Override
	void voice() {
		System.out.println(" Muuuuu-Muuuuu.");
	}

	@Override
	public String toString() {
		return "I'm " + name + " -";
	}

}