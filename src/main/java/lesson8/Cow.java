package lesson8;

public class Cow extends Animal{

    private static final String sound = "mua";

    protected Cow(String name, int age) {
        super(name, age);
    }

    @Override
    protected String getSound() {
        return super.getName() + " говорит " + this.sound;
    }
}
