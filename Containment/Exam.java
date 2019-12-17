package Information;

public class Exam {
	private String exam_name;
	private int max_marks;
	private int marks_obt;

	public Exam() {
	}

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	public int getMax_marks() {
		return max_marks;
	}

	public void setMax_marks(int max_marks) {
		this.max_marks = max_marks;
	}

	public int getMarks_obt() {
		return marks_obt;
	}

	public void setMarks_obt(int marks_obt) {
		this.marks_obt = marks_obt;
	}

	public void print() {
		System.out.println("exam name: " + exam_name);
		System.out.println("maximum marks: " + max_marks);
		System.out.println("marks obtained: " + marks_obt);
	}
}
