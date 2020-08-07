package org.dxctraining;

import java.util.*;


public class StudentMain {
		 Map<String,Student> store =new HashMap<>();
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		List<String> list=new ArrayList<>();
		public static void main(String[] args) {
		StudentMain demo=new StudentMain();
		demo.runUi();
	}

	private void runUi() {
		Student student1=new Student("b1",24);
        Student student2=new Student("b2",27);
        store.put(student1.getRollno(),student1);
        store.put(student2.getRollno(), student2);
        list.add(student1.getRollno());
        list.add(student2.getRollno());
        for(String details:store.keySet())
        {
            Student student=store.get(details);
            int age= student.getAge();
            String rollnum=student.getRollno();
            if(age%2==0)
            {

                set1.add(age);
            }
            else {
                set2.add(age);
            }
        }
        System.out.println(""+set1);
        System.out.println(""+set2);
    	System.out.println(""+list);
	}
}


