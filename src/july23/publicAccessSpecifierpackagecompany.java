package july23;

// Employee class with public members
class Employee {
    // Public fields
    public String name;
    public int empId;
    public String department;

    // Public method
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
    }
}

public class publicAccessSpecifierpackagecompany {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp = new Employee();

        // Directly access and modify public fields
        emp.name = "David";
        emp.empId = 1001;
        emp.department = "Finance";

        // Call public method
        emp.displayInfo();

        // Modify again
        emp.name = "Sophia";
        emp.department = "Marketing";

        System.out.println("\nAfter updates:");
        emp.displayInfo();
    }
}
