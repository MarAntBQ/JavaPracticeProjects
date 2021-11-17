import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		int aLength = arr.length;
		aLength = aLength - 1;
		for (int i = aLength; i >= 0; i--) {
			System.out.print(arr[i]);
		}		
	}
}