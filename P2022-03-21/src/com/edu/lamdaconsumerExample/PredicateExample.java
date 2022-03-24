package com.edu.lamdaconsumerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
		Predicate<Student> pridic = new Predicate<Student>( ) {

			@Override
			public boolean test(Student t) {
				return t.gender.equals("남자");
				
			}
		};
	        double avg = avg(pridic);
	        System.out.println("남학생의 평균: " + avg);
	        pridic = (s) -> s.gender.equals("여자");
	        avg = avg(pridic);
	        System.out.println("여학생의 평균: " + avg);
	        
    }
    public static double avg(Predicate<Student> pred) {
    	List<Student> list = new ArrayList<Student>();
    	list.add(new Student("김지찬", "남자", 70));
    	list.add(new Student("이유빈", "여자", 80));
    	list.add(new Student("김형민", "여자", 85));
    	list.add(new Student("김상수", "남자", 90));
    
        int cnt = 0;
        int sum = 0;
        double avg = 0;
        
        for(Student student : list) {
        	if(pred.test(student)) {
        		cnt++;
        		sum += student.score;
        	}
        }
        avg = sum / (double) cnt;
        return avg;
        
    }

}
