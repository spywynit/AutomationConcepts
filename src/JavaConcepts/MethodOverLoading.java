package JavaConcepts;

public class MethodOverLoading {
	
	public void add() {
		
	System.out.println("add method with no arguments");
	}
	
	public void add(int a) {
		
		System.out.println("add method with one arguments");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MethodOverLoading obj=new MethodOverLoading();
		
		obj.add(1);
	}

}
