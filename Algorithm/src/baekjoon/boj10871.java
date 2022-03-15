package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		br.close();

		for (int i = 1; i <= n; i++) {
			int k = Integer.parseInt(st.nextToken());

			if (k < x)
				sb.append(k).append(" ");
		}
		System.out.println(sb);
	}
}

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int n = Integer.parseInt(st.nextToken());
//		int x = Integer.parseInt(st.nextToken());
//
//		int arr[] = new int[n];
//		st = new StringTokenizer(br.readLine(), " ");
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (arr[i] < x)
//				System.out.print(arr[i] + " ");
//		}
//	}
//
//}
