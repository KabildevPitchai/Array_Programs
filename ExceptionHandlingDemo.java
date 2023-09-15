package Learn_Array;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		ExceptionHandlingDemo exd=new ExceptionHandlingDemo();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter input");
		int no1=sc.nextInt();    // OR  int no1=10;
	 	int no2=sc.nextInt();  // OR  int no2=0;
		exd.divide(no1,no2);
		exd.subtract(no1,no2);
	}

	private void subtract(int no1, int no2) {
		
		System.out.println("subtract"+(no1-no2));
		
	}

	private void divide(int no1, int no2) {
		try {
			//Exception handling area
			System.out.println("Divide"+(no1/no2));
			int[] ar=new int[no1];
			System.out.println(ar.length);
			ar[ar.length]=56;
		}
		/*catch(ArrayIndexOutOfBoundsException aoe) { 
			System.out.println("array out of bound");
		}catch(NegativeArraySizeException nas) {
			System.out.println("check no");
		}
		catch(ArithmeticException ae){
			System.out.println("check the no2");
		}*/
		
		//if we use parent class Exception we don't need of using remains three methods parents done its work so cant use child method
		catch(Exception e) {   
			System.out.println("something else");
		}
	
	}

}
