package t3_while;

//1~100가지의 합 10항씩의 합을 출력하시오.
/*
 
 */

public class Test4 {
	public static void main(String[] args) {
		int i = 0, tot =0;
		
		while(i< 100) {
			
			
			i++;
			tot = tot+i; //tot += i
			if(i % 10 ==0 ) {
			System.out.println((i-9) + "~"  +i+ "합은" +tot+ "입니다");
			tot = 0;
		  }
    }
	}
}