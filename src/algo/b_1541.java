package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		// "0"을 선언 > 만약 문자열안에 값이 없다면
		// 빈값으로 더하기 때문에 error발생
		String str_add = "0";
		String str_sub = "0";
		
		
		// '-'가 있다면 첫번째 '-'기준으로 문자열을 나눔.
		if(str.indexOf("-") > 0) {
			str_add = str.substring(0, str.indexOf("-"));
			str_sub = str.substring(str.indexOf("-")+1 , str.length());
		}else {
			str_add = str;
		}
		
//		System.out.println("add " + str_add);
//		System.out.println("sub " + str_sub);
		
		// add = '+', sub = '+', '-'로 잘라 배열에 저장.
		String add_arr[] = str_add.split("\\+");
		String sub_arr[] = str_sub.split("\\+|\\-");
//		System.out.println(add_arr.length + ", " + sub_arr.length);
		
		//sub, add 배열에 저장된 값을 각각 더해줌.
		int add = 0, sub = 0;
		for(int i=0; i<add_arr.length; i++) {
			add += Integer.parseInt(add_arr[i]);
		}
		for(int i=0;i<sub_arr.length; i++) {
			sub += Integer.parseInt(sub_arr[i]);
		}
		
		System.out.println(add - sub);
		
	}

}
