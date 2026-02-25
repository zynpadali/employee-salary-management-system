import java.util.Scanner;

public class EmployeeSalaryManagementSystem {
		private String name;
		private double baseSalary;
		private double bonusPercentage;
		private double totalSalary;
		private static int employeeCount = 0;
		
		// constructor
		public EmployeeSalaryManagementSystem (String name, double baseSalary, double bonusPercentage){
			this.setName(name);
			this.setBaseSalary(baseSalary);
			this.setBonusPercentage(bonusPercentage);
			calculateTotalSalary();
			employeeCount += 1;
		}
		private void calculateTotalSalary(){
			this.totalSalary = baseSalary + (baseSalary * (bonusPercentage / 100));
		}
		
		// getter and setter methods
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
		public void setBaseSalary(double baseSalary){
			this.baseSalary = baseSalary;
			calculateTotalSalary(); // update the total salary
		}
		public double getBaseSalary(){
			return baseSalary;
		}
		public void setBonusPercentage(double bonusPercentage){
			this.bonusPercentage = bonusPercentage;
			calculateTotalSalary(); // update the total salary
		}
		public double getBonusPercentage(){
			return bonusPercentage;
		}
		public static int getEmployeeCount(){
			return employeeCount;
		}
		public double getTotalSalary() {
			return totalSalary;
        }
        
        //Assign the performance level
        public String getPerformanceLevel(){
        	if(totalSalary >= 90000) {
        		return "Outstanding" ;
        	} else if (totalSalary >= 70000){
        		return "Excellent";
        	} else if(totalSalary >= 50000){
        		return "Good";
        	} else if (totalSalary >= 30000){
        		return "Average";
        	} else {
        		return "Needs Improvement";
        	}
        }
        
        
        public String getPerformanceMessage(){
        	String performance = getPerformanceLevel();
        	switch(performance){
        		case "Outstanding":
        			return "harika";
        		case "Excellent":
        			return "mğkemmeş";
        		case "Good":
        			return "iyi gidiyorsun";
        		case "Average":
        			return " ortalamanın üzerindesin";
        		default:
        			return "daha çok çalış";
        	}
        }
        
        
        
        
        // print employee's information
        public void displayInfo(){
        	System.out.println("Total Salary:" + getTotalSalary());
        	System.out.println("Performance Level:" + getPerformanceLevel());
        	System.out.println("Performance Message:" + getPerformanceMessage());
        }
       
       
       
       public static void main(String[] args){
       	Scanner input = new Scanner(System.in);
       	
       	System.out.print("Enter number of employees:");
       	int numEmployees = input.nextInt();
       	
       	for (int x = 0; x < numEmployees; ++x ){
       		input.nextLine();
       		
       		System.out.print("Enter Name:");
       		String name = input.nextLine();
       		
       		System.out.print("Enter Base Salary:");
       		double baseSalary = input.nextDouble();
       		
       		System.out.print("Enter Bonus Percentage:");
       		double bonusPercentage = input.nextDouble();
       		
       	EmployeeSalaryManagementSystem employee = new EmployeeSalaryManagementSystem (name, baseSalary, bonusPercentage);
       		employee.displayInfo();
       		
       	}
       System.out.println("Total Employees Registered:" + EmployeeSalaryManagementSystem.getEmployeeCount());
       input.close();
       
       }
      }
       
       
       
     
     