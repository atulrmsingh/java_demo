import java.util.Random;
import java.util.Scanner;


public class FlipCoin {
	public static void main(String[] args) {

		int head = 0;
		int tail = 0;
		Scanner sc = new Scanner(System.in);          
		System.out.println("enter a positive number");
		int num = sc.nextInt();
		for(int i=1; i<= num; i++) {
			Random r = new Random();
			
			double start = 0;
			double end = 1;
			double random = r.nextDouble();
			
			
		if(random < 0.5) {        
			tail++;
		}
		else {
			head++;
		}
				
		}
		System.out.println("Head count "+head + " Tail count "+tail );
		
		
		double phead = (head*100)/num;
		double ptail = (tail*100)/num;
		System.out.println("Head percent  "+phead+" % "+ "  Tail percent "+ptail+" % ");
		
	}

}
