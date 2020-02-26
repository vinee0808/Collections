import java.util.Scanner;
// sum of big numbers
public class Problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextLong();
		}
		aVeryBigSum(arr);
		System.out.println(aVeryBigSum(arr));
	}

	private static long aVeryBigSum(long[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}
}
