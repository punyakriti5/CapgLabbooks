package capg.lab1;


import java.util.Scanner;

public class Ex7checkNumber {

	public static void main(String[] args) {
		int n;
		boolean x = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n =sc.nextInt();
		
		int currentDigit = n % 10;
	       n = n/10;
	        
	      
	       while(n>0){
	           if(currentDigit <= n % 10){
	               x = true;
	               break;
	           }

	           currentDigit = n % 10;
	           n = n/10;
	       }
	        
	       
	       if(x){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");

	}
	}
}
