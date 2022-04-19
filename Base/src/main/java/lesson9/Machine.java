package lesson9;

public abstract class Machine {
    protected String modelName;
    protected String vin;

    protected Machine(String name, String vin) {
        this.modelName = name;
        this.vin = vin;
    }

    protected abstract void move(int distance);
}
