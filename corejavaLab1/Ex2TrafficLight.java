package capg.lab1;

import java.util.Scanner;

public class Ex2TrafficLight {
	public static void main(String[] args) {
			
			String color;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the color of traffic lights");
			
			color = sc.next();
			color = color.toUpperCase();
		
				
			switch(color)
			{
			case "RED":
				System.out.println("Stop");
				break;
			case "YELLOW":
				System.out.println("Ready");
				break;
			case "GREEN":
				System.out.println("Go");
				default:
					System.out.println("Wrong Color");
				

		}

	}
	}
