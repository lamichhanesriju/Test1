package Sirisha_JavaFinalPractice;

public class Conditional_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*3.if else if statement :
			if /else statement multiples

			if(cond)
			{ode}
			elseif
			{
			code
			}
			elseif{
			code
			}
			else{
			comd
			}*/


	
			int x=100;
			int y=100;
			int z=100;

			if(x>y&&x>z) 
			//&& operator is =and operator when both condions are true then the loop will run else no
			{
			System.out.println(x+" is a bigger value");
			}
			else if(y>x&&y>z)
			{
			System.out.println(y+"is bigger value");
			}
			else if(z>x&&z>y)//true
			{
			System.out.println(z+"is abigger value");

			}
			else
			{
			System.out.println("no value ");
			}
		
	}

}
