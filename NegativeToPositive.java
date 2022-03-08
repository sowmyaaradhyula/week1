package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int number = -40;
		if(number < 0)
		{
		  System.out.println("Given Number is a Negative Number");		
		  int positiveNumber = number*-1;
		  System.out.println("The number -40 is converted to " +  positiveNumber);
		}
		else
		{
			System.out.println("Given Number is a Positive Number");
		}
	}

}
