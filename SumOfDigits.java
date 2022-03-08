package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 386;
		int sum = 0;
		while(n > 0)
		{
			int remainder = n % 10;
			sum = sum + remainder;
			n = n/10;
					
		}
		System.out.println(sum);
	}

}
