package gold.restapi;
import java.util.*;
import jakarta.persistence.*;

public class Employee {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;

    Employee() {}
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this== obj) return false;
        if(!(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }
}
