package IfStatement;

import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c=sc.next().charAt(0);
		if(c>='a' && c<='z') {
			c=(char) (c-32);
			System.out.println(c);
		}
		else if(c>='A' && c<='Z') {
			c=(char) (c+32);
			System.out.println(c);
		}
		else {
			System.out.println("Enter valid character");
		}
	}

}
