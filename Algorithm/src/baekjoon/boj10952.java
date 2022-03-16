package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true){
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			}
			sb.append(a+b).append('\n');
		}
		br.close();
		System.out.println(sb);
		
	}
}

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//StringBuilder sb = new StringBuilder();
//
//while (true) {
//	String str = br.readLine();
//	int a = str.charAt(0) - '0'; // 10 미만이라서 가능한
//	int b = str.charAt(2) - '0';
//
//	if (a == 0 && b == 0) {
//		break;
//	}
//	sb.append(a + b).append('\n');
//}
//br.close();
//System.out.println(sb);
//}
//}
