package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		int result = num/2;
		int flag = 0;
		for(int j = 2; j <= result; j++)
		{
			if(num % j == 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		System.out.println("It's not a prime number");
		else
		System.out.println("It's a prime number");
	}
}
