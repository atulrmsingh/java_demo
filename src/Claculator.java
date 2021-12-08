import java.util.Scanner;

public class Claculator {
	
	public static Double add(Double a, Double b) {
		Double sum=a+b;
		return sum;
		}
	
	public static Double subs(Double a, Double b) {
		Double sum=a-b;
		return sum;
		}
	
	public static Double mult(Double a, Double b) {
		Double sum=a*b;
		return sum;
		}
	
	public static Double div(Double a, Double b) {
		Double sum=a/b;
		return sum;
		}
	
	
		public static void main(String[] args) {
			
			System.out.println("enter two numbers");
			
			Scanner sc = new Scanner(System.in);
			Double num1 = sc.nextDouble();
			Double num2 = sc.nextDouble();
			
			Double sum1 = add(num1,num2);
			Double sum2 = subs(num1,num2);
			Double sum3 = mult(num1,num2);
			Double sum4 = div(num1,num2);
			System.out.println("addition  "+sum1 + " substraction "+ sum2 + " multiplication "+ sum3 +  " diverson "+ sum4);
			
}
}
