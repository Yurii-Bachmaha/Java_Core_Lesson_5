package homework0501;

public abstract class Pet {

	protected String name;

	Pet() {
		this.name = "";
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	abstract void voice();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}

}
