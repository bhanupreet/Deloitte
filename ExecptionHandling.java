public class ExecptionHandling {
	public static void demo() throws ArithmeticException{
		 System.out.println("inside demo() ");
		 throw new ArithmeticException("demo exception");
	}
	
	public static void main(String args[]) {
		try {
		demo();
		}
		catch (ArithmeticException e) {
			System.out.println("exception caught in main method");
		}
		
		int a = 10, b = 0, result; 
		
        try { 
            result = a / b; 
            System.out.println("result" + result); 
        } 
  
        catch (ArithmeticException e) { 
            System.out.println("Exception occured Division by zero is not possible"); 
        } 
  
        finally { 
            System.out.println("final block "); 
        } 
	}
}
