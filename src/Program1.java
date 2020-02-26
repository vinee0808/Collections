import java.util.Scanner;

public class Program1 {
// print index of a number in an array
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int n1 = scanner.nextInt();
		StringBuffer sb = new StringBuffer();
		while (n1 > 0) {
			System.out.println("Enter the number of elements: ");
			int n2 = scanner.nextInt();
			int[] arr = new int[n2];
			System.out.println("Enter the elements: ");
			for (int i = 0; i < n2; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println("Enter the element to be searched: ");
			int n3 = scanner.nextInt();

			sb.append(indexNumber(arr, n3, n2) + "\n");

			n1--;
		}
		System.out.print(sb);

	}

	private static int indexNumber(int[] arr, int n3, int n2) {
		for (int i = 0; i < n2; i++) {
			if (arr[i] == n3) {
				return i;
			}
		}
		return -1;
	}

}
