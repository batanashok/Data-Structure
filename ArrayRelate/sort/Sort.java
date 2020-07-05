package com.sort;

public class Sort {
	static int[] bubble(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag=false; // this for if array is already sorted best case O(n) otherwise O(n^2)
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]) // for increasing order and for decreasing order < 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = true;
				}
			}
			if(flag == false)
			{
				break;
			}
		}
		return arr;
	}
	
	static int[] recursiveBubble(int arr[], int length)
	{
		if(length == 1)
			return arr;
		boolean flag = false;
		for(int i=0;i<length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				flag = true;
			}
		}
		if(flag == false)
		{
			return arr;
		}
		
		return recursiveBubble(arr,length-1);
	}
	
	static int[] selection(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min_index = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min_index]>arr[j])
				{
					min_index = j;
				}
			}
			if(min_index != i)
			{
				int temp = arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;
				
			}
		}
		return arr;
	}
	
	static void insertion(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=key;
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	
	
	static void show(int arr[])
	{
		System.out.println("Array element after sort is :");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
