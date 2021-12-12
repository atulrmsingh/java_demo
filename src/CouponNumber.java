import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	
	public static void coupon(int num) {
		int arr[]=new int[num+1];
		for(int i = 1; i<=num;i++) {
			Random rnd = new Random();
		    int number = rnd.nextInt(9999);
			
		arr[i] = number;
		System.out.println(arr[i]);
		}
	
		for(int i = 0; i < arr.length; i++) {  
         
			for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]+" Duplicate numbers");  
            }  
        }  
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How much coupon you want");
		int num = sc.nextInt();
		
		coupon(num);
		
	}

}
