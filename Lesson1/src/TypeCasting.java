
public class TypeCasting {
	
	public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting :");
		
		char c = 'A';
		System.out.println("Value of c :" + c);

/*		byte and short :Type mismatch: cannot convert from char to byte or short, these would require explicit casting
		byte b = c;
		System.out.println("Value of b :" + b);

		short s = c;
		System.out.println("Value of s :" + s);
*/

		int i = c;
		System.out.println("Value of i :" + i);

		long l = c;
		System.out.println("Value of l :" + l);

		float f = c;
		System.out.println("Value of f :" + f);

		double d = c;
		System.out.println("Value of d :" + d);			
		
		System.out.println("Explicit Type Casting :");

		//explicit from above
		byte b = (byte) c;
		System.out.println("Value of b :" + b);

		//explicit from above
		short s = (short) c;
		System.out.println("Value of s :" + s);

		double d1 = 465656.67;
		System.out.println("Value of d1 :" + d1);

		int i3 = (int) d1;
		System.out.println("Value of i3 :" + i3);
		
		float f1 = (float)d1;
		System.out.println("Value of f1 :" + f1);
		
		Integer integer = 10;
		int i4 = integer;
		System.out.println("Value of i4 :" + i4);

		String s1 = "15";
		int i5 = Integer.parseInt(s1);
		System.out.println("Value of i5 :" + i5);
		
	}
}
