package lesson9;

public final class Car extends Machine {
    private final int moveLimit = 500;

    @Override
    public void move(int distance) {
        if (distance > 0 & distance <= moveLimit) {
            System.out.println(super.modelName + " проехал " + distance + " километров");
        } else if (distance <= 0) {
            System.out.println(super.modelName + " не поехал");
        } else {
            System.out.println(super.modelName + " проехал только " + moveLimit + " километров");
        }
    }

    public Car(String name, String vin) {
        super(name, vin);
    }
}
