package t3_while;

//1~100가지의 합
public class Test1 {
	public static void main(String[] args) {
		int i = 0, tot =0;
		
		while(i< 100) {
			i++;
			tot = tot+i; //tot += i
			
		}
		
		System.out.println("1~ 100까지 합은?" +tot);
		
	}

}
