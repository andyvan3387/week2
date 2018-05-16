

import java.math.BigInteger;
import java.util.Scanner;

public class SmallestCommonMultiple {
	public static BigInteger scm(BigInteger a, BigInteger b){
		
		BigInteger lr = a.multiply(b);
		BigInteger gc = gcd(a,b);
		
		BigInteger rs = lr.divide(gc);
		return rs;
	}
	
	public static BigInteger gcd(BigInteger a, BigInteger b){
		if (a.mod(b).intValue() == 0)
			return b;
		else return gcd(b, a.mod(b));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String aa = String.valueOf(a);
		String bb = String.valueOf(b);
		BigInteger aaa = new BigInteger(aa);
		BigInteger bbb = new BigInteger(bb);
		System.out.println(scm(aaa,bbb));
	}
}
