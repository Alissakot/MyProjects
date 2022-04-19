package lesson13;

public class Employee {
    private String fio;
    private int personalNumber;
    private int workAge;

    public Employee(String fio, int personalNumber, int workAge) {
        this.fio = fio;
        this.personalNumber = personalNumber;
        this.workAge = workAge;
    }

    public String getFio() {
        return fio;
    }

    public int getWorkAge() {
        return workAge;
    }
}


