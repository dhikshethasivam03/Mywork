public class Test {
    public static void main(String[] args) {

        int a = 3;

        int b = a++ * 5 + ++a * 2 - a++;

        System.out.println(a);
        System.out.println(b);
    }
}