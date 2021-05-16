package capg.lab1;
import java.util.Scanner;

public class Ex1sumofcubes {

	public static void main(String[] args) {
			
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the integer n");
			n =  sc.nextInt();

			if(n<0){
		            System.out.println("Number cannot be negative ");
		            return;
		        }
			 
				
		       double sum = Math.pow(n*(n+1)/2,2);
		        System.out.println("The sum of first " + n + " cube numbers is " + sum);
		        n = n*n*n;
		        System.out.println("Cube of entered value is: " +n);
		 
		    }

	}