package pkg1;

public class ForLoopInJava {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		//Iterate the value from 1 to 10
		for(int i=1;i<=10;i++) 
		{
			for(int j=1;j<=5;j++) {
				System.out.print(" i="+ i +" j="+ j);
		//	break;
			//if a break; is added here then as per the int=1. only the first case will be executed as i=1 to 10 and j=1 for all the 10 iterations of i;
			}
			System.out.println();
			//break;
			//output will be like, i remains as 1 and 'j' will be iterated from 1 to 5
			//i=1 j=1 i=1 j=2 i=1 j=3 i=1 j=4 i=1 j=5
		}
			
	}

}
