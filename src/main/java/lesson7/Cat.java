package lesson7;

public class Cat {
    public String name;
    public int age;

    private final static int runLimit = 200;

    public String getName() {
        return name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void runner(String action, int distance) {
        switch (action) {
            case "бежать": {
                if (distance <= runLimit & distance > 0) {
                    System.out.println(getName() + " пробежал " + distance + " метров");
                } else if (distance > runLimit) {
                    System.out.println(getName() + " пробежал только 200 метров");
                }
                break;
            }
            case "плыть": {
                System.out.println(getName() + " не стал плавать");
                break;
            }
            default: {
                System.out.println(getName() + " прилег отдохнуть");
                break;
            }
        }
    }
}

