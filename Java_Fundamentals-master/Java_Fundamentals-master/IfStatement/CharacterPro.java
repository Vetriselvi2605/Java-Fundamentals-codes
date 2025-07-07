package IfStatement;

import java.util.Scanner;

public class CharacterPro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two characters: ");
		char c=sc.next().charAt(0);
		char c1=sc.next().charAt(0);
		if(c>c1) {
			System.out.println(c1 +","+ c );
		}
		else {
			System.out.println(c +","+ c1);
		}
		
	}

}
