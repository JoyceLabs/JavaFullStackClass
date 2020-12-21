import java.util.Scanner;

public class Student {
	int studentId;
	String name;
	boolean assignmentStatus;
	
	Student(int id, String name) {
		this.studentId = id;
		this.name = name;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String name, boolean assignmentStatus) {
		this(studentId, name);
		this.assignmentStatus = assignmentStatus;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", assignmentStatus=" + assignmentStatus + "]";
	}


	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student(10, "Anne");
		System.out.println(student2);
		Student student3 = new Student(20, "John", true);
		System.out.println(student3);
		System.out.println("Enter employee name : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Enter employee Id : ");
		int id = scanner.nextInt();
		Student student4 = new Student(id, name, true);
		System.out.println(student4);
		scanner.close();

	}

	

}
