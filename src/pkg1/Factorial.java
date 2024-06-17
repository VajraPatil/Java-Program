package pkg1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f= new Factorial();
		int result=f.factorial(7); //method calling
		System.out.println("factorial="+result);
	}
		int factorial(int num) {
		int facto=1;
		for(int i = 1;i<=num;i++)
			{facto*=i; //facto=facto*i;
		}
		return facto();
	}
		private int facto() {
			// TODO Auto-generated method stub
			return 0;
		}
	}


