import java.util.Scanner;

public class Program19_AreaOfTriangle {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter value for base: ");
	double base = scan.nextDouble();
	System.out.println("Enter value for height: ");
	double height = scan.nextDouble();
	System.out.println("Area of the triangle is " + (base*height)/2);
	}
}
