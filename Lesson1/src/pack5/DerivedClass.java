package pack5;

import pack4.BaseClass;

public class DerivedClass extends BaseClass {

	public static void main(String[] args) {
		DerivedClass class1 = new DerivedClass();
		int x = class1.display();
		System.out.println("X is " + x);
		System.out.println("Or class1 i value is " + class1.i);
		
		//private var is not accessible
		//System.out.println("Or class1 j value is " + class1.j);
	}

}

