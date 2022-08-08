package homework0502;

public class Overload {

	private double heigth;
	private int length;

	public Overload(double heigth, int length) {
		this.heigth = 18.5;
		this.length = 27;
	}

	public Overload() {
		this.heigth = 33.5;
		this.length = 20;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Overload [heigth=" + heigth + ", length=" + length + "]";
	}

}
