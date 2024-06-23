package pack2;

public class LoopDiscuss {
	public static void main(String[] args) {
		int a =1;
		System.out.println("ugjygdadgdjhsad");
		System.out.println("vaue of a" + a);
	    System.out.println(a<=3);
		while(a<=3)
		{
			System.out.println("The value of a "+ " "+ a);
			a++;
		}
		System.out.println("End of while loop for a");
		System.out.println();

		System.out.println("*** do-while loop**");
		
		int b = 12;
		do {
			System.out.println("Print value of b "+ " "+ b); // In Do-while loop this statement will by default print even if while condition is false
			b--;
          }
		while(b>10);
		System.out.println("End for Do-While loop ");
		System.out.println();
		System.out.println("***** FOR LOOP **************");
		
		// for(initialization;condition;increment/decrement)
		// {
		//   Code to repeat
		 //}
		
		int d=12;
		// int c;  c can be initialized and then use in for loop or otherwise we can initialized in Loop also
		for(int c=20;c>=d;c--) 
		{
			System.out.println("Value of c = "+ " "+ c);
		}
		System.out.println();

			System.out.println("***** FOR-EACH LOOP **************");
			System.out.println();
			System.out.println();
			
			int array[] = {10,55,87,97,69};
			// Syntax: for (data type in Array (Variable): Array variable name) 
			for (int i : array) // for each loop
			{
				System.out.println(i);
			}
			System.out.println();
			System.out.println("Using break keyword");
			System.out.println();

			
			int array1[] ={12,64,9,87,24,6,34,45,76};
			for(int i:array1)
			{
				System.out.println(i);
				if(i==45)
				{
					break; // to break/stop the execution of code
				}
			}
			System.out.println("After break code will run this statement");
				
				int array2[] = {88,56,90,32,7,49,97};
				
				for(int j: array2) 
				{
					//System.out.println("value of j:"+ " "+j);
					if(j==97)
					{
						//	System.out.println("Value of j "+ " "+ j);
						continue;
					}
					System.out.println(j);
				}
				System.out.println("out after each loop"); // continue will execute and this statement will be printed once
				System.out.println();System.out.println();
				
				// to write a code where to print given numbers without 100
				System.out.println("To write a code where to print given numbers without 100");
				
				int eg[] = {10,20,100,39,74};
				for (int i : eg)
				{
					if(i==100)
					{
						continue;
					}
					System.out.println(i);
				}
//				int z =1;
//				while (z<=5)
//				{
//					if(z==3)
//					{
//						//System.out.println("before decrementing"+" "+ z); not fitting in code
//						continue;
//						
//					}
//					++z;
//					System.out.println(z);
//						
//				}
		
	}
	}

