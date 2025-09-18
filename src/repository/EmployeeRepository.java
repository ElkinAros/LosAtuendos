package repository;

import java.util.*;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public void add(Employee e) { employees.add(e); }
    public Employee findById(String id) {
        return employees.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }
}
