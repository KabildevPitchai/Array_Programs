package Learn_Array;

import java.util.Scanner;

public class Primitive_datatype_Array {

	public static void main(String[] args) {
		Primitive_datatype_Array p=new Primitive_datatype_Array ();
		p.String_array();
		p.byte_Array(); 
		p.short_Array(); 
		p.long_Array(); 
	 	p.Double_Array();
		p.float_Array();
		}
	private void float_Array() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total count");
		float fl=sc.nextFloat();
		float[] f=new float[(int)fl];
		for(int i=0;i<f.length;i++) {
			System.out.println("Enter value");
			f[i]=sc.nextFloat();
		}
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
		}
	}
	private void Double_Array() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total count");
		double d=sc.nextDouble();
		double[] two=new double[(int)d];
		for(int i=0;i<two.length;i++) {
			System.out.println("enter value");
			two[i]=sc.nextDouble();
		}
		for(int i=0;i<two.length;i++) {
			System.out.println(two[i]);
		}
		
		
	}
	private void long_Array() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total count");
		long lo=sc.nextLong();
		long[] l=new long[(int)lo];
		for(int i=0;i<l.length;i++) {
			System.out.println("enter number");
			l[i]=sc.nextLong();
		}
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
			
		}
		
		
	}
	private void short_Array() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total count");
		short no=sc.nextShort();
		short[] sh=new short[no];
		for(int i=0;i<sh.length;i++) {
			System.out.println("Enter no");
			sh[i]=sc.nextShort();
		}
		for(int i=0;i<sh.length;i++) {
			System.out.println(sh[i]);
		}
		
	}
	private void byte_Array() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count value");
		int nos=sc.nextInt();
		byte[] by=new byte[nos];
		for(int i=0;i<by.length;i++){
			System.out.println("Enter nos");
			by[i]=sc.nextByte();
		}
		for(int i=0;i<by.length;i++) {
			System.out.println(by[i]);//value limit=127
		}
		
	}
	private void String_array() {

		Scanner str = new Scanner(System.in);//scanner class obj for getting 
		System.out.println("no_of_names");
		int no_of_names = str.nextInt(); // for taken the inputs from scanner class String[]
		String[] st = new String[no_of_names];
		int i=0;
		while(i<st.length) {
			System.out.println("Enter names");
			st[i]=str.next();//next used for taking String values only
			i++;
		}
		for(i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
	}

}
