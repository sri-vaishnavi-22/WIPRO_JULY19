package july30;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals() to compare object content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + "_" + name;
    }
}

public class equalsmethod {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "Ravi"));
        employees.add(new Employee(101, "Amit"));
        employees.add(new Employee(102, "Zara"));
        employees.add(new Employee(102, "Zara")); // duplicate
        employees.add(new Employee(104, "John"));

        for (Employee e : employees) {
            System.out.println(e);
        }

        // Example: Check equality
        Employee e1 = new Employee(102, "Zara");
        Employee e2 = new Employee(102, "Zara");

        System.out.println("Are e1 and e2 equal? " + e1.equals(e2));
    }
}
