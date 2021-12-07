package lesson7;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик", 3);
        Cat Gavryusha = new Cat("Гаврюша", 2);
        Tiger Petya = new Tiger("Петя", 5);
        Bobik.runner("бежать", 300);
        Gavryusha.runner("плыть", 300);
        Petya.runner("сидеть", 0);
    }
}

