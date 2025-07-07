package Whileloop;

public class Divisible {
	public static void main(String[] args) {
		System.out.println("The numbers that are divisible by 2,3 and 5 is:");
		int count=1;
		int num=1;
		while(count<=5) {
			if(num%2==0 && num%3==0 && num%5==0) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

}
