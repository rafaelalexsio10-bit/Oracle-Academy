import java.util.Arrays;
import java.util.Scanner;

public class CekAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string pertama: ");
        String str1 = input.nextLine();

        System.out.print("Masukkan string kedua: ");
        String str2 = input.nextLine();

        // Menghapus semua spasi dan tanda baca (hanya menyisakan huruf), lalu ubah ke huruf kecil
        String bersih1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String bersih2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Cek apakah jumlah panjang hurufnya sama
        if (bersih1.length() != bersih2.length()) {
            System.out.println("Hasil: Bukan anagram.");
        } else {
            // Ubah string menjadi array karakter lalu diurutkan (sorting)
            char[] array1 = bersih1.toCharArray();
            char[] array2 = bersih2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            // Bandingkan kedua array karakter tersebut
            if (Arrays.equals(array1, array2)) {
                System.out.println("Hasil: Kedua string adalah ANAGRAM.");
            } else {
                System.out.println("Hasil: Bukan anagram.");
            }
        }

        input.close();
    }
}