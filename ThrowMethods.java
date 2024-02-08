import java.io.FileReader;

public class ThrowMethods {
    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // multi exception handling

    void multiException() {
        int[] arr = { 1, 3 };
        int val = 4 / 0;
        try {
            // System.out.println(arr[3]);
            System.out.println(val);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    void tryWithResourceMethod() {
        try {
            FileReader fr = new FileReader("test.text");

            System.out.println("hi test");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // try (FileReader fr = new FileReader("test.text")) {
        // fr.read();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
    }

}
