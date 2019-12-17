package package1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of employees\n");
		Employee emp[]  = new Employee[scan.nextInt()];
		

		for (int employee = 0; employee < emp.length; employee++) {

			System.out.println("enter the employee id for " + employee);
			
			emp[employee]=new Employee();
			emp[employee].setId(scan.nextInt());
			System.out.println("enter the employee name for " + employee);
			emp[employee].setName(scan.nextLine() + scan.nextLine());
			System.out.println("enter the employee salary for " + employee);
			emp[employee].setSalary(scan.nextFloat());

		}
		System.out.println("printing the details of the employees");
		for (int employee = 0; employee < emp.length; employee++) {
			System.out.println("details for: " + employee);
			emp[employee].display_details();
		}
	}
}
