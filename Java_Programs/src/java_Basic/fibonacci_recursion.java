package java_Basic;

import java.util.*;

public class fibonacci_recursion {
	
	public int Fibonacci(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num = sc.nextInt();
		
		fibonacci_recursion obj=new fibonacci_recursion();
		
		System.out.println("Fibonacci number at position " + num +" is :"+obj.Fibonacci(num));
		
		sc.close();

	}

}
