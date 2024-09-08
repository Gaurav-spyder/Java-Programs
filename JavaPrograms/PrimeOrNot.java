package JavaPrograms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number to Check whether it is Prime or not");
		int num=obj.nextInt();
		if (num==1){
			System.out.println(num+": is prime number ");
		}
		else if(num<0){
			System.out.println("No negative number allowed");
			
		}
		else {
			if(num>0) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
			}
		}
		

	}
if (flag==1) {
	System.out.println("Number is not prime number");
}
else {
	System.out.println("Number is  a prime number");
}
}
}}
