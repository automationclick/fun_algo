package basicQ;

import java.util.HashSet;

public class KadaneAlgo 
{

	/**
	 * Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.
	 */

	public static int findMaxSum(int[] arr)
	{


		int size = arr.length;
		int maxSum = Integer.MIN_VALUE;
		int currentMaxSum = 0;

		for(int i = 0; i<size; i++)
		{
			if(arr[i] > maxSum)
			{
				maxSum = arr[i];
			}
			currentMaxSum = currentMaxSum + arr[i];
			if(maxSum < currentMaxSum)
			{
				maxSum = currentMaxSum;
			}

			else if( currentMaxSum < 0)
			{
				currentMaxSum = 0;
			}
		}
		return maxSum;

	}

	/**
	 * tofind min sum of contigous array
	 * @param args
	 */

	public static int findSubArrayWithMinSum(int arr[])
	{
		int minSum = Integer.MAX_VALUE;
		int currentMinSum = 0;

		for (int i =0; i<arr.length; i++)
		{
			if (arr[i] < minSum)
			{
				minSum = arr[i];
			}

			currentMinSum += arr[i];

			if( minSum > currentMinSum)
			{
				minSum = currentMinSum;
			}
			if(currentMinSum > 0)
			{
				currentMinSum = 0;
			}
		}
		return minSum;

	}

	public static void main(String[] args) {
		int[] arr = {-1,23,-1,-2,-3,1};
		System.out.println(findMaxSum(arr));
		System.out.println(findSubArrayWithMinSum(arr));
		
	}
}
