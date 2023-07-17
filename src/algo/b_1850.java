package algo;

import java.io.IOException;

public class b_1850 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		long a = 111111111111L;
//		         9223372036854775807
		long b = 111111;
		System.out.println(gcd(a, b));
		System.out.println(Long.toBinaryString(1L<<127));
		System.out.println(Long.toBinaryString(a));
		System.out.println(Long.toBinaryString(b));
		System.out.println(Long.toBinaryString(a^b));
	}
	
	static long gcd(long a, long b) {
		if(b == 0) return a;
		else return gcd(b, a%b);
	}
}
