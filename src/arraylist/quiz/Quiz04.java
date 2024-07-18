package arraylist.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz04 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Student student1 = new Student(1, "둘리");
		list.add(student1);

		list.add(new Student(2, "또치"));
		list.add(new Student(3, "도우너"));

		for(int i=0;i<list.size();i++) {
			Student a = list.get(i);
			a.showInfo();
		}
	}

}

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void showInfo() {
		System.out.println(studentID+ " / " + studentName);
	}
}