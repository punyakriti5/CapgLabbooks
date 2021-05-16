package capg.lab6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex7ReverseSorting {

	public static void main(String[] args) {
		int arr[] = {42,64,81,95,78,55,73,39,10};
		 for(int i : arr)
		     System.out.println(i);
		 
		 List<Integer> sorted = getSorted(arr);
		 
		 System.out.println(sorted);

		}
		
		static List<Integer> getSorted(int arr[])
		{
			List<Integer> sortedlist = new ArrayList<>();
			
			for(int a:arr)
				sortedlist.add(a);
			
			Collections.sort(sortedlist);
			Collections.reverse(sortedlist);
			
			return sortedlist;

	}

}
