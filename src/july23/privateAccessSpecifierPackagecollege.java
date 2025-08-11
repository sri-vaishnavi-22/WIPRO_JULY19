package july23;

// Student class in package college
class Student {
    // Private fields
    private String name;
    private int id;
    private String department;

    // Constructor
    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Public getters and setters to access private fields
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Department: " + department);
    }
}

public class privateAccessSpecifierPackagecollege {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("John", 101, "Computer Science");

        // Accessing via public method
        s1.displayInfo();

        // Updating using setters
        s1.setName("Alice");
        s1.setDepartment("Information Technology");

        System.out.println("\nAfter updates:");
        s1.displayInfo();
    }
}
