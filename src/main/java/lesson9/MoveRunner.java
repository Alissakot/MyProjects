package lesson9;

public class MoveRunner {
    public static void main(String[] args) {
        Car vaz = new Car("девятка", "1ф2т2ллдд3ж");
        Car tesla = new Car("model 3", "33nrjk567h8l54l");
        Tracktor belorus = new Tracktor("белорусь", "3ап4млв8с");
        Tracktor uralets = new Tracktor("уралец", "56ас6в8гн");

        Machine[] avtomobili = new Machine[] {vaz, tesla, belorus, uralets};
        for (Machine avto : avtomobili){
            avto.move(5000);
        }
    }
}
