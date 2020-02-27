import java.util.Scanner;

public class MinAndMax_Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = scanner.nextInt();

		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		int min = arr[0], max = arr[0], minIndex = 0, maxIndex = 0;
		for (int j = 0; j < arr.length; j++) {
			if (min > arr[j]) {
				min = arr[j];
				minIndex = j;
			}
			if (max < arr[j]) {
				max = arr[j];
				maxIndex = j;
			}
		}
		System.out.println("Max value= " + max + " at index " + maxIndex);
		System.out.println("Min value= " + min + " at index " + minIndex);
	}

}
