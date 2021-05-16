package capg.lab2;


import java.util.Scanner;
import java.util.Arrays;

public class Ex4modifyArray {
	
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0; 
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       
    public static void main (String[] args) { 
    	
    	int x;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the elements of array");
    	x = sc.nextInt();
    	
    	int[] array = new int[x];
    	int length =array.length;
    	
    	System.out.println("Enter the elements: ");
    	
    	for(int i=0;i<x;i++)
		{
			array[i] = sc.nextInt();
			
		}
    	
        
        length = removeDuplicateElements(array, length);  
        for (int i=0; i<length; i++)  
           System.out.print(array[i]+" "); 
    }  
}
	