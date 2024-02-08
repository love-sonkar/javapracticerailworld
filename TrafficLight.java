public class TrafficLight {
    String color;
    int duration;

    TrafficLight(String color, int duration) {
        this.color = color.toLowerCase();
        this.duration = duration;
    }

    void setColor(String color) {
        this.color = color.toLowerCase();
    }

    boolean checkRed() {
        return color.equals("red");
    }

    boolean checkGreen() {
        return color.equals("green");
    }

}
