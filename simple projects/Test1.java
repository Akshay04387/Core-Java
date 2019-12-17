package package1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Class1 class1 = new Class1();
		
		class1.setA(scan.nextInt());
		class1.setB(scan.nextInt());
		class1.sum();
	}

}
