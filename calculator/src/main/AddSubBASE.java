
package main;
import java.util.Scanner;

public class AddSubBASE {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter your first number: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
	
		System.out.println("Enter your operation: ");
		Scanner scanner1 = new Scanner(System.in);
		String operation = scanner1.nextLine();
		
		
		System.out.println("Enter your second number: ");
		Scanner scanner2 = new Scanner(System.in);
		int y = scanner2.nextInt();
		
		
		if (operation.equals("+")|| operation.equals("addition")) {
			System.out.println("your answer is: "+addition(x,y));
		}
		if (operation.equals("subtraction") || operation.equals("-")) {
			System.out.println("your answer is: " + subtraction(x,y));
		}
		if (operation.equals("multiplication") || operation.equals("*")) {
			System.out.println("your answer is: " + multiplication(x,y));
		}
		if (operation.equals("division") || operation.equals("/")) {
			System.out.println("your answer is: " + division(x,y));
		}
		//else {
		//	System.out.println("ERROR CAN'T FIND SOLUTION");
		//}
	}
	public static int addition(int x, int y) {
		// TODO Auto-generated method stub
			return x+y;
	}
	public static int subtraction (int x, int y) {
		// TODO Auto-generated method stub
			return x-y;
	}
	public static int multiplication (int x, int y) {
		// TODO Auto-generated method stub
			return x*y;
	}
	public static float division (int x, int y) {
		// TODO Auto-generated method stub
			float z = (float) x/y;
			return z;
	}
}

	
