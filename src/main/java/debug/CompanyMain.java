package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack Doe", 1989);
        Employee employee2 = new Employee("John Cena", 1979);
        Employee employee3 = new Employee("Wade Russel", 1969);

        Company company = new Company(new ArrayList<>());
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        Employee johnCena = company.findEmployeeByName("John Cena");
        System.out.println(johnCena.getName());
        System.out.println(johnCena.getYearOfBirth());

        List<String> companyEmployees = company.listEmployeeNames();
        System.out.println(companyEmployees);


    }
}
