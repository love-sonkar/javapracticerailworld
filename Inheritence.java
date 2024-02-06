public class Inheritence {
    public static void main(String[] args) {
        Beta b = new Beta();
        System.out.println(b.name);
        System.out.println(b.surname);
        Pita parent = new Pita();
        System.out.println(parent.name);
        System.out.println(parent.surname);
    }
}

class Dada {
    String name = "Berlin";
    String surname = "Professor";
}

class Pita extends Dada {
    String name = "Sergio";
}

class Beta extends Pita {
    String name = "Rafael";
}