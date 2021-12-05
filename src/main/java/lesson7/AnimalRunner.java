package lesson7;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик", 3);
        Cat Gavryusha = new Cat("Гаврюша", 2);
        Tiger Petya = new Tiger("Петя", 5);
        animalSetter(Bobik, Gavryusha, Petya, 1200, 600);

    }

    public static void animalSetter(Dog animal1, Cat animal2, Tiger animal3, int runLength, int swimLength) {
        animal1.runner("бежать", 300);
        animal2.runner("плыть", 800);
        animal3.runner("сидеть", 0);
    }
}

