package lesson7;

public class Cat {
    String name;
    int age;
    int run;
    int swim;

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
                if (distance <= 200 & distance > 0) {
                    System.out.println(getName() + " пробежал " + distance + " метров");
                } else if (distance > 200) {
                    System.out.println(getName() + " пробежал только 200 метров");
                }
                break;
            }
            case "плавать": {
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

