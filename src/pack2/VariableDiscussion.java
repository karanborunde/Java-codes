package pack2;

public class VariableDiscussion {

	//Global variable
	static int a=12; // static variable
	int b = 45;  //  Non-static variable
	int z = 64;
	public static void newMethod(){
		
		int l = 12;  //Local variable scope is till method only and variabl cannot access outside method
		int a = 65; // creating local variable same name as Global variable
		System.out.println(a);
		System.out.println(VariableDiscussion.a);  // to call global variable having same name as local so we have to write ClassName.Variablename 
		System.out.println(l);
		
	}
	
	public void methodName()
	{
		int z = 87; // Local variable
		System.out.println(z); // Printing Local variable
		System.out.println(this.z);  // this keyword is written to call Non static variable
	}
	
	public static void main(String[] args) {
		
		
		/*
		 * System.out.println(a); VariableDiscussion ref = new VariableDiscussion();
		 * System.out.println(ref.b); newMethod();
		 */
		VariableDiscussion k = new VariableDiscussion();
		k.methodName();
	}
}
