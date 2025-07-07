package ForLoop;

import java.util.Scanner;

public class SumOfDig {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit");
		int num=sc.nextInt();
		int sum=0;
		int temp=0;
		for (; num > 0; ) {
			temp = num % 10;
			sum += temp;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
