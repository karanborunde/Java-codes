package pack2;

public class MethodDisuss {
	
//		public static void methodName   syntax of static method
		public static void printText()
		{
			System.out.println("This statement is printed from printText method");
		}
	    public static void mulNumber()
	    {
	    	int a =12;
	    	int b = 2;
	    	int c = a*b;
	    	System.out.println("Mul of Number" + " " + c);
	    }
	    
	    public void  divNum() // Non static method
	    {
	    	int d = 24;
	    	int e = 6;
	    	int f = d/e;
	    	System.out.println("Div of Number" + " " +f);
	    	
	    }
	    
	    public void modulus()
	    {
	    	
	    	int k2 = 12;
	    	int c2 = 5;
	    	int v2 = k2%c2;
	    	System.out.println("Modulus of num" + " " + v2);
	    	divNum();
	    	mulNumber();
	    }
	    public static void main(String[]args)
	    {
	         printText(); // calling static method using method name
			mulNumber(); // calling static method using method name
			
			// to call Non static method user must have to create object first
			MethodDisuss ref1 = new MethodDisuss(); // creation of object for Non static method
			ref1.divNum();  // syntax referncename.Nonstatic methodname
			MethodDisuss ref2 = new MethodDisuss(); // Creation of object for another Non static method
			ref2.modulus();
			MethidDiscuss2.tushar();
		}
	}



