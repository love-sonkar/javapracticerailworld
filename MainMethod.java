public class MainMethod {
    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight("red", 10);
        System.out.println(tl.checkRed());
        tl.setColor("Green");
        System.out.println(tl.checkGreen());
    }

}
