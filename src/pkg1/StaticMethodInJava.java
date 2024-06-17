package pkg1;

public class StaticMethodInJava {
int a=20;
static int b=30;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
                 // static family only accepts the static variables
//if you have instance variable and you want to call that in the class then you need to create object and then static variable can be called in main class.
		static void m1() {
	System.out.println("this is method1");
			System.out.println(b);
			StaticMethodInJava s1=new StaticMethodInJava();
			System.out.println(s1.a);
			s1.m2();
		}
		void m2() {
			System.out.println(a);
			m1();
			System.out.println("this is method2");
		}
	}
