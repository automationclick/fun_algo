package basicQ;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PrimeExample 
{

	/**
	 * to check if given no is prime
	 */

	public static void primeCheck(int num)
	{
		boolean status = true ;
		for (int i = 2;i<=num/2; i++)
		{
			if(num % 2 == 0)
			{
				System.out.println("prime check failed");

				status = false;
				break;
			}
		}
		if(status)
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" is not prime number");
		}
	}

	/**
	 * to find prime number till given number n
	 * @param args
	 */

	public static List findPrime(int n)
	{
	ArrayList<Integer> list = new ArrayList<>();
		int size = n+1;
		int[] prime =new int[size];
		
		for(int i =0; i <prime.length; i++)
		{
			prime[i]=1;// which mean number is prime
		}
		prime[0]=0;// to exclude 0 from prime list
		prime[1] = 0;// to exclude 1 
		int sqrt = (int)Math.sqrt(n);
		
		for(int j =2; j<=sqrt; j++)// run this loop til sqrt of n
		{
			if(prime[j]==1)
			{
				for (int k=2;k*j <=n; k++)
				{
					prime[j*k]=0;//replace all multiple of prime with 0, to make it non prime in list
				}
			}
		}
		
		//now print prime
		for(int c =2; c <prime.length; c++)
		{
			if(prime[c]==1)
			{
				list.add(c);
			}
		}
		
		list.stream().forEach(x -> System.out.print(" "+x));
		System.out.println("");
		
		return list;
	}

	public static void main(String[] args) 
	{
		List<Integer> list = findPrime(Integer.MAX_VALUE/10);
		list.stream().forEach(x -> primeCheck(x));
	}
}
