package lesson2;

public class math {

    public static void main(String[] args) {

        System.out.println(sum(5,3));
        System.out.println(minus(10,12));
        System.out.println(multi(4,6));
        System.out.println(dif(12,3));

    }

    public static int sum(int arg1, int arg2) {

        int sum = arg1 + arg2;
        return sum;

    }

    public static int minus(int arg1, int arg2) {

        int minus = arg1 - arg2;
        return minus;
    }

    public static int multi(int arg1, int arg2) {

        int multi = arg1 * arg2;
        return multi;
    }

    public static int dif(int arg1, int arg2) {

        int dif = arg1 / arg2;
        return dif;
    }

}
