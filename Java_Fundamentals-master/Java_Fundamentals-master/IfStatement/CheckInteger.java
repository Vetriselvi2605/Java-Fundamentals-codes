package IfStatement;

import java.util.Scanner;

public class CheckInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num +" "+"is a positive number");
		}
		else if(num<0) {
			System.out.println(num +" "+"is a negative number");
		}
		else {
			System.out.println(num +" "+"is a zero");
		}
	}

}
