package employeedatabase;

public class FullTimeEmployee extends EmployeeInfo{
	
	private double yearlySalary;
	
	public FullTimeEmployee(int empNum, String firstName, String lastName, int sex, int workLoc, double deductRate, double yearlySalary) {
		super(empNum, firstName, lastName, sex, workLoc, deductRate);
		this.yearlySalary = yearlySalary;
	}

	public double calcAnnualGrossIncome() {
		return yearlySalary;
	}
	
	public double calcAnnualNetIncome() {
		return calcAnnualGrossIncome() * (1 - this.deductRate);
	}
        
        public void setYearlySalary(double yearlySalary) {
            this.yearlySalary = yearlySalary;
        }
	
}
