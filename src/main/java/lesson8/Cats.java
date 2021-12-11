package lesson8;

public class Cats extends Animal{

    private static final String sound = "meow";

    protected Cats(String name, int age) {
        super(name, age);
    }

    @Override
    protected String getSound() {
        return super.getName() + " говорит " + this.sound;
    }
}
