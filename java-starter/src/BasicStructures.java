import java.util.Scanner;

public class BasicStructures {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Enter a number");

		int value = scan.nextInt();

//		boolean flag = false;
//		
//		if(flag) {
//			System.out.println("TRUE");
//			System.out.println("YES IT IS TRUE");
//		}
//		else 
//			System.out.println("FALSE");

		switch (value) {
		case 15:
			System.out.println("FIFTEEN");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 11:
			System.out.println("ELEVEN");
			break;
		default:
			System.out.println("No Match Found");
		}

	}
}

// true - true

// false - false

//
//12 1 2
//Winter
//3 4 5
//Spring
//6 7 8
//Summer
//9 10 11
//Autumn
















