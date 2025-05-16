import java.util.Scanner;

public class PrintOneToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        int i = 1; // Starting number

        System.out.println("Numbers from 1 to " + n + ":");
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        scanner.close();
    }
}
