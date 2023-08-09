package Sirisha_JavaFinalPractice;

public class LoopNested_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;

	    // outer loop no of rows
	    for (int i = 1; i <= rows; ++i) {

	      // inner loop to print the numbers or the ***
	      for (int j = 1; j <= i; ++j) {
	        System.out.print( "* ");
	      }
	      System.out.println("");

	    }
		
	}

}
