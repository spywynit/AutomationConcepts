package JavaConcepts;

public interface First {
	
	int a=10;
	
	public abstract void sub();
	
	public abstract void add();
	
	default void add1() {
	 // a=30;
	}
	
	static void add2() {
		//a=30;
		System.out.println(a);
	}
	

}
