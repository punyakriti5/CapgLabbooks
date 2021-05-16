package capg.lab2;


import java.util.Scanner;
import java.util.Arrays;

public class Ex3getSorted {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the array");
		
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
			
		}
		System.out.print("Reversed sorted array: ");
		
		for(int i=array.length-1; i>=0;i--)
		{
			Arrays.sort(array);
			System.out.print(array[i]+" ");
		}
	

	}

}