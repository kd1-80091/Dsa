package com.sunbeam;
import java.util.Scanner;

/*Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is not found, return -1.*/
public class Linear 
{
	public static int nthOccurance(int arr[],int key,int occ)
	{
		int occurance=0;
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==key)
				occurance++;
			if(occurance==occ)
				return i;
		}
		
		return -1;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {10,20,20,60,80,70,50,40,90,110,60};
		
		System.out.println("Enter array element");
		int key=sc.nextInt();
		
		System.out.println("Enter repeated occurance ");
		int occ=sc.nextInt();
		
		int index = nthOccurance(arr,key,occ);
		
		if(index!=-1)
			System.out.println("Element found at index = "+index);
		else
			System.out.println("Element not found");
		
		
	}

}
