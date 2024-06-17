package pkg1;

public class PrintTable {
	int c=1; //instance object
	static int s=2; // class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable obj = new PrintTable();
		obj.m();
	System.out.println(s);
		//int num = num.PrintTable();
	}
	
	void m() {
		//		// TODO Auto-generated method stub
		 for(int i=1;i<=10;i++)
			 for(int j=1;j<=10;j++)  {
				 System.out.printf("%2d",i*j);
			 }
}
}