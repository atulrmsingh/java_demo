import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		
		int num = sc.nextInt();
		System.out.println("prime factor of "+ num);
		for(int i =2; i<= num/2; i++) {
			
			if(num%i==0) {
				
				System.out.println(i);
			//	num/=i;
			}
			
			
			
		}
		
	}

}
