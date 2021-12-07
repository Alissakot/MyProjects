package lesson9;

public class MoveRunner {
    public static void main(String[] args) {
        Car vaz = new Car("девятка", "1ф2т2ллдд3ж");
        Car tesla = new Car("model 3", "33nrjk567h8l54l");
        Tracktor belorus = new Tracktor("белорусь", "3ап4млв8с");
        Tracktor uralets = new Tracktor("уралец", "56ас6в8гн");
        Car vw = new Car("фольцваген", "1ф2т2олдд90ж");
        Car nissan = new Car("ниссан", "3вап7роьб8l54l");
        Car opel = new Car("опель", "1ф2т4кепмит8шгот3ж");
        Car ford = new Car("форд", "33nrjk3увами9шлl54l");
        Car lexus = new Car("лексус", "wsxf6yh9ikr");
        Car bmw = new Car("бмв", "3esx6ty8irt7u");

        Machine[] avtomobili = new Machine[] {vaz, tesla, belorus, uralets, vw, nissan, opel, ford, lexus, bmw};
        for (Machine avto : avtomobili){
            int count = (int) (Math.random() * 1000);
            avto.move(count);
        }
    }
}
