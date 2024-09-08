package JavaPrograms;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number to check Even: ");
		 int a =obj.nextInt();
		 if (a%2==0) {
			 System.out.println("Even Number");
		 }
		 else {
			 System.out.println("Odd Number");
		 }
		

	}

}
