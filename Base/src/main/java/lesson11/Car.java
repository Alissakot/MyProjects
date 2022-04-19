package lesson11;

public class Car extends Auto {

    private static final String className = "легковой автомобиль";
    private static final int MinSpeed = 40;
    private static final int MaxSpeed = 200;
    private static final int MinWeight = 600;
    private static final int MaxWeight = 3000;
    private static final int MinLength = 200;
    private static final int MaxLength = 400;
    private static final int MinWidth = 100;
    private static final int MaxWidth = 150;
    private static final int MinHeight = 120;
    private static final int MaxHeight = 180;


    public void carRandom() {
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



