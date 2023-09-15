package Array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		ArrayDemo ad=new ArrayDemo();
		ad.learning1();
		ad.learning2();
		ad.learning3();
		ad.learning4();
		ad.learning5();	
		ad.learning6();
		ad.nonrepeated_character();
		ad.countOfEachchars();
		ad.thirdofmynamecount();
		ad.mostrepeatedchar();
		ad.repeatedcharacter();
		}

	private void repeatedcharacter() {
		char [] name = { 'S','U','V','E','T','H','A','S','S'};
	      
	      
	      for(int j=0; j<name.length; j++)
	      {
	        int count = 1; 
	        char ch = name [j];
	        if(ch == '*')
	        continue;
	        for(int i=j+1; i<name.length;i++)
	        {
	          if(ch==name[i])
	          {
	            name[i]='*';
	            count++;
	          }
	        }
	        
	        System.out.println("Count is == >"+  "  " +ch + "   " + count);
	      }
	}

	private void mostrepeatedchar() {
		
		char [] name = { 'S','U','V','E','T','H','A','S','S'};
	      
		int big = 0;
        char ch1 = ' ';
        
	      for(int j=0; j<name.length; j++)
	      {
	        int count = 1; 
	        char ch = name [j];
	        if(ch == '*')
	        continue;
	        for(int i=j+1; i<name.length;i++)
	        {
	          if(ch==name[i])
	          {
	            name[i]='*';
	            count++;
	          }
	        }
	        
	        if(count>big)
	        {
	          big = count;
	          ch1 = ch;  
	        }
	      }
	        System.out.println(big +" "+ ch1);
	}

	private void thirdofmynamecount() {
		String s="kabildev";
		char[] name=s.toCharArray();
		int count=0;
		for(int i=0;i<name.length;i++) {
			char ch=name[i];

			if(ch=='b')
				count++;
		}System.out.println(" "+count);
	}

	private void countOfEachchars() {
		String s="kabildev";
		char[] name=s.toCharArray();
		for(int j=0;j<name.length;j++) {
			char ch=name[j];
			int count=1;
			if(ch=='*')
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='*';
					count++;
				}
			}
			System.out.println("count of "+ch+" is=>"+count);
			
		}
	}

	private void nonrepeated_character() {
		char[] name= {'a','n','a','n','d'};
		for(int j=0;j<name.length;j++) {
			boolean repeated=false;
			char ch=name[j];
			if(ch=='*')
				continue;
				
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='*';
					repeated=true;
//					break; //its not suit this program
				}
			}
			if(repeated==false) {
				System.out.println("first non repeated =>"+ch);
			}
			
		}
	}

	private void learning6() {
		
	}

	private void learning5() {
		int[] ar= {5,-10,-20,30,-40,50};
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0) {
			System.out.println("Negative Numbers=>"+ar[i]);
			count++;
			}
			if(ar[i]<0 && ar[i]%20==0) {
				System.out.println("Negative numbers%20=>"+ar[i]);
			}
			if(ar[i]<0&&i%2==0) {
				System.out.println("Even index position"+ar[i]);
			}
		}System.out.println("Total count of negative no's=>"+count);
	}

	private void learning4() {
//		System.out.println(Integer.MAX_VALUE);
		int [] scores= {50,90,99,59,30};
		int lowest=Integer.MAX_VALUE;
		int second_lowest=Integer.MAX_VALUE;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]<lowest) {
				//second_lowest=lowest;
				lowest=scores[i];
				}
			else if(scores[i]<second_lowest) {
				second_lowest=scores[i];
			}
		}System.out.println(lowest);
		System.out.println(second_lowest);
	}

	private void learning3() {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int[] scores= {50,60,55,63,62};
		int highest=scores[0],second_highest=scores[0];
		for(int i=1;i<scores.length;i++) {
			if(scores[i]>highest) {
				second_highest=highest;
				highest=scores[i];
			}
			else if(scores[i]>second_highest){
				second_highest=scores[i];
			}
		}System.out.println("Highest value -->"+highest);
		System.out.println("Second highest-->"+second_highest);
	}

	private void learning2() {
		int marks[]= {96,96,100,98,99};		
				int count=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]==100) 
				System.out.println("Index of 100 is-->"+i);
				count++;
			if(marks[i]>96)
				System.out.println("greater than 96 all are-->"+marks[i]);
		}System.out.println("count of 100 is -->"+count);
	}

	private void learning1() {
		int [] marks=new int[5];
		
		Scanner sc=new Scanner(System.in);
		int total=0;
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter Mark:");
			marks[i]=sc.nextInt();
//			System.out.println(marks[i]);
			total=total+marks[i];
		}
		sc.close();
		System.out.println(total);
		System.out.println(total/marks.length);
		
//		marks[0]=96;
//		marks[1]=95;
//		marks[2]=100;
//		marks[3]=97;
//		marks[4]=96;
//		
		
//		System.out.println(marks[0]=96);
//		System.out.println(marks[0]=95);
//		System.out.println(marks[0]=100);
//		System.out.println(marks[0]=97);
//		System.out.println(marks[0]=96);
//		
//		for(int no=0;no<marks.length;no++) { //manually using loop without using scanner
//			System.out.println(marks[no]);
//		}
		
		
		
	}

}
