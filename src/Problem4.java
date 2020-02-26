import java.util.Scanner;

//difference in the sum of the diagonals
public class Problem4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();

		int arr[][] = new int[r][r];
		// int arr[][] = { { 1, 2 }, { 5, 6 }, };

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (i == j) {
					sum1 += arr[i][j];
				}
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (i == r - j - 1) {
					sum2 += arr[i][j];
				}

			}
		}
		int diff = sum1 - sum2;
		diff = Math.abs(diff);
		System.out.println(diff);
	}
}
