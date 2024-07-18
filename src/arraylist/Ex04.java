package arraylist;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		
		//둘리 학생 생성
		Student student1 = new Student("둘리");
		
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("수학", 50));
		student1.showInfo();
		
		Student student2 = new Student("도우너");
		
		student2.subjectList.add(new Subject("국어", 70));
		student2.subjectList.add(new Subject("영어", 85));
		student2.subjectList.add(new Subject("과학", 70));
		student2.subjectList.add(new Subject("사회", 85));
		student2.showInfo();
	}

}

class Subject {
	String name; // 과목명
	int score; // 점수

	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}

class Student {
	String studentName; // 학생이름
	ArrayList<Subject> subjectList; // 수강 과목 리스트

	public Student(String studentName) {
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}

	// 학생의 총 점수를 출력하는 메소드
	public void showInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total = total + s.score;
		}
		System.out.println(studentName + "학색의 총점은 " + total + "입니다.");
	}

}