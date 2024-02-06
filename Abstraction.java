public class Abstraction {
    public static void main(String[] args) {
        TestTing2 test = new TestTing2("sonu nigam") {

            void address() {
                System.out.println("This is Address");
            }

            int sumTwo(int a, int b) {
                return a + b;
            }
        };

        int storeval = test.sumTwo(4, 4);
        test.name();
        System.out.println(storeval);
    }
}

abstract class TestTing {
    String name;

    TestTing(String name) {

        this.name = name;
    }

    abstract void address();

    void name() {
        System.out.println("This is " + name);
    }
}

abstract class TestTing2 extends TestTing {
    TestTing2(String name) {
        super(name);
    }

    abstract int sumTwo(int a, int b);

}