package java_Basic;


import java.util.*;

public class Palindrome_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		
		int original = num;
		
		int rem,sum=0;
		
		while(num > 0)
		{
			rem = num % 10;
			
			sum = sum * 10 +rem;
			
			num = num / 10;
		}
		
		if(sum == original)
		{
			System.out.println(original + " is a palindrome number");
		}
		
		else {
			System.out.println(original + " is not a palindrome number");
		}
		
		sc.close();

	}

}
