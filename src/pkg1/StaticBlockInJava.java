package pkg1;

public class StaticBlockInJava {
	{
		System.out.println("this is my instance block");
	}
	static {
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		StaticBlockInJava s= new StaticBlockInJava();
		StaticBlockInJava s1= new StaticBlockInJava();
		StaticBlockInJava s2= new StaticBlockInJava();
		System.out.println("End");
	}

}
//static block will be loaded before the main method.