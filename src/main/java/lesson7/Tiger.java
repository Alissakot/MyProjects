package lesson7;

public class Tiger {
    public String name;
    public int age;

    private final static int runLimit = 1000;
    private final static int swimLimit = 200;

    public String getName() {
        return name;
    }

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void runner(String action, int distance) {
        switch (action) {
            case "бежать": {
                if (distance <= runLimit & distance > 0) {
                    System.out.println(getName() + " пробежал " + distance + " метров");
                } else if (distance > runLimit) {
                    System.out.println(getName() + " пробежал только 1000 метров");
                }
                break;
            }
            case "плавать": {
                if (distance <= swimLimit & distance > 0) {
                    System.out.println(getName() + " проплыл " + distance + "метров");
                } else if (distance > swimLimit) {
                    System.out.println(getName() + " проплыл только 200 метров");
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