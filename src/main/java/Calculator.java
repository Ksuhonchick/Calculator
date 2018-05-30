public class Calculator {
    static byte a = 0;
    static short a1 = 1;
    static int a2 = 2;
    static int a3 = 3;
    static int a4 = 4;
    static int a5 = 5;
    static int a6 = 6;
    static long a7 = 7;
    static long a8 = 8;
    static int  a9 = 9;
    static double b = 0.1;
    static double b1 = 1.2;
    static double b3 = 3.5;

    public static void main(String[] args) {
        sum1();
        sum2();
        subtraction1();
        subtraction2();
        multiple1();
        divide1();
    }
    public static int sum1() {
        return a2 + a3;
    }
    public static int sum2() {
        return a + a1;
    }
    public static double subtraction1() {
        return b3 - b1;
    }
    public static long subtraction2() {
        return a9 - a;
    }
    public static long multiple1() {
        return a1 * a8;
    }
    public static double divide1() {
        return b3 / a2;
    }
}
