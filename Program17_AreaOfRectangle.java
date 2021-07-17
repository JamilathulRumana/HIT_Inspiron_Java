import java.util.Scanner;

public class Program17_AreaOfRectangle {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter value for length: ");
	double length = scan.nextDouble();
	System.out.println("Enter value for width: ");
	double width = scan.nextDouble();
	System.out.println("Area of the rectangle is " + (length*width) );
	}
}
