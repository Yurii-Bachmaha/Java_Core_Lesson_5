package homework0503;

public class Amphibia {

	protected String name;

	public void eat() {
		System.out.println(" I'm eating.");
	}

	public void sleep() {
		System.out.println(" I'm sleeping.");
	}

	public void swim() {
		System.out.println(" I'm swimming.");
	}

	public void walk() {
		System.out.println(" I'm walking.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Amphibia [name=" + name + ", toString()=" + super.toString() + "]";
	}

}
