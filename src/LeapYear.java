import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year in YYYY formate");
		int num = sc.nextInt();
		
		if(num%4==0) {
			System.out.println(num+" is a leap year");
		}
		else {
			System.out.println(num+" is not a leap year");
		}
		
	}

}
