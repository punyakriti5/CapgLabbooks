package capg.lab3;
import java.util.Scanner;
import java.util.*;

public class Ex1StringTokenizer {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sequence of integers with space b/w them and press enter: ");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.print(n+" ");
            sum = sum + n;
		}
        System.out.println("\nSum of the integers is: " + sum);
        sc.close();	
        
	}

}
