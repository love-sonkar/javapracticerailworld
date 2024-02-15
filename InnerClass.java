public class InnerClass {
    class Second {
        void msg() {
            System.out.println("Hi");
        }
    }

    void hii() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        InnerClass in = new InnerClass();
        InnerClass.Second second = in.new Second();
        second.msg();
    }

}
