import java.util.Scanner;


public class Program3_MultiplyTwoNumbers {
	public static void main(String[] args) {
		int num1, num2; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for First Number");
		num1 = scan.nextInt();
		System.out.println("Enter value for Second Number");
		num2 = scan.nextInt();
		System.out.println("The multiplication of " +num1+ "*" +num2+ " are : "+ (num1*num2));
	}

}
