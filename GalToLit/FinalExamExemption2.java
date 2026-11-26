import java.util.Scanner;

public class FinalExamExemption2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your average: ");
        double average = scanner.nextDouble();

        System.out.print("How many classes have you missed? ");
        int daysAbsent = scanner.nextInt();

        boolean exempt = (average >= 90 && daysAbsent <= 3)
                      || (average >= 80 && daysAbsent == 0);

        if (exempt) {
            System.out.println("Congratulations! You are exempt from the final exam.");
        } else {
            System.out.println("You are not exempt from the final exam.");
        }

        scanner.close();
    }
}
