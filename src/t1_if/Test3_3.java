package t1_if;


import java.util.Scanner;

// 3과목의 점수를 입력받는다. 
//이때 3과목의 평균점수가 60점 이상이고 각 과목당 40점 이상이면 합격, 그렇지 않으면 '불합격' 
public class Test3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sub1, sub2, sub3, avg;
		String str;
		
		System.out.print("첫번째 과목 점수 : "); sub1=sc.nextInt();
		System.out.print("두번째 과목 점수 : "); sub2=sc.nextInt();
		System.out.print("세번째 과목 점수 : "); sub3=sc.nextInt();
		
		avg = (sub1 +sub2 +sub3) /3;
		
		if (avg >= 60 && sub1 >= 40 && sub2 >= 40 && sub3 >= 40 ) {
			str = "합격";
		}
		else {
			str = "불합격";
		}
		
		System.out.println("당신은 "+str+"입니다");
		
		sc.close();
		
	}

}
