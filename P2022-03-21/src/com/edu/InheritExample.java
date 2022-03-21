package com.edu;

public class InheritExample {
   //학생, 직장인, 주부 => 정보를 담아놓는 정보.
   //학교, 학년
   //직장명, 직급
   //출신지역
	
	public static void main(String[] args) {
		Students student = new Students();
		student.setName("군만두");
        student.setAge(15);
        student.setSchool("중앙고");
        student.setGrade(2);
        
        
        Worker worker = new Worker();
        worker.setName("물만두");
	    worker.setAge(35);
	    worker.setCompany("카카오");
	    worker.setJob("만두팀장");
	    
	  //부모클래스의 참조변수에 자식클래스의 참조변수 자동형변환(promotion)
	    Person p1 = new Person();
	    p1 = (Person) student; 
	    p1 = worker;
	    
	    
	
	}
}
