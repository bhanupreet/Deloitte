interface Calculator {
	int sum(int x, int y);

	int product(int x, int y);
}

class ABCCalculator implements Calculator {
	@Override
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int product(int x, int y) {
		return x * y;
	}

}

class XYZCalculator implements Calculator {

	@Override
	public int sum(int x, int y) {
		return x - (-y);
	}

	@Override
	public int product(int x, int y) {
		return y * x;
	}
}

public class Interfaces {
	public static void main(String args[]) {
		Calculator c = new ABCCalculator();
		System.out.println(c.sum(12, 13));
		System.out.println(c.product(4, 7));

		Calculator d = new XYZCalculator();

		System.out.println(d.sum(4, 9));
		System.out.println(d.product(3, 7));
	}

}
