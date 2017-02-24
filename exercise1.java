package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the size of array : ");
		int size = in.nextInt();  
		int arr[] = new int[size];
		double sum=0;
		int i =0;
    	for (i=0;i<size;i++){
    		arr[i] = in.nextInt();
    		sum += arr[i];
    	}
    	Arrays.sort(arr);
    	for (i=0;i<size;i++)
        	System.out.println(arr[i]);
    	System.out.println(sum/i);
    	}
}
