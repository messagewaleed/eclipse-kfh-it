import java.util.Scanner;

public class LoopsFun {
	public static void main(String[] args) {
//		for(int index = 35; index >= 7; index -= 2) {
//				System.out.println(index);
//		}
		
//		int index = 35;
//		
//		while(index >= 7) {
//			System.out.println(index);
//			index -= 2;
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt(), rev = 0;
		
//		for(;num > 0;) {
//			rev = num % 10;
//			num = num / 10;
//			System.out.print(rev);
//		}
		
//		Or with a while loop
		
		while(num > 0) {
			rev = num % 10;
			num = num / 10;
			System.out.print(rev);
		}
		
		int val = 78;
		
		do {
			System.out.println(val);
			val++;
		}while(val < 10);		
		
		
		
		
		
		
		
		
		
		
	}

}
