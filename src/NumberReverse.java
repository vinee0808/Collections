import java.util.Scanner;

public class NumberReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		int a, revNumber = 0;
		int temp = number;
		while (number > 0) {
			a = number % 10;
			number = number / 10;
			revNumber = 10 * revNumber + a;
		}

		System.out.println("Reverse of number " + temp + " is " + revNumber);
	}

}
