package JAVA.Abs;

abstract class Employee {
    protected String name;
    protected int employeeID;
    protected double monthlySalary;

    // Constructor
    public Employee(String name, int employeeID, double monthlySalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.monthlySalary = monthlySalary;
    }

    // Abstract method to calculate salary
    abstract void calculateSalary();

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

class TemporaryEmployee extends Employee {
    private double hourlyRate;
    private int totalHoursWorked;

    // Constructor
    public TemporaryEmployee(String name, int employeeID, double hourlyRate, int totalHoursWorked) {
        super(name, employeeID, 0);
        this.hourlyRate = hourlyRate;
        this.totalHoursWorked = totalHoursWorked;
    }

    // Method to calculate salary for Temporary Employee
    @Override
    void calculateSalary() {
        monthlySalary = hourlyRate * totalHoursWorked;
    }

    // Getter methods
    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }
}

class PermanentEmployee extends Employee {
    private double annualBonus;

    // Constructor
    public PermanentEmployee(String name, int employeeID, double monthlySalary, double annualBonus) {
        super(name, employeeID, monthlySalary);
        this.annualBonus = annualBonus;
    }

    // Method to calculate salary for Permanent Employee
    @Override
    void calculateSalary() {
        monthlySalary += annualBonus; // Adding annual bonus to monthly salary
    }

    // Getter method
    public double getAnnualBonus() {
        return annualBonus;
    }
}

