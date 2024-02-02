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

		for (int i = 0; i <= val; i++) {
			if (i == 2) {
				System.out.println("first assing");
			}
			// if (i != 1) {
			// System.out.println("seccond");
			// }
			if (i % 2 == 0) {
				System.out.println("even");
			}
			if (i % 2 == 0 && i % 10 == 0) {
				System.out.println("testing and oprator");
			}
		}

	}

}
