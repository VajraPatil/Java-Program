package pkg1;
public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int number=7;
 boolean flag=true;
 for (int i=2;i<number;i++)
	 if(number%i==0) {
		 flag=false;
		 break;
	 }
 {
if(flag) {
	System.out.println("no. is Prime number");
}
else {
	System.out.println("no. is not Prime number");
	}
}
	}
}