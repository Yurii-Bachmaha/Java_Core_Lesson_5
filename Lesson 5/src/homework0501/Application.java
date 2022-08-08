package homework0501;

public class Application {
	public static void main(String[] args) {

		Cow c = new Cow();
		Cat ct = new Cat();
		Dog d = new Dog();

		System.out.print(c);
		c.voice();
		System.out.print(ct);
		ct.voice();
		System.out.print(d);
		d.voice();

	}

}
