package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
 
		System.out.println(sb);
	}
}

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int a = Integer.parseInt(br.readLine());
//int arr[] = new int[a];
//
//StringTokenizer st;
//
//for (int i = 0; i < a; i++) {
//	st = new StringTokenizer(br.readLine(), " ");
//	int b = Integer.parseInt(st.nextToken());
//	int c = Integer.parseInt(st.nextToken());
//	arr[i] = b + c;
//}
//
//for (int k : arr) {
//	System.out.println(k);
//}
