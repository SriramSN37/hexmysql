package library;

public class book {
    private int code;
    private String name;
    private int qty;
    
    // Default constructor
    public book() {
        this.code = 0;
        this.name = "";
        this.qty = 0;
    }
    
    // Parameterized constructor
    public book(Integer code, String name, int qty) {
        this.code = code;
        this.name = name;
        this.qty = qty;
    }
    
    // Getter and setter methods
    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
