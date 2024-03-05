package prototype;

public class Fox implements Cloneable {
    public enum Breed {
        BROWN,
        RED,
        MANDARIN
    }

    private Breed breed;
    private int age;

    public Fox(Breed breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    protected Fox clone() {
        try {
            return (Fox) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public String toString() {
        return "Fox{" +
                "breed=" + breed +
                ", age=" + age +
                '}';
    }
}
