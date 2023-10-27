package com.sunbeam;

import java.util.Arrays;

public class BubbleSort 
{
	public static void bubbleSort(int arr[], int N) {
		int count = 0;
		for(int i = 1 ; i < N ; i++) {
			for(int j = 0 ; j < N - 1 ; j++) {
				count++;
				
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("No of comparisions : " + count);
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,50,80,89,71,10,2,};
		bubbleSort(arr,arr.length);
		System.out.println("Arrays after sort "+Arrays.toString(arr));	
	}


}
