//int var; Doesn't work in Java

public class VariableLevelDemo {
	char ch;
	static int val;
	int var;
	String str;
	public static void main(String[] args) {
		
//		System.out.println(VariableLevelDemo.val);
//		System.out.println(val);//VariableLevelDemo.val
		
		VariableLevelDemo first = new VariableLevelDemo();
		VariableLevelDemo second = new VariableLevelDemo();
		
		first.val = 907; //Works - Yes : VariableLevelDemo.val
		
//		System.out.println(second.val);//?907
		
		first.var = 67;
		second.var = 101;
		
//		System.out.println(this.var);
		
		first.func();
		
		
		
		
		
//		------------------
////		VariableLevelDemo ref = new VariableLevelDemo();
//		VariableLevelDemo otherRef = new VariableLevelDemo();		
//		ref.str = "Lulwa";
//		System.out.println(ref.str.charAt(3));//Might be a NPE!
//		System.out.println(otherRef.str);
		
//		new VariableLevelDemo().func();
		
//		int value = 0;
//		
//		System.out.println(value);
		
//		for(int index = 9; index > 90; index++) {
//			System.out.println(index);
//		}
//			System.out.println(index);
		
	}
	void func() {//CEO
		int var = 0;//Works
//			Access var of first here:
		System.out.println(var);//local var 0
		System.out.println(this.var);//67
	}
}

//boolean - false
//byte
//short
//int
//long - 0
//float
//double - 0.0
//
//Reference - null
