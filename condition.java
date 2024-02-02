import java.util.Scanner;

class condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int val = sc.nextInt();
		if (val >= 18) {

			System.out.println("you are good to go");
		} else {
			System.out.println("not you bro stop here");
		}

	}

}
