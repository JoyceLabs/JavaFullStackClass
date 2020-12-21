
import java.util.Scanner;

public class Calculate {
	static String operationAddition = "Addition";
	static String operationSubtraction = "Subtraction";
	static String operationMultiplication = "Multiplication";
	static String operationDivision = "Division";

	public static void main(String[] args) {
//type casting, access specifiers, final
		Scanner s = new Scanner(System.in);
        Calculator c = new Calculator();
        
		System.out.println("Please enter the letter of the operation you would like to perform:");
		System.out.println("A:Addition, S:Subtraction, M:Multiplication, D:Division");
        c.setOperation(s.nextLine());

		System.out.println("Please enter the first value:");
		c.setValue1(s.nextInt());

		System.out.println("Please enter the second value:");
		c.setValue2(s.nextInt());

		switch(c.getOperation()) {
		case "A":
			System.out.println(operationAddition + ": " + (c.getValue1() + c.getValue2()));
			break;
		case "S":
			System.out.println(operationSubtraction + ": " + (c.getValue1() - c.getValue2()));
			break;		
		case "M":
			System.out.println(operationMultiplication + ": " + (c.getValue1() * c.getValue2()));
			break;		
		case "D":
			if (c.getValue2() == 0) {
				System.out.println("Invalid operation cannot divide by 0");
				break;						
			}
			System.out.println(operationDivision + ": " + (c.getValue1() / c.getValue2()));
		   	break;		
		default:
			System.out.println("A valid operation was not specified");
			break;		
	   	}
	}

}
