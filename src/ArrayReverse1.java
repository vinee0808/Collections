import java.util.Scanner;

//swap first and last elements and so on...
public class ArrayReverse1 {
	public static void main(String args[]) {
		int counter, i = 0, j = 0, temp;

		Scanner scanner = new Scanner(System.in);
		System.out.print("How many elements you want to enter: ");
		counter = scanner.nextInt();
		int number[] = new int[counter];
		System.out.println(i);
		for (i = 0; i < counter; i++) {
			System.out.print("Enter Array Element" + (i + 1) + ": ");
			number[i] = scanner.nextInt();
			System.out.println(i);
		}
		System.out.println(i);
		j = i - 1;
		System.out.println(j);
		i = 0;
//		scanner.close();
		while (i < j) {
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			i++;
			j--;
		}

		System.out.print("Reversed array: ");
		for (i = 0; i < counter; i++) {
			System.out.print(number[i] + "  ");
		}
	}

}
