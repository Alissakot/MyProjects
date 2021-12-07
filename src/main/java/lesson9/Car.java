package lesson9;

public class Car extends Machine {
    private final int moveLimit = 1000;
    @Override
    protected void move(int distance) {
        if (distance > 0 & distance <= moveLimit){
            System.out.println(super.modelName + " проехал " + distance + " километров");
        }
        else if (distance <= 0){
            System.out.println(super.modelName + " не поехал");
        }
        else {
            System.out.println(super.modelName + " проехал " + moveLimit + " километров");
        }
    }
    public Car(String name, String vin) {
        super(name, vin);
    }
}
