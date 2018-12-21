package mytree;
import java.util.HashSet;


public class BST {


	public static void main(String[] args) {

		int[] arr = {1, 2,2,2,5,1,-1};

//		System.out.println(findSum(arr));
		System.out.println(subArrayWithZeroSum(arr));
	}

	public static int isP(int A)
	{
		int temp =A;
		int reverse=0;

		while(A != 0)
		{
			int d = A % 10;
			reverse = reverse*10 + d;
			A =A/10;
		}
		System.out.println(temp);
		System.out.println(reverse);
		return reverse==temp ? 1 : 0;
	}


	/**
	 * check if array contains any two element which have sum equls to 0
	 * @param arr
	 * @return
	 */
	public static boolean findSum(int[] arr)
	{
		//		int[] arr = {1,-2,-4,4,5,-1};

		boolean result  = false;

		HashSet<Integer> hash = new HashSet<>();
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] ==0)
			{
				result = true;
				break;
			}
			int diff = 0 - arr[i];

			if(diff > 0)
			{
				if(hash.contains(diff))
				{
					result = true;
					break;
				}
			}
			else
			{
				hash.add(arr[i]);
			}
		}
		return result;
	}

	/**
	 * to find a sub array with 
	 */
	public static boolean subArrayWithZeroSum(int[] arr)
	{
		boolean result = false;
		int sum = 0;
		HashSet<Integer> hashSet = new HashSet();

		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				result = true;
				break;
			}
			sum = sum + arr[i];
			if(hashSet.contains(sum) || sum == 0)
			{
				result =true;
				break;
			}
			else
			{
				hashSet.add(sum);
			}
		}
		return result;
	}

}
