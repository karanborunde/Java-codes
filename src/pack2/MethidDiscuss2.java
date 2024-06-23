package pack2;

public class MethidDiscuss2 {
	
	public static void tushar()
	{
		System.out.println("Print");
	}
	
	// ClassName.methodName() // syntax for calling static method from another class
	public static void main(String[] args) {
		
	MethodDisuss.printText();  // calling static method from another class ( ClassName{where method is present}.methodName)
	MethodDisuss.mulNumber();
	MethodDisuss ref2 = new MethodDisuss(); // creating an instance/object of a Class (will have to create object to call non static method)
	ref2.divNum();	// calling non static method from another class
	System.out.println();
	}
}
