package capg.lab1;

import java.util.Scanner;

public class Ex8checkNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		
		while(n%2==0) {
			n=n/2; 
			}
			if(n==1) {
				System.out.println("Number is power of 2");
			}
			else {
				System.out.println("Number is not power of 2");
			}
				 }
	 	
	}
