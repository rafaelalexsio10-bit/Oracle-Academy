import java.util.Scanner;

public class SeleksiUniversitas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda valedictorian atau salutatorian? (true/false): ");
        boolean isTopStudent = input.nextBoolean();

        System.out.print("Masukkan jumlah siswa di sekolah Anda: ");
        int jumlahSiswaSekolah = input.nextInt();

        System.out.print("Masukkan nilai GPA Anda: ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan skor SAT Anda: ");
        int sat = input.nextInt();

        boolean diterima = false;

        if (isTopStudent && jumlahSiswaSekolah >= 1400) {
            diterima = true;
        } else if (gpa >= 4.0 && sat >= 1100) {
            diterima = true;
        } else if (gpa >= 3.5 && sat >= 1300) {
            diterima = true;
        } else if (gpa >= 3.0 && sat >= 1500) {
            diterima = true;
        }

        if (diterima) {
            System.out.println("Selamat! Anda diterima di Mountville University.");
        } else {
            System.out.println("Mohon maaf, Anda belum memenuhi kriteria penerimaan.");
        }
    }
}