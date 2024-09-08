package JavaPrograms;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first Number:  ");
		
		int a = obj.nextInt();
		System.out.println("Enter second Number:  ");
		int b = obj.nextInt();
		System.out.println("Enter third Number:  ");
		int c= obj.nextInt();
		System.out.println("Enter last Number:  ");
		int d = obj.nextInt();
		
		
		
		if ((a+b)>(c+d)){
			System.out.println("sum of "+ a+" and "+ b +" is greater than sum of "+ c +" and "+ d);
			
		}
		else {
			System.out.println("sum of "+ a+" and "+ b +" is not  greater than sum of "+ c +" and "+ d);
		}
	}

}
