package lesson13;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeMethods {

    public static String[] fillArrayF() {
        String[] familyName = new String[10];
        familyName[0] = "Иванов";
        familyName[1] = "Петров";
        familyName[2] = "Смирнов";
        familyName[3] = "Воробьев";
        familyName[4] = "Кузнецов";
        familyName[5] = "Сидоров";
        familyName[6] = "Котровский";
        familyName[7] = "Степанов";
        familyName[8] = "Беляков";
        familyName[9] = "Пузиков";
        return familyName;
    }

    public static String[] fillArrayI() {
        String[] firstName = new String[10];
        firstName[0] = "Иван";
        firstName[1] = "Петр";
        firstName[2] = "Семен";
        firstName[3] = "Владимир";
        firstName[4] = "Павел";
        firstName[5] = "Даниил";
        firstName[6] = "Олег";
        firstName[7] = "Алексей";
        firstName[8] = "Михаил";
        firstName[9] = "Евгений";
        return firstName;
    }

    public static String[] fillArrayO() {
        String[] secondName = new String[10];
        secondName[0] = "Иванович";
        secondName[1] = "Петрович";
        secondName[2] = "Семенович";
        secondName[3] = "Владимирович";
        secondName[4] = "Павлович";
        secondName[5] = "Денисович";
        secondName[6] = "Олегович";
        secondName[7] = "Алексеевич";
        secondName[8] = "Михайлович";
        secondName[9] = "Евгеньевич";
        return secondName;
    }

    public static void printEmployeeTargetAge(List<Employee> workers, int workAge) {
        for (Iterator<Employee> iterator = workers.iterator(); iterator.hasNext(); ) {
            Employee value = iterator.next();
            if (value.getWorkAge() == workAge) {
                System.out.println(value.getFio());
            }
        }
    }

    public static void remover(List<Employee> workers) {
        int size = workers.size();

        ListIterator<Employee> listIterator = workers.listIterator(size - 1);
        while (listIterator.hasPrevious()) {
            Employee element = listIterator.previous();
            size--;
            if (size % 2 == 1) {
                listIterator.remove();
            }
        }
    }

    public static void printList(List<Employee> workers) {
        for (Iterator<Employee> Iterator = workers.listIterator(); Iterator.hasNext(); ) {
            Employee next = Iterator.next();
            System.out.println(next.getFio());
        }
    }
}
