import java.util.Scanner;

public class ArrayReverse2 {
	public static void main(String[] args) {
		int i, j, temp;
		System.out.println("Enter the number of elements: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Enter the elements of array: ");
		int array[] = new int[n];
		for (i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		j = i - 1;
		i = 0;

		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
			i++;
		}
		System.out.println("Reverse of an array: ");
		for (int k = 0; k < n; k++) {
			System.out.print(array[k] + " ");
		}

	}

}
