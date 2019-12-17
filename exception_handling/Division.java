package Package1;

public class Division {
	private int a;
	private int b;

	public Division() {
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int calculatedivision(int a, int b) {
		int res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException ex) {
			System.out.println("dividing by 0 is not allowed");
		}
		return res;
	}
}
