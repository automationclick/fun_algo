package basicQ;

import java.util.Stack;

public class Example 
{

	/**
	 * find next greater element in array for every element
	 */

	public static void findNGE(int arr[])
	{
		int element=0;
		int next = 0;

		Stack<Integer> stack = new Stack();
		stack.push(arr[0]);

		for(int i = 1; i <arr.length; i++)
		{
			next = arr[i];
			if(stack.isEmpty() == false)
			{
				element = stack.pop();
				while(element<next)
				{
					System.out.println(element+"-----> "+next);
					if(stack.isEmpty()==true){break;}
					element = stack.pop();
				}
				if(element>next)
				{
					stack.push(element);
				}
			}
			stack.push(next);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,6,8,9,12};
		findNGE(arr);
	}
}
