package pack4;

public class BaseClass {
	
	protected int i = 10;
	
	private int j = 20;
	
	protected int display() {
		System.out.println("Inside parent's display method!"+ i);
		return i;
	}

}