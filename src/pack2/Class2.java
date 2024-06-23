package pack2;


public class Class2 {
	public static void main(String[]args) {
		System.out.println("Print Hello world");
		int a =2;
		int b=12;
		System.out.println(a+b+" "+a);
//		ClassName referenceVraiableName = new ClassName();
		Class2 ref = new Class2();  // creating an object
		Class2 harris = new Class2();
		
		
		// Data types
		
		byte b1 = 1;
		int n = 120;
		float f = 12.21f;
		double d = 12.2323;
		short s = 233;
		long longdoH = 23823;
		char ch = 'u';  // number from 0 to 9, special characters, alphabets,symbol
		char ch1 = '1';
		boolean bol = true;
		boolean bol1 = false;
		
		System.out.println(ch);
		System.out.println(ch1);
		String st ="This is just for testing purpose "; 
		System.out.println(st);
		
		
		int a12 = 23;
		int a22 = 76;
		
		int res = a12+a22;	
		System.out.println(res);
		
		float f1 = 21.12f;
		float f2 = 566.122f;
		double res1 = f1-f2;
		System.out.println(res1);
		
		int mul1 = 142;
		int mul2 = 12266;
		int res3 = mul1*mul2;
		System.out.println(res3);
		
		double div = 12;
		int div1 = 5;
		double res4 = div/div1;
		System.out.println(res4);
		
		int m = 95;
		int o = 7;
		int modulus = m%o;
		System.out.println(modulus);
		
		// Pre and Post increment operator
		int pre = 23;
		int dre = 45;
		int z= pre --;
		System.out.println(z);
		System.out.println(pre);
		int z1 = --pre;
		System.out.println(pre);
		System.out.println(z1);
		int z2 = ++ dre ;
		System.out.println(dre);
		System.out.println(z2);
		int z3 = dre ++;
		System.out.println(z2);
		System.out.println("final ans" + " "+ dre);
		
		// If else statement
		
		if (pre>dre)
		{ System.out.println("Pre is greater than dre");
		
		}
		
		else
		{
			System.out.println("dre is greater than pre");
		}
		
		// another prog
		if (1>3)
		{
			System.out.println("1 is greater than 3");
		}
		
		else
		{
		System.out.println("else loop is not present");	
		}	
		// program to find given number is even or odd
		
		int num = 253;
		int remainder = num%2;
		
	if (remainder==0)
		{
			System.out.println("the given number"+ " " + num + " is even ");
		}
		
	else 
	{ System.out.println("the given number" + num + "is odd"); 
	
	}
	
	
			
	}
	
}
		
		
		


