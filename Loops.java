import java.util.Scanner;

class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print : ");
        int val = sc.nextInt();
        for (int i = 1; i <= val; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int j = 1;
        while (j <= val) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        int z = 1;
        do {
            System.out.print(z + " ");
            z++;
        } while (z <= val);
        sc.close();
    }

}