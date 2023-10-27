/*1. Write a program to print no of comparisions done to search a key in
	i. linear search
	ii. binary serach */


package com.sunbeam;
import java.util.Scanner;
public class comp {
	
	public static int linearSearch(int arr[],int size,int key)
	{
		int count=0;
		for(int i = 0;i<size;i++)
		{
			count++;
			if(key==arr[i])
			{
				System.out.println("Number of comparisons = "+count);
				return i;
			}
			
		}System.out.println("Number of comparisons = "+count);
			
;
		return -1;

	}

	
	public static int binarySearch(int arr[],int size,int key)
	{
		int right=size-1;int left=0;int mid=0;int count=0;
		while(left<=right)
		{
			count++;
			mid=(left+right)/2;
			if(key==arr[mid])
			{
				System.out.println("Number of comparisons = "+count);
				return mid;
			}
			else if(key<arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		System.out.println("Number of comparisons = "+count);
		return -1;				
	}
	
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50,60,70};
		
		System.out.println("Enter key to serached ");
		int key = sc.nextInt();
		
//		int index = linearSearch(arr,arr.length,key);	
    	int index = binarySearch(arr,arr.length,key);
		
		if(index != -1)
			System.out.println("Key found at index number "+index);
		else
			System.out.println("key not found");
		
		
	}

}





