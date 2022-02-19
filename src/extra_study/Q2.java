package extra_study;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// 2)	Write a Java program to reverse an array of integer value
		// {12,13,14}>>>>>{14,13,12}
		
		
		String arr[] = {"mehmet","erva","asli"};
		String arr1[]= new String[arr.length];
		
		int count = 0;
		for (int i = arr.length-1; i >=0 ; i--) {
			
			
			arr1[count] = arr[i];
			count++ ;
				
		}
       System.out.println(Arrays.toString(arr1));
	}

}
