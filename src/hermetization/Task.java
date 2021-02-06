package hermetization;

public class Task {
    private String description;
    private Employee employee;

    public Task(String description, Employee employee) {
        this.description = description;
        this.employee = employee;
    }


    public void dispplayTask() {
        System.out.println("Description: "+description);
        employee.dispplay();
    }
}
