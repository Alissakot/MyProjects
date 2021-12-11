package lesson8;

public class Parrot extends Animal{

    private static final String sound = "is so good";

    protected Parrot(String name, int age) {
        super(name, age);
    }
    @Override
    protected String getSound() {
        String parrotSound = super.getName();
        return parrotSound + " говорит " + parrotSound + " " +  this.sound;
    }

}
