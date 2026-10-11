package java_Basic;

import java.util.*;

public class Armstrong_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		int rem,sum=0;
		
		int original = num;
		
		while(num>0)
		{
			rem = num % 10;
			
			sum = sum + rem*rem*rem;
			
			num = num / 10;
		}
		
		if(sum == original)
		{
			System.out.println(original + " is a Armstrong number");
		}
		
		else {
			System.out.println(original + " is not a Armstrong number");
		}
		
		sc.close();
		
	}

}
