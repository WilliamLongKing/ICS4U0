package LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myLL linkedList = new myLL();
		StudentInfo someStudent = new StudentInfo("Daffy", "Duck", 123456);
		linkedList.add(someStudent);
		linkedList.studentsOutput();
		
		StudentInfo someOtherStudent = new StudentInfo("Bugs", "Bunny", 654321);
		linkedList.add(someOtherStudent);
		linkedList.studentsOutput();
		
		StudentInfo someOtherOtherStudent = new StudentInfo("Lola", "Bunny", 101010);
		linkedList.add(someOtherOtherStudent);
		linkedList.studentsOutput();
		
		linkedList.removeFromRear();
		linkedList.studentsOutput();
		
		linkedList.removeFromFront();
		linkedList.studentsOutput();
	}

}
