import java.util.Scanner;

public class FinalExamExemption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your average: ");
        double average = scanner.nextDouble();

        System.out.print("How many classes have you missed? ");
        int daysAbsent = scanner.nextInt();

        boolean exempt = false;

        if (average >= 90) {
            if (daysAbsent <= 3) {
                exempt = true;
            }
        } else if (average >= 80) {
            if (daysAbsent == 0) {
                exempt = true;
            }
        }

        if (exempt) {
            System.out.println("Congratulations! You are exempt from the final exam.");
        } else {
            System.out.println("You are not exempt from the final exam.");
        }
    }
}