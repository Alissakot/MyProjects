package lesson8;

public abstract class Animal {
    private String name;
    private int age;
    private String sound;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract String getSound();

    protected String getName(){
        return this.name;
    }
}
