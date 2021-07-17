import java.util.Scanner;
public class Program16_NestedSwitchCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter starting letter of programming languages: 1. Java 2. React 3. Angular ");
		char ch = scan.nextLine().charAt(0);
		System.out.println("select the level: ");
		int i = scan.nextInt();
		switch(ch)
		{
		case 'j' : 
		{
			System.out.println("Java");
			switch(i){
			case 1 : {
				System.out.println("You have chosen beginner level.");
				break;
					}
			case 2 : {
				System.out.println("You have chosen intermediate level.");
				break;
					}
			case 3 : {
				System.out.println("You have chosen advanced level.");
				break;
					}
			default : System.out.println("Invalid");
			}
			break;
		}
		case 'r' : 
			{
				System.out.println("React.js");
				switch(i){
				case 1 : {
					System.out.println("You have chosen beginner level.");
					break;
						}
				case 2 : {
					System.out.println("You have chosen intermediate level.");
					break;
						}
				case 3 : {
					System.out.println("You have chosen advanced level.");
					break;
						}
				default : System.out.println("Invalid");
				}
				break;
			}
		case 'a' : {
			System.out.println("Angular.js");
			switch(i){
			case 1 : {
				System.out.println("You have chosen beginner level.");
				break;
					}
			case 2 : {
				System.out.println("You have chosen intermediate level.");
				break;
					}
			case 3 : {
				System.out.println("You have chosen advanced level.");
				break;
					}
			default : System.out.println("Invalid");
			}
			break;
		}
		default : System.out.println("Invalid");
		}
	}

}
