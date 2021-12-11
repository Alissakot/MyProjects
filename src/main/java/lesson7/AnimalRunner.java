package lesson7;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик", 3);
        Cat Gavryusha = new Cat("Гаврюша", 2);
        Tiger Petya = new Tiger("Петя", 5);

        Bobik.run(300);
        Bobik.swim(600);
        Gavryusha.run(300);
        Gavryusha.swim(100);
        Petya.run(500);
        Petya.swim(0);
    }
}

