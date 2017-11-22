package employeedatabase;

public class PartTimeEmployee extends EmployeeInfo{
	
	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	public PartTimeEmployee(int empNum, String firstName, String lastName, int sex, int workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weeksPerYear) {
		super(empNum, firstName, lastName, sex, workLoc, deductRate);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
		this.weeksPerYear = weeksPerYear;
	}

	public double calcAnnualGrossIncome() {
		return hourlyWage * hoursPerWeek * weeksPerYear;
	}
	
	public double calcAnnualNetIncome() {
		return (calcAnnualGrossIncome()) * (1 - this.deductRate);
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	
        public double getHoursPerWeek() {
            return hoursPerWeek;
        }
        
        public double getWeeksPerYear() {
            return weeksPerYear;
        }
}
