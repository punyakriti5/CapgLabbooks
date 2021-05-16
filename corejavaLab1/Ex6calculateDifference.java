package capg.lab1;

import java.util.Scanner;

public class Ex6calculateDifference {

	public static void main(String[] args) {
		int n,i,Sum1 = 0, Sum2 = 0,Diff;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			Sum1 = Sum1 + i*i;
		}
		System.out.println("Sum of Square of numbers: " +Sum1);
		
		for (i=1;i<=n;i++) {
			Sum2 = Sum2 + i;
		}
		System.out.println("Sum of number is: " +Sum2);
		
		
		Diff = Sum1 - Sum2;
		System.out.println("Difference is: " +Diff);
	}

}