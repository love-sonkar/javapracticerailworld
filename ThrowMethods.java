import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

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
        // try {
        // FileReader fr = new FileReader("test.text");
        // Scanner sc = new Scanner(fr);
        // while (sc.hasNextLine()) {
        // System.out.println(sc.nextLine());
        // }
        // sc.close();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        try (FileReader fr = new FileReader("test.text")) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
