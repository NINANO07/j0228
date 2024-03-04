package t3_while;
//-(1/2)+(2/3)-....... i/(i+1) -(9/10)=
public class Test7 {
	public static void main(String[] args) {
		double i = 0.0, tot = 0.0;
		int s = 1;
		
		while(i <9) {
			i++;
			s = s*(-1);
			tot = tot+(i/(i+1)*s);
			
		}
		System.out.println(tot);
	}

}
