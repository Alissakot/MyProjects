package lesson7;

public class Cat {
    String name;
    int age;
    int run;
    int swim;

    public Cat(String name, int age, int run, int swim) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.swim = swim;
    }
    public void setRunSwim(int run, int swim) {
        if(run>200){
            run = 200;
        }

        this.run = run;
        this.swim = 0;
    }

    public int getRun() {
        return run;
    }

    public String getSwim (){
        return ("не стал плавать");
    }
}
