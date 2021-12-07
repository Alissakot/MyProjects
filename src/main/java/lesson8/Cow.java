package lesson8;

public class Cow extends Animal{
    public Cow(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public String getSound() {
        return super.getSound();
    }
}
