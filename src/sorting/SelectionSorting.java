package sorting;

import java.util.Arrays;

public class SelectionSorting 

{
	/**
	 * selection sort
	 * @param args
	 */
	public static void selectionSort(int[] arr)
	{

		int length = arr.length;

		for (int i= 0;i<length; i++)
		{
			int min_index = i;
			for(int j=i+1; j < length; j++)
			{
				if(arr[j] < arr[min_index])
				{
					min_index = j;
				}
			}
			//swap element
			/*
			 swap a and
			 a =a+b;
			 b = a-b;
			 a = a-b;
			 * */
			arr[min_index] = arr[min_index] + arr[i];
			arr[i] = arr[min_index] - arr[i];
			arr[min_index] = arr[min_index] - arr[i];
		}

		printArray(arr);
	}

/**
 * to print an array using stream in java
 * @param arr
 */
	public static void printArray(int[] arr)
	{
		Arrays.stream(arr).forEach(i ->System.out.println(i) );
	}

	/**
	 * swap two number with temp var
	 * @param args
	 */
	
	public static void swap(int a, int b)
	
	{
		System.out.println("First Number before swapping: --> "+a);
		System.out.println("Second Number before swapping: --> "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("First Number after swapping: --> "+a);
		System.out.println("Second Number after swapping: --> "+b);
		System.err.println();
	}
	public static void main(String[] args) 
	{
//		int[] arr = {5,4,7,8,9,1,2,3,4,5};
//		selectionSort(arr);
		swap(1,2);
	}
}
