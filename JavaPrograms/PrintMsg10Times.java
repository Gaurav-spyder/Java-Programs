package JavaPrograms;

import java.util.Scanner;

public class PrintMsg10Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Text:  ");
		
		String msg=obj.nextLine();
		//String msg="Welcome to Guvi";
		for (int i=1;i<=10;i++) {
			System.out.println(msg);
		}

	}

}
