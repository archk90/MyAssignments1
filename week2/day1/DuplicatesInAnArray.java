package week2.day1;

import java.util.Arrays;


public class DuplicatesInAnArray {
	
	public static void main(String[] args) {
		int[] arrdata = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int arr=arrdata.length;
		
		System.out.println("Duplicate elements are");
		
		for(int i=0; i<=arr; i++)
		{
			for(int j=i+1; j<arr; j++)
			{
				if(arrdata[i]==arrdata[j])
				{
					System.out.println(arrdata[i]);
	
				}
			}
		}
		
		
}


}

