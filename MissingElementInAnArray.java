package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,7,6,8};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) 
		{
			int j = i+1;
			if(j != array[i])
			{
				System.out.println("Missing element in array is "+j);
				break;
			}
		}
	}

}
