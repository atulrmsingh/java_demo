class Shape{
	
	String color;
	int len;
}

class Box extends Shape{ //single level inheritance 
      void area(int l, int h) {
    	  
    	  System.out.println("single level exp.");
      }	
	
}
class Tri extends Box{
	void area(int l, int h) {
		System.out.println("multilevel exp.");
	}

	
}


public class OOPS {
	public static void main(String[] args) {
		
		
		Box b= new Box();
		b.color="black";
		b.len=10;
		System.out.println(b.color+ " " +b.len);
	}

}
