import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		String s= sc.next();
		
		if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") ||
				s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U")) {
			
			System.out.println("Characer is Vowel");
		}
		else {
			
			System.out.println("Character is Consonant");
		}
		
	}

}
