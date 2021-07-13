import java.util.Scanner;


public class Program1_AdditionOfTwoNumbers {
	public static void main(String[] args) {
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number:");
		num2 = scan.nextInt();
		System.out.println("The addition of given two numbers: " + (num1+num2));
		
	}
}
