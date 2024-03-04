package t3_while;

//1~100가지의 홀수합
public class Test3 {
	public static void main(String[] args) {
		int i = -1, tot = 0;
		
		while(i < 99) { // 최대 홀수
			i = i + 2 ;
			tot = tot+i; //tot += i
			
		}
		
		System.out.println("1~ 100까지 홀수합은?" +tot);
		
	}

}
