package pack2;

import pack1.DefAccessSpecifier3;
import pack3.PriAccessSpecifier;

public class AccessSpecifierTest3 {

	public static void main(String[] args) {

		DefAccessSpecifier3 accessSpecifier3 = new DefAccessSpecifier3();
		//accessSpecifier3.display3(); //not visible because default
		accessSpecifier3.display4();
		
		//private
		PriAccessSpecifier priAccessSpecifier = new PriAccessSpecifier();
		//priAccessSpecifier.welcome();		
	}

}