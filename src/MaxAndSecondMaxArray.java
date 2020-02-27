import java.util.Scanner;

public class MaxAndSecondMaxArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements of an array: ");
		int n = scanner.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = arr[0], secondMax = arr[0];
		int index = 0, index1=0;
		for (int j = 0; j < arr.length; j++) {

			if (max < arr[j]) {
				secondMax = max;
				max = arr[j];
				index = j;
			} else if (secondMax < arr[j] && arr[j] != max) {
				secondMax = arr[j];
				 index1 = j;

			}
		}

		System.out.println(max + " at index " + index);
		System.out.println(secondMax + " at index " + index1);
	}

}
