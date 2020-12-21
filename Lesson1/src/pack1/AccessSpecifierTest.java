package pack1;

public class AccessSpecifierTest {

	public static void main(String[] args) {
		DefAccessSpecifier accessSpecifier = new DefAccessSpecifier();
		accessSpecifier.display();
		accessSpecifier.display1();
		DefAccessSpecifier2.display2();	//it is accessible without an object because it is declared as static
	}

}