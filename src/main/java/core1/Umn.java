package core1;

public class Umn {

    public static int result(int a, int b) {
        int umn = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            umn += Math.abs(a);
        }
        if (a < 0 && b > 0 || a > 0 && b < 0) umn -= umn + umn;
        return umn;
    }

    public static void main(String[] args) {
        System.out.println(result(Integer.MAX_VALUE, 4));
        System.out.println(result(-2, Integer.MAX_VALUE));
        System.out.println(result(Integer.MAX_VALUE, -Integer.MAX_VALUE));
        System.out.println(result(-2, -4));
    }
}
