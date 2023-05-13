package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_10773 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// K개의 정수
		int K = Integer.parseInt(br.readLine());
		
		//stack 생성
		Stack<Integer> stack = new Stack<>();
		
		// K만큼 반복하여 조건에 맞게 stack에 저장
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) stack.pop();
			else stack.push(num);
		} 
		
		// stack에있는 값들을 sum
		int sum = 0;
		for(int i : stack) {
			sum += i;
		}
		System.out.println(sum);
	}

}
