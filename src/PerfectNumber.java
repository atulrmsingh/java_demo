
public class PerfectNumber {
	public static void main(String[] args) {
		
		int n=28;
		int s=0;
		for(int i=1; i<=n/2; i++) {
			
			if(n%i==0) {
				s = s+i;
				
			}
			
		}
	if(n==s) {
		System.out.println(n+" is a perfect number");
	}
	else {
		
		System.out.println(n+" is not a perfect number");
	}
	}
	

}
