package com.prod;

public class Employee {
   private int employeeId;
   private String employeeName;
   private String department;
   private String job;
   private int salary; //private하면 외부에 숨김
   
   public void setEmployeeId(int employeeId) {
	   this.employeeId = employeeId;
   }
   
   public int getEmployeeId() {
	   return this.employeeId;
	   
   }
   public void setSalary(int salary) { //값을 지정하는 매소드
	   if(salary < 0) {
		   this.salary = 10000; 
	   } else {
		   this.salary = salary;
		   
	   }
   }
   public int getSalary() { //값을 불러오는 매소드
	   return this.salary;
   }
   public void setEmployeeName(String employeeName) {
	   this.employeeName = employeeName;
   }
   public String getEmployeeName() {
	   return this.employeeName;
   }
   public void setEmployeedepartment(String department) {
	   this.department = department;
   }
   public String getEmployeedepartment() {
	   return this.department;
   }
   public void setEmployeejob(String job) {
	   this.job = job;
   }
   public String getEmployeejob() {
	   return this.job;
   }
   public String getEmpInfo() {
	   String result = this.getEmployeeName() + "의 부서는 " // 
   + this.getEmployeedepartment() + "이고, 직무는 " + this.job // 
   + "이고, 급여는 " + this.getSalary() + " 원입니다."; 
   return result;
   }
}

