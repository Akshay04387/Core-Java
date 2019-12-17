package Information;

public class Reportcard {
	private int tot_marks;
	private int marks_obt;
	private float percentage;
	private String grade;

	public void set_marks(int t, int o) {
		tot_marks = t;
		marks_obt = o;

	}

	public void calculate() {
		System.out.println("total marks: " + tot_marks + "	/	marks obtained: " + marks_obt);
		percentage = ((float)(marks_obt*100)/tot_marks);
		if (percentage > 35) {
			grade = "PASS";
		} else {
			grade = "FAIL";
		}
	}

	public void print() {
		System.out.println("percentage: " + percentage);
		System.out.println("grade: " + grade);
	}
}
