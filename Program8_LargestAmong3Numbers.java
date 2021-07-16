import java.util.Scanner;


public class Program8_LargestAmong3Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any 3  numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1 + " is the Largest Number");
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println(num2 + " is the Largest Number");
		}
		else
		{
			System.out.println(num3 + " is the Largest Number");
		}
	}

}
