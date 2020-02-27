import java.util.Scanner;

//swap values
public class StringReverse1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = scanner.nextLine();
		char[] str = string.toCharArray();
		int  j;
		char temp = ' ';
		int i = str.length;
//	
//		for (i = 0; i < str.length; i++) {
//		
//		}
		j = i - 1;
		i = 0;
		while (i < j) {
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		for (char c : str) {
			System.out.print(c);

		}
	}

}
