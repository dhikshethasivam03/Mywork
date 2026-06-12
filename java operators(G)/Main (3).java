public class Test {
    public static void main(String[] args) {

        int a = 10;

        boolean result =
                (a++ > 10) &&
                (++a > 12) ||
                (a++ < 20);

        System.out.println(a);
        System.out.println(result);
    }
}