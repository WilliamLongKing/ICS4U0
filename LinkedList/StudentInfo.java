package LinkedList;

public class StudentInfo {
	private String firstName;
	private String lastName;
	private int studentNumber;
	private StudentInfo next;

	public StudentInfo(String firstName, String lastName, int studentNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public StudentInfo getNext() {
		return next;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setNext(StudentInfo next) {
		this.next = next;
	}
	
	public void outputStudent(int i) {
		System.out.println("Student #" + i);
		System.out.println("First name: " + getFirstName());
		System.out.println("Last name: " + getLastName());
		System.out.println("Student Number: " + getStudentNumber());
		System.out.println();
	}
}
