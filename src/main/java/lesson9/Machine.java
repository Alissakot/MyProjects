package lesson9;

public abstract class Machine {
    public String modelName;
    public String vin;
    protected abstract void move(int distance);

    public Machine(String name, String vin) {
        this.modelName = name;
        this.vin = vin;
    }

    public String getModelName() {
        return modelName;
    }
}
