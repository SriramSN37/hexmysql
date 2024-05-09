package JAVA.Abs;

public class Main {
    public static void main(String[] args) {
        // Creating TemporaryEmployee object
        TemporaryEmployee tempEmp = new TemporaryEmployee("John Doe", 101, 20.00, 160);
        tempEmp.calculateSalary();
        System.out.println("Temporary Employee Details:");
        System.out.println("Name: " + tempEmp.getName());
        System.out.println("Employee ID: " + tempEmp.getEmployeeID());
        System.out.println("Hourly Rate: $" + tempEmp.getHourlyRate());
        System.out.println("Total Hours Worked: " + tempEmp.getTotalHoursWorked());
        System.out.println("Monthly Salary: $" + tempEmp.getMonthlySalary());
        System.out.println();

        // Creating PermanentEmployee object
        PermanentEmployee permEmp = new PermanentEmployee("Jane Smith", 102, 5000.00, 2000.00);
        permEmp.calculateSalary();
        System.out.println("Permanent Employee Details:");
        System.out.println("Name: " + permEmp.getName());
        System.out.println("Employee ID: " + permEmp.getEmployeeID());
        System.out.println("Monthly Salary: $" + permEmp.getMonthlySalary());
        System.out.println("Annual Bonus: $" + permEmp.getAnnualBonus());
        System.out.println("Total Salary: $" + ((permEmp.getMonthlySalary()*12)+permEmp.getAnnualBonus()));
    }
}

