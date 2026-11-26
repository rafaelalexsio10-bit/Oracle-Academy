public class Animal {
    private int speed;
    private int weight;
    private int age;

    public Animal() {
        this(0, 0, 0);
    }

    public Animal(int speed, int weight, int age) {
        this.speed = speed;
        this.weight = weight;
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
