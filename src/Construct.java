
class Student{
	
	String name;
	int age;
	
	public void printinfo() {      // non para construct
		
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	/*Student( Student s2){   //copy construct
		this.name=s2.name;
		this.age=s2.age;
	}
	Student(){
		
	}*/
	
	Student(String name, int age){   //para construct
		this.name=name;
		this.age=age;
	}
}

public class Construct {
	public static void main(String[] args) {
		
		Student s1 = new Student("atul", 24);   // para construct
		
/*		Student s1 = new Student();
		s1.name="atul";
		s1.age=26;  */    //non para construct
		//Student s2=new Student(s1);		//copy construct
		s1.printinfo();
	}
}
