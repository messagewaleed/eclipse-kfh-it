import java.util.Scanner;

public class TakingInputFromRuntimeDemo {
	public static void main(String[] args) {
		
    //	 int firstNumber = Integer.parseInt(args[0]);
	// int secondNumber = Integer.parseInt(args[1]);

	Scanner scan = new Scanner(System.in);

	System.out.println("Please enter two numbers");

	int firstNumber = scan.nextInt();

	int secondNumber = scan.nextInt();

	int result = firstNumber + secondNumber;

	System.out.println("Addition  : " + result);

	}
}
	
