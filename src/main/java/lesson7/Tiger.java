package lesson7;

public class Tiger {
    String name;
    int age;
    int run;
    int swim;

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
                if (distance <= 1000 & distance > 0) {
                    System.out.println(getName() + " пробежал " + distance + " метров");
                } else if (distance > 1000) {
                    System.out.println(getName() + " пробежал только 1000 метров");
                }
                break;
            }
            case "плавать": {
                if (distance <= 200 & distance > 0) {
                    System.out.println(getName() + " проплыл " + distance + "метров");
                } else if (distance > 200) {
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