package lesson7;

public class Cat {
    private String name;
    private int age;

    private final static int runLimit = 200;

    private String getName() {
        return name;
    }

    protected Cat(String name, int age) {
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
        System.out.println(getName() + " не стал плавать");
    }
}

