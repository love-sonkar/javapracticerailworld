import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number between 1 to 5 : ");
        int val = sc.nextInt();
        switch (val) {
            case 1:
                System.out.println("You enterd : " + val);
                break;
            case 2:
                System.out.println("You enterd : " + val);
                break;
            case 3:
                System.out.println("You enterd : " + val);
                break;
            case 4:
                System.out.println("You enterd : " + val);
                break;
            case 5:
                System.out.println("You enterd : " + val);
                break;
            default:
                System.out.println("This is Default one you Enterd : " + val);
                break;
        }
    }

}