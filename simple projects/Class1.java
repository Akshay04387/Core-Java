package package1;

public class Class1 {
	private int a,b;
	public Class1() {
		System.out.println("inside the constructor");
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
	public void sum() {
		System.out.println("the sum is = " + (a+b) );
	}
}
