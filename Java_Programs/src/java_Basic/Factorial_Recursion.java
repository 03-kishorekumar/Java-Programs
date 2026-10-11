package java_Basic;

import java.util.*;

public class Factorial_Recursion {
	
	public int Factorial(int num) 
	{
		if(num == 0 || num == 1)
		{
			return 1;
		}
		
		return num*Factorial(num-1);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int n = sc.nextInt();
		
		Factorial_Recursion obj=new Factorial_Recursion();
		
		System.out.println("Factorial of " + n + " is : " + obj.Factorial(n));
		
		sc.close();

	}

}
