package learnJava;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
				System.out.println("Arithmatic Operators");
				System.out.println("====================");
				System.out.print("Enter the first number: ");
				int num1 = scan.nextInt();
				System.out.print("Enter the Second number: ");
				int num2 = scan.nextInt();
				System.out.println("1.ADDITION");
				System.out.println("2.SUBTRACTION");
				System.out.println("3.MULTIPLICATION");
				System.out.println("4.DIVISION");
				System.out.println("5.MODULUS");
				System.out.println("EXIT");
				int n = scan.nextInt();
				switch(n) {
				case 1:
					int addResult;
					addResult = num1+num2;
					System.out.println("Result: "+addResult);
					break;
					
				case 2:
					int subResult;
					subResult = num1 - num2;
					System.out.println("Result: "+subResult);
					break;
					
				case 3: 
					int mulResult;
					mulResult = num1*num2;
					System.out.println("Result: "+mulResult);
					break;
					
				case 4:
					int divResult;
					divResult = num1/num2;
					System.out.println("Result: "+divResult);
					break;
					
				case 5:
					int modResult;
					modResult = num1%num2;
					System.out.println("Result: "+modResult);
					break;
				
				case 6:
					System.exit(0);
				}
			}
		}
	}
}
