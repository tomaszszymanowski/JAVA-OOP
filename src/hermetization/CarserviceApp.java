package hermetization;

import java.util.Scanner;

public class CarserviceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        CarService carService = new CarService();
        int option;
        int emplyeeNumber = 1;
        Employee employee;

        do {
            System.out.println("----- Car Service App -----");
            System.out.println("1 - add employee");
            System.out.println("2 - display employee");
            System.out.println("3 - add task");
            System.out.println("4 - display tasks");
            System.out.println("100 - end program");

            option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Experience level: ");
                    String level = scanner.nextLine();

                    employee = new Employee(name, level, emplyeeNumber++);
                    carService.addEmployee(employee);
                    break;

                case 2:
                    carService.displayEmployees();
                    break;

                case 3:
                    System.out.print("Description: ");
                    String descripton = scanner.nextLine();

                    System.out.print("Employee ID: ");
                    int employeeNumber = scanner.nextInt();

                    employee = carService.findEmployee(employeeNumber);

                    if (employee != null) {
                        Task task = new Task(descripton, employee);
                        carService.addTask(task);
                    } else {
                        System.out.println("Not found employee");
                    }
                    break;

                case 4:
                    carService.displayTasks();
                    break;

                case 100:
                    break;
            }

        } while (option != 100);
        scanner.close();
    }
}
