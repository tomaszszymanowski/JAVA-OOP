package hermetization;

public class CarService {
    private Employee[] employees;
    private int employeeIndex = 0;

    private Task[] tasks;
    private int taskIndex = 0;

    public CarService() {
        employees = new Employee[10];
        tasks = new Task[20];
    }


    public void addEmployee(Employee employee){
        employees[employeeIndex++] = employee;
    }

    public void displayEmployees() {
        for(int i = 0; i< employees.length && employees[i] != null; i++ ){
            employees[i].dispplay();
        }
    }

    public Employee findEmployee(int employeeNumber) {
        for(int i = 0; i< employees.length && employees[i] != null; i++ ){
            if(employees[i].getEmployeeNumber() == employeeNumber){
                return employees[i];
            }
        }
        return null;
    }

    public void addTask(Task task) {
        tasks[taskIndex] = task;
    }

    public void displayTasks() {
        for(int i = 0; i< tasks.length && tasks[i] != null; i++ ){
            System.out.println("*********************************");
            tasks[i].dispplayTask();
            System.out.println("*********************************\n");
        }
    }
}
