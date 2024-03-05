package prototype;

public class Main {
    public static void main(String[] args) {
        Fox fox1 = new Fox(Fox.Breed.RED, 2);
        Fox fox2 = fox1.clone();

        System.out.println(fox1);
        System.out.println(fox2);
    }
}
