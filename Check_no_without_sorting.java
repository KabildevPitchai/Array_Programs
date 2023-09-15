package Array;

public class Check_no_without_sorting {

	public static void main(String[] args) {
		Check_no_without_sorting c=new Check_no_without_sorting();
		c.sortwithoutAscendingOrder();
		
	}

	private void sortwithoutAscendingOrder() {
		int []no={18,10,3,19,7,22,6,14,23};
		int key=23;
		for(int i=0,j=0;i<no.length;i++) {
			if(no[i]<=key) {
				int temp=no[i];
				no[i]=no[j];
				no[j]=temp;
				j++;
			}
		}
			for(int i=0;i<no.length;i++) {
				System.out.println(no[i]);
			}
		}
	}


