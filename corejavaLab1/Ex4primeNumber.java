package capg.lab1;

import java.util.Scanner;

public class Ex4primeNumber {
	
		public static void main(String[] args) {
			int n,p;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the integer upto which you want prime number");
			n = sc.nextInt();
			
			
			for(int i=2;i<n;i++)
			{
				p=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					p=1;
				}
				if(p==0)
					System.out.print(i+ " ");
			}
			

		}

	}