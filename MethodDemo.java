
public class MethodDemo {
	
	//Called method
	public int sum(int input1, int input2) {
		int c = input1 + input2;
		return c;
	}
	
	//Calling method
	public static void main(String[] args) {
		int input1 = 10, input2 = 20;
		//Instantiate an object of MethodDemo class
		MethodDemo demo = new MethodDemo();
		// Static reference - MethodDemo.sum(input1, input2);
		int result = demo.sum(input1, input2);//sum(10, 20)
		System.out.println("Result : " + result);
	}
}
