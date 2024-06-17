package pkg1;

public class SwitchCaseArrowOrLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key=5;
		
		switch (key) {
		case 1 -> System.out.println("Case 1");
		case 2 -> System.out.println("Case 2");
		case 3 -> System.out.println("Case 3");
		case 4 -> System.out.println("Case 4");
		
		//switch case for multiple line output
		case 5 ->{System.out.println("Case 5");
		System.out.println("Case 6");
		System.out.println("Case 7");
		}
		}
	}

}
