package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();

		// 메뉴: 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료
		while (true) {
			System.out.println("1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료");
			System.out.println("메뉴선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) { // 리스트.
				List<Employee> list = dao.empList(); // 전체 조회하는 기능.

				System.out.println("사원리스트.");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) { // 입력
                 //사원번호, lastName, email, hireDate, jobId
				
				// 생성자, set메소드.
				
				System.out.println("사원번호를 입력해라");
				int employeeId = scn.nextInt();
//                emp.setEmployeeId(employeeId);
				
                System.out.println("LastName를 입력해라");
                String lastName = scn.next();
//                emp.setLastName(lastName);
                
                System.out.println("E-Mail을 입력해라");
                String eMail = scn.next();
//                emp.setEmail(eMail);
                
                System.out.println("입사일을 입력해라");
                String hireDate = scn.next();
//                emp.setHireDate(hireDate);
                
                System.out.println("부서를 입력해라");
                String jobId = scn.next();
//                emp.setJobId(jobId);
                Employee emp = new Employee(employeeId, lastName, eMail, hireDate, jobId);
                dao.insertEmp(emp);
				
			    
			
			} else if (menu == 3) { // 수정
				 Employee emp = new Employee();

//				 psmt.setString(1, emp.getFirstName());
//		         psmt.setString(2, emp.getphoneNumber());
//		         psmt.setInt(3, emp.getSalary());
//		         psmt.setInt(4, emp.getEmployeeId());
				System.out.println("first 이름을 입력해라");
				emp.setFirstName(scn.next());
				
				System.out.println("폰번호를 입력해라");
				emp.setphoneNumber(scn.next());
				
				System.out.println("급여를 입력해라");
				emp.setSalary(scn.nextInt()); //==	int Salary = scn.nextInt(); + emp.getSalary());
				
				System.out.println("사원번호를 입력해라");
				emp.setEmployeeId(scn.nextInt()); // == int EmployeeId = scn.nextInt();
	                
				dao.updateEmp(emp);
				
			} else if (menu == 4) { // 삭제
				System.out.println("사원번호를 입력해라 ");
				int employeeId = scn.nextInt();
				
				dao.deleteEmp(employeeId);
			
			} else if (menu == 5) { // 한건조회
              System.out.println("조회할 사원번호 입력 ");
              int eid = scn.nextInt();
              Employee emp = dao.searchEmp(eid);
              if(emp == null)
            	  System.out.println("조회결과가 없습니다");
              else
            	  System.out.println(emp.toString());
			
			} else if (menu == 9) { // 종료
				System.out.println("프로그램을 종료합니다.");
				break;

			}

		} // end of while
		System.out.println("end of prog");
		scn.close();
	}
}
