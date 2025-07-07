package Array;

import java.util.Scanner;

public class ThreeCrossMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr = new int[3][3];
		int index=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=Integer.parseInt(args[index]);
				if (arr[i][j] > max) {
                    max = arr[i][j];
                }
				index++;
			}
		}
		System.out.println("The original 3*3 arr is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("The maximum element is : " +max);
	}

}
