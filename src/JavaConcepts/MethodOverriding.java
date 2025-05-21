package JavaConcepts;

public class MethodOverriding extends MethodOverLoading{
	
	
	public void add() {
		
		System.out.println("add method override class");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverriding child=new MethodOverriding();
		
		child.add(); 
		
		MethodOverLoading parent=new MethodOverLoading();
		
		parent.add();
		
		MethodOverLoading obj=new MethodOverriding();
		
		obj.add();
		
		
	}

}
