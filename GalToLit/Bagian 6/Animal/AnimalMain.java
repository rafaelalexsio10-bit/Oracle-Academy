public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal(); // Menggunakan constructor default
        Animal animal2 = new Animal(50, 120, 25); // Menggunakan constructor berparameter

        System.out.println("Animal #1 memiliki kecepatan: " + animal1.getSpeed() + " mil per jam");
        System.out.println("Animal #2 memiliki kecepatan: " + animal2.getSpeed() + " mil per jam");
    }
}