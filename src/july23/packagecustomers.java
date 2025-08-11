package july23;

public class packagecustomers {
    protected String name;
    protected int id;
    protected String department;

    // Constructor name matches class name
    public packagecustomers(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    protected void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}
