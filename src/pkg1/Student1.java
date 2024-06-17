package pkg1;

public class Student1 {
	String name;
	int rollNumber;
	
	public Student1(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	
	void printStudentData() {
		System.out.println("Name="+name+" rollNumber="+rollNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1("Amit",1001);
		s.m2();
		//s.printStudentData();
	}

	void m1() {
		System.out.println("this is m1 method"); 
		}
	void m2() {
		//call m1 here
	//	Student1 s=new Student1("abc", 123);
	//	s.m1();//call method (no need to create object, when we are using "this" keyword
			this.m1(); //call method
		}
	}
