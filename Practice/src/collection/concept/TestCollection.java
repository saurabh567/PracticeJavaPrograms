package collection.concept;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		List<Object> b1 = new ArrayList<>();
		b1.add("Ravi");
		b1.add(1);
		b1.add(true);
		System.out.println("String Type " +b1.get(0));
		System.out.println("Integer Type " +b1.get(1));
		System.out.println("Boolean Type " +b1.get(2));
		List<Student> studentList = new ArrayList<>();
		Student student1 = new Student("Ravi", 1, true);
		
		Student student2 = new Student("Rahul", 2, false);
		
		studentList.add(student1);
		studentList.add(student2);
		
		for(Student s: studentList)
		{
			System.out.println("Name: " +s.getName() + " Roll No: " +s.getRollNo() + " Option value: " +s.isOpt());
		}
		
		student1.setName(null);
		
		for(Student s: studentList)
		{
			System.out.println("New Name: " +s.getName() + " Roll No: " +s.getRollNo() + " Option value: " +s.isOpt());
		}
		
		al.add("Ravi");
		al.add("Ganesh"); //Syntax for adding an object in Arraylist-- arrayname.add(data)
		al.add("Suresh");
		al.add("Shyam");
		al.add("Mohan");
		//System.out.println(al.get(2));   //syntax-arrayname.get(index)
		

		//System.out.println(al.size());
	
//	ArrayList<object> al2 =new ArrayList<object>();
//	al2.add("Hemant");
//	al2.add("Saurabh");
		
	
//	for(String i:al) {                //Enhanced for loop
//		System.out.println(i);
//	}
//	
//	for( String j:al2) {
//		System.out.println(j);
		
//	Iterator itr=al.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//		
//	}
	
	
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(i);
//		}
	
	ArrayList al2=new ArrayList();
	al2.add("sonu");
	al2.add(30);
	al2.add('p');
	System.out.println(al2.size());
	
	}

	/*
	 * public static void main(String[] args) { al.get(2) }
	 */
	
	}



