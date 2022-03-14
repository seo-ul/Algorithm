package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if (b < 45) {
			a--;
			b = b + 60 - 45;
			if (a < 0)
				a = 23;
			System.out.printf("%d %d", a, b);
		} else {
			b = b - 45;
			System.out.printf("%d %d", a, b);
		}
	}
	
}