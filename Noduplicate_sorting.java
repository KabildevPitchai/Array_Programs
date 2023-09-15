package Array;

import java.util.LinkedHashSet;

public class Noduplicate_sorting {

	public static void main(String[] args) {
		Noduplicate_sorting nd=new Noduplicate_sorting();
//		nd.noduplicate();
//		nd.noduplicatebycollections();
		nd.subArray();
		
	}

	private void subArray() {
			  int [] a= {10,20,30,40,50};
			  int [] b= {10,20,30};
			  int count = 0;
			  int j;
			  for(j=0;j<b.length;j++)
			  {
			   boolean present= false;
			   
			  for(int i=0;i<a.length;i++)
			  {
			   if (b[j]==a[i])
			   {
//			    count++;
			    present = true;
			   }
			  
			  }
			  if(present == false)
			  {
			   System.out.println("not sub array");
			   break;
			  }
			  }
			  if(j == b.length)
			  {
			   System.out.println("sub array");
			  }
			 }

	

	private void noduplicatebycollections() {
		int [] ar= {20,20,30,40,30,50,59,75,40};
		LinkedHashSet lhs=new LinkedHashSet();
		for(int i=0;i<ar.length;i++) {
			lhs.add(ar[i]);
			}
		System.out.println(lhs);
		
		
		
		}

	private void noduplicate() {
		int [] ar= {2,3,3,5,8,8,8,10,10,12};
		int unique=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				ar[unique]=ar[i+1];
//				System.out.println(ar[unique]);
				unique++;
			}
		}
		
		for(int i=0;i<unique;i++) {
			System.out.println(ar[i]);
		}
	}

}
