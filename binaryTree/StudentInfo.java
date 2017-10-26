package binaryTree;

public class StudentInfo {
	private int studentNumber;
	private String firstName;
	private String lastName;
	private StudentInfo left;
	private StudentInfo right;

	public StudentInfo(int studentNumber, String firstName, String lastName) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		
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
	
	public StudentInfo getLeft() {
		return left;
	}
	
	public StudentInfo getRight() {
		return right;
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
	
	public void setLeft(StudentInfo left) {
		this.left = left;
	}
	
	public void setRight(StudentInfo right) {
		this.right = right;
	}
	
	public void outputStudent(int i) {
		System.out.println("Student #" + i);
		System.out.println("First name: " + getFirstName());
		System.out.println("Last name: " + getLastName());
		System.out.println("Student Number: " + getStudentNumber());
		System.out.println();
	}
}
