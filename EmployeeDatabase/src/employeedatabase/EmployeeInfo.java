package employeedatabase;
public class EmployeeInfo {

    protected int empNum;
    protected String firstName;
    protected String lastName;
    protected int sex; // encode e.g. 0 for M, 1 for F, etc.
    protected int workLoc; // encode e.g. 0 for Mississauga, etc.
    protected double deductRate; // e.g. 0.21 for 21%

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
    
     public void setEmpNum(int empNum) {
    	this.empNum = empNum;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    public void setSex(int sex) {
    	this.sex = sex;
    }
    
    public void setWorkLoc(int workLoc) {
    	this.workLoc = workLoc;
    }
    
    public void setDeductRate(double deductRate) {
    	this.deductRate = deductRate;
    }
    
    public void displayEmployee(EmployeeInfo someEmp) {
    	System.out.println("Employee Number: " + empNum);
    	System.out.println("First Name: " + firstName);
    	System.out.println("Last Name: " + lastName);
    	
    	if(this instanceof FullTimeEmployee) {
    		FullTimeEmployee someFTE = (FullTimeEmployee) someEmp;
    		System.out.println("Yearly Salary: " + someFTE.calcAnnualGrossIncome());
    	}
    	else if(this instanceof PartTimeEmployee) {
    		PartTimeEmployee somePTE = (PartTimeEmployee) someEmp;
    		System.out.println("Hourly Wage: " + somePTE.getHourlyWage());
    	}
    	
    	System.out.println("");
    }
}