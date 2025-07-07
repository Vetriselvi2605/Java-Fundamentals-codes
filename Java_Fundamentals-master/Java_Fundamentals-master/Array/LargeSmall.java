package Array;

import java.util.Scanner;

public class LargeSmall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j+1]>arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("The largest two numbers are: " +arr[0]);
		System.out.println(" " +arr[1]);
		System.out.print("The smallest two numbers are: " +arr[size-1]);
		System.out.print(" " +arr[size-2]);
		
	}

}
