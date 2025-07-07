package Switch;

import java.util.Scanner;

public class ColourIdentify {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char c=sc.next().charAt(0);
		if(c>='a' && c<='z') {
			c=(char) (c-32);
		}
		switch(c) {
		case 'R':
			System.out.println("Red");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid case");
				
		}
		
	}

}
