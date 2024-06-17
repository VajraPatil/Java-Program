package pkg1;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
		int temp = 0;
	
//		temp=a;   //Swapping 2 no's using 3rd variable "temp"
//		a=b;
//		b=temp;
		
		a=a-b;  //Swapping 2 no's without using 3rd variable 
	    b=a+b; // 20
        a=b-a; //
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}	
		
		
	
	
		
		
		
		
		//boolean a=false;
		//boolean b=true;
		
		//Compound assignment operator
		//a=a+2;
		//a+=2;
	//	a=a-3;
	//	a-=3;
		
	//	a=a%7;// meaning: 30%7 so 2 will be the output
		//a=a*10;
		//a*=10;
		
	//	System.out.println(a);
	//	Ternary Operator or Conditional operators:
		//?:
		//condition?statement1:statement2 -if any condition is true the it will return the statement 2.
				//int result=a<b?a:b;
				//System.out.println("result="+result);
		
	//	System.out.println(2<<1);
	//	System.out.println(3>>1);
		//Logical operators:
		//for "&&"And operator (true&&true=true), both the operators should be true then only it will return true, else all other options are false
		//for "||"OR oprrator: if any one of the operator is true then it will return true
		//example:
	    //System.out.println(a&&b);
		//System.out.println(a||b);
		//b=a++; //10
	    //b=++a;
		//b=--a;
		//System.out.println(a+b);
		//System.out.println("Hello java"+"Hello C++");
		//System.out.println(b-a);
		//System.out.println(a*b);
		//System.out.println(b/a);
		//System.out.println(b%a);
		//System.out.println(++a);
		//System.out.println(a++);
		//System.out.println(--a);
		//System.out.println(--a);
		
		//System.out.println("a="+a);
		//System.out.println("b="+b);
	//	System.out.println(a>=b);//greater than operator= true	
	//System.out.println(a<=b);//lesser than operator= false
	//System.out.println(a<=b);//lesser than operator= false
	//System.out.println(a==b);//checks 2 nos are equal or not
	//System.out.println(a!=b);//checks 2 nos are equal or not
	
	}