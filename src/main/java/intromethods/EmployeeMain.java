package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Paprika Jancsi",2005,250000);

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        employee.setName("Gill Bates");
        System.out.println(employee.getName());
        employee.raiseSalary(50000);
        System.out.println(employee.getSalary() + "FT");
    }
}

