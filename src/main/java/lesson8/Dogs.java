package lesson8;

public class Dogs extends Animal{

    private static final String sound = "woof";

    public Dogs(String name, int age) {
        super(name, age);
    }
    @Override
    public String getSound() {
        return super.getName() + " говорит " + this.sound;
    }
}
