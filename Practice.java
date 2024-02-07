public class Practice {
    public static void main(String[] args) {
        GetterPractice gp = new GetterPractice("happy", 8);
        String name = gp.getName();
        int age = gp.getAge();
        System.out.println("This is getter : " + name + " " + age);
        SetterPractice sp = new SetterPractice();
        sp.SetName("happy Set");
        sp.SetAge(90);
        System.out.print("This is setter : ");
        sp.Display();
    }
}
