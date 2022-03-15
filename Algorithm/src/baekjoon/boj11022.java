package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Case #" + i + ": ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a + " + " + b + " = ");
			sb.append(a + b);
			sb.append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}