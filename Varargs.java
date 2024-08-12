import java.lang.reflect.Array;

public class Varargs {
    public static void main(String[] args) {
        fun(2, 3);
        fun(3, 5, 8, 9);
    }

    static void fun(int... n) {
        System.out.println(n);
    }

    static void fun(int a, int b) {
        System.out.println("sum: " + (a + b));
    }

}
