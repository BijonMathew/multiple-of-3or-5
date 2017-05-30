/*Bijon Mathew
 * 26 May 2017
 */
public class Multiple {
	public boolean multipleOf3Or5Only(int n){
		if(n%3 ==0 && n%5 == 0)
			return false;
		else if (n%3 == 0 || n%5 == 0)
			return true;
		else
			return false;
		
		
		
	}
	public static void main(String[] args) {
		
		Multiple boolObj = new Multiple();
		{
			// Test 1    failing test
		boolean output = boolObj.multipleOf3Or5Only(23);
		if(output == false)
			System.out.println("Test Passed!");
		else
			System.out.println("Test Failed!");
		}
		{
			//Test 2     passing test
			boolean output = boolObj.multipleOf3Or5Only(18);
			if(output == true)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
			
		}
		
		{
			// Test 3       failing test
			
			boolean output = boolObj.multipleOf3Or5Only(15);
			if(output == false)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
			
			}
		{
			//Test 4       passing test
			
			boolean output = boolObj.multipleOf3Or5Only(6);
			if(output == true)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
		}
		
		{
			// Test 5    passing test
			boolean output = boolObj.multipleOf3Or5Only(24);
			if(output == true)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
		}
		
		{ //Test 6       passing test
			boolean output = boolObj.multipleOf3Or5Only(40);
			if(output == true)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
		}
		
		{  // Test 7   failing test
			boolean output = boolObj.multipleOf3Or5Only(30);
			if(output == false)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
		}
		
		{  // Test 8      failing test
			boolean output = boolObj.multipleOf3Or5Only(45);
			if(output == false)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
		}
		
		{
			// Test 9    passing test
			boolean output = boolObj.multipleOf3Or5Only(5);
			if(output == true)
				System.out.println("Test Passed");
			else
				System.out.println("Test Failed");
		}
	}

}
