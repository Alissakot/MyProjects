package lesson8;

public class Cats extends Animal{

    public Cats(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public String getSound() {
        return super.getSound();
    }
}
