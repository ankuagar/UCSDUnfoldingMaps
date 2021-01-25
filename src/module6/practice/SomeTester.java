package module6.practice;

public class SomeTester {
    public static void main(String[] args) {
        SomeInterface s1 = new SomeClass1();
        SomeInterface s2 = new SomeClass2();
        s1.draw();
        s2.draw();
    }
}
