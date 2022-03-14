package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());

		if (b + c >= 60) {
			a = a + (b + c) / 60;
			b = (b + c) % 60;
			if (a > 23)
				a = (a - 24);
			System.out.println(a + " " + b);
		} else {
			b = b + c;
			System.out.println(a + " " + b);
		}
	}
}
