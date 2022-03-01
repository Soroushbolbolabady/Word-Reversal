import java.util.Scanner;

public class Words {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		String reverseWord = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word : ");
		
		String word = scanner.nextLine();
		
		
		for (int i = word.length() - 1 ; i >= 0 ; i-- ) {
			 reverseWord = reverseWord + word.charAt(i);
		
		}
		System.out.println("Reverse Your word is : " + reverseWord);

		
	}

}
