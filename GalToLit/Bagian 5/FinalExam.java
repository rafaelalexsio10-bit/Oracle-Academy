
import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai rata-rata: ");
        double average = input.nextDouble();

        System.out.print("Berapa kali absen: ");
        int daysAbsent = input.nextInt();

        boolean exempt = false;

        if ((average >= 90 && daysAbsent <= 3) ||
            (average >= 80 && daysAbsent == 0)) {
            exempt = true;
        }

        if (exempt) {
            System.out.println("Congratulations! You are exempt from the final exam.");
        } else {
            System.out.println("You are not exempt from the final exam.");
        }

        input.close();
    }
}
