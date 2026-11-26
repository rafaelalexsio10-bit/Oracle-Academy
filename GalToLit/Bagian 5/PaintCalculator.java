
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter room height (feet): ");
        double height = input.nextDouble();

        System.out.print("Enter room length (feet): ");
        double length = input.nextDouble();

        System.out.print("Enter room width (feet): ");
        double width = input.nextDouble();

        // Calculate wall area and ceiling area
        double wallArea = 2 * height * (length + width);
        double ceilingArea = length * width;

        double totalArea = wallArea + ceilingArea;

        // Calculate paint buckets
        int bucket5 = (int) (totalArea / 1500);
        double remainingArea = totalArea % 1500;

        int bucket1 = (int) Math.ceil(remainingArea / 300);

        // Calculate total cost
        double totalCost = (bucket5 * 15) + (bucket1 * 4);

        System.out.println("\nTotal area: " + totalArea + " square feet");
        System.out.println("5-liter buckets: " + bucket5);
        System.out.println("1-liter buckets: " + bucket1);
        System.out.println("Total cost: $" + totalCost);

        input.close();
    }
}
