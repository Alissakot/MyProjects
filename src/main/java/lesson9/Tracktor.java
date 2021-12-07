package lesson9;

public class Tracktor extends Machine{
    private final int moveLimit = 10000;
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
    public Tracktor(String name, String vin) {
        super(name, vin);
    }
}
