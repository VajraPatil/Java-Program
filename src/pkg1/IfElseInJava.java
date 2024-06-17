package pkg1;

public class IfElseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=80;
		int c=30;
		//String State="";// here we can print the string saying welcome to karnataka or maharashtra
		//if(){}
		//if- else{}
		//else if
		
		if(a>b && a>c) {
			System.out.println("a is greater number than b,c");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater number than a,c");
		}
		else {
			System.out.println("c is greater number");
		}
//		if(a>b) {
//			System.out.println("a is greater than b");
//		}
//		else {
//			System.out.println("b is greater than a");
//		}
		System.out.println("this is end of prgm");
	}

}
