import java.util.Scanner;
public class Assignment{

    public static int addNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = addNumbers(num1, num2);
   
        System.out.println("The sum is: " + result);

        scanner.close();
    }
}






