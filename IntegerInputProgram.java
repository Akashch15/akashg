package thread;

import java.util.InputMismatchException;
import java.util.Scanner;
//Write a java program to return InputMismatchException for non-integer value.
public class IntegerInputProgram {

	public static void main(String[] args)
	{
		//for user Input
		Scanner sc =new Scanner(System.in);
		
		try {
			//Taking Input from User
			System.out.println("Enter an Integer");
			int UserInput=sc.nextInt();
			//Print Input
			System.out.println("You Entered:"+UserInput);
		}
		//Creating Exception
		catch(InputMismatchException e) 
		{
			System.out.println("Enter a Valid Input");
		}
		finally 
		{
			sc.close();
		}
		

	}

}
