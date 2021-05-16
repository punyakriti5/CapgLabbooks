package capg.lab2;



import java.util.Scanner;
import java.util.Arrays;

public class Ex2sortStrings {

	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();
	
		
		String[] array = new String[n];
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Strings one by one:");
		
		
		for(int i = 0; i < n; i++)
        {
            array[i] = sc1.nextLine();
            
        }
		
        sc.close();
        sc1.close();
        Arrays.sort(array);
       
       String[] a = new String[(n+1)/2];
       String[] b = new String[n-a.length];
        
       for (int i = 0; i<n; i++)
       {
    	   if(i<a.length)
    		   a[i] = array[i].toUpperCase();
    	   
    	   else  
    		   b[i -a.length]=array[i].toLowerCase();
    	   
       }
		System.out.println("Sorted array is: "+Arrays.toString(array));
		System.out.println("Array in UPPER case: "+Arrays.toString(a));
		System.out.println("Array in UPPER case: "+Arrays.toString(b));
}}