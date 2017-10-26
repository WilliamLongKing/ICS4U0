package hashTable;

public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashTable hashTable = new MyHashTable(2);
		
		EmployeeInfo someEmployee = new EmployeeInfo(529789, "William", "King", 0, 0, 0.00);
		hashTable.addEmployee(someEmployee);
		someEmployee = new EmployeeInfo(987925, "Mailliw", "Gnik", 0, 0, 0.00);
		hashTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(300000, "Cilliam", "Cing", 0, 0, 0.00);
		hashTable.addEmployee(someEmployee);

		someEmployee = new EmployeeInfo(400000, "Dilliam", "Ding", 0, 0, 0.00);
		hashTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(729589, "Killiam", "Wing", 0, 0, 0.00);
		hashTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(700000, "Gilliam", "Ging", 0, 0, 0.00);
		hashTable.addEmployee(someEmployee);
		
		someEmployee = new EmployeeInfo(200000, "Billiam", "Bing", 0, 0, 0.00);
		hashTable.addEmployee(someEmployee);
		
		hashTable.displayContents();
	}

}
