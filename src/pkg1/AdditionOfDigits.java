package pkg1;

public class AdditionOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int number=123456;
 int sum=0;
 for (int i=1; number>0;i++) {
	 sum=sum+number%10; //another way using compound assignment: sum+=number%10;
	 number=number/10; //number/=10;
	 }
 System.out.println(sum);
	}

}
