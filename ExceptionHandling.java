import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        ThrowMethods tm = new ThrowMethods();
        // tm.tryWithResourceMethod();
        try {
            FileReader fr = new FileReader("test.text");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
