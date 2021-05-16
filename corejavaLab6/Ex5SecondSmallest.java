package capg.lab6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex5SecondSmallest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 integers to get second smallest number:");
		
		for(int i =0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int secondSmall = getSecondSmallest(arr);
		
		System.out.println(secondSmall);
	}
	
	static int getSecondSmallest(int[] arr)
	{
		List<Integer> arrlist = new ArrayList<Integer>();
		
		for(int a : arr)
			arrlist.add(a);
		
		Collections.sort(arrlist);
		
		
		return arrlist.get(1);

	}

}

