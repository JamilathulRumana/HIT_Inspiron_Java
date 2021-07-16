import java.util.Scanner;


public class Program15_SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter starting letter of programming languages: ");
		char ch = scan.nextLine().charAt(0);
		switch(ch)
		{
		case 'j' : 
		{
			System.out.println("Java");
			break;
		}
		case 'r' : 
			{
				System.out.println("React.js");
				break;
			}
		case 'a' : {
			System.out.println("Angular.js");
			break;
		}
		default : System.out.println("Invalid");
		}
	}

}
