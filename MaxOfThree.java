public class MaxOfThree {

    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 42;
        int num3 = 17;

        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
    }
}
