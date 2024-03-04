package exam;

import java.util.Scanner;

public class Test3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cnt =0 ;
		
		
		System.out.println("2자리수를 입력하세요 :");
		num = sc.nextInt();
		
		if(num >=10) { //양수일때
		
		 while(num >= 1) {
			 System.out.print(num +"\t");

			 num--;
			 cnt++;
			 if(cnt % 5 ==0) System.out.println();
		 }
		}
		 if(num <= - 10) { //음수일때
				
			 while(num <= 1) {
				 System.out.print(num +"\t");

				 num++;
				 cnt++;
				 if(cnt % 5 ==0) System.out.println();
			 }
		}
		sc.close();
	}

}
