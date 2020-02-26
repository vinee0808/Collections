import java.util.Scanner;
// store the reverse elements in another array
public class ArrayReverse3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		printArray(arr, n);
		reverseArray(arr, n);

	}

	private static void printArray(int[] arr, int n) {
		System.out.println("Print array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverseArray(int[] arr, int n) {

		int[] revArr = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			revArr[j - 1] = arr[i];
			j--;
		}
		System.out.println();
		System.out.println("Print reverse array: ");
		for (int k = 0; k < n; k++) {
			System.out.print(revArr[k] + " ");
		}
	}

}
