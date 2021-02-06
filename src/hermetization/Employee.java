package hermetization;

public class Employee {
    private String name;
    private String level;
    private int employeeNumber;

    public Employee(String name, String level, int employeeNumber) {
        this.name = name;
        this.level = level;
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void dispplay() {
        System.out.println("---------------------------");
        System.out.println("Name: " + name);
        System.out.println("Exerience level: " + level);
        System.out.println("Employee number: " + employeeNumber);
    }
}
