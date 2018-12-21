package basicQ;

public class ArmstrongNumberExample 
{

	/**
	 * to check if given no is armstrong or not
	 */
	public static void armstrongCheck(int num)
	{
		int digitCount = 0;
		double sum = 0;
		int tempNumber = num;
		int temp = num;

		if (num<10)
		{
			digitCount = 1;
		}
		else
		{
			while(num != 0)
			{
				digitCount++;
				num = num/10;
			}
		}

		while(tempNumber != 0)

		{
			int digit = tempNumber % 10;
			sum =sum + Math.pow(digit, digitCount);
			tempNumber = tempNumber / 10;
		}
		System.out.println("given no is "+temp);
		System.out.println("sum of no is "+sum);
		if(temp == sum)
		{

			System.out.println(temp+"  is  armstrong number");
		}
		else
		{
			System.out.println(temp+ " is not armstrong");
		}
	}

	public static void main(String[] args) {
		armstrongCheck(152);
	}
}
