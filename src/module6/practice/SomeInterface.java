package module6.practice;

public interface SomeInterface {
    public default void draw() {
        System.out.println("draw method of SomeInterface");
    }
}
