package pkg1;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalrow = 5;

		for (int row = 1; row <= totalrow; row++) { //1st for loop for controlling row
		      for (int sp = 1; sp <= row; sp++) {//2nd for loop for controlling star
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
		  }
		}