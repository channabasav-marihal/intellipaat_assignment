package module6;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		String string;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String : ");
		string = scan.nextLine();
		scan.close();
		char str[] = string.toCharArray();
		for (i = 0; i < str.length; i++) {
			str[i] = (char) ((int) str[i] + 32);
		}
		System.out.print("Lower Case : ");
		for (i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	
	}

}
