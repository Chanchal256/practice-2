package com.exercises.bill;
import java.util.Scanner;

public class Pin {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int a = 123;
		  
		  int num=0;
		  while(true)
		  {
			  System.out.println("Please enter your pin number:");
			  int pin =sc.nextInt();
			  
			  if(a==pin) {
				  System.out.println("Correct, Welcome back. ");
				  break;
			  }
			  else
			  {
				  if(num<=2)
				  {
					  System.out.println("Incorrect pin. try again.");
				  }
			  }
			  num++;
			  
			  if(num>=3)
			  {
				  System.out.println("Sorry but have been locked out.");
				  break;
			  }
		  }
		sc.close();
	}

}
