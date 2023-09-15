package Learn_Array;

public class ErrorDemo {

	public static void main(String[] args) {
		ErrorDemo er=new ErrorDemo();
		er.error_example();
	}

	private void error_example() {
//		System.out.println("hii");
//		error_example();
		
		try {
			System.out.println(20/0);
		}
		catch(ArithmeticException ae){
	 		System.out.println("cant divide by zero");
		}
		finally {
			System.out.println("finally");
		}
	}

}

//try catch => possible  
//try catch finally => possible  //finally is depend on try catch or try 
//try finally =>possible    
//finally is useful to execute the finally block inside of coding "if exception will happen or not but finally block give output".

