package algo;

public class method_use {
	public static void main(String[] args) {
		
		int result_num = 0;
		boolean result[] = new boolean[10001];
		
		for(int i=0; i<result.length; i++) {
			result_num = kaprekar(i);
			if(result_num <= 10000) result[result_num] = true;
		}
		
		for(int i=0; i<result.length; i++) {
			if(!result[i]) System.out.println(i);
		}
		
	}
	static int kaprekar(int number) {
//		int sum = number;
//		int x = number;
//		while(x > 0) {
//			sum = sum + x%10;
//			x /= 10;
//		}
//		return sum;
		
		int result = number;
		for(int i=0; i<String.valueOf(number).length(); i++) {
			result += Integer.parseInt(String.valueOf(number).substring(i, i+1));
		}
		return result;
	}	
}