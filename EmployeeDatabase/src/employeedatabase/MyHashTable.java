package employeedatabase;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MyHashTable {

	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	private ArrayList<EmployeeInfo>[] buckets;
        private ArrayList<EmployeeInfo>[] employeesToAdd;
        private int numEmployees;

	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}



	public boolean addEmployee(EmployeeInfo theEmployee) {
		int employeeNumber = theEmployee.getEmpNum();
		int bucketNumber = calcBucket(employeeNumber);
		buckets[bucketNumber].add(theEmployee);
                numEmployees++;
		return true;

		// Add the employee to the hash table.  Return true if employee is added successfully,
		// return false otherwise.
	}



	public EmployeeInfo searchByEmployeeNumber(int employeeNum) {
		int bucketNumber = calcBucket(employeeNum);
		for(int i = 0; i < buckets[bucketNumber].size(); i++) {
			if (buckets[bucketNumber].get(i).getEmpNum() == employeeNum) {
				return buckets[bucketNumber].get(i);	
			}
		}
		// Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
		// If the employee is not found, return -1.

		return null;
	}



	public EmployeeInfo removeEmployee(int employeeNum) {
		int bucketNumber = calcBucket(employeeNum);
		EmployeeInfo employeeRemoved = searchByEmployeeNumber(employeeNum);
		for(int i = 0; i < buckets[bucketNumber].size(); i++) {
			if (buckets[bucketNumber].get(i) == employeeRemoved) {
				buckets[bucketNumber].remove(searchByEmployeeNumber(employeeNum));
                                numEmployees--;
				return employeeRemoved;
			}
		}

		return null;
		// Remove the employee from the hash table and return the reference to that employee.
		// If the employee is not in the hash table, return null.
	}



	public void displayContents() {

		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.

		for (int i = 0; i < buckets.length; i++) {

			// For the current bucket, print out the emp num for each item
			// in its ArrayList.

			System.out.println("\nExamining the ArrayList for bucket " + i);
			int listSize = buckets[i].size();
			if (listSize == 0) {
				System.out.println("  Nothing in its ArrayList!");
			}
			else {
				for (int j = 0; j < listSize; j++) {
					int theEmpNum = buckets[i].get(j).getEmpNum();
					System.out.println("  Employee " + theEmpNum);
				}
			}

		}

	} // end displayContents
    
    public void readFile() {
            List<String> records = new ArrayList<String>();
            String line = null;
            File file = new File("EmployeeList.csv");
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader); 
                while((line = reader.readLine()) != null) {
                    records.add(line);
                }
                for(int i = 0; i < records.size(); i++) {
                    line = records.get(i);
                    String[] attributes = line.split(",");
                    String employeeType = attributes[0];
                    int empNum = Integer.parseInt(attributes[1]);
                    String firstName = attributes[2];
                    String lastName = attributes[3];
                    int gender = Integer.parseInt(attributes[4]);
                    int location = Integer.parseInt(attributes[5]);
                    double deductRate = Double.parseDouble(attributes[6]);
                    
                    if("P".equals(employeeType)) {
                        double hourlyWage = Double.parseDouble(attributes[7]);
                        double hoursWeek = Double.parseDouble(attributes[8]);
                        double weeksYear = Double.parseDouble(attributes[9]);
                        PartTimeEmployee loadedPTE = new PartTimeEmployee(empNum, firstName, lastName, gender, location, deductRate, hourlyWage, hoursWeek, weeksYear);
                        this.addEmployee(loadedPTE);
                    }
                    else if("F".equals(employeeType)) {
                        double yearlySalary = Double.parseDouble(attributes[7]);
                        FullTimeEmployee loadedFTE = new FullTimeEmployee(empNum, firstName, lastName, gender, location, deductRate, yearlySalary);
                        this.addEmployee(loadedFTE);
                    }
                    
                }
                
                reader.close();
            } catch (Exception e) {
                System.err.format("Exception occurred trying to read file");
                e.printStackTrace();
            }
        }
    
    public void writeFile() throws IOException {
        List<String> records = new ArrayList<String>();
        File writeFile = new File("EmployeeList.csv");
        FileWriter fw = new FileWriter(writeFile);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < buckets.length; i++) {
            for(int j = 0; j <buckets[i].size(); j++) {
                EmployeeInfo employeeSaved = buckets[i].get(j);   
                int empNum = employeeSaved.getEmpNum();
                String firstName = employeeSaved.getFirstName();
                String lastName = employeeSaved.getLastName();
                int gender = employeeSaved.getSex();
                int location = employeeSaved.getWorkLoc();
                double deductRate = employeeSaved.getDeductRate();
                
                if(employeeSaved instanceof FullTimeEmployee) {
                    FullTimeEmployee FTE = (FullTimeEmployee) employeeSaved;
                    double yearlySalary = FTE.calcAnnualGrossIncome();
                    String writeFTE = "F," + empNum + "," + firstName + "," + lastName + "," + gender + "," + location + "," + deductRate + "," + yearlySalary;
                    System.out.println(writeFTE);
                    bw.write(writeFTE);          
                    bw.newLine();
                }
                else if(employeeSaved instanceof PartTimeEmployee) {
                    PartTimeEmployee PTE = (PartTimeEmployee) employeeSaved;
                    double hourlyWage = PTE.getHourlyWage();
                    double hoursWeek = PTE.getHoursPerWeek();
                    double weeksYear = PTE.getWeeksPerYear();
                    String writePTE = "P," + empNum + "," + firstName + "," + lastName + "," + gender + "," + location + "," + deductRate + "," + hourlyWage + "," + hoursWeek + "," + weeksYear;
                    System.out.println(writePTE);
                    bw.write(writePTE);
                    bw.newLine();
                }
            }
        }
        bw.close();
    }
    
    public int getNumEmp(){
        return numEmployees;
    }


} // end class MyHashTable
