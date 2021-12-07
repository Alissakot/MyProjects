package lesson8;

public class Parrot extends Animal{
    public Parrot(String name, int age, String sound) {
        super(name, age, sound);
    }
    @Override
    public String getSound() {
        return super.getSound();
    }
}
