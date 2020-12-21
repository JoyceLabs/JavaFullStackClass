package pack3;

public class PriAccessSpecifier {
	
	private void welcome() {
		System.out.println("I am private method!");
	}

	public static void main(String[] args) {
		PriAccessSpecifier priAccessSpecifier = new PriAccessSpecifier();
		priAccessSpecifier.welcome();

	}
}