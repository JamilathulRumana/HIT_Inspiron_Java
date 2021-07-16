import java.util.Scanner;


public class Program10_OddOrEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num1 = scan.nextInt();
		if(num1%2==0)
		{
			System.out.println("The Entered Number is EVEN");
		}
		else
		{
			System.out.println("The Entered Number is ODD");
		}

	}

}
