package JavaPrograms;

import java.util.Scanner;

public class CountNumberInDigits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num=obj.nextInt();
		int flag=num; 
		int c=0;
		while(num>0) {
			 r=num%10;
			 c=c+1;
			num=num/10;
			
		}
System.out.println("Total no of digits in "+ flag + " is " + c );
	}

}
