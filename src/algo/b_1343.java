package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1343 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		String str2 = "";
//		while(!str.equals("")) {
//			if(str.indexOf(".") < 0) {
//				if(append(str, sb)) str = ""; 
//				else return;
//			}else {				
//				str2 = str.substring(0, str.indexOf("."));
//				if(append(str2, sb)) {
//					str = str.substring(str.indexOf("."));
//					if(str.indexOf("X") < 0) {						
//						sb.append(str); str="";
//					}
//					else {						
//						sb.append(str.substring(0, str.indexOf("X")));
//						str = str.substring(str.indexOf("X"));
//					} 
//				}
//				else return;				
//			}
//				
//		}
//		
//		System.out.println(sb);
		
		�ڽ�Ŭ���� ��ü���� = new �ڽ�Ŭ����();
		
		
	}
	
	static class �θ�Ŭ���� {
		�θ�Ŭ����(){
			System.out.println("�θ�Ŭ����");
		}
	}
	static class �ڽ�Ŭ���� extends �θ�Ŭ����{
		�ڽ�Ŭ����(){
			System.out.println("�ڽ�Ŭ����");
		}
	}
	
	
//	static boolean append(String str, StringBuilder sb) {
//		if(str.length()%2 == 1) {
//			System.out.println(-1);
//			return false;
//		} 
//		
//		int str_div = str.length()/4;
//		int str_mod = (str.length()%4) / 2;
//		for(int i=0; i<str_div; i++) {
//			sb.append("AAAA");
//		}
//		for(int i=0; i<str_mod; i++) {
//			sb.append("BB");
//		}
//		return true;
//	}
}
