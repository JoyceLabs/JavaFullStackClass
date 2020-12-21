
public class PassByValueDemo {
	
	int value = 100;

	private int changeValue(int a) {
		a += 100;
	//	this.value = a;
		return a;
	}


	public static void main(String[] args) {
		PassByValueDemo valueDemo = new PassByValueDemo();
		System.out.println("Before calling the method changeValue : " + valueDemo.value);
		valueDemo.changeValue(valueDemo.value);
		System.out.println("After calling the method changeValue : " + valueDemo.value);
	}

}
