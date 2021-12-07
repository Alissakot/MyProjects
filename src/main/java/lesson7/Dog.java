package lesson7;

public class Dog {
    public String name;
    public int age;

    private final static int runLimit = 500;
    private final static int swimLimit = 10;

    public String getName() {
        return name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void runner(String action, int distance) {
        switch (action) {
            case "бежать": {
                if (distance <= runLimit & distance > 0) {
                    System.out.println(getName() + " пробежал " + distance + " метров");
                } else if (distance > runLimit) {
                    System.out.println(getName() + " пробежал только 500 метров");
                }
                break;
            }
            case "плавать": {
                if (distance <= swimLimit & distance > 0) {
                    System.out.println(getName() + " проплыл " + distance + "метров");
                } else if (distance > swimLimit) {
                    System.out.println(getName() + " проплыл только 10 метров");
                }
                break;
            }
            default: {
                System.out.println(getName() + " прилег отдохнуть");
                break;
            }
        }
    }
}
