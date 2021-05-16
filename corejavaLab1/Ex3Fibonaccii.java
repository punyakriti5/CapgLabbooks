package capg.lab1;

import java.util.Scanner;

public class Ex3Fibonaccii {

	public static void main(String[] args) {
		int n,i,x = 1, y = 1,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of sequence you want: ");
		n = sc.nextInt();
		System.out.print(x+ " " +y);
		
		
		for (i=2; i<=n;++i)
		{
			z = x+y;
			x = y;
			y = z;
			System.out.print(" "+z);
		}
		
}
}