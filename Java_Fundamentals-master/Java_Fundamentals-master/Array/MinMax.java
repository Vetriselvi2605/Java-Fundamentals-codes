package Array;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j+1]>arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("MAXIMUM VALUE IS: " +arr[0]);
		System.out.println("MINIMUM VALUE IS: " +arr[num-1]);
		
	}

}
