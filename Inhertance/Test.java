package package1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*Worker worker = new Worker(12,"Akshay","Worker");
		Manager manager = new Manager(11,"Akash","Manager");
		
		worker.display();
		manager.display();*/
		
		System.out.println("enter the number of employees");
		Employee[] employees = new Employee[scan.nextInt()];
		for(int employee=0;employee<employees.length;employee++) {
			employees[employee] = new Employee();
			System.out.println("enter the employee id");
			employees[employee].setId(scan.nextInt());
			System.out.println("enter the employee name");
			employees[employee].setName(scan.nextLine()+scan.nextLine());
			
		}
		for(Employee employee:employees) {
			employee.display();
		}
	}

}
