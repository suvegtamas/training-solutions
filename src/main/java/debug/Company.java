package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    public Employee findEmployeeByName(String name) {
        for ( Employee names : employeeList) {
            if (names.getName().equals(name)) {
                return names;
            }
        }
        return null;
    }
    public List<String> listEmployeeNames() {
      List<String> names = new ArrayList<>();
      for (Employee name : employeeList) {
          names.add(name.getName());
      }
      return names;
    }
}


