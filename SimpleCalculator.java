public class SimpleCalculator {

    public static int calculate(int a, int b, char operator)
     {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0; // or throw an exception
                }
            default:
                System.out.println("Error: Invalid operator");
                return 0;
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("10 + 5 = " + calculate(num1, num2, '+'));
        System.out.println("10 - 5 = " + calculate(num1, num2, '-'));
        System.out.println("10 * 5 = " + calculate(num1, num2, '*'));
        System.out.println("10 / 5 = " + calculate(num1, num2, '/'));
        System.out.println("Invalid operator test: " + calculate(num1, num2, '%'));
    }
}
