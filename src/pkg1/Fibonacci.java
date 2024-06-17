package pkg1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0;
int n2=1;
int next=0;
System.out.println(n1+" "+n2+" ");
for(int i=0;i<=10;i++) {
	next=n1+n2;
	System.out.println(next+" ");
	n1=n2;
	n2=next;
	
}
	}

}
