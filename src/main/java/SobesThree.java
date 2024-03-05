public class SobesThree {
    public static void main(String[] args) {
        Integer a = Integer.MAX_VALUE;
        Integer b = Integer.MAX_VALUE;
        Integer c = a * b;
        Long l = Long.valueOf(a) * Long.valueOf(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(Long.MAX_VALUE);
    }
}
