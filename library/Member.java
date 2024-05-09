package library;

public class Member {
    private int m_id;
    private String name;
    private String email;
    
    // Default constructor
    public Member() {
        this.m_id = 0;
        this.name = "";
        this.email = "";
    }
    
    // Parameterized constructor
    public Member(int m_id, String name, String email) {
        this.m_id = m_id;
        this.name = name;
        this.email = email;
    }
    
    // Getter and setter methods
    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // toString method
    public String toString() {
        return m_id + " " + name + " " + email;
    }
}
