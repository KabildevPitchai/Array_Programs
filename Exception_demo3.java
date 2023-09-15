package Learn_Array;

public class Exception_demo3 {

	public static void main(String[] args)  {
		Exception_demo2 ex=new Exception_demo2();
		int[] br= {60,93,75,97};
		try {
	 		ex.display(br);
		}
		
/*		catch(ArrayIndexOutOfBoundsException ae){
			//System.out.println("index out of bound");
			}*/
		
	catch (Exception e) {
			e.printStackTrace();//exact inform about thread error
			System.out.println(e.getMessage());//exact message from error
		}
	}

}
