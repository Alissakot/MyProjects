package lesson7;

public class Dog {
    String name;
    int age;
    int run;
    int swim;

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
                if (distance <= 500 & distance > 0) {
                    System.out.println(getName() + " пробежал " + distance + " метров");
                } else if (distance > 500) {
                    System.out.println(getName() + " пробежал только 500 метров");
                }
                break;
            }
            case "плавать": {
                if (distance <= 10 & distance > 0) {
                    System.out.println(getName() + " проплыл " + distance + "метров");
                } else if (distance > 10) {
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
