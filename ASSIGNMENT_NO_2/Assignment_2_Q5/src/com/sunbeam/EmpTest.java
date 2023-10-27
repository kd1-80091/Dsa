package com.sunbeam;

import java.util.Arrays;

public class EmpTest 
{
	public static void main(String args[])
	{
		Emp e1[] = new Emp[5];
		
		e1[0]=new Emp(1,"Akash",10000);
		e1[1]=new Emp(2,"Pawan",8000);
		e1[2]=new Emp(3,"Prassana",7500);
		e1[3]=new Emp(4,"Suyash",9000);
		e1[4]=new Emp(5,"Akhil",5000);
		
		
		
		sortSalBySelectionSort(e1,e1.length);
		System.out.print(Arrays.toString(e1));
		
	
	}
	
	public static void sortSalBySelectionSort(Emp[] e2,int size)
	{
		for(int i = 0;i<e2.length-1;i++)
		{
			for(int j=i+1;j<e2.length;j++)
			{
				if(e2[i].getSalary()>e2[j].getSalary())
				{
					Emp temp=e2[i];
					e2[i]=e2[j];
					e2[j]=temp;
				}
			}
		}
		
	}
	

}



        
