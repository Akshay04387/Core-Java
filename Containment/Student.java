package Information;

public class Student {
	private int id;
	private String name;
	private Exam[] exams;
	private Reportcard report;
	private int total_marks;
	private int total_obt;

	public Student() {
		total_marks = 0;
		total_obt = 0;
	}

	public Student(int id, String name, Exam[] exams) {
		this.id = id;
		this.name = name;
		this.exams = exams;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	public Reportcard getReport() {
		return report;
	}

	public void setReports(Reportcard report) {
		this.report = report;
	}

	public void examdetails() {
		for (int exam = 0; exam < exams.length; exam++) {
			exams[exam].print();
			total_obt += exams[exam].getMarks_obt();
			total_marks += exams[exam].getMax_marks();
		}
	}

	public void print() {
		System.out.println("Printing the details for the Student: " + name);
		System.out.println("student id: " + id);
		System.out.println("displaying the details for the exams:");
		examdetails();
		
		System.out.println("displaying the final report card");
		report.set_marks(total_marks, total_obt);
		report.calculate();
		report.print();
	}
}
