package Package1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Division div = new Division();
		System.out.println("Enter the two numbers");
		int res = div.calculatedivision(scan.nextInt(), scan.nextInt());
		System.out.println("result is " + res);
	}

}
