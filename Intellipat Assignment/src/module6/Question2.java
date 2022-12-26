package module6;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		String str="";
		String reverse="";
		int i;
		int length = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String : ");
		str = scan.nextLine();
		length = str.length();
		
		for(i=length-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);
		}
	System.out.println("Reversed : "+reverse);
	}
	
}
