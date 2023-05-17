package algo;

import java.util.*;
public class star {
	static char[][] star;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x=0; int y=0;
		star = new char[num][num];
		star_df(num, x, y);
		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[0].length;j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
		
	}
	static void star_df(int num, int x, int y) {
		boolean block = false;
		
		if(x==3) {
//			a = x*3
			for(int i=x*3;i<x*3;i++) {
				for(int j=y*3;j<y*3;j++) {
//					if(i==x*3+1 && j==y*3+1) {star[i][j] = ' ';}
//					else {star[i][j] = '*';}
					star[i][j] = '*';
					System.out.print(i+j);
				}
				return;
			}
		}

		for(int i=0;i<x/3;i++) {
			for(int j=0;j<x/3;j++) {
				System.out.print(i+j);
				if(i==1 && j==1) {continue;}
				else {star_df(x/3, i, j);}
			}
		}
	}
}
