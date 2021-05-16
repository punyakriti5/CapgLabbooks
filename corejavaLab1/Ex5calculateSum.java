package capg.lab1;

import java.util.Scanner;

public class Ex5calculateSum {

	public static void main(String[] args) {
		int n,Sum= 0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want sum");
		n = sc.nextInt();
		
		for(i=1;i<=10;i++) {
			if(i%3==0 || i%5==0) {
			Sum = Sum +i;
			System.out.println("Numbers is: " +i+ " ");
		}
		}
		System.out.println("Total sum: " +Sum);
	}

}