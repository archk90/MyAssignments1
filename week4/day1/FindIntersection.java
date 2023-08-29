package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a= {3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer> lsName= new ArrayList<Integer>();
		 for(int i=0; i<a.length;i++)
		 {
			 lsName.add(a[i]);
		 }
		System.out.println(lsName);
		
		
		List<Integer> lsName1= new ArrayList<Integer>();
		 for(int i=0; i<a.length;i++)
		 {
			 lsName1.add(b[i]);
		 }
		System.out.println(lsName1);
		
		for(int i=0; i<lsName.size();i++) {
			for(int j=0; j<lsName.size() ;j++) {
			if(lsName.get(i)==lsName1.get(j)){
				
				System.out.println(lsName1.get(j));
			   }
			}
		
		
			}
		
	}
}

