package main;
import java.util.Scanner;
import java.util.Arrays;
//this only works with two numbers
public class calcNew {
	public static void main(String[] args) {
			System.out.println("Enter your expression: ");
			@SuppressWarnings("resource")
			Scanner scanner1 = new Scanner(System.in);
			String x = scanner1.nextLine();
			for (int i = 0; i < x.length(); i++) {
				if(x.charAt(i)=='+') {
					System.out.println("= " + SplitterAdd(x));
				}
				if(x.charAt(i)=='-') {
					System.out.println("= " + SplitterSub(x));
				}
				if(x.charAt(i)=='*') {
					System.out.println("= " + SplitterMult(x));
				}
				if(x.charAt(i)=='/') {
					System.out.println("= " + SplitterDiv(x));
				}
			}
			
}
	public static int SplitterAdd (String expression) {
		// TODO Auto-generated method stub
		String[] str = expression.split("\\+");
		int [] arr = new int [str.length];
		for(int i=0; i<str.length; i++) {
	        arr[i] = Integer.parseInt(str[i]);
	      }
		int sum = 0;
		for (int i =0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
			return sum;
	}
	public static int SplitterSub (String expression) {
		// TODO Auto-generated method stub
		String[] str = expression.split("\\-");
		int [] arr = new int [str.length];
		for(int i=0; i<str.length; i++) {
	        arr[i] = Integer.parseInt(str[i]);
	      }
		int sum = 0;
		for (int i =0; i < arr.length; i++) {
			if (i==0) {
			sum = sum + arr[i];
			}
		 if (i!=0) {
			sum = sum- arr[i];
		 }
		}
			return sum;
	}
	public static int SplitterMult (String expression) {
		// TODO Auto-generated method stub
		String[] str = expression.split("\\*");
		int [] arr = new int [str.length];
		for(int i=0; i<str.length; i++) {
	        arr[i] = Integer.parseInt(str[i]);
	      }
		int sum = 1;
		for (int i =0; i < arr.length; i++) {
			
			sum = sum * arr[i];
		}
			return sum;
	}
	public static float SplitterDiv(String expression) {
		// TODO Auto-generated method stub
		String[] str = expression.split("\\/");
		int [] arr = new int [str.length];
		for(int i=0; i<str.length; i++) {
	        arr[i] = Integer.parseInt(str[i]);
	      }
		float sum = 0;
		for (int i =0; i < arr.length; i++) {
			if (i==0) {
				sum = sum + arr[i];
				}
			 if (i!=0) {
				sum = (float) sum/ arr[i];
			 }
		}
			return sum;
	}
	
}
