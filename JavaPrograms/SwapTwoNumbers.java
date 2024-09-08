package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=number.nextInt();
		System.out.println("Enter Second Number");
		int b=number.nextInt();
		
		System.out.println("Numbers befor swapping is ");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers After swapping is ");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
	}

}
