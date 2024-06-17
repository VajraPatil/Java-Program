package pkg1;

public class SwitchCaseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key=7;
		int a=20;
		int b=30;
		int result=0;
		switch (key) {
		case 1: {
			result=a+b;
			System.out.println("Addition="+result);
			break;
	}
		case 2:{
			result=a-b;
			System.out.println("Sub="+result);
			break;
		}
		case 3: {
			result=a/b;
			System.out.println("Div="+result);
			break;
		}
		case 4: {
			result=a*b;
			System.out.println("Mul="+result);
			break;
		}
default:
	System.out.println("Enter valid option between 1 to 4");
		}
	}
}
