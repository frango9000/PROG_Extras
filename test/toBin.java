package test;

//@author fsancheztemprano
public class toBin {

    public static void main(String[] args) {
        System.out.println(todec("1111111"));
        System.out.println(tobin(254));

    }

    public static String tobin(int i) {
        return Integer.toBinaryString(i);
    }

    public static int todec(String i) {
        return Integer.parseInt(i, 2);
    }

}
