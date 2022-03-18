package operators;

public class BitWiseOperators {

	public static void main(String[] args) {
		// Bitwise Operators  &,^,| 
		
		int a = 7;// 0000 0000 0000 0000 0000 0000 0000 0111
		int b = 6;// 0000 0000 0000 0000 0000 0000 0000 0110
		int x = 10;// 0000 0000 0000 0000 0000 0000 0000 1010
		
		// 1101
		int f = a^x; // 0000 0000 0000 0000 0000 0000 0000 1101
		
		System.out.println(f);
		
		int e = b|x; // 0000 0000 0000 0000 0000 0000 0000 1110
		System.out.println(e);
		
		int d = a|b; // 0000 0000 0000 0000 0000 0000 0000 0111
		System.out.println(d);
		
		int c = a&b;// 0000 0000 0000 0000 0000 0000 0000 0110
		System.out.println(c);
		
		boolean y = a&&b; // logical operators can not be used with integer operands or logical operators can not do bitwise operations
		
		
		
		  
		

	}

}
