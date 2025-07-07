package IfStatement;

import java.util.Scanner;

public class GenderIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gender: ");
		String gender=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		if(gender.equals("male") && age>=1 && age<=58) {
			System.out.println("The percentage of interest is 8.4%");
		}
		else if(gender.equals("male") && age>=59 && age<=100) {
			System.out.println("The percentage of interest is 10.5%");
		}
		else if(gender.equals("female") && age>=1 && age<=58) {
			System.out.println("The percentage of interest is 8.2%");
		}
		else if(gender.equals("female") && age>=59 && age<=100) {
			System.out.println("The percentage of interest is 9.2%");
		}
		else {
			System.out.println("Please enter correct values");
		}
	}
}
