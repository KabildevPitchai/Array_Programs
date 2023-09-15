package Learn_Array;

public class Exception_demo2 {

	public static void main(String[] args)  {
		Exception_demo2 ex=new Exception_demo2();
		int[] ar= {50,60,49,76,90};
		try {
			ex.display(ar);
		} catch (Exception e) {
			e.printStackTrace();
	 		System.out.println(e.getClass());
		}
	}
	public void display(int[] ar) throws Exception //ArrayIndexOutOfBoundsException 
	 {
		for(int i=0;i<5;i++) {
			System.out.println(ar[i]);
		}
	}
}
