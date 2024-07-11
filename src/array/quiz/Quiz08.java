package array.quiz;

import java.util.Arrays;

public class Quiz08 {

	public static void main(String[] args) {

		Student[] students = new Student[3];

		students[0] = new Student(1, "둘리");
		students[1] = new Student(2, "또치");
		students[2] = new Student(3, "도우너");

		for (int i = 0; i < students.length; i++) {
			students[i].showInfo();
		}
	}

}

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {

		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void showInfo() {
		System.out.println("이름:" + this.studentName + " / 학번:" + this.studentID);
	}

}