import java.util.Scanner;

    public class Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter marks out of 100: ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        scanner.close();
    }
}

