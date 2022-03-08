package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int total = cal.add(1,2,3);
		System.out.println("sum is : " + total);
		int diff = cal.sub(60, 30);
		System.out.println("Difference is : " + diff);
		double mul = cal.mul(10,20);
		System.out.println("Multiply result is : " + mul);
		float divide = cal.divide(100, 20);
		System.out.println("division result is : " + divide);
		
	}

}
