package pkg1;

public class JavaFirstProgram {
	//double b;
 int b=20; //instance variable related to object, (when the object is created (JavafirstProgram), the instance will get the memory)
 static int c=30; // static variable related to class ( when the class is loaded, the static var will get the memory)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello batch 3rd June");
		JavaFirstProgram j=new JavaFirstProgram();
		
		JavaFirstProgram obj=new JavaFirstProgram();
		System.out.println(j.b);
		
		short b=128;
		int a=13445;
		float f=100.1111111111111111f;
		double d=100.1111111111111111;
		
		//2 ways to print A to Z
	//	char c= 65;
	//	for(int i=0;i<=90;i++) {
		//	char[] c= Character.toChars(65+i);
		//	System.out.println(c);
	//	}
		
	//	for(char i='A';i<='Z';i++) {
		//	System.out.println(i);
	//	}
		//A to Z
		
		//System.out.println("byte b="+b);
		//System.out.println("int a="+a);
		//System.out.println("float f="+f);
		//System.out.println("double d="+d);
		//System.out.println("char c="+c);
	}
		int add(byte a, byte b) {
			a=10;
			b=20;
			int result= a+b ;
			return (result);
		}

		void m() {
			int b=20;
			System.out.println(b);
			System.out.println(c);
		}
		void m2() {
			System.out.println(b);
			System.out.println(c);
		}
		
}
