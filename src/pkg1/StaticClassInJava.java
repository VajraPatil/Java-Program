package pkg1;

public class StaticClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.InnerClass.m();
 
	}

}

class A {
	static class InnerClass {
		static void m() {
			System.out.println("this is my inner class method m");	}
	}
}