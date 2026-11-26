import java.util.Scanner;

public class DecodePesan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder pesan = new StringBuilder();
        int jumlahValid = 0;

        System.out.println("Masukkan 10 angka kode (1-7) satu per satu:");

        while (jumlahValid < 10) {
            System.out.print("Angka ke-" + (jumlahValid + 1) + ": ");
            int kode = input.nextInt();

            switch (kode) {
                case 1:
                    pesan.append("D");
                    jumlahValid++;
                    break;
                case 2:
                    pesan.append("W");
                    jumlahValid++;
                    break;
                case 3:
                    pesan.append("E");
                    jumlahValid++;
                    break;
                case 4:
                    pesan.append("L");
                    jumlahValid++;
                    break;
                case 5:
                    pesan.append("H");
                    jumlahValid++;
                    break;
                case 6:
                    pesan.append("O");
                    jumlahValid++;
                    break;
                case 7:
                    pesan.append("R");
                    jumlahValid++;
                    break;
                default:
                    System.out.println("Angka belum terpecahkan! Masukkan angka baru (1-7).");
                    break;
            }
        }

        System.out.println("\nPesan yang telah diuraikan: " + pesan.toString());
        input.close();
    }
}