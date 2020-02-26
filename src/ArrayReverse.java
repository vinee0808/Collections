import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Enter the elements of array: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();

		}
		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println("Reverse of array: ");
		for (int i = arr.length - 1; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
