package JavaConcepts;

public class DemoClass {
	
	int x=10;  // instance variable
	
	static int z=20;  // class or static variable
	
	// instance method
	public void add() {
		int a=10;
		
		int b=20;
		
		System.out.println(a+b);
	
	}
	
	//static or class method
	public static void sub() {
		int a=30;
		
		int b=20;
		
		System.out.println(a-b);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoClass obj=new DemoClass();
		
		obj.add();
		
		System.out.println(obj.x);
		
		DemoClass.sub();
		
		System.out.println(DemoClass.z);
		

	}

}
