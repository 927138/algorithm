package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		// "0"�� ���� > ���� ���ڿ��ȿ� ���� ���ٸ�
		// ������ ���ϱ� ������ error�߻�
		String str_add = "0";
		String str_sub = "0";
		
		
		// '-'�� �ִٸ� ù��° '-'�������� ���ڿ��� ����.
		if(str.indexOf("-") > 0) {
			str_add = str.substring(0, str.indexOf("-"));
			str_sub = str.substring(str.indexOf("-")+1 , str.length());
		}else {
			str_add = str;
		}
		
//		System.out.println("add " + str_add);
//		System.out.println("sub " + str_sub);
		
		// add = '+', sub = '+', '-'�� �߶� �迭�� ����.
		String add_arr[] = str_add.split("\\+");
		String sub_arr[] = str_sub.split("\\+|\\-");
//		System.out.println(add_arr.length + ", " + sub_arr.length);
		
		//sub, add �迭�� ����� ���� ���� ������.
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
