package Array;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num ");
		int num=sc.nextInt();
		int[] arr= new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a search element: ");
		int sn=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==sn) {
				System.out.println("The element is present at " +i);
				System.exit(0);
			}
			
		}
		System.out.println("The element is present at -1");
		
	}

}
