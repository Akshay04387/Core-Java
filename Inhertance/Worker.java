package package1;

public class Worker extends Employee{
	private String department;
	public Worker() {
		
	}
	public Worker(int id,String name,String department) {
		super(id,name);
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public void display() {
		super.display();
		System.out.println("employee department: "+department);
	}
	
}
