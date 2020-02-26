import java.util.Scanner;

//hacker rank
public class Problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first array elements: ");
		// int n1 = scanner.nextInt();
		int arr1[] = new int[3];
		int arr2[] = new int[3];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner.nextInt();
		}
		// compareArray(arr1, arr2);
		// System.out.println(compareArray(arr1, arr2));
		int[] a = compareArray(arr1, arr2); // obtain the array
		for (int i = 0; i < a.length; i++) // for loop to print the array
			System.out.print(a[i] + " ");
	}

	private static int[] compareArray(int[] arr1, int[] arr2) {
		int count = 0;
		int count1 = 0;
		int[] temp = new int[2];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i == j) {
					if (arr1[i] == arr2[j]) {
						break;
					}

					if (arr1[i] > arr2[j]) {
						count++;
						temp[0] = count;
					}

					if (arr1[i] < arr2[j]) {
						count1++;
						temp[1] = count1;
					}
				}

			}

		}
		// temp[0] = count;
		// temp[1] = count1;
		return temp;

	}

}
