package com.prod;

public class EmployeeExample {
    public static void main(String[] args) {
		Employee e1 = new Employee();
//		e1.employeeId = 100;
		e1.setEmployeeId(100);
		
		
//		e1.employeeName = "장그래";
		e1.setEmployeeName("장그래");
		
		
//		e1.department = "개발부";
		e1.setEmployeedepartment("개발부");
		
		
//		e1.job = "월급계산";
		e1.setEmployeejob("월급계산");
		
//		e1.salary = -1000000;
		e1.setSalary(-10000);
		
		System.out.println(e1.getEmployeeName() + "의 부서는 " //
		       + e1.getEmployeedepartment() + "이고,"
		       + " 직무는 " + e1.getEmployeejob() + "이고, "
		       + "급여는 " + e1.getSalary() + "원입니다");
		System.out.println(e1.getEmpInfo());

        //employeeId        
		Employee e2 = new Employee();
        e2.setEmployeeId(101);
        e2.setEmployeeName("이재빈");
        e2.setEmployeedepartment("총무부");
        e2.setEmployeejob("비품구매");
        e2.setSalary(2000);
        
        System.out.println(e2.getEmpInfo());
        
		
		
		
		
		
	}
}
