package com.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class StudentApp {

	Scanner scn = new Scanner(System.in);
	List<Student> allStudents = new ArrayList<Student>(); // 컬렉션을 이용해서 정보를 저장.

	public StudentApp() {
		allStudents.add(new HighStudent(100, "김고등", "김담임", "1반"));
		allStudents.add(new CollegeStudent(200, "김대학", "김교수", "컴퓨터공학"));
	}

	class StudentServiceImpl implements StudentService {

		@Override
		public void addStudent(Student student) {
			allStudents.add(student);

		}

		@Override
		public void modStudent(Student student) {

			for (int i = 0; i < allStudents.size(); i++) {
				if (allStudents.get(i).getStudName() == student.getStudName()) {

					allStudents.get(i).setStudNo(student.getStudNo());
				}
			}
		}

		@Override
		public List<Student> studentList() {
			return allStudents;
		}

	}

	public void execute() {

		StudentService service = new StudentServiceImpl();

		// 1.입력, 2.수정, 3.리스트 보기 기능을 구성하세요.
		while (true) {
			

			System.out.println("1.입력, 2.수정, 3.리스트 보기, 4.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				// 입력일 경우 고등학생정보와 대학생정보를 구분해서 처리.
				System.out.println("선택> 고등학생, 대학생");
				String s1 = scn.next();
				
				
				if (s1.equals("고등학생")) {

					System.out.println("학생번호 입력");
					int s2 = scn.nextInt();

					System.out.println("학생이름 입력");
					String s3 = scn.next();

					System.out.println("담임선생님 입력");
					String s4 = scn.next();

					System.out.println("반 이름 입력");
					String s5 = scn.next();

					Student hm = new HighStudent(s2, s3, s4, s5);
					service.addStudent(hm);

				} else if (s1.equals("대학생")) {

					System.out.println("학생번호 입력");
					int s2 = scn.nextInt();

					System.out.println("학생이름 입력");
					String s3 = scn.next();

					System.out.println("담당교수 입력");
					String s4 = scn.next();

					System.out.println("전공 입력");
					String s5 = scn.next();

					Student cm = new CollegeStudent(s2, s3, s4, s5);
					service.addStudent(cm);
				}

			} else if (menu == 2) {
				System.out.println("수정할 학생번호를 입력");
				int s1 = scn.nextInt();

				System.out.println("수정할 학생이름 입력");
				String s2 = scn.next();

				Student s3 = new Student(s1, s2);
				service.modStudent(s3);

			} else if (menu == 3) {
				List<Student> list = service.studentList();
				for (Student a : list) {
					System.out.println(a.toString());
				}
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("end of program.");
	}
}
