package pkg1;

public class Constructor {
	
	//Constructor(){ //default constructor
//	}
	
	Constructor(){ //zero argument constructor
	System.out.println("this is my constructor");
	}
	
	Constructor(float a){
		System.out.println("this is float args constructor");
		}
	
	Constructor(double a){
		System.out.println("this is double args constructor");
		}
	Constructor(int a,int b){
	System.out.println("this is 2 int args constructor");
	}
	
	

	int Constructor() { //this is considered as method and not a constructor (Constructor donot have any return method)
		System.out.println("in side constructor");
		return 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Constructor c = new Constructor();
		//Constructor c1= new Constructor(10,20); // int argument wil be called by using this constructor
	//	Constructor c1= new Constructor(10.10); //double arg will be called by using this constructor
		//Constructor c1= new Constructor(10.10f); //float arg will be called by using this constructor
		
		//c.ConstructorInJava();
		System.out.println("main End");
		
	}

}
//if you don't have a constructor in your class,then java adds a default constructor to your class.
//If we have a business requirement, where the code should be called as soon as we use the object.
//-	Constructor should be called.
