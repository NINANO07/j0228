package exam;

import java.util.Scanner;

/*
 2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
 여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
 */
public class Test2_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, temp =0, tot = 0, cnt = 0, total =0, i =0, startSu;
		
		System.out.print("첫번째 숫자를 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println("첫번째수:"+num1+" 두번째수:"+num2);
		
		if (num2<num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		startSu =temp = num1;
		
		while (num1 <= num2) {
			tot += num1;
			//total += num1;
			cnt++;
			
			if(cnt % 5 == 0) {
				System.out.println(temp + "~" +num1 + " : " + tot);
				total += tot;
				tot =0;
				temp = num1+1;
			}
			num1++;
		}
		if(cnt % 5 != 0) {
			System.out.println(temp + "~" + --num1 + " : " + tot);
			total += tot;
		}
		
		System.out.println("총합은 "+startSu+"~"+num2+":" + total);
		
		sc.close();
	}

}
