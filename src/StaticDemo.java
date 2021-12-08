
public class StaticDemo {

	    static int a = 0;
	    public StaticDemo(){
	        a++;
	        System.out.println(a);
	    }
	    public static void main(String[] args) {//start of program
	        StaticDemo s1 = new StaticDemo();
	        StaticDemo s2 = new StaticDemo();
	        StaticDemo s3 = new StaticDemo();
	    }
	}
