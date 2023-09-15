package Learn_Array;

public class LowAttendanceException extends Exception{

	public static void main(String[] args){
		LowAttendanceException lae=new LowAttendanceException();
//		int no=70;
		try {
		lae.allow_for_exam(70);
		} 
		catch(Exception e){
			System.out.println("check the no");
		}
	}

	private void allow_for_exam(int percentage) throws LowAttendanceException {
		if(percentage>=75) {
		System.out.println("permit");
		}
		else {
			//LowAttendanceException obj=new LowAttendanceException();
			throw new LowAttendanceException();
		}
	}

}
//throwable class 
//exception class 
//RuntimeExpection

//Runtime exception extends, if we use it it will not give any error  in compile time
//other exception or other class will make error in compile time only

//IF we use extends in class with other than exception class we must use the "IMPORT THE ADDRESS OF GIVEN CLASS"