package lesson11;

public class Truck extends Auto {

    private static final String className = "грузовой автомобиль";
    private static final int MinSpeed = 40;
    private static final int MaxSpeed = 120;
    private static final int MinWeight = 3000;
    private static final int MaxWeight = 10000;
    private static final int MinLength = 500;
    private static final int MaxLength = 2500;
    private static final int MinWidth = 160;
    private static final int MaxWidth = 250;
    private static final int MinHeight = 250;
    private static final int MaxHeight = 400;


    public void truckRandom() {
        super.setNumber((int) (Math.random() * 1000000));
        super.setSpeed((int) ((Math.random() * (MaxSpeed - MinSpeed)) + MinSpeed));
        super.setWeight((int) ((Math.random() * (MaxWeight - MinWeight)) + MinWeight));
        super.setLength((int) ((Math.random() * (MaxLength - MinLength)) + MinLength));
        super.setWidth((int) ((Math.random() * (MaxWidth - MinWidth)) + MinWidth));
        super.setHeight((int) ((Math.random() * (MaxHeight - MinHeight)) + MinHeight));

    }

    public String getClassName() {
        return className;
    }
}
