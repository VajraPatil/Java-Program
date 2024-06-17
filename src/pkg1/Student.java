package pkg1;

public class Student {
	
String StudentName;
int StudentId;

	Student(String name, int id)
	{
	StudentName= name;
	StudentId= id;
}
	void printStudentInfo() {
		System.out.println("Name of student is="+StudentName);
		System.out.println("Studentid is="+StudentId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ajay=new Student("Ajay",0001);
		ajay.printStudentInfo();
		Student Sanjay=new Student("Sanjay",0002);
		Sanjay.printStudentInfo();
		
	}

}
