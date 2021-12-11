import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		double val=0.0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
							
		if(num==0) {
			System.out.println("value can not be 0");
		}
		
		else {
			for(int i=1; i <=num; i++ ) {

			val = val + (1.0/i);
			System.out.println("1/"+i+" = "+val);
			}	
			System.out.println("Nth Harmonic Value is "+val);
			
			
		}	
			
		
	}
	

}
