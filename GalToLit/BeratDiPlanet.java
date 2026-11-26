import java.util.Scanner;

public class BeratDiPlanet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan Anda di Bumi (lbs): ");
        double beratBumi = input.nextDouble();

        System.out.println("\nPilih Planet:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Masukkan pilihan nomor planet (1-7): ");
        int pilihan = input.nextInt();

        String namaPlanet = "";
        double faktorKonversi = 0;

        switch (pilihan) {
            case 1:
                namaPlanet = "Merkurius";
                faktorKonversi = 0.38;
                break;
            case 2:
                namaPlanet = "Venus";
                faktorKonversi = 0.91;
                break;
            case 3:
                namaPlanet = "Mars";
                faktorKonversi = 0.38;
                break;
            case 4:
                namaPlanet = "Jupiter";
                faktorKonversi = 2.36;
                break;
            case 5:
                namaPlanet = "Saturnus";
                faktorKonversi = 0.92;
                break;
            case 6:
                namaPlanet = "Uranus";
                faktorKonversi = 0.89;
                break;
            case 7:
                namaPlanet = "Neptunus";
                faktorKonversi = 1.13;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }

        double beratPlanet = beratBumi * faktorKonversi;
        System.out.println("Your weight on " + namaPlanet + " is " + beratPlanet + " lbs.");
    }
}