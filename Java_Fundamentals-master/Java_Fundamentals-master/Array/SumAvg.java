package Array;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		int sum=0;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		}
		System.out.println(sum);
		int avg=sum/num;
		System.out.println(avg);
	}

}
