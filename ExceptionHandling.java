public class ExceptionHandling {
    public static void main(String[] args) {
        ThrowMethods tm = new ThrowMethods();
        try {
            tm.checkAge(19);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
