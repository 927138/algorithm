package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1284 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();
			if (str.equals("0"))
				break;

			int len = str.length() + 1;
			for (int i = 0; i < str.length(); i++) {

				switch (str.charAt(i)) {
				case '0':
					len += 4;
					break;
				case '1':
					len += 2;
					break;

				default:
					len += 3;
					break;
				}

			}
			System.out.println(len);
		}
	}

}
