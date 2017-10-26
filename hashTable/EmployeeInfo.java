package hashTable;
public class EmployeeInfo {

    private int empNum;
    private String firstName;
    private String lastName;
    private int sex; // encode e.g. 0 for M, 1 for F, etc.
    private int workLoc; // encode e.g. 0 for Mississauga, etc.
    private double deductRate; // e.g. 0.21 for 21%

    public EmployeeInfo(int empNum, String firstName, String lastName, int sex, int workLoc, double deductRate) {
    	this.empNum = empNum;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.sex = sex;
    	this.workLoc = workLoc;
    	this.deductRate = deductRate;
    }

	public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public int getSex() {
    	return sex;
    }
    
    public int getWorkLoc() {
    	return workLoc;
    }
    
    public double getDeductRate() {
    	return deductRate;
    }
}