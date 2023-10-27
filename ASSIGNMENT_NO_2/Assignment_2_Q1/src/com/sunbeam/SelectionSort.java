package com.sunbeam;
import java.util.Arrays;
public class SelectionSort {
		
	public static void selectionSort(int arr[],int size)
	{
		int count=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				count++;
				if(arr[i]>arr[j])
				{
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.println("Number of camparisons = "+count);
	}

	public static void main(String[] args) 
	{
		int arr[]= {45,89,25,74,11,25,65,87};
		System.out.println("Before sort");	
		System.out.println(Arrays.toString(arr));

		System.out.println("");
		selectionSort(arr,arr.length);
		System.out.println("After sort");
		System.out.println(Arrays.toString(arr));
		
	}
	

}
