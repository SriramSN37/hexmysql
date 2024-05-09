package JAVA.Abs;
abstract class Emp {
    protected int eid;
    protected String name;
    protected double sal;
    protected double bon;

    // Constructor
    public Emp(int eid, String name, double sal) {
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }

    // Getter and setter methods
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getBon() {
        return bon;
    }

    public void setBon(double bon) {
        this.bon = bon;
    }

    // Abstract method to calculate bonus
    abstract void calBon();
}

class PE extends Emp {
    // Constructor
    public PE(int eid, String name, double sal) {
        super(eid, name, sal);
    }

    // Method to calculate bonus for Permanent Employee
    @Override
    void calBon() {
        bon = sal * 0.10; // 10% bonus for Permanent Employee
    }
}

class TE extends Emp {
    // Constructor
    public TE(int eid, String name, double sal) {
        super(eid, name, sal);
    }

    // Method to calculate bonus for Temporary Employee
    @Override
    void calBon() {
        bon = sal * 0.05; // 5% bonus for Temporary Employee
    }
}

