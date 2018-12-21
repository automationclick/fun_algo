package sorting;

import java.util.Arrays;

public class BubbleSrot 
{

/**
 * to print array
 */
	
	public static void printArray(int[] arr)
	{
		Arrays.stream(arr)
		.forEach(i -> System.out.println(i));
	}
	
	/**
	 * to sort an given array using bubble sort
	 */
	public static void bubbleSort(int[] arr)
	{
		int length = arr.length;
		System.out.println("Array before sorting....");
		printArray(arr);
		
		for(int i = 0; i<length; i++)
		{
			for(int j=0; j<length-1; j++)
			{
				if(arr[j+1] <arr[j])
				{
					arr[j+1] = arr[j+1] + arr[j];
					arr[j] = arr[j+1] -arr[j];
					arr[j+1] = arr[j+1] - arr[j];
				}
			}
		}
		System.out.println("Array after sorting....");
		printArray(arr);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1};
		int [] arr2 = {5,6,7,9,1,2,3};
		bubbleSort(arr2);
	}
}
