import java.util.Scanner;

public class TransportasiSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kapasitasBus = 45;

        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalPendaftar = input.nextInt();

        int jumlahBus = totalPendaftar / kapasitasBus;
        int naikVan = totalPendaftar % kapasitasBus;

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total orang yang harus naik van: " + naikVan);
    }
}