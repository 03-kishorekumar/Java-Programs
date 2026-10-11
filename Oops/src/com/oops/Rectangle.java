
package com.oops;


public class Rectangle {
	
	int length,width;
	
	void getdetails(int x,int y)
	{
		length =x;
		
		width=y;
		
	}
	
	int area()
	{
		int a=length*width;
		
		return a;
	}
	
	int perimeter()
	{
		int b=2*(length+width);
		
		return b;
	}
	

	public static void main(String[] args) {
		
		Rectangle rec=new Rectangle();
		
		rec.length=20;
		
		rec.width=30;
		
		System.out.println(" Area of rectangle : " + rec.area());
		
		Rectangle rec1=new Rectangle();
		
		rec1.getdetails(10, 5);
		
		System.out.println(" Area of rectangle : " + rec1.area());
		
		System.out.println(" Area of perimeter : " + rec1.perimeter());
		
		// TODO Auto-generated method stub

	}

}
