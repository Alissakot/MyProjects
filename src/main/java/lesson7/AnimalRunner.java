package lesson7;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик", 3, 500, 10);
        Cat Gavryusha = new Cat("Гаврюша", 2 , 200, 0);
        Tiger Petya = new Tiger("Петя", 5, 1000, 400);
        animalSetter(Bobik, Gavryusha, Petya, 1200, 600);
        System.out.println("Бобик пробежал " + Bobik.getRun() + " метров" + " и проплыл " + Bobik.getSwim() + " метров");
        System.out.println("Гаврюша пробежал " + Gavryusha.getRun() + " метров" + " и " + Gavryusha.getSwim());
        System.out.println("Петя пробежал " + Petya.getRun() + " метров" + " и проплыл " + Petya.getSwim() + " метров");

    }
    public static void animalSetter(Dog animal1, Cat animal2, Tiger animal3, int runLength, int swimLength){
        animal1.setRunSwim(runLength, swimLength);
        animal2.setRunSwim(runLength, swimLength);
        animal3.setRunSwim(runLength, swimLength);
    }
    }

