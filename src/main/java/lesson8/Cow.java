package lesson8;

public class Cow extends Animal{

    private static final String sound = "mua";

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return super.getName() + " говорит " + this.sound;
    }
}
