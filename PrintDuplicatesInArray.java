package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = array.length;
		System.out.println("array Length is " + length);
		
		for (int i = 0; i < length-1; i++) 
		{
			int count = 0;
			for (int j = i+1; j < length; j++) 
			{
				if(array[i] == array[j])
				{
					count++;
					
				}
			}
			if(count>0)
			System.out.println(array[i]);
			
		
		}
	}

}
