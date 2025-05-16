public class PowerCalculator {

    public static int power(int base, int exponent) {
        int result = 1;
        int i = 0;

        while (i < exponent) {
            result *= base;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;

        int result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}
