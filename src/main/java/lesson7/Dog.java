package lesson7;

public class Dog {
         String name;
        int age;
        int run;
        int swim;

        public Dog(String name, int age, int run, int swim) {
            this.name = name;
            this.age = age;
            this.run = run;
            this.swim = swim;

}
    public void setRunSwim(int run, int swim) {
            if(run>500){
                run = 500;
            }
            if(swim>10){
                swim = 10;
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
