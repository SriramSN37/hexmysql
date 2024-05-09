package JAVA.Abs;

public class dem {
    public static void main(String[] args) {
        TE obj = new TE(101, "John", 5000);
        PE obj1 = new PE(102, "Smith", 15000);
        obj.calBon();
        obj1.calBon();
        System.out.println("Employee ID: " + obj.getEid());
        System.out.println("Employee Name: " + obj.getName());
        System.out.println("Employee Salary: $" + obj.getSal());
        System.out.println("Employee Bonus: $" + obj.getBon());
        System.out.println("Employee ID: " + obj1.getEid());
        System.out.println("Employee Name: " + obj1.getName());
        System.out.println("Employee Salary: $" + obj1.getSal());
        System.out.println("Employee Bonus: $" + obj1.getBon());
    }
}
