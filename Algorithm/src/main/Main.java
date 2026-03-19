package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	private static int N;
	private static String[] strs;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(br.readLine());
		strs = new String[N];
		for(int i=0;i<N;i++) {
			strs[i] = br.readLine();
		}
		Arrays.sort(strs, (s1, s2) -> {
		    if (s1.length() == s2.length()) {
		        return s1.compareTo(s2); // 사전순
		    }
		    return s1.length() - s2.length(); // 길이순
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			if(i > 0 && strs[i-1].equals(strs[i])) {
				continue;
			}
			sb.append(strs[i]);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
