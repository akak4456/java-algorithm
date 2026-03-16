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
	private static int T;
	private static int R;
	private static String S;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(br.readLine());
		for(int testCase = 0; testCase < T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			for(int i=0;i<S.length();i++) {
				for(int j=0;j<R;j++) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
