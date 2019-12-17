package Information;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("enter the no of students");
		Scanner scan = new Scanner(System.in);

		Student[] students = new Student[scan.nextInt()];

		for (int student = 0; student < students.length; student++) {
			students[student] = new Student();
			System.out.println("enter the " + (student + 1) + " details");
			System.out.println("name");
			students[student].setName(scan.nextLine() + scan.nextLine());
			System.out.println("id");
			students[student].setId(scan.nextInt());
			System.out.println("enter the no of exams taken by the student");
			int tot_exams = scan.nextInt();
			Exam[] exams = new Exam[tot_exams];
			for (int exam = 0; exam < exams.length; exam++) {
				exams[exam] = new Exam();
				System.out.println("enter the details of: " + exam);
				System.out.println("exam name:");
				exams[exam].setExam_name(scan.nextLine() + scan.nextLine());
				System.out.println("maximum marks:");
				exams[exam].setMax_marks(scan.nextInt());
				System.out.println("marks obtained:");
				exams[exam].setMarks_obt(scan.nextInt());
			}
			students[student].setExams(exams);
		}

		for (int student = 0; student < students.length; student++) {
			Reportcard rep = new Reportcard();
			students[student].setReports(rep);
			students[student].print();
		}

	}

}
