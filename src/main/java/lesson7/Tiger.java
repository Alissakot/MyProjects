package lesson7;

public class Tiger {
    String name;
    int age;
    int run;
    int swim;

    public Tiger(String name, int age, int run, int swim) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.swim = swim;
    }

    public void setRunSwim(int run, int swim) {
        if (run > 1000) {
            run = 1000;
        }
        if (swim > 400) {
            swim = 400;
        }
        this.run = run;
        this.swim = swim;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }
}