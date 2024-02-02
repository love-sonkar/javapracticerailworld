import java.util.Random;

public class Methods {
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.printEven(2);
        randomNum();

    }

    static void randomNum() { // this is static method
        Random ran = new Random();
        long num = ran.nextInt(333);
        System.out.println(num);
    }

    public void printEven(int val) { // this is non static method
        if (val % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
