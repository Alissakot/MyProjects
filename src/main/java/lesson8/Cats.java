package lesson8;

public class Cats extends Animal{

    private static final String sound = "meow";

    public Cats(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return super.getName() + " говорит " + this.sound;
    }
}
