
public class MethodsWork {
	public static void main(String[] args) {
//		int result = new Calculate().add(56, 10);
		Calculate calculate = new Calculate();
		calculate.add(50, 181);
		calculate.add(50, 181, 9, 88);
		calculate.add(50, 181, 9, 88, 89, 66);
		
	}

}

class Calculate{
	void add(int... values) {
		int total = 0;
		for(int index = 0; index < values.length; index++) {
			total += values[index];
		}
		System.out.println("Addition  : " + total);
	}
}


//VariableArguments - VarArgs : Java5
//void func(Type... identifier) {0-n
//	
//}




