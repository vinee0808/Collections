import java.util.Scanner;

public class SmallestAndSecondSmallest_Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int min = arr[0], secondMin = arr[0];
		for (int j = 0; j < arr.length; j++) {

			if (min > arr[j]) {
				secondMin = min;
				min = arr[j];

			} else if (secondMin > arr[j]) {
				secondMin = arr[j];
			}
		}
		System.out.println("Minimum: " + min);
		System.out.println("secondMin: " + secondMin);
	}

}
