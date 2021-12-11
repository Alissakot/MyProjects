package lesson8;

public class Dogs extends Animal{

    private static final String sound = "woof";

    protected Dogs(String name, int age) {
        super(name, age);
    }
    @Override
    protected String getSound() {
        return super.getName() + " говорит " + this.sound;
    }
}
