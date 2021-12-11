package lesson7;

public class Tiger {
    private String name;
    private int age;

    private final static int runLimit = 1000;
    private final static int swimLimit = 200;

    private String getName() {
        return name;
    }

    protected Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void run(int distance) {
        if (distance <= runLimit & distance > 0) {
            System.out.println(getName() + " пробежал " + distance + " метров");
        } else if (distance > runLimit) {
            System.out.println(getName() + " пробежал только " + runLimit + " метров");
        } else {
            System.out.println(getName() + " присел отдохнуть");
        }
    }

    protected void swim(int distance) {
        if (distance <= swimLimit & distance > 0) {
            System.out.println(getName() + " проплыл " + distance + "метров");
        } else if (distance > swimLimit) {
            System.out.println(getName() + " проплыл только " + swimLimit + " метров");
        } else {
            System.out.println(getName() + " парит как уточка");
        }
    }
}