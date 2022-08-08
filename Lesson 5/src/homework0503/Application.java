package homework0503;

public class Application {

	public static void main(String[] args) {

		Frog f = new Frog();

		System.out.print(f + " and");
		f.eat();
		System.out.print(f + " and");
		f.sleep();
		System.out.print(f + " and");
		f.swim();
		System.out.print(f + " and");
		f.walk();
	}
}
