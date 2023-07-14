import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.printf("byte minimum = %s, maximum = %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short minimum = %s, maximum = %s%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int minimum = %s, maximum = %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        float f =  123.45666777777F;
        double d = 1235.66777888;
        System.out.println("f is ");

        BigDecimal z = new BigDecimal("123.34243535466666666666666666666666666");
        System.out.printf("z is %.99f %n", z);
}
}
