package capg.lab2;

import java.util.Scanner;
import java.util.Arrays;


public class Ex1getSecondSmallest {

	public static void main(String[] args) {
		
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt(); 
		
		
		int[] array = new int[n];  
		
		System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<n; i++)  
		{  
			array[i]=sc.nextInt();  
		}  
		
		System.out.print("Array elements in sorted: ");  

		for (int i=0; i<n; i++)   
		
		{  
		
			Arrays.sort(array);
			
			System.out.print(array[i]+" "); 
			
		}
		System.out.println("\nSecond smallest element of array is: " +array[1]);
	}  
}