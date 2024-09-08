package JavaPrograms;

import java.util.Scanner;

public class CheckSeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age=obj.nextInt();
		
		if (age>=60) {
			System.out.println("Senior Citizen");
		}
		
		else {
			System.out.println("Enter age is less than 60");
		}
				

	}

}
