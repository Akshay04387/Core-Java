package package1;

public class Tiger implements Animals{
	public Tiger() {
		System.out.println("This animal is tiger");
	}
	@Override
	public void eats() {
		System.out.println("the tiger is carnivore");
	}@Override
	public void legs() {
		System.out.println("the tiger has 4 legs");
	}@Override
	public void livesin() {
		System.out.println("the tiger lives in jungle");	
	}
}
