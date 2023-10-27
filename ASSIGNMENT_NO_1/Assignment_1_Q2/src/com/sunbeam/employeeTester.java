package com.sunbeam;

import java.util.Scanner;

public class employeeTester {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int size=5;
		employee arr[]= new employee[size];
		arr[0]=new employee(1,"Akash",5000);
		arr[1]=new employee(2,"Varad",4000);
		arr[2]=new employee(3,"Prajwal",9000);
		arr[3]=new employee(4,"adarsh",6000);
		arr[4]=new employee(5,"prithviraj",2000);
	
//		int index=linearSearchById(arr);
		
//		String index = linearSearchByName(arr,sc);
//		if(index!=-1+"")
//			System.out.println("Employee found at index "+index+"");
//		else
//			System.out.println("Employee not found");

		
		int index = linearSearchBysal(arr);
		if(index!=-1)
			System.out.println("Employee found at index "+index);
		else
			System.out.println("Employee not found");

		
		
		
	}
	
	public static int linearSearchById(employee arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid to searched ");
		int id = sc.nextInt();
		for(int i = 0;i<5;i++)
		{
			if(id==arr[i].getEmpid())
				return i;	
		}
		return -1;
	}
	
	public static String linearSearchByName(employee arr[],Scanner sc)
	{
		System.out.println("Enter name to searched");
		String name1=sc.nextLine();
		for(int i = 0;i<5;i++)
		{
			if(name1.equals(arr[i].getName()))
			{
				return arr[i]+" at index "+i;
			}
		}
		return -1+"";
		
		
	}
	
	public static int linearSearchBysal(employee arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sal to searched ");
		double sal = sc.nextDouble();
		for(int i = 0;i<5;i++)
		{
			if(sal==arr[i].getSal())
				return i;	
		}
		return -1;
	}	
	
	
	

	
	
	
	
	
}
