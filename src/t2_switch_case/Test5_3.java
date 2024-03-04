package t2_switch_case;

import java.util.Scanner;

//직급코드를 입력받아서 직급별 명칭을 출력하시오. 
/*
 직급코드 1: 부장 5000000
 직급코드 2: 과장 4000000
 직급코드 3: 대리 3000000
 직급코드 4: 사원 2000000
 
 시간수당(sud) : 시간을 입력받아서 시간당 25000으로 한다. 
 공제액(gon) : (본봉 (bon)+수당)의 10%로 한다.
 실수령액(net)을 구하시오.
 단, 실수령액 = 본봉 + 수당 - 공제액
 
 
 
 */
public class Test5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int sud, gon, net, code, hour;
		int bon;		
		String jik;
		
		System.out.print("직급코드를 입력 (1:부장, 2:과장, 3:대리, 4:사원): ");
		code = sc.nextInt();
		
		System.out.print("추가시간을 입력: ");
		hour = sc.nextInt();
		sud = hour * 25000;
		
		
		switch(code){
			case 1:	
			 jik = "부장";
			 bon = 5000000;	
			 break;
			case 2:
       jik = "과장";
			 bon = 4000000;
			 break;
			case 3:
			 jik = "대리";
			 bon = 3000000;
			 break;
			case 4:
			 jik = "사원";
			 bon = 2000000;
			 break;
		  default:
			 jik = "비사원";
			 bon = 0;
		}
		
		//gon = (bon + sud) / 10;
		gon = (int)((bon + sud) *0.1);
		net = (bon + sud) - gon;

		
		System.out.println( jik + "의 본봉의 "+bon+"실수령액은 "+net+"입니다");
		
		sc.close();
	
	}

}
