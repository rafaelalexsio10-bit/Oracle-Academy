
import java.util.Scanner;

public class OperasiSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double b = input.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Tidak bisa dibagi nol");
                }
                break;
            case '%':
                System.out.println("Hasil: " + (a % b));
                break;
            default:
                System.out.println("Operator tidak valid");
        }

        input.close();
    }
}
