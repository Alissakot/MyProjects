package lesson13;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {

    public static void main(String[] args) {
        int n = 30;
        int targetWorkAge = 5;
        List<Employee> workers = new ArrayList<>();
        String[] familyArray = EmployeeMethods.fillArrayF();
        String[] nameArray = EmployeeMethods.fillArrayI();
        String[] otchestvoArray = EmployeeMethods.fillArrayO();
        for (int i = 0; i < n; i++) {
            Employee worker = new Employee(familyArray[(int) (Math.random() * 10)] + " " +
                    nameArray[(int) (Math.random() * 10)] + " " +
                    otchestvoArray[(int) (Math.random() * 10)],
                    (int) (Math.random() * 1000000), (int) (Math.random() * 20));
            workers.add(worker);
        }
        EmployeeMethods.printEmployeeTargetAge(workers, targetWorkAge);
        System.out.println();
        System.out.println("----------------------------------");
        EmployeeMethods.printList(workers);
        EmployeeMethods.remover(workers);
        System.out.println();
        System.out.println("Половина листа--------------------");
        EmployeeMethods.printList(workers);
    }
}