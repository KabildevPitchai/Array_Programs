package Learn_Array;

import java.util.Scanner;

public class Array_Learning {

	public static void main(String[] args) {
		Array_Learning a=new Array_Learning();
		//a.intialmodel();
		//a.odd_num();
		//a.even_position();
		//a.add_totalcount();
//		a.percentage();
//		a.failed_marks();
//		a.total_subs_and_failed_subs();
//		a.student();
//		a.biggest_value();
//		a.smallest_value();
//		a.initialisation_with_scanner();
		}
		private void initialisation_with_scanner() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter sub count:");
			int no_of_sub=sc.nextInt();
			int[] ar=new int[no_of_sub];
			
			
			//OR METHOD OF 
			/*ar[0]=sc.nextInt();
			ar[1]=sc.nextInt();
			ar[2]=sc.nextInt();
			ar[3]=sc.nextInt();
			ar[4]=sc.nextInt();*/
			
			for(int i=0;i<ar.length;i++) {
				System.out.println("Enter marks:");
				ar[i]=sc.nextInt();
			}
			
	}
		private void smallest_value() {
			String[] names= {"sneka","kausi","subu","ram","sandhiya","kabil"};
			int[] marks= {9800,9500,9600,9400,9800,9900};
			int small=Integer.MAX_VALUE;
			int position=0;
			for(int i=0;i<marks.length;i++) {
				if(small>marks[i]) {
					small=marks[i];
					position=i;
				}
			}System.out.println("small num is =>"+small);
			System.out.println(names[position]);
			System.out.println(Integer.MAX_VALUE);
			
			
	}
		private void biggest_value() {
			String[] names= {"sneka","kausi","subu","ram","sandhiya","kabil"};
			int[] marks= {9400,9500,9600,9700,9800,9900};
			int big=0;
			int position=0;
			for(int i=0;i<marks.length;i++) {
				if(big<marks[i]) {
					big=marks[i];
					position=i;
				}
			}System.out.println(big);
			System.out.println(names[position]);
	}
		private void student() {
			String[] names= {"sandhiya","sneka","ram","subu","kabil"};
			int[] total= {94,96,98,100,99};
			for(int i=0;i<total.length;i++) {
				System.out.println(total[i] +"-> "+names[i]);
			}
	}
		private void total_subs_and_failed_subs() {		
			int []marks= {100,95,34,87,30};
			int count=0;
			int total=0;
			for(int i=0;i<marks.length;i++) {
				if(marks[i]<35) {
					count++;
				}
				total=total+marks[i];
			}
			if(count==0) {
				System.out.println(total);
				System.out.println(total/marks.length);
			}else {
				System.out.println(count+" sub fail");
			}
			
	}
		private void failed_marks() {
			int[] marks= {100,90,34,80,30};
			int count=0;
			for(int i=0;i<marks.length;i++) {
				if(marks[i]<35) {
					count++;
				}
			}System.out.println(count);
	}
		private void percentage() {
			int[] marks = {90,95,99,96,100};
			int total=0;
			for(int i=0;i<marks.length;i++) {
				total=total+marks[i];
			}System.out.println("total =>"+total);
			System.out.println("percentage => "+total/marks.length);
			
	}
		private void add_totalcount() {
			int[] marks = {90,95,99,96,100};
			int total=0;
			for(int i=0;i<marks.length;i++) {
				total=total+marks[i];
			}System.out.println(total);
		
	}
		private void even_position() {
			int[] marks = {90,95,99,96,100};
			for(int i=0;i<marks.length;i++) 
			{
				if(i%2==0)
				System.out.println(marks[i]);
			}
	}
		private void odd_num() {
			
				
	}
		private void intialmodel() {
			/*int[] marks = {90,95,99,96,100};
			int i=0;
			while(i<=4) {
				System.out.println(marks[i]);
				i++;   // while loop  model for Array */
			
				/*System.out.println(marks[0]);
				System.out.println(marks[1]);
				System.out.println(marks[2]);
				System.out.println(marks[3]);
				System.out.println(marks[4]);*/
				       
				
				    //OR
			
			int[] marks = {90,95,99,96,100};
			
			/*
			 * //System.out.println(marks.length); //it gives total count of numbers
			 * 
			 * for(int i=0;i<=marks.length-1;i++) { if (marks[i]%2!=0)
			 * System.out.println(marks[i]); } //for loop model for Array
			 */		
			for(int i=marks.length-1;i>=0;i--) {
				System.out.println(marks[i]);
			}
			/*
			 * System.out.println(marks[4]); System.out.println(marks[3]);
			 * System.out.println(marks[2]); System.out.println(marks[1]);
			 * System.out.println(marks[0]);
			 */
	}	
	}
