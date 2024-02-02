public class Constructor {
    public static void main(String[] args) {
        Car car1 = new Car(); // this will call default constructor
        Car car2 = new Car("Audi", 2); // this will call arguement constructor
        System.out.println("Car1 name: " + car1.name + " number: " + car1.number);
        System.out.println("Car2 name: " + car2.name + " number: " + car2.number);
    }

}