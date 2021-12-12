import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("press any key to start");
		String s = sc.next();
		
		System.out.println("time started");
		Long start = System.currentTimeMillis();
		System.out.println("press any key to stop");
		String s1 = sc.next();
		
		System.out.println("Stoped");
		Long stop = System.currentTimeMillis();
		Long elapsed = stop-start;
		
		System.out.println("Elapsed time is "+elapsed+"ms");
	}

}
