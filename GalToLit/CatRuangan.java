import java.util.Scanner;

public class CatRuangan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = input.nextDouble();

        // Luas dinding: 2 * (panjang * tinggi) + 2 * (lebar * tinggi)
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        // Luas langit-langit: panjang * lebar (tanpa lantai)
        double luasLangitLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangitLangit;

        System.out.println("Total luas yang harus dicat: " + totalLuas + " kaki persegi.");

        // Menghitung kebutuhan cat (Ember 5 liter = 1500 sq ft, Ember 1 liter = 300 sq ft)
        int jumlahEmber5L = (int) (totalLuas / 1500);
        double sisaLuas = totalLuas % 1500;

        int jumlahEmber1L = (int) Math.ceil(sisaLuas / 300);

        // Jika biaya ember 1L melebihi ember 5L, lebih baik ambil tambahan ember 5L
        if (jumlahEmber1L * 4 > 15) {
            jumlahEmber5L++;
            jumlahEmber1L = 0;
        }

        double totalBiaya = (jumlahEmber5L * 15) + (jumlahEmber1L * 4);

        System.out.println("Jumlah ember 5 liter yang dibeli: " + jumlahEmber5L);
        System.out.println("Jumlah ember 1 liter yang dibeli: " + jumlahEmber1L);
        System.out.println("Total biaya cat: $" + totalBiaya);
    }
}